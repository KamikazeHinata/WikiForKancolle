package com.android.wikiforkancolle;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class Activity_ship extends Activity {

	private SQLiteDatabase db;
	private MyDBOpenHelper myDBHelper;
	private MyVDBOpenHelper myVDBHelper;
	private String databaseNum;
	private Bitmap bitmap;
	private ImageButton back;
	private ImageView lihui1;
	private String imageURL;

	private MediaPlayer mediaPlayer = new MediaPlayer();

	private Handler handler = new Handler();

	private ListView voiceListView;
	private List<kanmusuVoice> voiceData = new ArrayList<kanmusuVoice>();

	private Context mContext;
	private ViewPager mViewPager;
	private PagerAdapter mAdapter;
	private List<View> mViews = new ArrayList<View>();

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_ship);
		mContext = Activity_ship.this;
		initView();
		initEvents();
		InitVoice();
	}

	private void initView() {
		mViewPager = (ViewPager) findViewById(R.id.id_viewpager_ship);

		LayoutInflater mInflater = LayoutInflater.from(this);
		View data = mInflater.inflate(R.layout.shipdata, null);
		View voice = mInflater.inflate(R.layout.voice, null);
		View history = mInflater.inflate(R.layout.history, null);
		View girlStory = mInflater.inflate(R.layout.girlstory, null);
		voiceListView = (ListView) voice.findViewById(R.id.voiceListView);

		myDBHelper = new MyDBOpenHelper(mContext, "kancolle.db", null, 1);
		db = myDBHelper.getReadableDatabase();
		Cursor cursor = db.query("kanmusu", null, null, null, null, null, null);

		Intent intent_map = getIntent();
		TextView mingzi = (TextView) data.findViewById(R.id.mingzi);
		TextView id = (TextView) data.findViewById(R.id.tujianbianhao);
		TextView gaizaodengji = (TextView) data.findViewById(R.id.gaizaodengji);
		TextView cv = (TextView) data.findViewById(R.id.cv);
		TextView huashi = (TextView) data.findViewById(R.id.huashi);
		lihui1 = (ImageView) data.findViewById(R.id.lihui);
		TextView naijiu = (TextView) data.findViewById(R.id.naijiu);
		TextView huoli = (TextView) data.findViewById(R.id.huoli);
		TextView zhuangjia = (TextView) data.findViewById(R.id.zhuangjia);
		TextView leizhuang = (TextView) data.findViewById(R.id.leizhuang);
		TextView huibi = (TextView) data.findViewById(R.id.huibi);
		TextView duikong = (TextView) data.findViewById(R.id.duikong);
		TextView duiqian = (TextView) data.findViewById(R.id.duiqian);
		TextView sudu = (TextView) data.findViewById(R.id.sudu);
		TextView suodi = (TextView) data.findViewById(R.id.suodi);
		TextView dazai = (TextView) data.findViewById(R.id.dazai);
		TextView shecheng = (TextView) data.findViewById(R.id.shecheng);
		TextView yun = (TextView) data.findViewById(R.id.yun);
		TextView ranliao = (TextView) data.findViewById(R.id.ranliao);
		TextView danyao = (TextView) data.findViewById(R.id.danyao);
		TextView dazai1 = (TextView) data.findViewById(R.id.dazai1);
		TextView dazai2 = (TextView) data.findViewById(R.id.dazai2);
		TextView dazai3 = (TextView) data.findViewById(R.id.dazai3);
		TextView dazai4 = (TextView) data.findViewById(R.id.dazai4);
		TextView zhuangbei1 = (TextView) data.findViewById(R.id.zhuangbei1);
		TextView zhuangbei2 = (TextView) data.findViewById(R.id.zhuangbei2);
		TextView zhuangbei3 = (TextView) data.findViewById(R.id.zhuangbei3);
		TextView zhuangbei4 = (TextView) data.findViewById(R.id.zhuangbei4);
		TextView diaoluo = (TextView) data.findViewById(R.id.diaoluo);
		TextView jianzao = (TextView) data.findViewById(R.id.jianzao);
		/****************************************************************************/
		lihui1.setBackgroundResource(R.color.white);
		lihui1.setImageResource(R.drawable.loadfailed);
		/****************************************************************************/
		switch (intent_map.getExtras().getInt("shipdata")) {
		case R.id.nagato:
			imageURL = "https://img.mengniang.org/common/d/d5/47537660_p0.png";
			if (MainActivity.usePixivImage) {
				setImage(imageURL);
			} else {
				lihui1.setImageResource(R.drawable.k001);
			}
			cursor.move(1);
			break;
		case R.id.mutsu:
			// lihui1.setImageResource(R.drawable.mutsu);
			imageURL = "https://img.mengniang.org/common/0/09/41339623_p0.jpg";
			if (MainActivity.usePixivImage) {
				setImage(imageURL);
			} else {
				lihui1.setImageResource(R.drawable.k002);
			}
			cursor.move(2);
			break;
		case R.id.ise:
			// lihui1.setImageResource(R.drawable.ise);
			imageURL = "https://img.mengniang.org/common/c/c8/42902518_p0.jpg";
			if (MainActivity.usePixivImage) {
				setImage(imageURL);
			} else {
				lihui1.setImageResource(R.drawable.k003);
			}
			cursor.move(3);
			break;
		case R.id.hyuuga:
			// lihui1.setImageResource(R.drawable.hyuga);
			imageURL = "https://img.mengniang.org/common/f/f6/44698298_p0.jpg";
			if (MainActivity.usePixivImage) {
				setImage(imageURL);
			} else {
				lihui1.setImageResource(R.drawable.k004);
			}
			cursor.move(4);
			break;
		case R.id.yukikaze:
			// lihui1.setImageResource(R.drawable.yukikaze);
			imageURL = "https://img.mengniang.org/common/a/a0/53672107_p0.jpg";
			if (MainActivity.usePixivImage) {
				setImage(imageURL);
			} else {
				lihui1.setImageResource(R.drawable.k005);
			}
			cursor.move(5);
			break;
		case R.id.akagi:
			// lihui1.setImageResource(R.drawable.akagi);
			imageURL = "https://img.mengniang.org/common/6/61/54098826_p0_master1200.jpg";
			if (MainActivity.usePixivImage) {
				setImage(imageURL);
			} else {
				lihui1.setImageResource(R.drawable.k006);
			}
			cursor.move(6);
			break;
		case R.id.kaga:
			// lihui1.setImageResource(R.drawable.kaga);
			imageURL = "https://img.mengniang.org/common/c/c5/39521243_p0.jpg";
			if (MainActivity.usePixivImage) {
				setImage(imageURL);
			} else {
				lihui1.setImageResource(R.drawable.k007);
			}
			cursor.move(7);
			break;
		case R.id.souryuu:
			// lihui1.setImageResource(R.drawable.soryu);
			imageURL = "https://img.mengniang.org/common/3/39/44996635.jpg";
			if (MainActivity.usePixivImage) {
				setImage(imageURL);
			} else {
				lihui1.setImageResource(R.drawable.k008);
			}
			cursor.move(8);
			break;
		case R.id.hiryuu:
			// lihui1.setImageResource(R.drawable.hiryu);
			imageURL = "https://img.mengniang.org/common/0/04/44533906_p0.jpg";
			if (MainActivity.usePixivImage) {
				setImage(imageURL);
			} else {
				lihui1.setImageResource(R.drawable.k009);
			}
			cursor.move(9);
			break;
		case R.id.shimakaze:
			// lihui1.setImageResource(R.drawable.shimakaze);
			imageURL = "https://img.mengniang.org/common/0/00/KanShimakaze.jpg";
			if (MainActivity.usePixivImage) {
				setImage(imageURL);
			} else {
				lihui1.setImageResource(R.drawable.k010);
			}
			cursor.move(10);
			break;
		case R.id.fubuki:
			// lihui1.setImageResource(R.drawable.fubuki);
			imageURL = "https://img.mengniang.org/common/4/42/45546578_p0.png";
			if (MainActivity.usePixivImage) {
				setImage(imageURL);
			} else {
				lihui1.setImageResource(R.drawable.k011);
			}
			cursor.move(11);
			break;
		case R.id.shirayuki:
			// lihui1.setImageResource(R.drawable.shirayuki);
			imageURL = "https://img.mengniang.org/common/d/d0/52447545_p0.jpg";
			if (MainActivity.usePixivImage) {
				setImage(imageURL);
			} else {
				lihui1.setImageResource(R.drawable.k012);
			}
			cursor.move(12);
			break;
		case R.id.hatsuyuki:
			// lihui1.setImageResource(R.drawable.hatsuyuki);
			imageURL = "https://img.mengniang.org/common/6/65/53068934_p3_master1200.jpg";
			if (MainActivity.usePixivImage) {
				setImage(imageURL);
			} else {
				lihui1.setImageResource(R.drawable.k013);
			}
			cursor.move(13);
			break;
		case R.id.miyuki:
			// lihui1.setImageResource(R.drawable.miyuki);
			imageURL = "https://img.mengniang.org/common/9/97/37077613.jpg";
			if (MainActivity.usePixivImage) {
				setImage(imageURL);
			} else {
				lihui1.setImageResource(R.drawable.k014);
			}
			cursor.move(14);
			break;
		case R.id.murakumu:
			// lihui1.setImageResource(R.drawable.murakumo);
			imageURL = "https://img.mengniang.org/common/0/0c/%E5%8F%A2%E4%BA%91.jpg";
			if (MainActivity.usePixivImage) {
				setImage(imageURL);
			} else {
				lihui1.setImageResource(R.drawable.k015);
			}
			cursor.move(15);
			break;
		case R.id.isonami:
			// lihui1.setImageResource(R.drawable.isonami);
			imageURL = "https://img.mengniang.org/common/a/a7/46803685_p0.jpg";
			if (MainActivity.usePixivImage) {
				setImage(imageURL);
			} else {
				lihui1.setImageResource(R.drawable.k016);
			}
			cursor.move(16);
			break;
		case R.id.ayanami:
			// lihui1.setImageResource(R.drawable.ayanami);
			imageURL = "https://img.mengniang.org/common/0/08/KanAyanami.jpg";
			if (MainActivity.usePixivImage) {
				setImage(imageURL);
			} else {
				lihui1.setImageResource(R.drawable.k017);
			}
			cursor.move(17);
			break;
		case R.id.shikinami:
			// lihui1.setImageResource(R.drawable.shikinami);
			imageURL = "https://img.mengniang.org/common/7/7d/KanShikinami.jpg";
			if (MainActivity.usePixivImage) {
				setImage(imageURL);
			} else {
				lihui1.setImageResource(R.drawable.k018);
			}
			cursor.move(18);
			break;
		case R.id.ooi:
			// lihui1.setImageResource(R.drawable.ooi);
			imageURL = "https://img.mengniang.org/common/b/b7/55414110_p0.jpg";
			if (MainActivity.usePixivImage) {
				setImage(imageURL);
			} else {
				lihui1.setImageResource(R.drawable.k019);
			}
			cursor.move(19);
			break;
		case R.id.kitakami:
			// lihui1.setImageResource(R.drawable.kitakami);
			imageURL = "https://img.mengniang.org/common/0/0e/39051936_p1.jpg";
			if (MainActivity.usePixivImage) {
				setImage(imageURL);
			} else {
				lihui1.setImageResource(R.drawable.k020);
			}
			cursor.move(20);
			break;
		case R.id.kongou:
			// lihui1.setImageResource(R.drawable.kongo);
			imageURL = "https://img.mengniang.org/common/3/39/44484471_p0.jpg";
			if (MainActivity.usePixivImage) {
				setImage(imageURL);
			} else {
				lihui1.setImageResource(R.drawable.k021);
			}
			cursor.move(21);
			break;
		case R.id.hiei:
			// lihui1.setImageResource(R.drawable.hiei);
			imageURL = "https://img.mengniang.org/common/2/2f/%E6%AF%94%E7%9D%BF1.jpg";
			if (MainActivity.usePixivImage) {
				setImage(imageURL);
			} else {
				lihui1.setImageResource(R.drawable.k022);
			}
			cursor.move(22);
			break;
		case R.id.haruna:
			// lihui1.setImageResource(R.drawable.haruna);
			imageURL = "https://img.mengniang.org/common/5/52/45019173_p0.jpg";
			if (MainActivity.usePixivImage) {
				setImage(imageURL);
			} else {
				lihui1.setImageResource(R.drawable.k023);
			}
			cursor.move(23);
			break;
		case R.id.kirishima:
			// lihui1.setImageResource(R.drawable.kirishima);
			imageURL = "https://img.mengniang.org/common/c/c1/52019513_p0.png";
			if (MainActivity.usePixivImage) {
				setImage(imageURL);
			} else {
				lihui1.setImageResource(R.drawable.k024);
			}
			cursor.move(24);
			break;
		case R.id.houshyou:
			// lihui1.setImageResource(R.drawable.hosho);
			imageURL = "https://img.mengniang.org/common/8/89/55257559_p0.jpg";
			if (MainActivity.usePixivImage) {
				setImage(imageURL);
			} else {
				lihui1.setImageResource(R.drawable.k025);
			}
			cursor.move(25);
			break;
		case R.id.fusou:
			// lihui1.setImageResource(R.drawable.fuso);
			imageURL = "https://img.mengniang.org/common/7/7a/%E7%BA%A2%E5%8F%B6%E6%89%B6%E6%A1%91.jpg";
			if (MainActivity.usePixivImage) {
				setImage(imageURL);
			} else {
				lihui1.setImageResource(R.drawable.k026);
			}
			cursor.move(26);
			break;
		case R.id.yamashiro:
			// lihui1.setImageResource(R.drawable.yamashiro);
			imageURL = "https://img.mengniang.org/common/c/ce/47356186_p0.jpg";
			if (MainActivity.usePixivImage) {
				setImage(imageURL);
			} else {
				lihui1.setImageResource(R.drawable.k027);
			}
			cursor.move(27);
			break;
		case R.id.tenryuu:
			// lihui1.setImageResource(R.drawable.tenryu);
			imageURL = "https://img.mengniang.org/common/f/f4/40618419_p0_master1200.jpg";
			if (MainActivity.usePixivImage) {
				setImage(imageURL);
			} else {
				lihui1.setImageResource(R.drawable.k028);
			}
			cursor.move(28);
			break;
		case R.id.tatsuta:
			// lihui1.setImageResource(R.drawable.tatsuta);
			imageURL = "https://img.mengniang.org/common/4/4b/49748262_p0.jpg";
			if (MainActivity.usePixivImage) {
				setImage(imageURL);
			} else {
				lihui1.setImageResource(R.drawable.k029);
			}
			cursor.move(29);
			break;
		case R.id.ryuujyou:
			// lihui1.setImageResource(R.drawable.ryujo);
			imageURL = "https://img.mengniang.org/common/a/ae/52381666_p0.jpg";
			if (MainActivity.usePixivImage) {
				setImage(imageURL);
			} else {
				lihui1.setImageResource(R.drawable.k030);
			}
			cursor.move(30);
			break;
		case R.id.mutsuki:
			// lihui1.setImageResource(R.drawable.mutsuki);
			imageURL = "https://img.mengniang.org/common/5/54/50526768_p0.jpg";
			if (MainActivity.usePixivImage) {
				setImage(imageURL);
			} else {
				lihui1.setImageResource(R.drawable.k031);
			}
			cursor.move(31);
			break;
		case R.id.kisaragi:
			// lihui1.setImageResource(R.drawable.kisaragi);
			imageURL = "https://img.mengniang.org/common/a/a8/39016261.jpg";
			if (MainActivity.usePixivImage) {
				setImage(imageURL);
			} else {
				lihui1.setImageResource(R.drawable.k032);
			}
			cursor.move(32);
			break;
		case R.id.satsuki:
			// lihui1.setImageResource(R.drawable.satsuki);
			imageURL = "https://img.mengniang.org/common/8/83/%E7%8C%AB%E5%A8%98%E7%9A%90%E6%9C%88.jpg";
			if (MainActivity.usePixivImage) {
				setImage(imageURL);
			} else {
				lihui1.setImageResource(R.drawable.k033);
			}
			cursor.move(33);
			break;
		case R.id.fumizuki:
			// lihui1.setImageResource(R.drawable.fumizuki);
			imageURL = "https://img.mengniang.org/common/2/2c/%E6%96%87%E6%9C%88.jpg";
			if (MainActivity.usePixivImage) {
				setImage(imageURL);
			} else {
				lihui1.setImageResource(R.drawable.k034);
			}
			cursor.move(34);
			break;
		case R.id.nagatsuki:
			// lihui1.setImageResource(R.drawable.nagatsuki);
			imageURL = "https://img.mengniang.org/common/6/6f/%E9%95%BF%E6%9C%8840720179.png";
			if (MainActivity.usePixivImage) {
				setImage(imageURL);
			} else {
				lihui1.setImageResource(R.drawable.k035);
			}
			cursor.move(35);
			break;
		case R.id.kikuzuki:
			// lihui1.setImageResource(R.drawable.kikuduki);
			imageURL = "https://img.mengniang.org/common/f/fc/43793442.jpg";
			if (MainActivity.usePixivImage) {
				setImage(imageURL);
			} else {
				lihui1.setImageResource(R.drawable.k036);
			}
			cursor.move(36);
			break;
		case R.id.mikazuki:
			// lihui1.setImageResource(R.drawable.mikazuk);
			imageURL = "https://img.mengniang.org/common/9/94/49425317.jpg";
			if (MainActivity.usePixivImage) {
				setImage(imageURL);
			} else {
				lihui1.setImageResource(R.drawable.k037);
			}
			cursor.move(37);
			break;
		case R.id.mochizuki:
			// lihui1.setImageResource(R.drawable.mochizuki);
			imageURL = "https://img.mengniang.org/common/8/8c/%E6%9C%9B%E6%9C%88_%E4%BA%8C%E5%91%A8%E5%B9%B4%E8%B4%BA%E5%9B%BE.jpg";
			if (MainActivity.usePixivImage) {
				setImage(imageURL);
			} else {
				lihui1.setImageResource(R.drawable.k038);
			}
			cursor.move(38);
			break;
		case R.id.kuma:
			// lihui1.setImageResource(R.drawable.kuma);
			imageURL = "https://img.mengniang.org/common/0/05/41479125_p0.jpg";
			if (MainActivity.usePixivImage) {
				setImage(imageURL);
			} else {
				lihui1.setImageResource(R.drawable.k039);
			}
			cursor.move(39);
			break;
		case R.id.tama:
			// lihui1.setImageResource(R.drawable.tama);
			imageURL = "https://img.mengniang.org/common/d/dd/KanColleTama.png";
			if (MainActivity.usePixivImage) {
				setImage(imageURL);
			} else {
				lihui1.setImageResource(R.drawable.k040);
			}
			cursor.move(40);
			break;
		case R.id.kiso:
			// lihui1.setImageResource(R.drawable.kiso);
			imageURL = "https://img.mengniang.org/common/a/aa/49350935_p0_Next.png";
			if (MainActivity.usePixivImage) {
				setImage(imageURL);
			} else {
				lihui1.setImageResource(R.drawable.k041);
			}
			cursor.move(41);
			break;
		case R.id.nagara:
			// lihui1.setImageResource(R.drawable.nagara);
			imageURL = "https://img.mengniang.org/common/7/71/Nagara_01.jpg";
			if (MainActivity.usePixivImage) {
				setImage(imageURL);
			} else {
				lihui1.setImageResource(R.drawable.k042);
			}
			cursor.move(42);
			break;
		case R.id.itsuzu:
			// lihui1.setImageResource(R.drawable.isuzu);
			imageURL = "https://img.mengniang.org/common/f/f7/42441895.jpg";
			if (MainActivity.usePixivImage) {
				setImage(imageURL);
			} else {
				lihui1.setImageResource(R.drawable.k043);
			}
			cursor.move(43);
			break;
		case R.id.natori:
			// lihui1.setImageResource(R.drawable.natori);
			imageURL = "https://img.mengniang.org/common/2/2c/42324028_p0.jpg";
			if (MainActivity.usePixivImage) {
				setImage(imageURL);
			} else {
				lihui1.setImageResource(R.drawable.k044);
			}
			cursor.move(44);
			break;
		case R.id.yura:
			// lihui1.setImageResource(R.drawable.yura);
			imageURL = "https://img.mengniang.org/common/3/33/44949657_p10.png";
			if (MainActivity.usePixivImage) {
				setImage(imageURL);
			} else {
				lihui1.setImageResource(R.drawable.k045);
			}
			cursor.move(45);
			break;
		case R.id.sendai:
			// lihui1.setImageResource(R.drawable.sendai);
			imageURL = "https://img.mengniang.org/common/d/da/46603487_p0.png";
			if (MainActivity.usePixivImage) {
				setImage(imageURL);
			} else {
				lihui1.setImageResource(R.drawable.k046);
			}
			cursor.move(46);
			break;
		case R.id.jintsuu:
			// lihui1.setImageResource(R.drawable.jintsu);
			imageURL = "https://img.mengniang.org/common/c/c8/Jintsu-%E6%AC%A1%E5%8F%91%E8%A3%85%E5%A1%AB.jpg";
			if (MainActivity.usePixivImage) {
				setImage(imageURL);
			} else {
				lihui1.setImageResource(R.drawable.k047);
			}
			cursor.move(47);
			break;
		case R.id.naka:
			// lihui1.setImageResource(R.drawable.naka);
			imageURL = "https://img.mengniang.org/common/0/05/Kankorenaka.jpg";
			if (MainActivity.usePixivImage) {
				setImage(imageURL);
			} else {
				lihui1.setImageResource(R.drawable.k048);
			}
			cursor.move(48);
			break;
		case R.id.chitose:
			// lihui1.setImageResource(R.drawable.chitose);
			imageURL = "https://img.mengniang.org/common/c/c9/43876295.jpg";
			if (MainActivity.usePixivImage) {
				setImage(imageURL);
			} else {
				lihui1.setImageResource(R.drawable.k049);
			}
			cursor.move(49);
			break;
		case R.id.chiyoda:
			// lihui1.setImageResource(R.drawable.chiyoda);
			imageURL = "https://img.mengniang.org/common/4/44/E90705a6.jpg";
			if (MainActivity.usePixivImage) {
				setImage(imageURL);
			} else {
				lihui1.setImageResource(R.drawable.k050);
			}
			cursor.move(50);
			break;
		case R.id.mogami:
			// lihui1.setImageResource(R.drawable.mogami);
			imageURL = "https://img.mengniang.org/common/4/4c/2014022003552157a.png";
			if (MainActivity.usePixivImage) {
				setImage(imageURL);
			} else {
				lihui1.setImageResource(R.drawable.k051);
			}
			cursor.move(51);
			break;
		case R.id.furutaka:
			// lihui1.setImageResource(R.drawable.furutaka);
			imageURL = "https://img.mengniang.org/common/0/04/51973320_p0.jpg";
			if (MainActivity.usePixivImage) {
				setImage(imageURL);
			} else {
				lihui1.setImageResource(R.drawable.k052);
			}
			cursor.move(52);
			break;
		case R.id.kako:
			// lihui1.setImageResource(R.drawable.kako);
			imageURL = "https://img.mengniang.org/common/0/0f/55143446_p16_master1200.jpg";
			if (MainActivity.usePixivImage) {
				setImage(imageURL);
			} else {
				lihui1.setImageResource(R.drawable.k053);
			}
			cursor.move(53);
			break;
		case R.id.aoba:
			// lihui1.setImageResource(R.drawable.aoba);
			imageURL = "https://img.mengniang.org/common/f/fb/Aoba_kancolle.jpg";
			if (MainActivity.usePixivImage) {
				setImage(imageURL);
			} else {
				lihui1.setImageResource(R.drawable.k054);
			}
			cursor.move(54);
			break;
		case R.id.myoukou:
			// lihui1.setImageResource(R.drawable.myoko);
			imageURL = "https://img.mengniang.org/common/6/63/44496936.jpg";
			if (MainActivity.usePixivImage) {
				setImage(imageURL);
			} else {
				lihui1.setImageResource(R.drawable.k055);
			}
			cursor.move(55);
			break;
		case R.id.nachi:
			// lihui1.setImageResource(R.drawable.nachi);
			imageURL = "https://img.mengniang.org/common/6/64/41031613_p0.jpg";
			if (MainActivity.usePixivImage) {
				setImage(imageURL);
			} else {
				lihui1.setImageResource(R.drawable.k056);
			}
			cursor.move(56);
			break;
		case R.id.ashigara:
			// lihui1.setImageResource(R.drawable.ashigara);
			imageURL = "https://img.mengniang.org/common/6/69/52960554_p2_master1200.jpg";
			if (MainActivity.usePixivImage) {
				setImage(imageURL);
			} else {
				lihui1.setImageResource(R.drawable.k057);
			}
			cursor.move(57);
			break;
		case R.id.haguro:
			// lihui1.setImageResource(R.drawable.haguro);
			imageURL = "https://img.mengniang.org/common/2/26/%E3%82%B3%E3%83%9F%E3%82%BA%E3%83%9F%E3%82%B3-%E7%BE%BD%E9%BB%91.png";
			if (MainActivity.usePixivImage) {
				setImage(imageURL);
			} else {
				lihui1.setImageResource(R.drawable.k058);
			}
			cursor.move(58);
			break;
		case R.id.takao:
			// lihui1.setImageResource(R.drawable.takao);
			imageURL = "https://img.mengniang.org/common/8/87/38647660_p0.jpg";
			if (MainActivity.usePixivImage) {
				setImage(imageURL);
			} else {
				lihui1.setImageResource(R.drawable.k059);
			}
			cursor.move(59);
			break;
		case R.id.atago:
			// lihui1.setImageResource(R.drawable.atago);
			imageURL = "https://img.mengniang.org/common/9/9c/43904310p0.png";
			if (MainActivity.usePixivImage) {
				setImage(imageURL);
			} else {
				lihui1.setImageResource(R.drawable.k060);
			}
			cursor.move(60);
			break;
		case R.id.maya:
			// lihui1.setImageResource(R.drawable.maya);
			imageURL = "https://img.mengniang.org/common/6/6d/%E6%91%A9%E8%80%B6%E6%94%B9%E4%BA%8C.png";
			if (MainActivity.usePixivImage) {
				setImage(imageURL);
			} else {
				lihui1.setImageResource(R.drawable.k061);
			}
			cursor.move(61);
			break;
		case R.id.chyoukai:
			// lihui1.setImageResource(R.drawable.chokai);
			imageURL = "https://img.mengniang.org/common/2/25/%E9%B8%9F%E6%B5%B7.png";
			if (MainActivity.usePixivImage) {
				setImage(imageURL);
			} else {
				lihui1.setImageResource(R.drawable.k062);
			}
			cursor.move(62);
			break;
		case R.id.tone:
			// lihui1.setImageResource(R.drawable.tone);
			imageURL = "https://img.mengniang.org/common/0/0d/%E5%88%A9%E6%A0%B9.jpg";
			if (MainActivity.usePixivImage) {
				setImage(imageURL);
			} else {
				lihui1.setImageResource(R.drawable.k063);
			}
			cursor.move(63);
			break;
		case R.id.chikuma:
			// lihui1.setImageResource(R.drawable.chikuma);
			imageURL = "https://img.mengniang.org/common/3/30/Tikuma.png";
			if (MainActivity.usePixivImage) {
				setImage(imageURL);
			} else {
				lihui1.setImageResource(R.drawable.k064);
			}
			cursor.move(64);
			break;
		case R.id.hiyou:
			// lihui1.setImageResource(R.drawable.hiyo);
			imageURL = "https://img.mengniang.org/common/4/43/%E9%A3%9E%E9%B9%B0.jpg";
			if (MainActivity.usePixivImage) {
				setImage(imageURL);
			} else {
				lihui1.setImageResource(R.drawable.k065);
			}
			cursor.move(65);
			break;
		case R.id.jyunyou:
			// lihui1.setImageResource(R.drawable.junyo);
			imageURL = "https://img.mengniang.org/common/e/e4/52044412_p4_master1200.jpg";
			if (MainActivity.usePixivImage) {
				setImage(imageURL);
			} else {
				lihui1.setImageResource(R.drawable.k066);
			}
			cursor.move(66);
			break;
		case R.id.oboro:
			// lihui1.setImageResource(R.drawable.oboro);
			imageURL = "https://img.mengniang.org/common/e/e1/41675449.jpg";
			if (MainActivity.usePixivImage) {
				setImage(imageURL);
			} else {
				lihui1.setImageResource(R.drawable.k067);
			}
			cursor.move(67);
			break;
		case R.id.akebono:
			// lihui1.setImageResource(R.drawable.akebono);
			imageURL = "https://img.mengniang.org/common/e/e2/Akebono_01.png";
			if (MainActivity.usePixivImage) {
				setImage(imageURL);
			} else {
				lihui1.setImageResource(R.drawable.k068);
			}
			cursor.move(68);
			break;
		case R.id.sazanami:
			// lihui1.setImageResource(R.drawable.sazanami);
			imageURL = "https://img.mengniang.org/common/9/93/48565135_p0.jpg";
			if (MainActivity.usePixivImage) {
				setImage(imageURL);
			} else {
				lihui1.setImageResource(R.drawable.k069);
			}
			cursor.move(69);
			break;
		case R.id.ushio:
			// lihui1.setImageResource(R.drawable.ushio);
			imageURL = "https://img.mengniang.org/common/f/fe/51272685_p0.jpg";
			if (MainActivity.usePixivImage) {
				setImage(imageURL);
			} else {
				lihui1.setImageResource(R.drawable.k070);
			}
			cursor.move(70);
			break;
		case R.id.akatsuki:
			// lihui1.setImageResource(R.drawable.akatsuki);
			imageURL = "https://img.mengniang.org/common/c/c3/50602549_p0.png";
			if (MainActivity.usePixivImage) {
				setImage(imageURL);
			} else {
				lihui1.setImageResource(R.drawable.k071);
			}
			cursor.move(71);
			break;
		case R.id.hibiki:
			// 某花老婆
			// lihui1.setImageResource(R.drawable.hibiki);
			imageURL = "https://img.acg.moe/common/3/3d/40238535_p0.jpg";
			if (MainActivity.usePixivImage) {
				setImage(imageURL);
			} else {
				lihui1.setImageResource(R.drawable.k072);
			}
			cursor.move(72);
			break;
		case R.id.ikazuchi:
			// lihui1.setImageResource(R.drawable.ikazuchi);
			imageURL = "https://img.mengniang.org/common/8/8d/KanIkazuchi.jpg";
			if (MainActivity.usePixivImage) {
				setImage(imageURL);
			} else {
				lihui1.setImageResource(R.drawable.k073);
			}
			cursor.move(73);
			break;
		case R.id.inazuma:
			// lihui1.setImageResource(R.drawable.inazuma);
			imageURL = "https://img.mengniang.org/common/b/bd/51464079.jpg";
			if (MainActivity.usePixivImage) {
				setImage(imageURL);
			} else {
				lihui1.setImageResource(R.drawable.k074);
			}
			cursor.move(74);
			break;
		case R.id.hatsuharu:
			// lihui1.setImageResource(R.drawable.hatsuharu);
			imageURL = "https://img.mengniang.org/common/c/ca/8a7606a98226cffc9e3176c7ba014a90f603ea64.jpg";
			if (MainActivity.usePixivImage) {
				setImage(imageURL);
			} else {
				lihui1.setImageResource(R.drawable.k075);
			}
			cursor.move(75);
			break;
		case R.id.nenohi:
			// lihui1.setImageResource(R.drawable.nenohi);
			imageURL = "https://img.mengniang.org/common/2/21/42014691.jpg";
			if (MainActivity.usePixivImage) {
				setImage(imageURL);
			} else {
				lihui1.setImageResource(R.drawable.k076);
			}
			cursor.move(76);
			break;
		case R.id.wakaba:
			// lihui1.setImageResource(R.drawable.wakaba);
			imageURL = "https://img.mengniang.org/common/5/52/42899894.jpg";
			if (MainActivity.usePixivImage) {
				setImage(imageURL);
			} else {
				lihui1.setImageResource(R.drawable.k077);
			}
			cursor.move(77);
			break;
		case R.id.hatsushimo:
			// lihui1.setImageResource(R.drawable.hatsushimo);
			imageURL = "https://img.mengniang.org/common/3/33/4617962.jpg";
			if (MainActivity.usePixivImage) {
				setImage(imageURL);
			} else {
				lihui1.setImageResource(R.drawable.k078);
			}
			cursor.move(78);
			break;
		case R.id.shiratsuyu:
			// lihui1.setImageResource(R.drawable.shiratsuyu);
			imageURL = "https://img.mengniang.org/common/3/3a/Shiratsuyu.jpg";
			if (MainActivity.usePixivImage) {
				setImage(imageURL);
			} else {
				lihui1.setImageResource(R.drawable.k079);
			}
			cursor.move(79);
			break;
		case R.id.shigure:
			// lihui1.setImageResource(R.drawable.shigure);
			imageURL = "https://img.mengniang.org/common/1/1b/6e70bef2b21193138ecf681661380cd790238dbf.jpg";
			if (MainActivity.usePixivImage) {
				setImage(imageURL);
			} else {
				lihui1.setImageResource(R.drawable.k080);
			}
			cursor.move(80);
			break;
		case R.id.murasame:
			// lihui1.setImageResource(R.drawable.murasame);
			imageURL = "https://img.mengniang.org/common/thumb/4/4b/53048257_p0_master1200.jpg/250px-53048257_p0_master1200.jpg";
			if (MainActivity.usePixivImage) {
				setImage(imageURL);
			} else {
				lihui1.setImageResource(R.drawable.k081);
			}
			cursor.move(81);
			break;
		case R.id.yuudachi:
			// lihui1.setImageResource(R.drawable.yudachi);
			imageURL = "https://img.mengniang.org/common/thumb/2/23/47418399_p0.jpg/250px-47418399_p0.jpg";
			if (MainActivity.usePixivImage) {
				setImage(imageURL);
			} else {
				lihui1.setImageResource(R.drawable.k082);
			}
			cursor.move(82);
			break;
		case R.id.samidare:
			// lihui1.setImageResource(R.drawable.samidare);
			imageURL = "https://img.mengniang.org/common/thumb/9/9b/55264446_p0.png/250px-55264446_p0.png";
			if (MainActivity.usePixivImage) {
				setImage(imageURL);
			} else {
				lihui1.setImageResource(R.drawable.k083);
			}
			cursor.move(83);
			break;
		case R.id.suzukaze:
			// lihui1.setImageResource(R.drawable.suzukaze);
			imageURL = "https://img.mengniang.org/common/thumb/a/af/46332817_p1.jpg/250px-46332817_p1.jpg";
			if (MainActivity.usePixivImage) {
				setImage(imageURL);
			} else {
				lihui1.setImageResource(R.drawable.k084);
			}
			cursor.move(84);
			break;
		case R.id.asashio:
			// lihui1.setImageResource(R.drawable.asashio);
			imageURL = "https://img.mengniang.org/common/thumb/0/0c/%E6%9C%9D%E6%BD%AE01.jpeg/250px-%E6%9C%9D%E6%BD%AE01.jpeg";
			if (MainActivity.usePixivImage) {
				setImage(imageURL);
			} else {
				lihui1.setImageResource(R.drawable.k085);
			}
			cursor.move(85);
			break;
		case R.id.ooshio:
			// lihui1.setImageResource(R.drawable.oshio);
			imageURL = "https://img.mengniang.org/common/thumb/9/99/39258574_p33.jpg/250px-39258574_p33.jpg";
			if (MainActivity.usePixivImage) {
				setImage(imageURL);
			} else {
				lihui1.setImageResource(R.drawable.k086);
			}
			cursor.move(86);
			break;
		case R.id.michishio:
			// lihui1.setImageResource(R.drawable.michishio);
			imageURL = "https://img.mengniang.org/common/thumb/c/c6/37977556.jpg/250px-37977556.jpg";
			if (MainActivity.usePixivImage) {
				setImage(imageURL);
			} else {
				lihui1.setImageResource(R.drawable.k087);
			}
			cursor.move(87);
			break;
		case R.id.arashio:
			// lihui1.setImageResource(R.drawable.arashio);
			imageURL = "https://img.mengniang.org/common/thumb/9/9a/%E8%8D%92%E6%BD%AE01.jpg/250px-%E8%8D%92%E6%BD%AE01.jpg";
			if (MainActivity.usePixivImage) {
				setImage(imageURL);
			} else {
				lihui1.setImageResource(R.drawable.k088);
			}
			cursor.move(88);
			break;
		case R.id.arare:
			// lihui1.setImageResource(R.drawable.arare);
			imageURL = "https://img.mengniang.org/common/thumb/8/86/42172232.jpg/250px-42172232.jpg";
			if (MainActivity.usePixivImage) {
				setImage(imageURL);
			} else {
				lihui1.setImageResource(R.drawable.k089);
			}
			cursor.move(89);
			break;
		case R.id.kazumi:
			// lihui1.setImageResource(R.drawable.kasumi);
			imageURL = "https://img.mengniang.org/common/thumb/a/af/54853030_p0.jpg/250px-54853030_p0.jpg";
			if (MainActivity.usePixivImage) {
				setImage(imageURL);
			} else {
				lihui1.setImageResource(R.drawable.k090);
			}
			cursor.move(90);
			break;
		case R.id.kagerou:
			// lihui1.setImageResource(R.drawable.kagero);
			imageURL = "https://img.mengniang.org/common/thumb/9/9e/41823276.jpg/250px-41823276.jpg";
			if (MainActivity.usePixivImage) {
				setImage(imageURL);
			} else {
				lihui1.setImageResource(R.drawable.k091);
			}
			cursor.move(91);
			break;
		case R.id.shiranui:
			// lihui1.setImageResource(R.drawable.shiranui);
			imageURL = "https://img.mengniang.org/common/thumb/6/69/49441046.jpg/250px-49441046.jpg";
			if (MainActivity.usePixivImage) {
				setImage(imageURL);
			} else {
				lihui1.setImageResource(R.drawable.k092);
			}
			cursor.move(92);
			break;
		case R.id.kuroshio:
			// lihui1.setImageResource(R.drawable.kuroshio);
			imageURL = "https://img.mengniang.org/common/thumb/5/5c/53195682_p0.jpg/250px-53195682_p0.jpg";
			if (MainActivity.usePixivImage) {
				setImage(imageURL);
			} else {
				lihui1.setImageResource(R.drawable.k093);
			}
			cursor.move(93);
			break;
		case R.id.shyouhou:
			// lihui1.setImageResource(R.drawable.shoho);
			imageURL = "https://img.mengniang.org/common/thumb/2/2b/38160489.jpg/250px-38160489.jpg";
			if (MainActivity.usePixivImage) {
				setImage(imageURL);
			} else {
				lihui1.setImageResource(R.drawable.k094);
			}
			cursor.move(94);
			break;
		case R.id.shyoukaku:
			// lihui1.setImageResource(R.drawable.shoukaku);
			imageURL = "https://img.mengniang.org/common/4/47/%E7%BF%94%E9%B9%A4.png";
			if (MainActivity.usePixivImage) {
				setImage(imageURL);
			} else {
				lihui1.setImageResource(R.drawable.k106);
			}
			cursor.move(95);
			break;
		case R.id.zuikaku:
			// lihui1.setImageResource(R.drawable.zuikaku);
			imageURL = "https://img.mengniang.org/common/f/f3/53004069_p0.jpg";
			if (MainActivity.usePixivImage) {
				setImage(imageURL);
			} else {
				lihui1.setImageResource(R.drawable.k107);
			}
			cursor.move(96);
			break;
		case R.id.kinu:
			// lihui1.setImageResource(R.drawable.kinu);
			imageURL = "https://img.mengniang.org/common/7/74/49270331_p4_master1200.jpg";
			if (MainActivity.usePixivImage) {
				setImage(imageURL);
			} else {
				lihui1.setImageResource(R.drawable.k109);
			}
			cursor.move(97);
			break;
		case R.id.abukuma:
			// lihui1.setImageResource(R.drawable.abukuma);
			imageURL = "https://img.mengniang.org/common/7/74/52491573_p0.jpg";
			if (MainActivity.usePixivImage) {
				setImage(imageURL);
			} else {
				lihui1.setImageResource(R.drawable.k110);
			}
			cursor.move(98);
			break;
		case R.id.yuubari:
			// lihui1.setImageResource(R.drawable.yubari);
			imageURL = "https://img.mengniang.org/common/5/5c/46863279_p0.png";
			if (MainActivity.usePixivImage) {
				setImage(imageURL);
			} else {
				lihui1.setImageResource(R.drawable.k111);
			}
			cursor.move(99);
			break;
		case R.id.zuihou:
			// lihui1.setImageResource(R.drawable.zuiho);
			imageURL = "https://img.mengniang.org/common/f/fd/55262350_p0.jpg";
			if (MainActivity.usePixivImage) {
				setImage(imageURL);
			} else {
				lihui1.setImageResource(R.drawable.k112);
			}
			cursor.move(100);
			break;
		case R.id.mikuma:
			// lihui1.setImageResource(R.drawable.mikuma);
			imageURL = "https://img.mengniang.org/common/c/c2/Mikuma1.jpg";
			if (MainActivity.usePixivImage) {
				setImage(imageURL);
			} else {
				lihui1.setImageResource(R.drawable.k116);
			}
			cursor.move(101);
			break;
		case R.id.hatsukaze:
			// lihui1.setImageResource(R.drawable.hatsukaze);
			imageURL = "https://img.mengniang.org/common/5/5d/43457314_p0.jpg";
			if (MainActivity.usePixivImage) {
				setImage(imageURL);
			} else {
				lihui1.setImageResource(R.drawable.k118);
			}
			cursor.move(102);
			break;
		case R.id.maikaze:
			// lihui1.setImageResource(R.drawable.maikaze);
			imageURL = "https://img.mengniang.org/common/9/9d/50448792_p14_master1200.jpg";
			if (MainActivity.usePixivImage) {
				setImage(imageURL);
			} else {
				lihui1.setImageResource(R.drawable.k119);
			}
			cursor.move(103);
			break;
		case R.id.kinugasa:
			// lihui1.setImageResource(R.drawable.kinugasa);
			imageURL = "https://img.mengniang.org/common/5/5a/53092896_p0_master1200.jpg";
			if (MainActivity.usePixivImage) {
				setImage(imageURL);
			} else {
				lihui1.setImageResource(R.drawable.k120);
			}
			cursor.move(104);
			break;
		case R.id.i19:
			// lihui1.setImageResource(R.drawable.i19);
			imageURL = "https://img.mengniang.org/common/0/00/40119337.png";
			if (MainActivity.usePixivImage) {
				setImage(imageURL);
			} else {
				lihui1.setImageResource(R.drawable.k123);
			}
			cursor.move(105);
			break;
		case R.id.suzuya:
			// lihui1.setImageResource(R.drawable.suzuya);
			imageURL = "https://img.mengniang.org/common/a/a0/55960461_p0_master1200.jpg";
			if (MainActivity.usePixivImage) {
				setImage(imageURL);
			} else {
				lihui1.setImageResource(R.drawable.k124);
			}
			cursor.move(106);
			break;
		case R.id.kumano:
			// lihui1.setImageResource(R.drawable.kumano);
			imageURL = "https://img.mengniang.org/common/e/e2/45219562_p0.jpg";
			if (MainActivity.usePixivImage) {
				setImage(imageURL);
			} else {
				lihui1.setImageResource(R.drawable.k125);
			}
			cursor.move(107);
			break;
		case R.id.i168:
			// lihui1.setImageResource(R.drawable.i168);
			imageURL = "https://img.mengniang.org/common/4/40/41962607_p0.png";
			if (MainActivity.usePixivImage) {
				setImage(imageURL);
			} else {
				lihui1.setImageResource(R.drawable.k126);
			}
			cursor.move(108);
			break;
		case R.id.i58:
			// lihui1.setImageResource(R.drawable.i58);
			imageURL = "https://img.mengniang.org/common/c/cb/Kancolle_Gouya.jpg";
			if (MainActivity.usePixivImage) {
				setImage(imageURL);
			} else {
				lihui1.setImageResource(R.drawable.k127);
			}
			cursor.move(109);
			break;
		case R.id.i8:
			// lihui1.setImageResource(R.drawable.i8);
			imageURL = "https://img.mengniang.org/common/1/1c/%E4%BC%8A8%28%E6%96%B0%E3%82%B9%E3%82%AF%E6%B0%B4%29_-_%E3%81%BA%E3%81%93_-_42444212.jpg";
			if (MainActivity.usePixivImage) {
				setImage(imageURL);
			} else {
				lihui1.setImageResource(R.drawable.k128);
			}
			cursor.move(110);
			break;
		case R.id.yamato:
			// lihui1.setImageResource(R.drawable.yamato);
			imageURL = "https://img.mengniang.org/common/2/2a/42264178_p0.jpg";
			if (MainActivity.usePixivImage) {
				setImage(imageURL);
			} else {
				lihui1.setImageResource(R.drawable.k131);
			}
			cursor.move(111);
			break;
		case R.id.akigumo:
			// lihui1.setImageResource(R.drawable.akigumo);
			imageURL = "https://img.mengniang.org/common/5/51/4561669i.jpg";
			if (MainActivity.usePixivImage) {
				setImage(imageURL);
			} else {
				lihui1.setImageResource(R.drawable.k132);
			}
			cursor.move(112);
			break;
		case R.id.yuugumo:
			// lihui1.setImageResource(R.drawable.yugumo);
			imageURL = "https://img.mengniang.org/common/c/c1/51263098_p2_master1200.jpg";
			if (MainActivity.usePixivImage) {
				setImage(imageURL);
			} else {
				lihui1.setImageResource(R.drawable.k133);
			}
			cursor.move(113);
			break;
		case R.id.makigumo:
			// lihui1.setImageResource(R.drawable.makigumo);
			imageURL = "https://img.mengniang.org/common/2/23/39854619.jpg";
			if (MainActivity.usePixivImage) {
				setImage(imageURL);
			} else {
				lihui1.setImageResource(R.drawable.k134);
			}
			cursor.move(114);
			break;
		case R.id.naganami:
			// lihui1.setImageResource(R.drawable.naganami);
			imageURL = "https://img.mengniang.org/common/f/f6/1583477.jpg";
			if (MainActivity.usePixivImage) {
				setImage(imageURL);
			} else {
				lihui1.setImageResource(R.drawable.k135);
			}
			cursor.move(115);
			break;
		case R.id.agano:
			// lihui1.setImageResource(R.drawable.agano);
			imageURL = "https://img.mengniang.org/common/8/87/Agano_01.jpg";
			if (MainActivity.usePixivImage) {
				setImage(imageURL);
			} else {
				lihui1.setImageResource(R.drawable.k137);
			}
			cursor.move(116);
			break;
		case R.id.noshiro:
			// lihui1.setImageResource(R.drawable.noshiro);
			imageURL = "https://img.mengniang.org/common/0/09/Noshiro.png";
			if (MainActivity.usePixivImage) {
				setImage(imageURL);
			} else {
				lihui1.setImageResource(R.drawable.k138);
			}
			cursor.move(117);
			break;
		case R.id.yahagi:
			// lihui1.setImageResource(R.drawable.yahagi);
			imageURL = "https://img.mengniang.org/common/4/40/41586666_p0.jpg";
			if (MainActivity.usePixivImage) {
				setImage(imageURL);
			} else {
				lihui1.setImageResource(R.drawable.k139);
			}
			cursor.move(118);
			break;
		case R.id.sakawa:
			// lihui1.setImageResource(R.drawable.sakawa);
			imageURL = "https://img.mengniang.org/common/d/df/45755042_p0.jpg";
			if (MainActivity.usePixivImage) {
				setImage(imageURL);
			} else {
				lihui1.setImageResource(R.drawable.k140);
			}
			cursor.move(119);
			break;
		case R.id.musashi:
			// lihui1.setImageResource(R.drawable.musashi);
			imageURL = "https://img.mengniang.org/common/2/2c/%E6%AD%A6%E8%97%8F.jpg";
			if (MainActivity.usePixivImage) {
				setImage(imageURL);
			} else {
				lihui1.setImageResource(R.drawable.k143);
			}
			cursor.move(120);
			break;
		case R.id.taihou:
			// lihui1.setImageResource(R.drawable.taiho);
			imageURL = "https://img.mengniang.org/common/3/31/54958301_p0_master1200.jpg";
			if (MainActivity.usePixivImage) {
				setImage(imageURL);
			} else {
				lihui1.setImageResource(R.drawable.k153);
			}
			cursor.move(121);
			break;
		case R.id.katori:
			// lihui1.setImageResource(R.drawable.katori);
			imageURL = "https://img.mengniang.org/common/7/7f/53964567_p0.jpg";
			if (MainActivity.usePixivImage) {
				setImage(imageURL);
			} else {
				lihui1.setImageResource(R.drawable.k154);
			}
			cursor.move(122);
			break;
		case R.id.i401:
			// lihui1.setImageResource(R.drawable.i401);
			imageURL = "https://img.mengniang.org/common/7/7a/44720994_p0.jpg";
			if (MainActivity.usePixivImage) {
				setImage(imageURL);
			} else {
				lihui1.setImageResource(R.drawable.k155);
			}
			cursor.move(123);
			break;
		case R.id.akitsumaru:
			// lihui1.setImageResource(R.drawable.akitsumaru);
			imageURL = "https://img.mengniang.org/common/3/34/Akitumaru54759048_p.jpg";
			if (MainActivity.usePixivImage) {
				setImage(imageURL);
			} else {
				lihui1.setImageResource(R.drawable.k161);
			}
			cursor.move(124);
			break;
		case R.id.maruyu:
			// lihui1.setImageResource(R.drawable.maruyu);
			imageURL = "https://img.mengniang.org/common/c/c1/40473106.jpg";
			if (MainActivity.usePixivImage) {
				setImage(imageURL);
			} else {
				lihui1.setImageResource(R.drawable.k163);
			}
			cursor.move(125);
			break;
		case R.id.yayoi:
			// lihui1.setImageResource(R.drawable.yayoi);
			imageURL = "https://img.mengniang.org/common/6/65/55243767_p0.jpg";
			if (MainActivity.usePixivImage) {
				setImage(imageURL);
			} else {
				lihui1.setImageResource(R.drawable.k164);
			}
			cursor.move(126);
			break;
		case R.id.uzuki:
			// lihui1.setImageResource(R.drawable.uzuki);
			imageURL = "https://img.mengniang.org/common/3/3e/50667429.jpg";
			if (MainActivity.usePixivImage) {
				setImage(imageURL);
			} else {
				lihui1.setImageResource(R.drawable.k165);
			}
			cursor.move(127);
			break;
		case R.id.isokaze:
			// lihui1.setImageResource(R.drawable.isokaze);
			imageURL = "https://img.mengniang.org/common/f/fc/52272800_p0.png";
			if (MainActivity.usePixivImage) {
				setImage(imageURL);
			} else {
				lihui1.setImageResource(R.drawable.k167);
			}
			cursor.move(128);
			break;
		case R.id.urakaze:
			// lihui1.setImageResource(R.drawable.urakaze);
			imageURL = "https://img.mengniang.org/common/4/4f/48203493_p0.png";
			if (MainActivity.usePixivImage) {
				setImage(imageURL);
			} else {
				lihui1.setImageResource(R.drawable.k168);
			}
			cursor.move(129);
			break;
		case R.id.tanikaze:
			// lihui1.setImageResource(R.drawable.tanikaze);
			imageURL = "https://img.mengniang.org/common/2/26/45095174_p1_master1200.jpg";
			if (MainActivity.usePixivImage) {
				setImage(imageURL);
			} else {
				lihui1.setImageResource(R.drawable.k169);
			}
			cursor.move(130);
			break;
		case R.id.hamakaze:
			// lihui1.setImageResource(R.drawable.hamakaze);
			imageURL = "https://img.mengniang.org/common/e/ef/55265393_p0_master1200.jpg";
			if (MainActivity.usePixivImage) {
				setImage(imageURL);
			} else {
				lihui1.setImageResource(R.drawable.k170);
			}
			cursor.move(131);
			break;
		case R.id.bismarck:
			// lihui1.setImageResource(R.drawable.bisumaruku);
			imageURL = "https://img.mengniang.org/common/3/33/53859073_p0.jpg";
			if (MainActivity.usePixivImage) {
				setImage(imageURL);
			} else {
				lihui1.setImageResource(R.drawable.k171);
			}
			cursor.move(132);
			break;
		case R.id.z1:
			// lihui1.setImageResource(R.drawable.z1);
			imageURL = "https://img.mengniang.org/common/5/53/46216583_p0.jpg";
			if (MainActivity.usePixivImage) {
				setImage(imageURL);
			} else {
				lihui1.setImageResource(R.drawable.k174);
			}
			cursor.move(133);
			break;
		case R.id.z3:
			// lihui1.setImageResource(R.drawable.z3);
			imageURL = "https://img.mengniang.org/common/8/88/42379456.jpg";
			if (MainActivity.usePixivImage) {
				setImage(imageURL);
			} else {
				lihui1.setImageResource(R.drawable.k175);
			}
			cursor.move(134);
			break;
		case R.id.eugen:
			// lihui1.setImageResource(R.drawable.prinzeugen);
			imageURL = "https://img.mengniang.org/common/9/93/47279550_p0.png";
			if (MainActivity.usePixivImage) {
				setImage(imageURL);
			} else {
				lihui1.setImageResource(R.drawable.k176);
			}
			cursor.move(135);
			break;
		case R.id.amatsukaze:
			// lihui1.setImageResource(R.drawable.amatsukaze);
			imageURL = "https://img.mengniang.org/common/d/d2/45137996_p0.jpg";
			if (MainActivity.usePixivImage) {
				setImage(imageURL);
			} else {
				lihui1.setImageResource(R.drawable.k181);
			}
			cursor.move(136);
			break;
		case R.id.akashi:
			// lihui1.setImageResource(R.drawable.akashi);
			imageURL = "https://img.mengniang.org/common/5/5d/43112993.jpg";
			if (MainActivity.usePixivImage) {
				setImage(imageURL);
			} else {
				lihui1.setImageResource(R.drawable.k182);
			}
			cursor.move(137);
			break;
		case R.id.ooyodo:
			// lihui1.setImageResource(R.drawable.oyodo);
			imageURL = "https://img.mengniang.org/common/a/a7/52592522_p0.jpg";
			if (MainActivity.usePixivImage) {
				setImage(imageURL);
			} else {
				lihui1.setImageResource(R.drawable.k183);
			}
			cursor.move(138);
			break;
		case R.id.taigei:
			// lihui1.setImageResource(R.drawable.taigei);
			imageURL = "https://img.mengniang.org/common/6/67/54622358_p0.png";
			if (MainActivity.usePixivImage) {
				setImage(imageURL);
			} else {
				lihui1.setImageResource(R.drawable.k184);
			}
			cursor.move(139);
			break;
		case R.id.ryuuhou:
			// lihui1.setImageResource(R.drawable.ryuho);
			imageURL = "https://img.mengniang.org/common/7/7c/43998366.jpg";
			if (MainActivity.usePixivImage) {
				setImage(imageURL);
			} else {
				lihui1.setImageResource(R.drawable.k185);
			}
			cursor.move(139);
			break;
		case R.id.tokitsukaze:
			// lihui1.setImageResource(R.drawable.tokitsukaze);
			imageURL = "https://img.mengniang.org/common/5/53/45322421_m.jpg";
			if (MainActivity.usePixivImage) {
				setImage(imageURL);
			} else {
				lihui1.setImageResource(R.drawable.k186);
			}
			cursor.move(140);
			break;
		case R.id.unryuu:
			// lihui1.setImageResource(R.drawable.unryu);
			imageURL = "https://img.mengniang.org/common/4/45/46804122_p0.jpg";
			if (MainActivity.usePixivImage) {
				setImage(imageURL);
			} else {
				lihui1.setImageResource(R.drawable.k201);
			}
			cursor.move(141);
			break;
		case R.id.amagi:
			// lihui1.setImageResource(R.drawable.amagi);
			imageURL = "https://img.mengniang.org/common/b/ba/%E5%A4%A9%E5%9F%8E.jpg";
			if (MainActivity.usePixivImage) {
				setImage(imageURL);
			} else {
				lihui1.setImageResource(R.drawable.k202);
			}
			cursor.move(142);
			break;
		case R.id.katsuragi:
			// lihui1.setImageResource(R.drawable.katsuragi);
			imageURL = "https://img.mengniang.org/common/b/b7/51678692.jpg";
			if (MainActivity.usePixivImage) {
				setImage(imageURL);
			} else {
				lihui1.setImageResource(R.drawable.k203);
			}
			cursor.move(143);
			break;
		case R.id.harusame:
			// lihui1.setImageResource(R.drawable.harusame);
			imageURL = "https://img.mengniang.org/common/2/2e/55265469_p0.jpg";
			if (MainActivity.usePixivImage) {
				setImage(imageURL);
			} else {
				lihui1.setImageResource(R.drawable.k205);
			}
			cursor.move(144);
			break;
		case R.id.hayashimo:
			// lihui1.setImageResource(R.drawable.hayashimo);
			imageURL = "https://img.mengniang.org/common/f/fc/46420802_p0_master1200.jpg";
			if (MainActivity.usePixivImage) {
				setImage(imageURL);
			} else {
				lihui1.setImageResource(R.drawable.k209);
			}
			cursor.move(145);
			break;
		case R.id.kiyoshimo:
			// lihui1.setImageResource(R.drawable.kiyoshimo);
			imageURL = "https://img.mengniang.org/common/d/de/51204535_p0.png";
			if (MainActivity.usePixivImage) {
				setImage(imageURL);
			} else {
				lihui1.setImageResource(R.drawable.k210);
			}
			cursor.move(146);
			break;
		case R.id.asagumo:
			// lihui1.setImageResource(R.drawable.asagumo);
			imageURL = "https://img.mengniang.org/common/2/2d/51719550_p0.jpg";
			if (MainActivity.usePixivImage) {
				setImage(imageURL);
			} else {
				lihui1.setImageResource(R.drawable.k213);
			}
			cursor.move(147);
			break;
		case R.id.yamagumo:
			// lihui1.setImageResource(R.drawable.yamagumo);
			imageURL = "https://img.mengniang.org/common/d/df/50783110_p0_master1200.jpg";
			if (MainActivity.usePixivImage) {
				setImage(imageURL);
			} else {
				lihui1.setImageResource(R.drawable.k214);
			}
			cursor.move(148);
			break;
		case R.id.nowaki:
			// lihui1.setImageResource(R.drawable.nowaki);
			imageURL = "https://img.mengniang.org/common/4/49/53151464_p3_master1200.jpg";
			if (MainActivity.usePixivImage) {
				setImage(imageURL);
			} else {
				lihui1.setImageResource(R.drawable.k215);
			}
			cursor.move(149);
			break;
		case R.id.akizuki:
			// lihui1.setImageResource(R.drawable.akizuki);
			imageURL = "https://img.mengniang.org/common/9/92/51452007_p0_master1200.jpg";
			if (MainActivity.usePixivImage) {
				setImage(imageURL);
			} else {
				lihui1.setImageResource(R.drawable.k221);
			}
			cursor.move(150);
			break;
		case R.id.teruzuki:
			// lihui1.setImageResource(R.drawable.teruzuki);
			imageURL = "https://img.mengniang.org/common/d/d6/54898648_p0.png";
			if (MainActivity.usePixivImage) {
				setImage(imageURL);
			} else {
				lihui1.setImageResource(R.drawable.k222);
			}
			cursor.move(151);
			break;
		case R.id.takanami:
			// lihui1.setImageResource(R.drawable.takanami);
			imageURL = "https://img.mengniang.org/common/6/64/4866581.png";
			if (MainActivity.usePixivImage) {
				setImage(imageURL);
			} else {
				lihui1.setImageResource(R.drawable.k224);
			}
			cursor.move(152);
			break;
		case R.id.asashimo:
			// lihui1.setImageResource(R.drawable.asashimo);
			imageURL = "https://img.mengniang.org/common/e/e2/52986486_p17_master1200.jpg";
			if (MainActivity.usePixivImage) {
				setImage(imageURL);
			} else {
				lihui1.setImageResource(R.drawable.k225);
			}
			cursor.move(153);
			break;
		case R.id.yu511:
			// lihui1.setImageResource(R.drawable.u511);
			imageURL = "https://img.mengniang.org/common/a/a0/48836956_p0.jpg";
			if (MainActivity.usePixivImage) {
				setImage(imageURL);
			} else {
				lihui1.setImageResource(R.drawable.k231);
			}
			cursor.move(154);
			break;
		case R.id.littorio:
			// lihui1.setImageResource(R.drawable.littorio);
			imageURL = "https://img.mengniang.org/common/7/78/50981610_p0.png";
			if (MainActivity.usePixivImage) {
				setImage(imageURL);
			} else {
				lihui1.setImageResource(R.drawable.k241);
			}
			cursor.move(155);
			break;
		case R.id.roma:
			// lihui1.setImageResource(R.drawable.roma);
			imageURL = "https://img.mengniang.org/common/a/af/50464047_p0.jpg";
			if (MainActivity.usePixivImage) {
				setImage(imageURL);
			} else {
				lihui1.setImageResource(R.drawable.k242);
			}
			cursor.move(156);
			break;
		case R.id.libeccio:
			// lihui1.setImageResource(R.drawable.libeccio);
			imageURL = "https://img.mengniang.org/common/2/22/52241818_p0.jpg";
			if (MainActivity.usePixivImage) {
				setImage(imageURL);
			} else {
				lihui1.setImageResource(R.drawable.k243);
			}
			cursor.move(157);
			break;
		case R.id.akitsushima:
			// lihui1.setImageResource(R.drawable.akitsushima);
			imageURL = "https://img.mengniang.org/common/6/62/50158670_p0.jpg";
			if (MainActivity.usePixivImage) {
				setImage(imageURL);
			} else {
				lihui1.setImageResource(R.drawable.k245);
			}
			cursor.move(158);
			break;
		case R.id.mitsuhou:
			// lihui1.setImageResource(R.drawable.zuiho);
			imageURL = "https://img.mengniang.org/common/9/9b/52212061_p0.jpg";
			if (MainActivity.usePixivImage) {
				setImage(imageURL);
			} else {
				lihui1.setImageResource(R.drawable.k251);
			}
			cursor.move(159);
			break;
		case R.id.kazagumo:
			// lihui1.setImageResource(R.drawable.kazagumo);
			imageURL = "https://img.mengniang.org/common/e/e0/52067643_p0.png";
			if (MainActivity.usePixivImage) {
				setImage(imageURL);
			} else {
				lihui1.setImageResource(R.drawable.k253);
			}
			cursor.move(160);
			break;
		case R.id.umikaze:
			// lihui1.setImageResource(R.drawable.umikaze);
			imageURL = "https://img.mengniang.org/common/2/20/52067354_p0_master1200.jpg";
			if (MainActivity.usePixivImage) {
				setImage(imageURL);
			} else {
				lihui1.setImageResource(R.drawable.k258);
			}
			cursor.move(161);
			break;
		case R.id.kawakaze:
			// lihui1.setImageResource(R.drawable.kawakaze);
			imageURL = "https://img.mengniang.org/common/1/1a/52138832_p0.png";
			if (MainActivity.usePixivImage) {
				setImage(imageURL);
			} else {
				lihui1.setImageResource(R.drawable.k259);
			}
			cursor.move(162);
			break;
		case R.id.hayasui:
			// lihui1.setImageResource(R.drawable.kawakaze);
			imageURL = "https://img.mengniang.org/common/d/d9/C546f44ca3a98e15a6847000f5075456.png";
			if (MainActivity.usePixivImage) {
				setImage(imageURL);
			} else {
				lihui1.setImageResource(R.drawable.k260);
			}
			cursor.move(163);
			break;
		case R.id.hagikaze:
			// lihui1.setImageResource(R.drawable.kawakaze);
			imageURL = "https://img.mengniang.org/common/5/56/53705179_p0.png";
			if (MainActivity.usePixivImage) {
				setImage(imageURL);
			} else {
				lihui1.setImageResource(R.drawable.k255);
			}
			cursor.move(164);
			break;
		case R.id.arashi:
			// lihui1.setImageResource(R.drawable.kawakaze);
			imageURL = "https://img.mengniang.org/common/5/52/53725623_p0.jpg";
			if (MainActivity.usePixivImage) {
				setImage(imageURL);
			} else {
				lihui1.setImageResource(R.drawable.k254);
			}
			cursor.move(165);
			break;
		case R.id.hatsuzuki:
			// lihui1.setImageResource(R.drawable.kawakaze);
			imageURL = "https://img.mengniang.org/common/7/76/55271573_p0.jpg";
			if (MainActivity.usePixivImage) {
				setImage(imageURL);
			} else {
				lihui1.setImageResource(R.drawable.k223);
			}
			cursor.move(166);
			break;
		case R.id.GrafZeppelin:
			// lihui1.setImageResource(R.drawable.kawakaze);
			imageURL = "https://img.mengniang.org/common/6/64/54064944_p0.jpg";
			if (MainActivity.usePixivImage) {
				setImage(imageURL);
			} else {
				lihui1.setImageResource(R.drawable.k232);
			}
			cursor.move(167);
			break;
		case R.id.okinami:
			// lihui1.setImageResource(R.drawable.kawakaze);
			imageURL = "https://img.mengniang.org/common/d/de/Id%3D55254520.jpg";
			if (MainActivity.usePixivImage) {
				setImage(imageURL);
			} else {
				lihui1.setImageResource(R.drawable.k252);
			}
			cursor.move(168);
			break;
		case R.id.zara:
			// lihui1.setImageResource(R.drawable.kawakaze);
			imageURL = "https://img.mengniang.org/common/7/72/55406641_p_Zara.jpg";
			if (MainActivity.usePixivImage) {
				setImage(imageURL);
			} else {
				lihui1.setImageResource(R.drawable.k248);
			}
			cursor.move(169);
			break;
		case R.id.kashima:
			// lihui1.setImageResource(R.drawable.kawakaze);
			imageURL = "https://img.mengniang.org/common/a/a4/53748807.jpg";
			if (MainActivity.usePixivImage) {
				setImage(imageURL);
			} else {
				lihui1.setImageResource(R.drawable.k265);
			}
			cursor.move(170);
			break;
		}

		mingzi.setText(cursor.getString(cursor.getColumnIndex("name")));
		id.setText(cursor.getString(cursor.getColumnIndex("id")));
		cv.setText(cursor.getString(cursor.getColumnIndex("cv")));
		gaizaodengji.setText(cursor.getString(cursor
				.getColumnIndex("gaizaodengji")));
		huashi.setText(cursor.getString(cursor.getColumnIndex("renshe")));
		naijiu.setText(cursor.getString(cursor.getColumnIndex("naijiu")));
		huoli.setText(cursor.getString(cursor.getColumnIndex("huoli")));
		zhuangjia.setText(cursor.getString(cursor.getColumnIndex("zhuangjia")));
		leizhuang.setText(cursor.getString(cursor.getColumnIndex("leizhuang")));
		huibi.setText(cursor.getString(cursor.getColumnIndex("huibi")));
		duikong.setText(cursor.getString(cursor.getColumnIndex("duikong")));
		duiqian.setText(cursor.getString(cursor.getColumnIndex("duiqian")));
		sudu.setText(cursor.getString(cursor.getColumnIndex("sudu")));
		suodi.setText(cursor.getString(cursor.getColumnIndex("suodi")));
		dazai.setText(cursor.getString(cursor.getColumnIndex("dazai")));
		shecheng.setText(cursor.getString(cursor.getColumnIndex("shecheng")));
		yun.setText(cursor.getString(cursor.getColumnIndex("yun")));
		ranliao.setText(cursor.getString(cursor
				.getColumnIndex("zuidaxiaofeiliangRANLIAO")));
		danyao.setText(cursor.getString(cursor
				.getColumnIndex("zuidaxiaofeiliangDANYAO")));
		dazai1.setText(cursor.getString(cursor.getColumnIndex("dazai1")));
		dazai2.setText(cursor.getString(cursor.getColumnIndex("dazai2")));
		dazai3.setText(cursor.getString(cursor.getColumnIndex("dazai3")));
		dazai4.setText(cursor.getString(cursor.getColumnIndex("dazai4")));
		zhuangbei1
				.setText(cursor.getString(cursor.getColumnIndex("zhuangbei1")));
		zhuangbei2
				.setText(cursor.getString(cursor.getColumnIndex("zhuangbei2")));
		zhuangbei3
				.setText(cursor.getString(cursor.getColumnIndex("zhuangbei3")));
		zhuangbei4
				.setText(cursor.getString(cursor.getColumnIndex("zhuangbei4")));
		jianzao.setText(cursor.getString(cursor
				.getColumnIndex("rushoufangshiJIANZAO")));
		diaoluo.setText(cursor.getString(cursor
				.getColumnIndex("rushoufangshiDIAOLUO")));
		/**********************************************/
		// More function -- Image's click and view
		lihui1.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent toImagePage = new Intent(Activity_ship.this,
						ImageOfKanmusu.class);
				toImagePage.putExtra("ImageURL", imageURL);
				startActivity(toImagePage);
			}
		});
		/**********************************************/
		// Back key's function
		back = (ImageButton) data.findViewById(R.id.back);
		back.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				finish();
			}
		});
		/**********************************************/
		// ��view����list
		mViews.add(data);
		mViews.add(voice);
		mViews.add(history);
		mViews.add(girlStory);
		
		// ����������
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

	private void initEvents() {
		mViewPager
				.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {

					private int currentItem;

					public void onPageSelected(int arg0) {

					}

					@Override
					public void onPageScrolled(int arg0, float arg1, int arg2) {

					}

					@Override
					public void onPageScrollStateChanged(int arg0) {

					}
				});

	}

	/**********************************************/
	private void setImage(String url) {
		new HttpThread(url, lihui1, handler).start();
	}

	/******************** Handle the voice page below **************************/
	public void InitVoice() {
		myVDBHelper = new MyVDBOpenHelper(mContext, "voice.db", null, 1);
		db = myVDBHelper.getReadableDatabase();
		Cursor cursor = null;

		Intent intent_map = getIntent();
		switch (intent_map.getExtras().getInt("shipdata")) {
		case R.id.nagato:
			databaseNum = "k001";
			break;
		case R.id.mutsu:
			databaseNum = "k002";
			break;
		case R.id.ise:
			databaseNum = "k003";
			break;
		case R.id.hyuuga:
			databaseNum = "k004";
			break;
		case R.id.yukikaze:
			databaseNum = "k005";
			break;
		case R.id.akagi:
			databaseNum = "k006";
			break;
		case R.id.kaga:
			databaseNum = "k007";
			break;
		case R.id.souryuu:
			databaseNum = "k008";
			break;
		case R.id.hiryuu:
			databaseNum = "k009";
			break;
		case R.id.shimakaze:
			databaseNum = "k010";
			break;
		/*
		 * case R.id.fubuki: databaseNum = "k011"; break;
		 */
		case R.id.shirayuki:
			databaseNum = "k012";
			break;
		case R.id.hatsuyuki:
			databaseNum = "k013";
			break;
		case R.id.miyuki:
			databaseNum = "k014";
			break;
		case R.id.murakumu:
			databaseNum = "k015";
			break;
		case R.id.isonami:
			databaseNum = "k016";
			break;
		case R.id.ayanami:
			databaseNum = "k017";
			break;
		case R.id.shikinami:
			databaseNum = "k018";
			break;
		case R.id.ooi:
			databaseNum = "k019";
			break;
		case R.id.kitakami:
			databaseNum = "k020";
			break;
		case R.id.kongou:
			databaseNum = "k021";
			break;
		case R.id.hiei:
			databaseNum = "k022";
			break;
		/*
		 * case R.id.haruna: databaseNum = "k023"; break;
		 */
		case R.id.kirishima:
			databaseNum = "k024";
			break;
		case R.id.houshyou:
			databaseNum = "k025";
			break;
		case R.id.fusou:
			databaseNum = "k026";
			break;
		case R.id.yamashiro:
			databaseNum = "k027";
			break;
		case R.id.tenryuu:
			databaseNum = "k028";
			break;
		case R.id.tatsuta:
			databaseNum = "k029";
			break;
		case R.id.ryuujyou:
			databaseNum = "k030";
			break;
		case R.id.mutsuki:
			databaseNum = "k031";
			break;
		case R.id.kisaragi:
			databaseNum = "k032";
			break;
		case R.id.satsuki:
			databaseNum = "k033";
			break;
		case R.id.fumizuki:
			databaseNum = "k034";
			break;
		case R.id.nagatsuki:
			databaseNum = "k035";
			break;
		case R.id.kikuzuki:
			databaseNum = "k036";
			break;
		case R.id.mikazuki:
			databaseNum = "k037";
			break;
		case R.id.mochizuki:
			databaseNum = "k038";
			break;
		case R.id.kuma:
			databaseNum = "k039";
			break;
		case R.id.tama:
			databaseNum = "k040";
			break;
		case R.id.kiso:
			databaseNum = "k041";
			break;
		case R.id.nagara:
			databaseNum = "k042";
			break;
		case R.id.itsuzu:
			databaseNum = "k043";
			break;
		case R.id.natori:
			databaseNum = "k044";
			break;
		case R.id.yura:
			databaseNum = "k045";
			break;
		case R.id.sendai:
			databaseNum = "k046";
			break;
		case R.id.jintsuu:
			databaseNum = "k047";
			break;
		case R.id.naka:
			databaseNum = "k048";
			break;
		case R.id.chitose:
			databaseNum = "k049";
			break;
		case R.id.chiyoda:
			databaseNum = "k050";
			break;
		case R.id.mogami:
			databaseNum = "k051";
			break;
		// case R.id.furutaka:
		// databaseNum = "k052";
		// break;
		case R.id.kako:
			databaseNum = "k053";
			break;
		case R.id.aoba:
			databaseNum = "k054";
			break;
		case R.id.myoukou:
			databaseNum = "k055";
			break;
		case R.id.nachi:
			databaseNum = "k056";
			break;
		case R.id.ashigara:
			databaseNum = "k057";
			break;
		case R.id.haguro:
			databaseNum = "k058";
			break;
		case R.id.takao:
			databaseNum = "k059";
			break;
		case R.id.atago:
			databaseNum = "k060";
			break;
		case R.id.maya:
			databaseNum = "k061";
			break;
		case R.id.chyoukai:
			databaseNum = "k062";
			break;
		case R.id.tone:
			databaseNum = "k063";
			break;
		case R.id.chikuma:
			databaseNum = "k064";
			break;
		case R.id.hiyou:
			databaseNum = "k065";
			break;
		case R.id.jyunyou:
			databaseNum = "k066";
			break;
		case R.id.oboro:
			databaseNum = "k067";
			break;
		// case R.id.akebono:
		// databaseNum = "k068";
		// break;
		case R.id.sazanami:
			databaseNum = "k069";
			break;
		case R.id.ushio:
			databaseNum = "k070";
			break;
		case R.id.akatsuki:
			databaseNum = "k071";
			break;
		case R.id.hibiki:
			databaseNum = "k072";
			break;
		case R.id.ikazuchi:
			databaseNum = "k073";
			break;
		case R.id.inazuma:
			databaseNum = "k074";
			break;
		case R.id.hatsuharu:
			databaseNum = "k075";
			break;
		case R.id.nenohi:
			databaseNum = "k076";
			break;
		case R.id.wakaba:
			databaseNum = "k077";
			break;
		case R.id.hatsushimo:
			databaseNum = "k078";
			break;
		case R.id.shiratsuyu:
			databaseNum = "k079";
			break;
		case R.id.shigure:
			databaseNum = "k080";
			break;
		case R.id.murasame:
			databaseNum = "k081";
			break;
		case R.id.yuudachi:
			databaseNum = "k082";
			break;
		case R.id.samidare:
			databaseNum = "k083";
			break;
		case R.id.suzukaze:
			databaseNum = "k084";
			break;
		case R.id.asashio:
			databaseNum = "k085";
			break;
		case R.id.ooshio:
			databaseNum = "k086";
			break;
		case R.id.michishio:
			databaseNum = "k087";
			break;
		case R.id.arashio:
			databaseNum = "k088";
			break;
		case R.id.arare:
			databaseNum = "k089";
			break;
		case R.id.kazumi:
			databaseNum = "k090";
			break;
		case R.id.kagerou:
			databaseNum = "k091";
			break;
		case R.id.shiranui:
			databaseNum = "k092";
			break;
		case R.id.kuroshio:
			databaseNum = "k093";
			break;
		case R.id.shyouhou:
			databaseNum = "k094";
			break;

		case R.id.shyoukaku:
			databaseNum = "k106";
			break;
		case R.id.zuikaku:
			databaseNum = "k107";
			break;
		case R.id.kinu:
			databaseNum = "k109";
			break;
		case R.id.abukuma:
			databaseNum = "k110";
			break;
		case R.id.yuubari:
			databaseNum = "k111";
			break;
		case R.id.zuihou:
			databaseNum = "k112";
			break;
		case R.id.mikuma:
			databaseNum = "k116";
			break;
		case R.id.hatsukaze:
			databaseNum = "k118";
			break;
		case R.id.maikaze:
			databaseNum = "k119";
			break;
		case R.id.kinugasa:
			databaseNum = "k120";
			break;
		case R.id.i19:
			databaseNum = "k123";
			break;
		case R.id.suzuya:
			databaseNum = "k124";
			break;
		case R.id.kumano:
			databaseNum = "k125";
			break;
		case R.id.i168:
			databaseNum = "k126";
			break;
		case R.id.i58:
			databaseNum = "k127";
			break;
		case R.id.i8:
			databaseNum = "k128";
			break;
		case R.id.yamato:
			databaseNum = "k131";
			break;
		case R.id.akigumo:
			databaseNum = "k132";
			break;
		case R.id.yuugumo:
			databaseNum = "k133";
			break;
		case R.id.makigumo:
			databaseNum = "k134";
			break;
		case R.id.naganami:
			databaseNum = "k135";
			break;
		case R.id.agano:
			databaseNum = "k137";
			break;
		case R.id.noshiro:
			databaseNum = "k138";
			break;
		case R.id.yahagi:
			databaseNum = "k139";
			break;
		case R.id.sakawa:
			databaseNum = "k140";
			break;
		case R.id.musashi:
			databaseNum = "k143";
			break;
		case R.id.taihou:
			databaseNum = "k153";
			break;
		// case R.id.katori:
		// databaseNum = "k154";
		// break;
		case R.id.i401:
			databaseNum = "k155";
			break;
		case R.id.akitsumaru:
			databaseNum = "k161";
			break;
		case R.id.maruyu:
			databaseNum = "k163";
			break;
		case R.id.yayoi:
			databaseNum = "k164";
			break;
		case R.id.uzuki:
			databaseNum = "k165";
			break;
		case R.id.isokaze:
			databaseNum = "k167";
			break;
		case R.id.urakaze:
			databaseNum = "k168";
			break;
		case R.id.tanikaze:
			databaseNum = "k169";
			break;
		case R.id.hamakaze:
			databaseNum = "k170";
			break;
		case R.id.bismarck:
			databaseNum = "k171";
			break;
		case R.id.z1:
			databaseNum = "k174";
			break;
		case R.id.z3:
			databaseNum = "k175";
			break;
		case R.id.eugen:
			databaseNum = "k176";
			break;
		case R.id.amatsukaze:
			databaseNum = "k181";
			break;
		case R.id.akashi:
			databaseNum = "k182";
			break;
		case R.id.ooyodo:
			databaseNum = "k183";
			break;
		case R.id.taigei:
			databaseNum = "k184";
			break;
		case R.id.ryuuhou:
			databaseNum = "k185";
			break;
		case R.id.tokitsukaze:
			databaseNum = "k186";
			break;
		case R.id.unryuu:
			databaseNum = "k201";
			break;
		// case R.id.amagi:
		// databaseNum = "k202";
		// break;
		case R.id.katsuragi:
			databaseNum = "k203";
			break;
		case R.id.harusame:
			databaseNum = "k205";
			break;
		case R.id.hayashimo:
			databaseNum = "k209";
			break;
		case R.id.kiyoshimo:
			databaseNum = "k210";
			break;
		case R.id.asagumo:
			databaseNum = "k213";
			break;
		case R.id.yamagumo:
			databaseNum = "k214";
			break;
		case R.id.nowaki:
			databaseNum = "k215";
			break;
		case R.id.akizuki:
			databaseNum = "k221";
			break;
		case R.id.teruzuki:
			databaseNum = "k222";
			break;
		case R.id.hatsuzuki:
			databaseNum = "k223";
			break;
		case R.id.takanami:
			databaseNum = "k224";
			break;
		case R.id.asashimo:
			databaseNum = "k225";
			break;
		case R.id.yu511:
			databaseNum = "k231";
			break;
		case R.id.GrafZeppelin:
			databaseNum = "k232";
			break;
		// case R.id.ro500: // lack for her own database (her data is combined
		// with u511)
		// databaseNum = "k236";
		// break;
		// case R.id.Iowa:
		// databaseNum = "k240";
		// break;
		case R.id.littorio:
			databaseNum = "k241";
			break;
		case R.id.roma:
			databaseNum = "k242";
			break;
		case R.id.libeccio:
			databaseNum = "k243";
			break;
		case R.id.akitsushima:
			databaseNum = "k245";
			break;
		case R.id.zara:
			databaseNum = "k248";
			break;
		// case R.id.pola:
		// databaseNum = "k249";
		// break;
		// case R.id.mitsuhou:
		// databaseNum = "k251";
		// break;
		case R.id.okinami:
			databaseNum = "k252";
			break;
		case R.id.kazagumo:
			databaseNum = "k253";
			break;
		case R.id.arashi:
			databaseNum = "k254";
			break;
		case R.id.hagikaze:
			databaseNum = "k255";
			break;
		// case R.id.oyashio:
		// databaseNum = "k256";
		// break;
		case R.id.umikaze:
			databaseNum = "k258";
			break;
		case R.id.kawakaze:
			databaseNum = "k259";
			break;
		// case R.id.hayasui:
		// databaseNum = "k260";
		// break;
		case R.id.kashima:
			databaseNum = "k265";
			break;
		// case R.id.kamikaze:
		// databaseNum = "k094";
		// break;
		// case R.id.harukaze:
		// databaseNum = "k094";
		// break;

		default:
			databaseNum = "null";
			break;
		}

		if (!databaseNum.equals("null")) {
			cursor = db.query(databaseNum, null, null, null, null, null, null);
		} else {
			cursor = null;
		}

		if (cursor != null) {
			cursor.move(1);
			String lines = cursor.getString(cursor.getColumnIndex("lines"));
			String situation = cursor.getString(cursor
					.getColumnIndex("situation"));
			kanmusuVoice kanmusuVoiceItem = new kanmusuVoice(lines, situation);
			voiceData.add(kanmusuVoiceItem);
			for (int i = 0; i < cursor.getCount() - 1; ++i) {
				cursor.moveToNext();
				voiceData.add(new kanmusuVoice(cursor.getString(cursor
						.getColumnIndex("lines")), cursor.getString(cursor
						.getColumnIndex("situation"))));
			}

			voiceListView.setAdapter(new kanmusuVoiceAdapter(
					Activity_ship.this, R.layout.kanmusuvoice, voiceData));
			voiceListView.setOnItemClickListener(new OnItemClickListener() {
				@Override
				public void onItemClick(AdapterView<?> parent, View view,
						int position, long id) {
					Cursor temp = db.query(databaseNum, null, null, null, null,
							null, null);
					temp.move(position + 1);
					if (!mediaPlayer.isPlaying()) {
						Toast.makeText(Activity_ship.this, "(*ﾟ∀ﾟ)开——始播放！",
								Toast.LENGTH_SHORT).show();

						String voiceUrl = temp.getString(temp
								.getColumnIndex("url"));
						new HttpThreadForVoice(voiceUrl, mediaPlayer, handler)
								.start();
					} else {
						Toast.makeText(Activity_ship.this, "(*ﾟ∀ﾟ)停——止播放!",
								Toast.LENGTH_SHORT).show();
						mediaPlayer.reset();
					}
				}
			});
		} else {
			List<String> sorry = new ArrayList<String>();
			sorry.add("该舰娘语音模块...还在建造中(*ﾟ∀ﾟ)");
			ArrayAdapter<String> sorryAdapter = new ArrayAdapter<String>(
					Activity_ship.this, android.R.layout.simple_list_item_1,
					sorry);

			voiceListView.setAdapter(sorryAdapter);
			voiceListView.setOnItemClickListener(new OnItemClickListener() {
				@Override
				public void onItemClick(AdapterView<?> parent, View view,
						int position, long id) {
					Toast.makeText(Activity_ship.this, "(*ﾟ∀ﾟ)开发团队很懒这里还没完成啦",
							Toast.LENGTH_SHORT).show();
				}
			});
		}
	}
}
