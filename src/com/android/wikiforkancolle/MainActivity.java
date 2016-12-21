package com.android.wikiforkancolle;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener {

	/***************************** ↓ Previous Setting Here ↓ *************************/

	public static boolean usePixivImage = false;
	private Switch imageSwitchButton;

	/***************************** ↓ Init of the databases ↓ *************************/
	private Context mContext;
	private SQLiteDatabase db;
	private MyDBOpenHelper myDBHelper;
	private static final String DATABASE_PATH = "/data/data/com.android.wikiforkancolle/databases/";
	private static final String DATABASE_MAIN = "kancolle.db";
	private static final String DATABASE_VOICE = "voice.db";

	public static boolean copyFileFromAssets(Context context, String filepath,
			String fileName) {
		boolean result = false;
		try {
			// 检查 SQLite 数据库文件是否存在
			// if ((new File(filepath + fileName)).exists() == false) {
			// 如 SQLite 数据库文件不存在，再检查一下 database 目录是否存在
			File f = new File(filepath);
			// 如 database 目录不存在，新建该目录
			if (!f.exists()) {
				f.mkdir();
			}
			try {
				// 得到 assets 目录下我们实现准备好的 SQLite 数据库作为输入流
				InputStream is = context.getAssets().open(fileName);
				// 输出流
				OutputStream os = new FileOutputStream(filepath + fileName);
				// 文件写入
				byte[] buffer = new byte[1024];
				int length;
				while ((length = is.read(buffer)) > 0) {
					os.write(buffer, 0, length);
				}
				// 关闭文件流
				os.flush();
				os.close();
				is.close();
				result = true;
			} catch (Exception e) {
				e.printStackTrace();
			}
			// }
		} catch (Exception e) {
			// TODO: handle exception
		}
		return result;
	}

	/***************************** ↑这里是对数据库的初始化↑ *************************/

	private boolean isExit;
	private ViewPager mViewPager;
	private PagerAdapter mAdapter;
	private List<View> mViews = new ArrayList<View>();
	// TAB
	private LinearLayout mTabMap;
	private LinearLayout mTabShip;
	private LinearLayout mTabEquip;
	private LinearLayout mTabRes;
	private LinearLayout mTabAssign;
	private LinearLayout mTabMore;

	private ImageButton mMapImg;
	private ImageButton mShipImg;
	private ImageButton mEquipImg;
	private ImageButton mResImg;
	private ImageButton mAssignImg;
	private ImageButton mMoreImg;

	// 海域按钮 oto对应one to one(1-1)
	private ImageButton oto;
	private ImageButton ott;
	private ImageButton otth;
	private ImageButton otf;
	private ImageButton otfi;
	private ImageButton ots;

	private ImageButton tto;
	private ImageButton ttt;
	private ImageButton ttth;
	private ImageButton ttf;
	private ImageButton ttfi;

	private ImageButton thto;
	private ImageButton thtt;
	private ImageButton thtth;
	private ImageButton thtf;
	private ImageButton thtfi;

	private ImageButton fto;
	private ImageButton ftt;
	private ImageButton ftth;
	private ImageButton ftf;
	private ImageButton ftfi;
	private ImageButton fito;

	private ImageButton fitt;
	private ImageButton fitth;
	private ImageButton fitf;
	private ImageButton fitfi;
	private ImageButton sto;
	private ImageButton stt;
	private ImageButton stth;

	// 舰船按钮
	private ImageButton bt_as;
	private ImageButton bt_av;
	private ImageButton bt_bb;
	private ImageButton bt_ca;
	private ImageButton bt_cl;
	private ImageButton bt_clt;
	private ImageButton bt_cv;
	private ImageButton bt_cvl;
	private ImageButton bt_dd;
	private ImageButton bt_fix;
	private ImageButton bt_lha;
	private ImageButton bt_prac;
	private ImageButton bt_ss;
	private ImageButton bt_support;

	private ImageButton bt_search; // 搜索按钮

	// 远征按钮
	private ImageButton o_o;
	private ImageButton o_t;
	private ImageButton o_th;
	private ImageButton o_f;
	private ImageButton o_fi;
	private ImageButton o_s;
	private ImageButton o_se;
	private ImageButton o_e;

	private ImageButton t_o;
	private ImageButton t_t;
	private ImageButton t_th;
	private ImageButton t_f;
	private ImageButton t_fi;
	private ImageButton t_s;
	private ImageButton t_se;
	private ImageButton t_e;

	private ImageButton th_o;
	private ImageButton th_t;
	private ImageButton th_th;
	private ImageButton th_f;
	private ImageButton th_fi;
	private ImageButton th_s;
	private ImageButton th_se;
	private ImageButton th_e;

	private ImageButton f_o;
	private ImageButton f_t;
	private ImageButton f_th;
	private ImageButton f_f;
	private ImageButton f_fi;
	private ImageButton f_s;
	private ImageButton f_se;
	private ImageButton f_e;

	private ImageButton fi_o;
	private ImageButton fi_t;
	private ImageButton fi_th;
	private ImageButton fi_f;
	private ImageButton fi_fi;
	private ImageButton fi_s;
	private ImageButton fi_se;
	private ImageButton fi_e;

	// 任务按钮
	private ImageButton make;
	private ImageButton go;
	private ImageButton exer;
	private ImageButton expe;
	private ImageButton sup;
	private ImageButton fcry;
	private ImageButton chge;
	private ImageButton wedd;

	// 装备按钮
	private ImageButton aafd;
	private ImageButton aagun;
	private ImageButton aswsonar;
	private ImageButton bomber;
	private ImageButton bulge;
	private ImageButton depth;
	private ImageButton econ;
	private ImageButton engine;
	private ImageButton fighter;
	private ImageButton ld;
	private ImageButton main;
	private ImageButton notknow;
	private ImageButton radar;
	private ImageButton repair;
	private ImageButton sentry;
	private ImageButton sub;
	private ImageButton torpedo;
	private ImageButton tpd;

	// 关于按钮
	private ImageButton about;
	private ImageButton loginPage;

	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		if (keyCode == KeyEvent.KEYCODE_BACK) {
			exit();
		}
		return false;
	}

	private void exit() {
		Timer mTimer = null;
		if (isExit == false) {
			isExit = true;
			mTimer = new Timer();
			Toast.makeText(this, "再点一次就退出哦(´・ω・｀)", Toast.LENGTH_SHORT).show();
			mTimer.schedule(new TimerTask() {
				@Override
				public void run() {
					isExit = false;
				}
			}, 2000);
		} else {
			finish();
			System.exit(0);
		}
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_main);

		initView();

		initEvents();
		mContext = MainActivity.this;
		copyFileFromAssets(mContext, DATABASE_PATH, DATABASE_VOICE);
		copyFileFromAssets(mContext, DATABASE_PATH, DATABASE_MAIN);
	}

	private void initEvents() {
		// tab的点击监听器
		mTabMap.setOnClickListener(this);
		mTabShip.setOnClickListener(this);
		mTabEquip.setOnClickListener(this);
		mTabRes.setOnClickListener(this);
		mTabAssign.setOnClickListener(this);
		mTabMore.setOnClickListener(this);
		// 滑动效果
		mViewPager
				.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {

					private int currentItem;

					public void onPageSelected(int arg0) {
						int currentItem = mViewPager.getCurrentItem();
						resetImg();
						switch (currentItem) {
						case 0:
							mMapImg.setImageResource(R.drawable.mapicon2);
							break;
						case 1:
							mShipImg.setImageResource(R.drawable.shipicon2);
							break;
						case 2:
							mEquipImg.setImageResource(R.drawable.equipicon2);
							break;
						case 3:
							mResImg.setImageResource(R.drawable.resicon2);
							break;
						case 4:
							mAssignImg.setImageResource(R.drawable.assignicon2);
							break;
						case 5:
							mMoreImg.setImageResource(R.drawable.more2);

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

		// 海域按钮点击监听器
		oto.setOnClickListener(this);
		ott.setOnClickListener(this);
		otth.setOnClickListener(this);
		otf.setOnClickListener(this);
		otfi.setOnClickListener(this);
		ots.setOnClickListener(this);

		tto.setOnClickListener(this);
		ttt.setOnClickListener(this);
		ttth.setOnClickListener(this);
		ttf.setOnClickListener(this);
		ttfi.setOnClickListener(this);

		thto.setOnClickListener(this);
		thtt.setOnClickListener(this);
		thtth.setOnClickListener(this);
		thtf.setOnClickListener(this);
		thtfi.setOnClickListener(this);

		fto.setOnClickListener(this);
		ftt.setOnClickListener(this);
		ftth.setOnClickListener(this);
		ftf.setOnClickListener(this);
		ftfi.setOnClickListener(this);

		fito.setOnClickListener(this);
		fitt.setOnClickListener(this);
		fitth.setOnClickListener(this);
		fitf.setOnClickListener(this);
		fitfi.setOnClickListener(this);

		sto.setOnClickListener(this);
		stt.setOnClickListener(this);
		stth.setOnClickListener(this);
		// 舰船按钮监听器
		bt_as.setOnClickListener(this);
		bt_av.setOnClickListener(this);
		bt_bb.setOnClickListener(this);
		bt_ca.setOnClickListener(this);
		bt_cl.setOnClickListener(this);
		bt_clt.setOnClickListener(this);
		bt_cv.setOnClickListener(this);
		bt_cvl.setOnClickListener(this);
		bt_dd.setOnClickListener(this);
		bt_fix.setOnClickListener(this);
		bt_lha.setOnClickListener(this);
		bt_prac.setOnClickListener(this);
		bt_ss.setOnClickListener(this);
		bt_support.setOnClickListener(this);

		bt_search.setOnClickListener(this);// 搜索

		// 远征按钮监听器
		o_o.setOnClickListener(this);
		o_t.setOnClickListener(this);
		o_th.setOnClickListener(this);
		o_f.setOnClickListener(this);
		o_fi.setOnClickListener(this);
		o_s.setOnClickListener(this);
		o_se.setOnClickListener(this);
		o_e.setOnClickListener(this);

		t_o.setOnClickListener(this);
		t_t.setOnClickListener(this);
		t_th.setOnClickListener(this);
		t_f.setOnClickListener(this);
		t_fi.setOnClickListener(this);
		t_s.setOnClickListener(this);
		t_se.setOnClickListener(this);
		t_e.setOnClickListener(this);

		th_o.setOnClickListener(this);
		th_t.setOnClickListener(this);
		th_th.setOnClickListener(this);
		th_f.setOnClickListener(this);
		th_fi.setOnClickListener(this);
		th_s.setOnClickListener(this);
		th_se.setOnClickListener(this);
		th_e.setOnClickListener(this);

		f_o.setOnClickListener(this);
		f_t.setOnClickListener(this);
		f_th.setOnClickListener(this);
		f_f.setOnClickListener(this);
		f_fi.setOnClickListener(this);
		f_s.setOnClickListener(this);
		f_se.setOnClickListener(this);
		f_e.setOnClickListener(this);

		fi_o.setOnClickListener(this);
		fi_t.setOnClickListener(this);
		fi_th.setOnClickListener(this);
		fi_f.setOnClickListener(this);
		fi_fi.setOnClickListener(this);
		fi_s.setOnClickListener(this);
		fi_se.setOnClickListener(this);
		fi_e.setOnClickListener(this);

		// 任务按钮监听器
		make.setOnClickListener(this);
		go.setOnClickListener(this);
		exer.setOnClickListener(this);
		expe.setOnClickListener(this);
		sup.setOnClickListener(this);
		fcry.setOnClickListener(this);
		chge.setOnClickListener(this);
		wedd.setOnClickListener(this);

		// 装备按钮监听器
		aafd.setOnClickListener(this);
		aagun.setOnClickListener(this);
		aswsonar.setOnClickListener(this);
		bomber.setOnClickListener(this);
		bulge.setOnClickListener(this);
		depth.setOnClickListener(this);
		econ.setOnClickListener(this);
		engine.setOnClickListener(this);
		fighter.setOnClickListener(this);
		ld.setOnClickListener(this);
		main.setOnClickListener(this);
		notknow.setOnClickListener(this);
		radar.setOnClickListener(this);
		repair.setOnClickListener(this);
		sentry.setOnClickListener(this);
		sub.setOnClickListener(this);
		torpedo.setOnClickListener(this);
		tpd.setOnClickListener(this);

		// 更多界面按钮监听器
		about.setOnClickListener(this);
		loginPage.setOnClickListener(this);
		imageSwitchButton
				.setOnCheckedChangeListener(new OnCheckedChangeListener() {
					@Override
					public void onCheckedChanged(CompoundButton buttonView,
							boolean isChecked) {
						// TODO Auto-generated method stub
						if (isChecked) {
							usePixivImage = true;
						} else {
							usePixivImage = false;
						}
					}
				});

	}

	// 全部初始化
	private void initView() {
		mViewPager = (ViewPager) findViewById(R.id.id_viewpager);

		// tabs
		mTabMap = (LinearLayout) findViewById(R.id.id_tab_map);
		mTabShip = (LinearLayout) findViewById(R.id.id_tab_ship);
		mTabEquip = (LinearLayout) findViewById(R.id.id_tab_equip);
		mTabRes = (LinearLayout) findViewById(R.id.id_tab_res);
		mTabAssign = (LinearLayout) findViewById(R.id.id_tab_assign);
		mTabMore = (LinearLayout) findViewById(R.id.id_tab_more);

		// ImageButton
		mMapImg = (ImageButton) findViewById(R.id.id_map_img);
		mShipImg = (ImageButton) findViewById(R.id.id_ship_img);
		mEquipImg = (ImageButton) findViewById(R.id.id_equip_img);
		mResImg = (ImageButton) findViewById(R.id.id_res_img);
		mAssignImg = (ImageButton) findViewById(R.id.id_assign_img);
		mMoreImg = (ImageButton) findViewById(R.id.id_more_img);

		// 初始化view
		LayoutInflater mInflater = LayoutInflater.from(this);
		View map = mInflater.inflate(R.layout.map, null);
		View ship = mInflater.inflate(R.layout.ship, null);
		View equip = mInflater.inflate(R.layout.equip, null);
		View res = mInflater.inflate(R.layout.resou, null);
		View assign = mInflater.inflate(R.layout.assign, null);
		View more = mInflater.inflate(R.layout.more, null);
		// View mapdata = mInflater.inflate(R.layout.mapdata, null);
		// 初始化海域按钮
		oto = (ImageButton) map.findViewById(R.id.oto);
		ott = (ImageButton) map.findViewById(R.id.ott);
		otth = (ImageButton) map.findViewById(R.id.otth);
		otf = (ImageButton) map.findViewById(R.id.otf);
		otfi = (ImageButton) map.findViewById(R.id.otfi);
		ots = (ImageButton) map.findViewById(R.id.ots);

		tto = (ImageButton) map.findViewById(R.id.tto);
		ttt = (ImageButton) map.findViewById(R.id.ttt);
		ttth = (ImageButton) map.findViewById(R.id.ttth);
		ttf = (ImageButton) map.findViewById(R.id.ttf);
		ttfi = (ImageButton) map.findViewById(R.id.ttfi);

		thto = (ImageButton) map.findViewById(R.id.thto);
		thtt = (ImageButton) map.findViewById(R.id.thtt);
		thtth = (ImageButton) map.findViewById(R.id.thtth);
		thtf = (ImageButton) map.findViewById(R.id.thtf);
		thtfi = (ImageButton) map.findViewById(R.id.thtfi);

		fto = (ImageButton) map.findViewById(R.id.fto);
		ftt = (ImageButton) map.findViewById(R.id.ftt);
		ftth = (ImageButton) map.findViewById(R.id.ftth);
		ftf = (ImageButton) map.findViewById(R.id.ftf);
		ftfi = (ImageButton) map.findViewById(R.id.ftfi);

		fito = (ImageButton) map.findViewById(R.id.fito);
		fitt = (ImageButton) map.findViewById(R.id.fitt);
		fitth = (ImageButton) map.findViewById(R.id.fitth);
		fitf = (ImageButton) map.findViewById(R.id.fitf);
		fitfi = (ImageButton) map.findViewById(R.id.fitfi);

		sto = (ImageButton) map.findViewById(R.id.sto);
		stt = (ImageButton) map.findViewById(R.id.stt);
		stth = (ImageButton) map.findViewById(R.id.stth);

		// 初始化舰船按钮
		bt_as = (ImageButton) ship.findViewById(R.id.AS);
		bt_av = (ImageButton) ship.findViewById(R.id.AV);
		bt_bb = (ImageButton) ship.findViewById(R.id.BB);
		bt_ca = (ImageButton) ship.findViewById(R.id.CA);
		bt_cl = (ImageButton) ship.findViewById(R.id.CL);
		bt_clt = (ImageButton) ship.findViewById(R.id.CLT);
		bt_cv = (ImageButton) ship.findViewById(R.id.CV);
		bt_cvl = (ImageButton) ship.findViewById(R.id.CVL);
		bt_dd = (ImageButton) ship.findViewById(R.id.DD);
		bt_fix = (ImageButton) ship.findViewById(R.id.Fix);
		bt_lha = (ImageButton) ship.findViewById(R.id.LHA);
		bt_prac = (ImageButton) ship.findViewById(R.id.Prac);
		bt_ss = (ImageButton) ship.findViewById(R.id.SS);
		bt_support = (ImageButton) ship.findViewById(R.id.Support);

		bt_search = (ImageButton) ship.findViewById(R.id.search);// 搜索

		// 初始化远征按钮
		o_o = (ImageButton) res.findViewById(R.id.o_o);
		o_t = (ImageButton) res.findViewById(R.id.o_t);
		o_th = (ImageButton) res.findViewById(R.id.o_th);
		o_f = (ImageButton) res.findViewById(R.id.o_f);
		o_fi = (ImageButton) res.findViewById(R.id.o_fi);
		o_s = (ImageButton) res.findViewById(R.id.o_s);
		o_se = (ImageButton) res.findViewById(R.id.o_se);
		o_e = (ImageButton) res.findViewById(R.id.o_e);

		t_o = (ImageButton) res.findViewById(R.id.t_o);
		t_t = (ImageButton) res.findViewById(R.id.t_t);
		t_th = (ImageButton) res.findViewById(R.id.t_th);
		t_f = (ImageButton) res.findViewById(R.id.t_f);
		t_fi = (ImageButton) res.findViewById(R.id.t_fi);
		t_s = (ImageButton) res.findViewById(R.id.t_s);
		t_se = (ImageButton) res.findViewById(R.id.t_se);
		t_e = (ImageButton) res.findViewById(R.id.t_e);

		th_o = (ImageButton) res.findViewById(R.id.th_o);
		th_t = (ImageButton) res.findViewById(R.id.th_t);
		th_th = (ImageButton) res.findViewById(R.id.th_th);
		th_f = (ImageButton) res.findViewById(R.id.th_f);
		th_fi = (ImageButton) res.findViewById(R.id.th_fi);
		th_s = (ImageButton) res.findViewById(R.id.th_s);
		th_se = (ImageButton) res.findViewById(R.id.th_se);
		th_e = (ImageButton) res.findViewById(R.id.th_e);

		f_o = (ImageButton) res.findViewById(R.id.f_o);
		f_t = (ImageButton) res.findViewById(R.id.f_t);
		f_th = (ImageButton) res.findViewById(R.id.f_th);
		f_f = (ImageButton) res.findViewById(R.id.f_f);
		f_fi = (ImageButton) res.findViewById(R.id.f_fi);
		f_s = (ImageButton) res.findViewById(R.id.f_s);
		f_se = (ImageButton) res.findViewById(R.id.f_se);
		f_e = (ImageButton) res.findViewById(R.id.f_e);

		fi_o = (ImageButton) res.findViewById(R.id.fi_o);
		fi_t = (ImageButton) res.findViewById(R.id.fi_t);
		fi_th = (ImageButton) res.findViewById(R.id.fi_th);
		fi_f = (ImageButton) res.findViewById(R.id.fi_f);
		fi_fi = (ImageButton) res.findViewById(R.id.fi_fi);
		fi_s = (ImageButton) res.findViewById(R.id.fi_s);
		fi_se = (ImageButton) res.findViewById(R.id.fi_se);
		fi_e = (ImageButton) res.findViewById(R.id.fi_e);

		// 初始化任务按钮
		make = (ImageButton) assign.findViewById(R.id.make);
		go = (ImageButton) assign.findViewById(R.id.go);
		exer = (ImageButton) assign.findViewById(R.id.exer);
		expe = (ImageButton) assign.findViewById(R.id.expe);
		sup = (ImageButton) assign.findViewById(R.id.sup);
		fcry = (ImageButton) assign.findViewById(R.id.fcry);
		chge = (ImageButton) assign.findViewById(R.id.chge);
		wedd = (ImageButton) assign.findViewById(R.id.wedd);

		// 初始化装备按钮
		aafd = (ImageButton) equip.findViewById(R.id.gao);
		aagun = (ImageButton) equip.findViewById(R.id.kong);
		aswsonar = (ImageButton) equip.findViewById(R.id.na);
		bomber = (ImageButton) equip.findViewById(R.id.bao);
		bulge = (ImageButton) equip.findViewById(R.id.zen);
		depth = (ImageButton) equip.findViewById(R.id.baolei);
		econ = (ImageButton) equip.findViewById(R.id.zhen);
		engine = (ImageButton) equip.findViewById(R.id.ji);
		fighter = (ImageButton) equip.findViewById(R.id.zhan);
		ld = (ImageButton) equip.findViewById(R.id.ting);
		main = (ImageButton) equip.findViewById(R.id.zhu);
		notknow = (ImageButton) equip.findViewById(R.id.others);
		radar = (ImageButton) equip.findViewById(R.id.tan);
		repair = (ImageButton) equip.findViewById(R.id.xiu);
		sentry = (ImageButton) equip.findViewById(R.id.shao);
		sub = (ImageButton) equip.findViewById(R.id.fu);
		torpedo = (ImageButton) equip.findViewById(R.id.gong);
		tpd = (ImageButton) equip.findViewById(R.id.lei);

		// 初始化更多按钮
		about = (ImageButton) more.findViewById(R.id.about);
		loginPage = (ImageButton) more.findViewById(R.id.logIn);
		imageSwitchButton = (Switch) more.findViewById(R.id.ImageSwitchButton);

		// 把view加入list
		mViews.add(map);
		mViews.add(ship);
		mViews.add(equip);
		mViews.add(res);
		mViews.add(assign);
		mViews.add(more);

		// 设置适配器
		mAdapter = new PagerAdapter() {

			@Override
			public void destroyItem(ViewGroup container, int position,
					Object object) {
				container.removeView(mViews.get(position));
			}

			@Override
			public Object instantiateItem(ViewGroup container, int position) {

				View view = mViews.get(position);
				container.addView(view);
				return view;
			}

			@Override
			public boolean isViewFromObject(View arg0, Object arg1) {
				return arg0 == arg1;
			}

			@Override
			public int getCount() {
				return mViews.size();
			}
		};
		mViewPager.setAdapter(mAdapter);

	}

	// 点击事件
	@Override
	public void onClick(View v) {
		Intent intent_map = new Intent(MainActivity.this, mapdata.class);
		Intent intent_ship = new Intent(MainActivity.this, shiptype.class);
		Intent intent_assgin = new Intent(MainActivity.this, assigndata.class);
		Intent intent_equip = new Intent(MainActivity.this, equiptype.class);
		Intent intent_search = new Intent(MainActivity.this, shipsearch.class);

		AlertDialog.Builder builder = new AlertDialog.Builder(this);

		// resetImg();
		switch (v.getId()) {
		/***************************** ↓这里开始是主界面的6个按钮↓ *************************/
		case R.id.id_tab_map:
			mViewPager.setCurrentItem(0);
			mMapImg.setImageResource(R.drawable.mapicon2);
			break;
		case R.id.id_tab_ship:
			mViewPager.setCurrentItem(1);
			mShipImg.setImageResource(R.drawable.shipicon2);
			break;
		case R.id.id_tab_equip:
			mViewPager.setCurrentItem(2);
			mEquipImg.setImageResource(R.drawable.equipicon2);
			break;
		case R.id.id_tab_res:
			mViewPager.setCurrentItem(3);
			mResImg.setImageResource(R.drawable.resicon2);
			break;
		case R.id.id_tab_assign:
			mViewPager.setCurrentItem(4);
			mAssignImg.setImageResource(R.drawable.assignicon2);
			break;
		case R.id.id_tab_more:
			mViewPager.setCurrentItem(5);
			mMoreImg.setImageResource(R.drawable.more2);
			break;
		/***************************** ↓这里开始是海域的按钮↓ *************************/
		case R.id.oto:
			intent_map.putExtra("map_No", R.id.oto);
			startActivity(intent_map);
			// mapId.setBackgroundResource(R.drawable.map1_1);
			break;
		case R.id.ott:
			intent_map.putExtra("map_No", R.id.ott);
			startActivity(intent_map);
			// mapId.setBackgroundResource(R.drawable.map1_2);
			break;
		case R.id.otth:
			intent_map.putExtra("map_No", R.id.otth);
			startActivity(intent_map);
			break;
		case R.id.otf:
			intent_map.putExtra("map_No", R.id.otf);
			startActivity(intent_map);
			break;
		case R.id.otfi:
			intent_map.putExtra("map_No", R.id.otfi);
			startActivity(intent_map);
			break;
		case R.id.ots:
			intent_map.putExtra("map_No", R.id.ots);
			startActivity(intent_map);
			break;
		case R.id.tto:
			intent_map.putExtra("map_No", R.id.tto);
			startActivity(intent_map);
			break;
		case R.id.ttt:
			intent_map.putExtra("map_No", R.id.ttt);
			startActivity(intent_map);
			break;
		case R.id.ttth:
			intent_map.putExtra("map_No", R.id.ttth);
			startActivity(intent_map);
			break;
		case R.id.ttf:
			intent_map.putExtra("map_No", R.id.ttf);
			startActivity(intent_map);
			break;
		case R.id.ttfi:
			intent_map.putExtra("map_No", R.id.ttfi);
			startActivity(intent_map);
			break;
		case R.id.thto:
			intent_map.putExtra("map_No", R.id.thto);
			startActivity(intent_map);
			break;
		case R.id.thtt:
			intent_map.putExtra("map_No", R.id.thtt);
			startActivity(intent_map);
			break;
		case R.id.thtth:
			intent_map.putExtra("map_No", R.id.thtth);
			startActivity(intent_map);
			break;
		case R.id.thtf:
			intent_map.putExtra("map_No", R.id.thtf);
			startActivity(intent_map);
			break;
		case R.id.thtfi:
			intent_map.putExtra("map_No", R.id.thtfi);
			startActivity(intent_map);
			break;
		case R.id.fto:
			intent_map.putExtra("map_No", R.id.fto);
			startActivity(intent_map);
			break;
		case R.id.ftt:
			intent_map.putExtra("map_No", R.id.ftt);
			startActivity(intent_map);
			break;
		case R.id.ftth:
			intent_map.putExtra("map_No", R.id.ftth);
			startActivity(intent_map);
			break;
		case R.id.ftf:
			intent_map.putExtra("map_No", R.id.ftf);
			startActivity(intent_map);
			break;
		case R.id.ftfi:
			intent_map.putExtra("map_No", R.id.ftfi);
			startActivity(intent_map);
			break;
		case R.id.fito:
			intent_map.putExtra("map_No", R.id.fito);
			startActivity(intent_map);
			break;
		case R.id.fitt:
			intent_map.putExtra("map_No", R.id.fitt);
			startActivity(intent_map);
			break;
		case R.id.fitth:
			intent_map.putExtra("map_No", R.id.fitth);
			startActivity(intent_map);
			break;
		case R.id.fitf:
			intent_map.putExtra("map_No", R.id.fitf);
			startActivity(intent_map);
			break;
		case R.id.fitfi:
			intent_map.putExtra("map_No", R.id.fitfi);
			startActivity(intent_map);
			break;
		case R.id.sto:
			intent_map.putExtra("map_No", R.id.sto);
			startActivity(intent_map);
			break;
		case R.id.stt:
			intent_map.putExtra("map_No", R.id.stt);
			startActivity(intent_map);
			break;
		case R.id.stth:
			intent_map.putExtra("map_No", R.id.stth);
			startActivity(intent_map);
			break;
		/***************************** ↓这里开始是舰种按钮↓ *************************/
		case R.id.AS:
			intent_ship.putExtra("shipType", R.id.AS);
			startActivity(intent_ship);
			break;
		case R.id.AV:
			intent_ship.putExtra("shipType", R.id.AV);
			startActivity(intent_ship);
			break;
		case R.id.BB:
			intent_ship.putExtra("shipType", R.id.BB);
			startActivity(intent_ship);
			break;
		case R.id.CA:
			intent_ship.putExtra("shipType", R.id.CA);
			startActivity(intent_ship);
			break;
		case R.id.CL:
			intent_ship.putExtra("shipType", R.id.CL);
			startActivity(intent_ship);
			break;
		case R.id.CLT:
			intent_ship.putExtra("shipType", R.id.CLT);
			startActivity(intent_ship);
			break;
		case R.id.CV:
			intent_ship.putExtra("shipType", R.id.CV);
			startActivity(intent_ship);
			break;
		case R.id.CVL:
			intent_ship.putExtra("shipType", R.id.CVL);
			startActivity(intent_ship);
			break;
		case R.id.DD:
			intent_ship.putExtra("shipType", R.id.DD);
			startActivity(intent_ship);
			break;
		case R.id.Fix:
			intent_ship.putExtra("shipType", R.id.Fix);
			startActivity(intent_ship);
			break;
		case R.id.LHA:
			intent_ship.putExtra("shipType", R.id.LHA);
			startActivity(intent_ship);
			break;
		case R.id.Prac:
			intent_ship.putExtra("shipType", R.id.Prac);
			startActivity(intent_ship);
			break;
		case R.id.SS:
			intent_ship.putExtra("shipType", R.id.SS);
			startActivity(intent_ship);
			break;
		case R.id.Support:
			intent_ship.putExtra("shipType", R.id.Support);
			startActivity(intent_ship);
			break;

		/***************************** ↓这里开始是远征的按钮↓ *************************/
		case R.id.o_o:
			builder.setTitle("1.練習航海")// 设置标题
					.setMessage("难度：E\n旗舰：lv.1\n要求：最低2只，舰种自由")// 设置文本
					.setPositiveButton("确定", null)// 确定按钮
					.show();// 显示
			break;
		case R.id.o_t:
			builder.setTitle("2.長距離練習航海")// 设置标题
					.setMessage("难度：E\n旗舰：lv.2\n要求：最低4只，舰种自由")// 设置文本
					.setPositiveButton("确定", null)// 确定按钮
					.show();// 显示
			break;
		case R.id.o_th:
			builder.setTitle("3.警備任務")// 设置标题
					.setMessage("难度：D\n旗舰：lv.3\n要求：最低3只，舰种自由")// 设置文本
					.setPositiveButton("确定", null)// 确定按钮
					.show();// 显示
			break;
		case R.id.o_f:
			builder.setTitle("4.對潛警戒任務")// 设置标题
					.setMessage("难度：D\n旗舰：lv.3\n要求：最低3只，轻巡1只，驱逐2只必要")// 设置文本
					.setPositiveButton("确定", null)// 确定按钮
					.show();// 显示
			break;
		case R.id.o_fi:
			builder.setTitle("5.海上護衛任務")// 设置标题
					.setMessage("难度：C\n旗舰：lv.3\n要求：最低4只，轻巡1只，驱逐2只必要")// 设置文本
					.setPositiveButton("确定", null)// 确定按钮
					.show();// 显示
			break;
		case R.id.o_s:
			builder.setTitle("6.防空射擊演習")
					.setMessage("难度：C\n旗舰：lv.4\n要求：最低4只，舰种自由")
					.setPositiveButton("确定", null).show();
			break;
		case R.id.o_se:
			builder.setTitle("7.觀艦式予行")
					.setMessage("难度：C\n旗舰：lv.5\n要求：全6只，舰种自由")
					.setPositiveButton("确定", null).show();
			break;
		case R.id.o_e:
			builder.setTitle("8.觀艦式").setMessage("难度：B\n旗舰：lv.6\n要求：全6只，舰种自由")
					.setPositiveButton("确定", null).show();
			break;
		case R.id.t_o:
			builder.setTitle("9.タンカー護衛任務")
					.setMessage("难度：C\n旗舰：lv.3\n要求：最低4只，轻巡1只、驱逐2只必要 ")
					.setPositiveButton("确定", null).show();
			break;
		case R.id.t_t:
			builder.setTitle("10.強行偵察任務")
					.setMessage("难度：C\n旗舰：lv.3\n要求：最低3只,轻巡2只必要 ")
					.setPositiveButton("确定", null).show();
			break;
		case R.id.t_th:
			builder.setTitle("11.ボーキサイト輸送任務")
					.setMessage("难度：B\n旗舰：lv.6\n要求：最低4只，驱逐2只必要 ")
					.setPositiveButton("确定", null).show();
			break;
		case R.id.t_f:
			builder.setTitle("12.資源輸送任務")
					.setMessage("难度：B\n旗舰：lv.4\n要求：最低4只，驱逐2只必要 ")
					.setPositiveButton("确定", null).show();
			break;
		case R.id.t_fi:
			builder.setTitle("13.鼠輸送作戰")
					.setMessage("难度：A\n旗舰：lv.5\n要求：全6只，轻巡1只、驱逐4只必要 ")
					.setPositiveButton("确定", null).show();
			break;
		case R.id.t_s:
			builder.setTitle("14.包囲陸戦隊撤収作戦")
					.setMessage("难度：A\n旗舰：lv.6\n要求：全6只，轻巡1只、驱逐3只必要 ")
					.setPositiveButton("确定", null).show();
			break;
		case R.id.t_se:
			builder.setTitle("15.囮機動部隊支援作戦")
					.setMessage(
							"难度：S\n旗舰：lv.9\n要求：全6只，空母(轻母,水母可/潜母不可)2只、驱逐2只必要 ")
					.setPositiveButton("确定", null).show();
			break;
		case R.id.t_e:
			builder.setTitle("16.艦隊決戰支援作戰")
					.setMessage("难度：S\n旗舰：lv.9\n要求：全6只，轻巡1只、驱逐2只必要 ")
					.setPositiveButton("确定", null).show();
			break;
		case R.id.th_o:
			builder.setTitle("17.敵方陣地偵察作戰")
					.setMessage("难度：A\n旗舰：lv.20\n要求：全6只，轻巡1只、驱逐3只必要 ")
					.setPositiveButton("确定", null).show();
			break;
		case R.id.th_t:
			builder.setTitle("18.艦載機輸送作戰")
					.setMessage(
							"难度：A\n旗舰：lv.15\n要求：全6只，空母(轻母,水母可/潜母不可)3只、驱逐2只必要 ")
					.setPositiveButton("确定", null).show();
			break;
		case R.id.th_th:
			builder.setTitle("19.北號作戰")
					.setMessage("难度：S\n旗舰：lv.20\n要求：全6只，航战2只、驱逐2只必要 ")
					.setPositiveButton("确定", null).show();
			break;
		case R.id.th_f:
			builder.setTitle("20.潛水艦哨戒任務")
					.setMessage("难度：S\n旗舰：lv.1\n要求：最低2只，潜艇1只(潜母可)、轻巡1只必要 ")
					.setPositiveButton("确定", null).show();
			break;
		case R.id.th_fi:
			builder.setTitle("21.北方鼠輸送作戰")
					.setMessage(
							"难度：S\n旗舰：lv.15\n要求：舰队总等级30\n最少5只，轻巡1只、驱逐4只必要\n备注：至少3艘舰艇装备ドラム缶(输送用)\n有无闪大成功报告 ")
					.setPositiveButton("确定", null).show();
			break;
		case R.id.th_s:
			builder.setTitle("22.艦隊演習")
					.setMessage(
							"难度：S\n旗舰：lv.30\n要求：舰队总等级45\n全6只，重巡1只、轻巡1只、驱逐2只必要 ")
					.setPositiveButton("确定", null).show();
			break;
		case R.id.th_se:
			builder.setTitle("23.航空戰艦運用演習")
					.setMessage("难度：S\n旗舰：lv.50\n要求：舰队总等级200\n全6只，航战2只、驱逐2只必要 ")
					.setPositiveButton("确定", null).show();
			break;
		case R.id.th_e:
			builder.setTitle("24.北方航路海上護衛")
					.setMessage(
							"难度：S\n旗舰：lv.50，轻巡固定\n要求：舰队总等级200\n全6只，轻巡1只、驱逐4只必要 ")
					.setPositiveButton("确定", null).show();
			break;
		case R.id.f_o:
			builder.setTitle("25.通商破壞作戰")
					.setMessage("难度：S\n旗舰：lv.25\n要求：最低4只，重巡2只、驱逐2只必要 ")
					.setPositiveButton("确定", null).show();
			break;
		case R.id.f_t:
			builder.setTitle("26.敵母港空襲作戰")
					.setMessage(
							"难度：S\n旗舰：lv.30\n最低4只，空母(轻母,水母可/潜母不可)1只、轻巡1只，驱逐2只必要 ")
					.setPositiveButton("确定", null).show();
			break;
		case R.id.f_th:
			builder.setTitle("27.潛水艦通商破壞作戰")
					.setMessage("难度：S\n旗舰：lv.1\n要求：最低2只，潜艇2只(潜母可)必要 ")
					.setPositiveButton("确定", null).show();
			break;
		case R.id.f_f:
			builder.setTitle("28.西方海域封鎖作戰")
					.setMessage("难度：S\n旗舰：lv.30\n要求：最低3只，潜艇3只(潜母可)必要 ")
					.setPositiveButton("确定", null).show();
			break;
		case R.id.f_fi:
			builder.setTitle("29.潛水艦派遣演習")
					.setMessage("难度：S\n旗舰：lv.50\n要求：最低3只，潜艇3只(潜母可)必要 ")
					.setPositiveButton("确定", null).show();
			break;
		case R.id.f_s:
			builder.setTitle("30.潛水艦派遣作戰")
					.setMessage("难度：S\n旗舰：lv.55\n要求：最低4只，潜艇4只(潜母可)必要 ")
					.setPositiveButton("确定", null).show();
			break;
		case R.id.f_se:
			builder.setTitle("31.海外艦との接觸")
					.setMessage(
							"难度：S\n旗舰：lv.60\n要求：舰队总等级200\n最低4只，潜艇4只(潜母可)必要 ")
					.setPositiveButton("确定", null).show();
			break;
		case R.id.f_e:
			builder.setTitle("32.遠洋練習航海")
					.setMessage("难度：D\n旗舰：lv.5，练巡固定\n要求：最低3只，练巡1只，驱逐2只必要 ")
					.setPositiveButton("确定", null).show();
			break;
		case R.id.fi_o:
			builder.setTitle("33.前衛支援任務")
					.setMessage("难度：E\n旗舰：-\n要求：最低2只，驱逐2只必要\n备注：特殊远征，支援用，无收益")
					.setPositiveButton("确定", null).show();
			break;
		case R.id.fi_t:
			builder.setTitle("34.艦隊決戰支援任務")
					.setMessage("难度：E\n旗舰：-\n要求：最低2只，驱逐2只必要\n备注：特殊远征，支援用，无收益")
					.setPositiveButton("确定", null).show();
			break;
		case R.id.fi_th:
			builder.setTitle("35.MO作戰")
					.setMessage(
							"难度：S\n旗舰：lv.40\n要求：全6只，空母(装母,轻母,水母可/潜母不可)2只、重巡1只、驱逐1只必要 ")
					.setPositiveButton("确定", null).show();
			break;
		case R.id.fi_f:
			builder.setTitle("36.水上飛機基地建設")
					.setMessage(
							"难度：S\n旗舰：lv.30\n要求：全6只，水母(空母不可,轻母不可,潜母不可)2只、轻巡1只、驱逐1只必要 ")
					.setPositiveButton("确定", null).show();
			break;
		case R.id.fi_fi:
			builder.setTitle("37.東京急行")
					.setMessage(
							"难度：S\n旗舰：lv.50\n要求：舰队总等级200\n全6只，轻巡1只、驱逐5只必要\n备注：至少3艘舰艇装备ドラム缶(输送用)、合计4个以上装备必须\n有无闪大成功报告")
					.setPositiveButton("确定", null).show();
			break;
		case R.id.fi_s:
			builder.setTitle("38.東京急行(二)")
					.setMessage(
							"难度：S\n旗舰：lv.65\n要求：舰队总等级240\n全6只，驱逐5只必要\n备注：至少4艘舰艇装备ドラム缶(输送用)、合计8个以上装备必须\n有无闪大成功报告")
					.setPositiveButton("确定", null).show();
			break;
		case R.id.fi_se:
			builder.setTitle("39.遠洋潛水艦作戰")
					.setMessage(
							"难度：S\n旗舰：lv.3\n要求：舰队总等级180\n最低5只。潜水母舰1只（大鲸）、潜4只(潜空母可)必要")
					.setPositiveButton("确定", null).show();
			break;
		case R.id.fi_e:
			builder.setTitle("40.水上機前線輸送")
					.setMessage(
							"难度：S\n旗舰：lv.25，轻巡固定\n要求：舰队总等级150\n全6只，轻巡1只、水母(空母不可,轻母不可,潜母不可)2只、驱逐2只必要\n备注：有无闪大成功报告")
					.setPositiveButton("确定", null).show();
			break;
		/***************************** ↓这里开始是任务的按钮↓ *************************/
		case R.id.make:
			intent_assgin.putExtra("assgindata", R.id.make);
			startActivity(intent_assgin);
			break;
		case R.id.go:
			intent_assgin.putExtra("assgindata", R.id.go);
			startActivity(intent_assgin);
			break;
		case R.id.exer:
			intent_assgin.putExtra("assgindata", R.id.exer);
			startActivity(intent_assgin);
			break;
		case R.id.expe:
			intent_assgin.putExtra("assgindata", R.id.expe);
			startActivity(intent_assgin);
			break;
		case R.id.sup:
			intent_assgin.putExtra("assgindata", R.id.sup);
			startActivity(intent_assgin);
			break;
		case R.id.fcry:
			intent_assgin.putExtra("assgindata", R.id.fcry);
			startActivity(intent_assgin);
			break;
		case R.id.chge:
			intent_assgin.putExtra("assgindata", R.id.chge);
			startActivity(intent_assgin);
			break;
		case R.id.wedd:
			intent_assgin.putExtra("assgindata", R.id.wedd);
			startActivity(intent_assgin);
			break;
		/***************************** ↓这里开始是装备的按钮↓ *************************/
		case R.id.gao:
			intent_equip.putExtra("equiptype", R.id.gao);
			startActivity(intent_equip);
			break;
		case R.id.kong:
			intent_equip.putExtra("equiptype", R.id.kong);
			startActivity(intent_equip);
			break;
		case R.id.na:
			intent_equip.putExtra("equiptype", R.id.na);
			startActivity(intent_equip);
			break;
		case R.id.bao:
			intent_equip.putExtra("equiptype", R.id.bao);
			startActivity(intent_equip);
			break;
		case R.id.zen:
			intent_equip.putExtra("equiptype", R.id.zen);
			startActivity(intent_equip);
			break;
		case R.id.baolei:
			intent_equip.putExtra("equiptype", R.id.baolei);
			startActivity(intent_equip);
			break;
		case R.id.zhen:
			intent_equip.putExtra("equiptype", R.id.zhen);
			startActivity(intent_equip);
			break;
		case R.id.ji:
			intent_equip.putExtra("equiptype", R.id.ji);
			startActivity(intent_equip);
			break;
		case R.id.zhan:
			intent_equip.putExtra("equiptype", R.id.zhan);
			startActivity(intent_equip);
			break;
		case R.id.ting:
			intent_equip.putExtra("equiptype", R.id.ting);
			startActivity(intent_equip);
			break;
		case R.id.zhu:
			intent_equip.putExtra("equiptype", R.id.zhu);
			startActivity(intent_equip);
			break;
		case R.id.others:
			intent_equip.putExtra("equiptype", R.id.others);
			startActivity(intent_equip);
			break;
		case R.id.tan:
			intent_equip.putExtra("equiptype", R.id.tan);
			startActivity(intent_equip);
			break;
		case R.id.xiu:
			intent_equip.putExtra("equiptype", R.id.xiu);
			startActivity(intent_equip);
			break;
		case R.id.shao:
			intent_equip.putExtra("equiptype", R.id.shao);
			startActivity(intent_equip);
			break;
		case R.id.fu:
			intent_equip.putExtra("equiptype", R.id.fu);
			startActivity(intent_equip);
			break;
		case R.id.gong:
			intent_equip.putExtra("equiptype", R.id.gong);
			startActivity(intent_equip);
			break;
		case R.id.lei:
			intent_equip.putExtra("equiptype", R.id.lei);
			startActivity(intent_equip);
			break;
		/***************************** ↓这里开始是装备的按钮↓ *************************/
		case R.id.search:
			startActivity(intent_search);
			break;
		default:
			Toast.makeText(this, "未知错误", Toast.LENGTH_SHORT).show();
			break;
		/***************************** ↓这里开始是更多的的按钮↓ *************************/
		case R.id.about:
			builder.setTitle("关于我们")
					.setMessage(
							"WFK是一款可以方便查询舰队collection百科的手机应用 \n\n喜欢的话请给我们点赞哟~ \n")
					.setPositiveButton("确定", null).show();
			break;
		case R.id.logIn:
			Intent intent_more_login = new Intent(MainActivity.this, remakingLoginPage.class);
			startActivity(intent_more_login);
			break;
		}
	}

	// 将所有图片变暗
	private void resetImg() {
		mMapImg.setImageResource(R.drawable.mapicon1);
		mShipImg.setImageResource(R.drawable.shipicon1);
		mEquipImg.setImageResource(R.drawable.equipicon1);
		mResImg.setImageResource(R.drawable.resicon1);
		mAssignImg.setImageResource(R.drawable.assignicon1);
		mMoreImg.setImageResource(R.drawable.more1);
	}

}
