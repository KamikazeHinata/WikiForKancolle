package com.android.wikiforkancolle;

import android.app.Activity;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.widget.TextView;

public class SplashActivity extends Activity {

	private static final int FAILURE = 0; // 失败
	private static final int SUCCESS = 1; // 成功
	private static final int OFFLINE = 2; // 如果支持离线阅读，进入离线模式

	private static final int SHOW_TIME_MIN = 2000;

	private TextView mVersionNameText;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.helloworld);

		mVersionNameText = (TextView) findViewById(R.id.version_name);
		mVersionNameText.setText("Beta");

		new AsyncTask<Void, Void, Integer>() {

			@Override
			protected Integer doInBackground(Void... params) {
				int result;
				long startTime = System.currentTimeMillis();
				result = SUCCESS; // 强制成功
				long loadingTime = System.currentTimeMillis() - startTime;
				if (loadingTime < SHOW_TIME_MIN) {
					try {
						Thread.sleep(SHOW_TIME_MIN - loadingTime);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				return result;
			}

			@Override
			protected void onPostExecute(Integer result) {
				Intent intent = new Intent();
				intent.setClassName(SplashActivity.this, "com.android.wikiforkancolle.MainActivity");
				startActivity(intent);
				finish();
				// 两个参数分别表示进入的动画,退出的动画
				overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
			};
		}.execute(new Void[] {});
	}
	// private int loadingCache() {
	// if (BaseApplication.mNetWorkState == NetworkUtils.NETWORN_NONE) {
	// return OFFLINE;
	// }
	// return SUCCESS;
	// }

}