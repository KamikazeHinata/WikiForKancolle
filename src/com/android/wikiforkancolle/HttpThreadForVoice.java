package com.android.wikiforkancolle;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.MediaPlayer;
import android.os.Environment;
import android.os.Handler;
import android.util.Log;

public class HttpThreadForVoice extends Thread {
	private String url;
	private MediaPlayer mediaPlayer;
	private Handler handler;
	private File downloadFile;

	public HttpThreadForVoice(String url, MediaPlayer mediaPlayer, Handler handler) {
		this.url = url;
		this.mediaPlayer = mediaPlayer;
		this.handler = handler;
	}

	@Override
	public void run() {
		try {
			URL httpUrl = new URL(url);
			HttpURLConnection conn = (HttpURLConnection) httpUrl
					.openConnection();
			conn.setReadTimeout(5000);
			conn.setRequestMethod("GET");
			conn.setDoInput(true);
			InputStream in = conn.getInputStream();
			FileOutputStream out = null;

			String fileName = String.valueOf(System.currentTimeMillis());

			if (Environment.getExternalStorageState().equals(
					Environment.MEDIA_MOUNTED)) {
				File parent = Environment.getExternalStorageDirectory();
				downloadFile = new File(parent, fileName);

				out = new FileOutputStream(downloadFile);
			}

			byte[] b = new byte[2 * 1024];
			int len;
			if (out != null) {
				while ((len = in.read(b)) != -1) {
					out.write(b, 0, len);
				}
			}
			final Bitmap bitmap = BitmapFactory.decodeFile(downloadFile
					.getAbsolutePath());
			
			handler.post(new Runnable() {
				@Override
				public void run() {
					try {
						Log.i("ad","HIasdfdsafasdfasdfasdfasdf");
						mediaPlayer.reset();
						mediaPlayer.setDataSource(downloadFile.getAbsolutePath());
						mediaPlayer.prepare();
						mediaPlayer.start();
					} catch (IllegalArgumentException | SecurityException
							| IllegalStateException | IOException e) {
						e.printStackTrace();
					}
				}
			});

		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
