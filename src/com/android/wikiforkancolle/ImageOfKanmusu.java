package com.android.wikiforkancolle;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

public class ImageOfKanmusu extends Activity {

	private ImageView image;
	private Handler handler = new Handler();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.image);
		image = (ImageView) findViewById(R.id.image);
		image.setImageResource(R.drawable.loadfailed);
		image.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				finish();
			}
		});
		Intent intent = getIntent();
		String imageURL = intent.getStringExtra("ImageURL");
		new HttpThread(imageURL, image, handler).start();
	}
}
