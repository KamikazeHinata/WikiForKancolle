package com.android.wikiforkancolle;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.view.Window;
import android.graphics.Color;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import android.view.View;
import android.view.View.OnClickListener;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;

public class mapdata extends Activity {
	private ImageButton back;
	private ImageView mmapId;
	private TextView tmapId;
	
	private ViewPager mViewPager;
	private PagerAdapter mAdapter;
	private List<View> mViews = new ArrayList<View>();
	
	//TAB
	private LinearLayout mTabDrop;
	private LinearLayout mTabEnemy;
	private LinearLayout mTabGuide;
	
	private Button btDrop;
	private Button btEnemy;
	private Button btGuide;
	
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.mapdata);
		//初始化部分,初始化view，就是下面滑动的部分
		//可能导致卡顿？
		LayoutInflater mInflater = LayoutInflater.from(this);
		mViewPager = (ViewPager) findViewById(R.id.id_viewpager_mapdata);

		mAdapter = new PagerAdapter() {
	
			public void destroyItem(ViewGroup container, int position,Object object) {
				container.removeView(mViews.get(position));
			}
	
			public Object instantiateItem(ViewGroup container, int position) {
	
				View view = mViews.get(position);
				container.addView(view);
				return view;
			}
	
			public boolean isViewFromObject(View arg0, Object arg1) {
				return arg0 == arg1;
			}
	
			public int getCount() {
				return mViews.size();
			}
		};

		
		
		mTabDrop = (LinearLayout) findViewById(R.id.id_drop);
		mTabEnemy = (LinearLayout) findViewById(R.id.id_enemy);
		mTabGuide = (LinearLayout) findViewById(R.id.id_guide);
		
		btDrop = (Button) findViewById(R.id.bt_drop);
		btEnemy = (Button) findViewById(R.id.bt_enemy);
		btGuide = (Button) findViewById(R.id.bt_guide);
		
		
		//初始化海域内容
		mmapId = (ImageView)findViewById(R.id.No_map);
	    mmapId.setBackgroundResource(R.drawable.map1_1);
		tmapId = (TextView) findViewById(R.id.mapIdtext);
		tmapId.setText("1-1");
		
		//获取页面跳转信息部分
		Intent intent_map = getIntent();
		//最好能写个change函数之类的把全部一次搞定
		//根据不同的按钮点击调用不同的部分
		switch(intent_map.getExtras().getInt("map_No")){
		case R.id.oto:
			mmapId.setBackgroundResource(R.drawable.map1_1);
			tmapId.setText("1-1");
			//1-1
			View oto_01 = mInflater.inflate(R.layout.oto_enemy,null);
			View oto_02 = mInflater.inflate(R.layout.oto_new, null);
			View oto_03 = mInflater.inflate(R.layout.oto_route, null);
			mViews.add(oto_01);
			mViews.add(oto_02);
			mViews.add(oto_03);
			mViewPager.setAdapter(mAdapter);
			break;
		case R.id.ott:
			mmapId.setBackgroundResource(R.drawable.map1_2);
			tmapId.setText("1-2");
			View ott_01 = mInflater.inflate(R.layout.ott_enemy,null);
			View ott_02 = mInflater.inflate(R.layout.ott_new,null);
			View ott_03 = mInflater.inflate(R.layout.ott_route,null);
			mViews.add(ott_01);
			mViews.add(ott_02);
			mViews.add(ott_03);
			mViewPager.setAdapter(mAdapter);
		    break;
		case R.id.otth:
			mmapId.setBackgroundResource(R.drawable.map1_3);
			tmapId.setText("1-3");
			View otth_01 = mInflater.inflate(R.layout.otth_enemy,null);
			View otth_02 = mInflater.inflate(R.layout.otth_new,null);
			View otth_03 = mInflater.inflate(R.layout.otth_route,null);
			mViews.add(otth_01);
			mViews.add(otth_02);
			mViews.add(otth_03);
			mViewPager.setAdapter(mAdapter);
		    break;
		case R.id.otf:
			mmapId.setBackgroundResource(R.drawable.map1_4);
			tmapId.setText("1-4");
			View otf_01 = mInflater.inflate(R.layout.otf_enemy,null);
			View otf_02 = mInflater.inflate(R.layout.otf_new,null);
			View otf_03 = mInflater.inflate(R.layout.otf_route,null);
			mViews.add(otf_01);
			mViews.add(otf_02);
			mViews.add(otf_03);
			mViewPager.setAdapter(mAdapter);
		    break;
		case R.id.otfi:
			mmapId.setBackgroundResource(R.drawable.map1_5);
			tmapId.setText("1-5");
			View otfi_01 = mInflater.inflate(R.layout.otfi_enemy,null);
			View otfi_02 = mInflater.inflate(R.layout.otfi_new,null);
			View otfi_03 = mInflater.inflate(R.layout.otfi_route,null);
			mViews.add(otfi_01);
			mViews.add(otfi_02);
			mViews.add(otfi_03);
			mViewPager.setAdapter(mAdapter);
		    break;
		case R.id.ots:
			mmapId.setBackgroundResource(R.drawable.map1_6);
			tmapId.setText("1-6");
			View ots_01 = mInflater.inflate(R.layout.ots_enemy,null);
			View ots_02 = mInflater.inflate(R.layout.ots_new,null);
			View ots_03 = mInflater.inflate(R.layout.ots_route,null);
			mViews.add(ots_01);
			mViews.add(ots_02);
			mViews.add(ots_03);
			mViewPager.setAdapter(mAdapter);
		    break;
		case R.id.tto:
			mmapId.setBackgroundResource(R.drawable.map2_1);
			tmapId.setText("2-1");
			View tto_01 = mInflater.inflate(R.layout.tto_enemy,null);
			View tto_02 = mInflater.inflate(R.layout.tto_new,null);
			View tto_03 = mInflater.inflate(R.layout.tto_route,null);
			mViews.add(tto_01);
			mViews.add(tto_02);
			mViews.add(tto_03);
			mViewPager.setAdapter(mAdapter);
		    break;
		case R.id.ttt:
			mmapId.setBackgroundResource(R.drawable.map2_2);
			tmapId.setText("2-2");
			View ttt_01 = mInflater.inflate(R.layout.ttt_enemy,null);
			View ttt_02 = mInflater.inflate(R.layout.ttt_new,null);
			View ttt_03 = mInflater.inflate(R.layout.ttt_route,null);
			mViews.add(ttt_01);
			mViews.add(ttt_02);
			mViews.add(ttt_03);
			mViewPager.setAdapter(mAdapter);
		    break;
		case R.id.ttth:
			mmapId.setBackgroundResource(R.drawable.map2_3);
			tmapId.setText("2-3");
			View ttth_01 = mInflater.inflate(R.layout.ttth_enemy,null);
			View ttth_02 = mInflater.inflate(R.layout.ttth_new,null);
			View ttth_03 = mInflater.inflate(R.layout.ttth_route,null);
			mViews.add(ttth_01);
			mViews.add(ttth_02);
			mViews.add(ttth_03);
			mViewPager.setAdapter(mAdapter);
		    break;
		case R.id.ttf:
			mmapId.setBackgroundResource(R.drawable.map2_4);
			tmapId.setText("2-4");
			View ttf_01 = mInflater.inflate(R.layout.ttf_enemy,null);
			View ttf_02 = mInflater.inflate(R.layout.ttf_new,null);
			View ttf_03 = mInflater.inflate(R.layout.ttf_route,null);
			mViews.add(ttf_01);
			mViews.add(ttf_02);
			mViews.add(ttf_03);
			mViewPager.setAdapter(mAdapter);
		    break;
		case R.id.ttfi:
			mmapId.setBackgroundResource(R.drawable.map2_5);
			tmapId.setText("2-5");
			View ttfi_01 = mInflater.inflate(R.layout.ttfi_enemy,null);
			View ttfi_02 = mInflater.inflate(R.layout.ttfi_new,null);
			View ttfi_03 = mInflater.inflate(R.layout.ttfi_route,null);
			mViews.add(ttfi_01);
			mViews.add(ttfi_02);
			mViews.add(ttfi_03);
			mViewPager.setAdapter(mAdapter);
		    break;
		case R.id.thto:
			mmapId.setBackgroundResource(R.drawable.map3_1);
			tmapId.setText("3-1");
			View thto_01 = mInflater.inflate(R.layout.thto_enemy,null);
			View thto_02 = mInflater.inflate(R.layout.thto_new,null);
			View thto_03 = mInflater.inflate(R.layout.thto_route,null);
			mViews.add(thto_01);
			mViews.add(thto_02);
			mViews.add(thto_03);
			mViewPager.setAdapter(mAdapter);
		    break;
		case R.id.thtt:
			mmapId.setBackgroundResource(R.drawable.map3_2);
			tmapId.setText("3-2");
			View thtt_01 = mInflater.inflate(R.layout.thtt_enemy,null);
			View thtt_02 = mInflater.inflate(R.layout.thtt_new,null);
			View thtt_03 = mInflater.inflate(R.layout.thtt_route,null);
			mViews.add(thtt_01);
			mViews.add(thtt_02);
			mViews.add(thtt_03);
			mViewPager.setAdapter(mAdapter);
		    break;
		case R.id.thtth:
			mmapId.setBackgroundResource(R.drawable.map3_3);
			tmapId.setText("3-3");
			View thtth_01 = mInflater.inflate(R.layout.thtth_enemy,null);
			View thtth_02 = mInflater.inflate(R.layout.thtth_new,null);
			View thtth_03 = mInflater.inflate(R.layout.thtth_route,null);
			mViews.add(thtth_01);
			mViews.add(thtth_02);
			mViews.add(thtth_03);
			mViewPager.setAdapter(mAdapter);
		    break;
		case R.id.thtf:
			mmapId.setBackgroundResource(R.drawable.map3_4);
			tmapId.setText("3-4");
			View thtf_01 = mInflater.inflate(R.layout.thtf_enemy,null);
			View thtf_02 = mInflater.inflate(R.layout.thtf_new,null);
			View thtf_03 = mInflater.inflate(R.layout.thtf_route,null);
			mViews.add(thtf_01);
			mViews.add(thtf_02);
			mViews.add(thtf_03);
			mViewPager.setAdapter(mAdapter);
		    break;
		case R.id.thtfi:
			mmapId.setBackgroundResource(R.drawable.map3_5);
			tmapId.setText("3-5");
			View thtfi_01 = mInflater.inflate(R.layout.thtfi_enemy,null);
			View thtfi_02 = mInflater.inflate(R.layout.thtfi_new,null);
			View thtfi_03 = mInflater.inflate(R.layout.thtfi_route,null);
			mViews.add(thtfi_01);
			mViews.add(thtfi_02);
			mViews.add(thtfi_03);
			mViewPager.setAdapter(mAdapter);
			break;
		case R.id.fto:
			mmapId.setBackgroundResource(R.drawable.map4_1);
			tmapId.setText("4-1");
			View fto_01 = mInflater.inflate(R.layout.fto_enemy,null);
			View fto_02 = mInflater.inflate(R.layout.fto_new,null);
			View fto_03 = mInflater.inflate(R.layout.fto_route,null);
			mViews.add(fto_01);
			mViews.add(fto_02);
			mViews.add(fto_03);
			mViewPager.setAdapter(mAdapter);
			break;
		case R.id.ftt:
			mmapId.setBackgroundResource(R.drawable.map4_2);
			tmapId.setText("4-2");
			View ftt_01 = mInflater.inflate(R.layout.ftt_enemy,null);
			View ftt_02 = mInflater.inflate(R.layout.ftt_new,null);
			View ftt_03 = mInflater.inflate(R.layout.ftt_route,null);
			mViews.add(ftt_01);
			mViews.add(ftt_02);
			mViews.add(ftt_03);
			mViewPager.setAdapter(mAdapter);
			break;
		case R.id.ftth:
			mmapId.setBackgroundResource(R.drawable.map4_3);
			tmapId.setText("4-3");
			View ftth_01 = mInflater.inflate(R.layout.ftth_enemy,null);
			View ftth_02 = mInflater.inflate(R.layout.ftth_new,null);
			View ftth_03 = mInflater.inflate(R.layout.ftth_route,null);
			mViews.add(ftth_01);
			mViews.add(ftth_02);
			mViews.add(ftth_03);
			mViewPager.setAdapter(mAdapter);
			break;
		case R.id.ftf:
			mmapId.setBackgroundResource(R.drawable.map4_4);
			tmapId.setText("4-4");
			View ftf_01 = mInflater.inflate(R.layout.ftf_enemy,null);
			View ftf_02 = mInflater.inflate(R.layout.ftf_new,null);
			View ftf_03 = mInflater.inflate(R.layout.ftf_route,null);
			mViews.add(ftf_01);
			mViews.add(ftf_02);
			mViews.add(ftf_03);
			mViewPager.setAdapter(mAdapter);
			break;
		case R.id.ftfi:
			mmapId.setBackgroundResource(R.drawable.map4_5);
			tmapId.setText("4-5");
			View ftfi_01 = mInflater.inflate(R.layout.ftfi_enemy,null);
			View ftfi_02 = mInflater.inflate(R.layout.ftfi_new,null);
			View ftfi_03 = mInflater.inflate(R.layout.ftfi_route,null);
			mViews.add(ftfi_01);
			mViews.add(ftfi_02);
			mViews.add(ftfi_03);
			mViewPager.setAdapter(mAdapter);
			break;
		case R.id.fito:
			mmapId.setBackgroundResource(R.drawable.map5_1);
			tmapId.setText("5-1");
			View fito_01 = mInflater.inflate(R.layout.fito_enemy,null);
			View fito_02 = mInflater.inflate(R.layout.fito_new,null);
			View fito_03 = mInflater.inflate(R.layout.fito_route,null);
			mViews.add(fito_01);
			mViews.add(fito_02);
			mViews.add(fito_03);
			mViewPager.setAdapter(mAdapter);
			break;
		case R.id.fitt:
			mmapId.setBackgroundResource(R.drawable.map5_2);
			tmapId.setText("5-2");
			View fitt_01 = mInflater.inflate(R.layout.fitt_enemy,null);
			View fitt_02 = mInflater.inflate(R.layout.fitt_new,null);
			View fitt_03 = mInflater.inflate(R.layout.fitt_route,null);
			mViews.add(fitt_01);
			mViews.add(fitt_02);
			mViews.add(fitt_03);
			mViewPager.setAdapter(mAdapter);
			break;
		case R.id.fitth:
			mmapId.setBackgroundResource(R.drawable.map5_3);
			tmapId.setText("5-3");
			View fitth_01 = mInflater.inflate(R.layout.fitth_enemy,null);
			View fitth_02 = mInflater.inflate(R.layout.fitth_new,null);
			View fitth_03 = mInflater.inflate(R.layout.fitth_route,null);
			mViews.add(fitth_01);
			mViews.add(fitth_02);
			mViews.add(fitth_03);
			mViewPager.setAdapter(mAdapter);
			break;
		case R.id.fitf:
			mmapId.setBackgroundResource(R.drawable.map5_4);
			tmapId.setText("5-4");
			View fitf_01 = mInflater.inflate(R.layout.fitf_enemy,null);
			View fitf_02 = mInflater.inflate(R.layout.fitf_new,null);
			View fitf_03 = mInflater.inflate(R.layout.fitf_route,null);
			mViews.add(fitf_01);
			mViews.add(fitf_02);
			mViews.add(fitf_03);
			mViewPager.setAdapter(mAdapter);
			break;
		case R.id.fitfi:
			mmapId.setBackgroundResource(R.drawable.map5_5);
			tmapId.setText("5-5");
			View fitfi_01 = mInflater.inflate(R.layout.fitfi_enemy,null);
			View fitfi_02 = mInflater.inflate(R.layout.fitfi_new,null);
			View fitfi_03 = mInflater.inflate(R.layout.fitfi_route,null);
			mViews.add(fitfi_01);
			mViews.add(fitfi_02);
			mViews.add(fitfi_03);
			mViewPager.setAdapter(mAdapter);
			break;
		case R.id.sto:
			mmapId.setBackgroundResource(R.drawable.map6_1);
			tmapId.setText("6-1");
			View sto_01 = mInflater.inflate(R.layout.sto_enemy,null);
			View sto_02 = mInflater.inflate(R.layout.sto_new,null);
			View sto_03 = mInflater.inflate(R.layout.sto_route,null);
			mViews.add(sto_01);
			mViews.add(sto_02);
			mViews.add(sto_03);
			mViewPager.setAdapter(mAdapter);
			break;
		case R.id.stt:
			mmapId.setBackgroundResource(R.drawable.map6_2);
			tmapId.setText("6-2");
			View stt_01 = mInflater.inflate(R.layout.stt_enemy,null);
			View stt_02 = mInflater.inflate(R.layout.stt_new,null);
			View stt_03 = mInflater.inflate(R.layout.stt_route,null);
			mViews.add(stt_01);
			mViews.add(stt_02);
			mViews.add(stt_03);
			mViewPager.setAdapter(mAdapter);
			break;
		case R.id.stth:
			mmapId.setBackgroundResource(R.drawable.map6_3);
			tmapId.setText("6-3");
			View stth_01 = mInflater.inflate(R.layout.stth_enemy,null);
			View stth_02 = mInflater.inflate(R.layout.stth_new,null);
			View stth_03 = mInflater.inflate(R.layout.stth_route,null);
			mViews.add(stth_01);
			mViews.add(stth_02);
			mViews.add(stth_03);
			mViewPager.setAdapter(mAdapter);
			break;
		default:
			break;
		}
		//点击事件部分
		getFocus(btEnemy);
		btEnemy.setTextColor(Color.WHITE);
		OnClickListener OCL = new OnClickListener() {
			@Override
			public void onClick(View v) {
				lostFocus(btEnemy);
				lostFocus(btDrop);
				lostFocus(btGuide);
				resetTextColor();
				switch(v.getId()){
				case R.id.bt_enemy:
					mViewPager.setCurrentItem(0);
					getFocus(btEnemy);
					btEnemy.setTextColor(Color.WHITE);
					break;
				case R.id.bt_drop:
					mViewPager.setCurrentItem(1);
					getFocus(btDrop);
					btDrop.setTextColor(Color.WHITE);
					break;
				case R.id.bt_guide:
					mViewPager.setCurrentItem(2);
					getFocus(btGuide);
					btGuide.setTextColor(Color.WHITE);
					break;
				default:
					break;
				}
			}
		};
		//中间3个按钮的点击事件
		btDrop.setOnClickListener(OCL);
		btEnemy.setOnClickListener(OCL);
		btGuide.setOnClickListener(OCL);
		//中间三个按钮的滑动
		mViewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
			@Override
			public void onPageSelected(int arg0) {
				int currentItem = mViewPager.getCurrentItem();
				lostFocus(btEnemy);
				lostFocus(btDrop);
				lostFocus(btGuide);
				resetTextColor();

				switch (currentItem){
				case 0:
					getFocus(btEnemy);
					btEnemy.setTextColor(Color.WHITE);
					break;
				case 1:
					getFocus(btDrop);
					btDrop.setTextColor(Color.WHITE);
					break;
				case 2:
					getFocus(btGuide);
					btGuide.setTextColor(Color.WHITE);
					break;
				default:
					break;
				}
			}
			@Override
			public void onPageScrolled(int arg0, float arg1, int arg2) {
				
			}
			
			@Override
			public void onPageScrollStateChanged(int arg0) {
				
			}
		});
		
		back = (ImageButton) findViewById(R.id.back);
		back.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				finish();
			}
		});
	}
	
	
	private void getFocus(View v){
		v.setFocusable(true);
		v.setFocusableInTouchMode(true);
		v.requestFocus();
		v.requestFocusFromTouch();
	}
	private void lostFocus(View v){
		v.setFocusable(false);
	}
	private void resetTextColor(){
		btEnemy.setTextColor(Color.BLACK);
		btDrop.setTextColor(Color.BLACK);
		btGuide.setTextColor(Color.BLACK);
	}
}
