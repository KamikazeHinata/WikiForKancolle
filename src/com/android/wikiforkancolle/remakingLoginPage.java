package com.android.wikiforkancolle;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class remakingLoginPage extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		Log.i("Hi", "Here it's");
		setContentView(R.layout.login_page);
	}
}
