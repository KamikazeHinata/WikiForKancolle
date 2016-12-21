package com.android.wikiforkancolle;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.Toast;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import com.android.wikiforkancolle.MyDBOpenHelper;

public class equipdata extends Activity {
	private ImageButton back;
	private Context mContext;
	private SQLiteDatabase db;
	private MyDBOpenHelper myDBHelper;
	private Bitmap bitmap;
	private String canNotBeEquiped;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.equipdata);
		mContext = equipdata.this;
		myDBHelper = new MyDBOpenHelper(mContext, "kancolle.db", null, 1);
		db = myDBHelper.getReadableDatabase();
		Cursor cursor = db.query("equipment", null, null, null, null, null,
				null);

		Intent intent = getIntent();
		// ��ʼ���ؼ�
		TextView name = (TextView) findViewById(R.id.equipname);
		ImageView lihui1 = (ImageView) findViewById(R.id.lihui);
		TextView huoli = (TextView) findViewById(R.id.huoli);
		TextView leizhuang = (TextView) findViewById(R.id.leizhuang);
		TextView baozhuang = (TextView) findViewById(R.id.baozhuang);
		TextView duikong = (TextView) findViewById(R.id.duikong);
		TextView duiqian = (TextView) findViewById(R.id.duiqian);
		TextView suodi = (TextView) findViewById(R.id.suodi);
		TextView mingzhong = (TextView) findViewById(R.id.mingzhong);
		TextView huibi = (TextView) findViewById(R.id.huibi);
		TextView shecheng = (TextView) findViewById(R.id.shecheng);
		TextView zhuangjia = (TextView) findViewById(R.id.zhuangjia);
		TextView data1 = (TextView) findViewById(R.id.data1);
		TextView data2 = (TextView) findViewById(R.id.data2);
		TextView data3 = (TextView) findViewById(R.id.data3);
		TextView data4 = (TextView) findViewById(R.id.data4);
		TextView data5 = (TextView) findViewById(R.id.data5);
		TextView data6 = (TextView) findViewById(R.id.data6);
		TextView data7 = (TextView) findViewById(R.id.data7);
		TextView data8 = (TextView) findViewById(R.id.data8);
		TextView data9 = (TextView) findViewById(R.id.data9);
		TextView data10 = (TextView) findViewById(R.id.data10);
		TextView data11 = (TextView) findViewById(R.id.data11);
		TextView data12 = (TextView) findViewById(R.id.data12);
		TextView data13 = (TextView) findViewById(R.id.data13);
		TextView data14 = (TextView) findViewById(R.id.data14);
		TextView data15 = (TextView) findViewById(R.id.data15);
		TextView data16 = (TextView) findViewById(R.id.data16);
		
		// Init dataX
		
		

		// Define the value of canNotBeEquiped
		cursor.move(1);
		canNotBeEquiped = cursor.getString(cursor.getColumnIndex("BBV"));
		cursor.move(-1);
		
		switch (intent.getExtras().getInt("equipdata")) {
		// For each case, first line set the image
		// For the second line, move the cursor to the right position
		case R.id.cmdan_12:
			lihui1.setBackgroundResource(R.drawable.n001a);
			cursor.move(1);
			break;
		case R.id.cmlian_12_7:
			lihui1.setBackgroundResource(R.drawable.n002a);
			cursor.move(2);
			break;
		case R.id.cm_10:
			lihui1.setBackgroundResource(R.drawable.n003a);
			cursor.move(3);
			break;
		case R.id.cmdan_14:
			lihui1.setBackgroundResource(R.drawable.n004a);
			cursor.move(4);
			break;
		case R.id.cm_15_5:
			lihui1.setBackgroundResource(R.drawable.n005a);
			cursor.move(5);
			break;
		case R.id.cm_20_3:
			lihui1.setBackgroundResource(R.drawable.n006a);
			cursor.move(6);
			break;
		case R.id.cm_35_6:
			lihui1.setBackgroundResource(R.drawable.n007a);
			cursor.move(7);
			break;
		case R.id.cm_41:
			lihui1.setBackgroundResource(R.drawable.n008a);
			cursor.move(8);
			break;
		case R.id.cm_46:
			lihui1.setBackgroundResource(R.drawable.n009a);
			cursor.move(9);
			break;
//		case R.id.cmh_12_7:
//			lihui1.setBackgroundResource(R.drawable.n010a);
//			cursor.move(10);
//			break;
		case R.id.cmdan_15_2:
			lihui1.setBackgroundResource(R.drawable.n011a);
			cursor.move(11);
			break;
		case R.id.cm15_5_3:
			lihui1.setBackgroundResource(R.drawable.n012a);
			cursor.move(12);
			break;
		case R.id.cm61_3:
			lihui1.setBackgroundResource(R.drawable.n013a);
			cursor.move(13);
			break;
		case R.id.cm61_4:
			lihui1.setBackgroundResource(R.drawable.n014a);
			cursor.move(14);
			break;
		case R.id.cm61_4op:
			lihui1.setBackgroundResource(R.drawable.n015a);
			cursor.move(15);
			break;
		case R.id.tp_97:
			lihui1.setBackgroundResource(R.drawable.n016a);
			cursor.move(16);
			break;
		case R.id.tenzan:
			lihui1.setBackgroundResource(R.drawable.n017a);
			cursor.move(17);
			break;
		case R.id.ryuusei:
			lihui1.setBackgroundResource(R.drawable.n018a);
			cursor.move(18);
			break;
		case R.id.tp_96:
			lihui1.setBackgroundResource(R.drawable.n019a);
			cursor.move(19);
			break;
		case R.id.Tp21:
			lihui1.setBackgroundResource(R.drawable.n020a);
			cursor.move(20);
			break;
		case R.id.Tp52:
			lihui1.setBackgroundResource(R.drawable.n021a);
			cursor.move(21);
			break;
		case R.id.reppu:
			lihui1.setBackgroundResource(R.drawable.n022a);
			cursor.move(22);
			break;
		case R.id.tp_99:
			lihui1.setBackgroundResource(R.drawable.n023a);
			cursor.move(23);
			break;
		case R.id.suisei:
			lihui1.setBackgroundResource(R.drawable.n024a);
			cursor.move(24);
			break;
		case R.id.tp_0:
			lihui1.setBackgroundResource(R.drawable.n025a);
			cursor.move(25);
			break;
		case R.id.zuiun:
			lihui1.setBackgroundResource(R.drawable.n026a);
			cursor.move(26);
			break;
		case R.id.num13:
			lihui1.setBackgroundResource(R.drawable.n027a);
			cursor.move(27);
			break;
		case R.id.num22:
			lihui1.setBackgroundResource(R.drawable.n028a);
			cursor.move(28);
			break;
		case R.id.num33:
			lihui1.setBackgroundResource(R.drawable.n029a);
			cursor.move(29);
			break;
		case R.id.num21:
			lihui1.setBackgroundResource(R.drawable.n030a);
			cursor.move(30);
			break;
		case R.id.num32:
			lihui1.setBackgroundResource(R.drawable.n031a);
			cursor.move(31);
			break;
		case R.id.num14:
			lihui1.setBackgroundResource(R.drawable.n032a);
			cursor.move(32);
			break;
		case R.id.gailiang:
			lihui1.setBackgroundResource(R.drawable.n033a);
			cursor.move(33);
			break;
		case R.id.qianhua:
			lihui1.setBackgroundResource(R.drawable.n034a);
			cursor.move(34);
			break;
		case R.id.tp_3:
			lihui1.setBackgroundResource(R.drawable.n035a);
			cursor.move(35);
			break;
		case R.id.tp_91:
			lihui1.setBackgroundResource(R.drawable.n036a);
			cursor.move(36);
			break;
		case R.id.mm_7_7:
			lihui1.setBackgroundResource(R.drawable.n037a);
			cursor.move(37);
			break;
		case R.id.mm_12_7:
			lihui1.setBackgroundResource(R.drawable.n038a);
			cursor.move(38);
			break;
		case R.id.mm_25:
			lihui1.setBackgroundResource(R.drawable.n039a);
			cursor.move(39);
			break;
		case R.id.mm25_3:
			lihui1.setBackgroundResource(R.drawable.n040a);
			cursor.move(40);
			break;
		case R.id.nail:
			lihui1.setBackgroundResource(R.drawable.n041a);
			cursor.move(41);
			break;
		case R.id.member:
			lihui1.setBackgroundResource(R.drawable.n042a);
			cursor.move(42);
			break;
		case R.id.megami:
			lihui1.setBackgroundResource(R.drawable.n043a);
			cursor.move(43);
			break;
		case R.id.tpbao_94:
			lihui1.setBackgroundResource(R.drawable.n044a);
			cursor.move(44);
			break;
		case R.id.tpbao_3:
			lihui1.setBackgroundResource(R.drawable.n045a);
			cursor.move(45);
			break;
		case R.id.tpshui_93:
			lihui1.setBackgroundResource(R.drawable.n046a);
			cursor.move(46);
			break;
		case R.id.tpshui_3:
			lihui1.setBackgroundResource(R.drawable.n047a);
			cursor.move(47);
			break;
		case R.id.cmh_12_7:
			lihui1.setBackgroundResource(R.drawable.n048a);
			cursor.move(48);
			break;
//		case R.id.mm25_3:
//			lihui1.setBackgroundResource(R.drawable.n011a);
//			cursor.move(49);
//			break;
		case R.id.cm20_3_3:
			lihui1.setBackgroundResource(R.drawable.n050a);
			cursor.move(50);
			break;
		case R.id.cm12_30:
			lihui1.setBackgroundResource(R.drawable.n051a);
			cursor.move(51);
			break;
		case R.id.ryuuseikai:
			lihui1.setBackgroundResource(R.drawable.n052a);
			cursor.move(52);
			break;
		case R.id.reppukai:
			lihui1.setBackgroundResource(R.drawable.n053a);
			cursor.move(53);
			break;
		case R.id.saiun:
			lihui1.setBackgroundResource(R.drawable.n054a);
			cursor.move(54);
			break;
		case R.id.shiden:
			lihui1.setBackgroundResource(R.drawable.n055a);
			cursor.move(55);
			break;
		case R.id.zhendian:
			lihui1.setBackgroundResource(R.drawable.n056a);
			cursor.move(56);
			break;
		case R.id.suiseiTp12:
			lihui1.setBackgroundResource(R.drawable.n057a);
			cursor.move(57);
			break;
		case R.id.cm61_5op:
			lihui1.setBackgroundResource(R.drawable.n058a);
			cursor.move(58);
			break;
		case R.id.tpguan_0:
			lihui1.setBackgroundResource(R.drawable.n059a);
			cursor.move(59);
			break;
		case R.id.Tp62:
			lihui1.setBackgroundResource(R.drawable.n060a);
			cursor.move(60);
			break;
		case R.id.tp_2:
			lihui1.setBackgroundResource(R.drawable.n061a);
			cursor.move(61);
			break;
		case R.id.seiran:
			lihui1.setBackgroundResource(R.drawable.n062a);
			cursor.move(62);
			break;
		case R.id.cmlianB_12_7:
			lihui1.setBackgroundResource(R.drawable.n063a);
			cursor.move(63);
			break;
		case R.id.ju87c:
			lihui1.setBackgroundResource(R.drawable.n064a);
			cursor.move(64);
			break;
		case R.id.cm_15_2:
			lihui1.setBackgroundResource(R.drawable.n065a);
			cursor.move(65);
			break;
		case R.id.cm_8:
			lihui1.setBackgroundResource(R.drawable.n066a);
			cursor.move(66);
			break;
		case R.id.cm_53:
			lihui1.setBackgroundResource(R.drawable.n067a);
			cursor.move(67);
			break;
		case R.id.big:
			lihui1.setBackgroundResource(R.drawable.n068a);
			cursor.move(68);
			break;
		case R.id.numka:
			lihui1.setBackgroundResource(R.drawable.n069a);
			cursor.move(69);
			break;
		case R.id.toss:
			lihui1.setBackgroundResource(R.drawable.n070a);
			cursor.move(70);
			break;
		case R.id.t_cm_10:
			lihui1.setBackgroundResource(R.drawable.n071a);
			cursor.move(71);
			break;
		case R.id.barujim:
			lihui1.setBackgroundResource(R.drawable.n072a);
			cursor.move(72);
			break;
		case R.id.barujib:
			lihui1.setBackgroundResource(R.drawable.n073a);
			cursor.move(73);
			break;
		case R.id.tan:
			lihui1.setBackgroundResource(R.drawable.n074a);
			cursor.move(74);
			break;
		case R.id.shu:
			lihui1.setBackgroundResource(R.drawable.n075a);
			cursor.move(75);
			break;
		case R.id.cm_38:
			lihui1.setBackgroundResource(R.drawable.n076a);
			cursor.move(76);
			break;
		case R.id.cm_15:
			lihui1.setBackgroundResource(R.drawable.n077a);
			cursor.move(77);
			break;
		case R.id.cm_12_7:
			lihui1.setBackgroundResource(R.drawable.n078a);
			cursor.move(78);
			break;
		case R.id.zuiun634:
			lihui1.setBackgroundResource(R.drawable.n079a);
			cursor.move(79);
			break;
		case R.id.zuiunTp12:
			lihui1.setBackgroundResource(R.drawable.n080a);
			cursor.move(80);
			break;
		case R.id.zuiun634Tp12:
			lihui1.setBackgroundResource(R.drawable.n081a);
			cursor.move(81);
			break;
		case R.id.tp97_931:
			lihui1.setBackgroundResource(R.drawable.n082a);
			cursor.move(82);
			break;
		case R.id.tenzan931:
			lihui1.setBackgroundResource(R.drawable.n083a);
			cursor.move(83);
			break;
		case R.id.flak38:
			lihui1.setBackgroundResource(R.drawable.n084a);
			cursor.move(84);
			break;
		case R.id.flakm42:
			lihui1.setBackgroundResource(R.drawable.n085a);
			cursor.move(85);
			break;
		case R.id.xiu:
			lihui1.setBackgroundResource(R.drawable.n086a);
			cursor.move(86);
			break;
		case R.id.xinxing:
			lihui1.setBackgroundResource(R.drawable.n087a);
			cursor.move(87);
			break;
		case R.id.num22kai:
			lihui1.setBackgroundResource(R.drawable.n088a);
			cursor.move(88);
			break;
		case R.id.num21kai:
			lihui1.setBackgroundResource(R.drawable.n089a);
			cursor.move(89);
			break;
		case R.id.cm20_3_2:
			lihui1.setBackgroundResource(R.drawable.n090a);
			cursor.move(90);
			break;
		case R.id.t_cmlianh_12_7:
			lihui1.setBackgroundResource(R.drawable.n091a);
			cursor.move(91);
			break;
		case R.id.mm_40:
			lihui1.setBackgroundResource(R.drawable.n092a);
			cursor.move(92);
			break;
		case R.id.tpyou_97:
			lihui1.setBackgroundResource(R.drawable.n093a);
			cursor.move(93);
			break;
		case R.id.tenzanyou:
			lihui1.setBackgroundResource(R.drawable.n094a);
			cursor.move(94);
			break;
		case R.id.cm53_8:
			lihui1.setBackgroundResource(R.drawable.n095a);
			cursor.move(95);
			break;
		case R.id.Tp21prac:
			lihui1.setBackgroundResource(R.drawable.n096a);
			cursor.move(96);
			break;
		case R.id.tpprac_99:
			lihui1.setBackgroundResource(R.drawable.n097a);
			cursor.move(97);
			break;
		case R.id.tpprac_97:
			lihui1.setBackgroundResource(R.drawable.n098a);
			cursor.move(98);
			break;
		case R.id.tpjiang_99:
			lihui1.setBackgroundResource(R.drawable.n099a);
			cursor.move(99);
			break;
		case R.id.suiseijiang:
			lihui1.setBackgroundResource(R.drawable.n100a);
			cursor.move(100);
			break;
		case R.id.zhao:
			lihui1.setBackgroundResource(R.drawable.n101a);
			cursor.move(101);
			break;
		case R.id.tp_98:
			lihui1.setBackgroundResource(R.drawable.n102a);
			cursor.move(102);
			break;
		case R.id.cm35_6_3:
			lihui1.setBackgroundResource(R.drawable.n103a);
			cursor.move(103);
			break;
		case R.id.cmdzr_35_6:
			lihui1.setBackgroundResource(R.drawable.n104a);
			cursor.move(104);
			break;
		case R.id.cm41_3:
			lihui1.setBackgroundResource(R.drawable.n105a);
			cursor.move(105);
			break;
		case R.id.num13kai:
			lihui1.setBackgroundResource(R.drawable.n106a);
			cursor.move(106);
			break;
		case R.id.si:
			lihui1.setBackgroundResource(R.drawable.n107a);
			cursor.move(107);
			break;
		case R.id.hang:
			lihui1.setBackgroundResource(R.drawable.n108a);
			cursor.move(108);
			break;
		case R.id.Tp52601:
			lihui1.setBackgroundResource(R.drawable.n109a);
			cursor.move(110);
			break;
		case R.id.reppu601:
			lihui1.setBackgroundResource(R.drawable.n110a);
			cursor.move(109);
			break;
		case R.id.suisei601:
			lihui1.setBackgroundResource(R.drawable.n111a);
			cursor.move(111);
			break;
		case R.id.tenzan601:
			lihui1.setBackgroundResource(R.drawable.n112a);
			cursor.move(112);
			break;
		case R.id.ryuusei601:
			lihui1.setBackgroundResource(R.drawable.n113a);
			cursor.move(113);
			break;
		case R.id.cmkai_38:
			lihui1.setBackgroundResource(R.drawable.n114a);
			cursor.move(114);
			break;
		case R.id.ar196:
			lihui1.setBackgroundResource(R.drawable.n115a);
			cursor.move(115);
			break;
		case R.id.tp_1:
			lihui1.setBackgroundResource(R.drawable.n116a);
			cursor.move(116);
			break;
		case R.id.cm46_3:
			lihui1.setBackgroundResource(R.drawable.n117a);
			cursor.move(117);
			break;
		case R.id.shiun:
			lihui1.setBackgroundResource(R.drawable.n118a);
			cursor.move(118);
			break;
		case R.id.cmlian_14:
			lihui1.setBackgroundResource(R.drawable.n119a);
			cursor.move(119);
			break;
		case R.id.tph_91:
			lihui1.setBackgroundResource(R.drawable.n120a);
			cursor.move(120);
			break;
		case R.id.tph_94:
			lihui1.setBackgroundResource(R.drawable.n121a);
			cursor.move(121);
			break;
		case R.id.cmh_10:
			lihui1.setBackgroundResource(R.drawable.n122a);
			cursor.move(122);
			break;
		case R.id.skc:
			lihui1.setBackgroundResource(R.drawable.n123a);
			cursor.move(123);
			break;
		case R.id.fumo25:
			lihui1.setBackgroundResource(R.drawable.n124a);
			cursor.move(124);
			break;
		case R.id.cm61_3op:
			lihui1.setBackgroundResource(R.drawable.n125a);
			cursor.move(125);
			break;
		case R.id.di:
			lihui1.setBackgroundResource(R.drawable.n126a);
			cursor.move(126);
			break;
		case R.id.FaT:
			lihui1.setBackgroundResource(R.drawable.n127a);
			cursor.move(127);
			break;
		case R.id.cm_51:
			lihui1.setBackgroundResource(R.drawable.n128a);
			cursor.move(128);
			break;
		case R.id.jian:
			lihui1.setBackgroundResource(R.drawable.n129a);
			cursor.move(129);
			break;
		case R.id.cmlianh_12_7:
			lihui1.setBackgroundResource(R.drawable.n130a);
			cursor.move(130);
			break;
		case R.id.mm25_3ji:
			lihui1.setBackgroundResource(R.drawable.n131a);
			cursor.move(131);
			break;
		case R.id.tpshui_0:
			lihui1.setBackgroundResource(R.drawable.n132a);
			cursor.move(132);
			break;
		case R.id.mm_381:
			lihui1.setBackgroundResource(R.drawable.n133a);
			cursor.move(133);
			break;
		case R.id.OTO:
			lihui1.setBackgroundResource(R.drawable.n134a);
			cursor.move(134);
			break;
		case R.id.mm_90:
			lihui1.setBackgroundResource(R.drawable.n135a);
			cursor.move(135);
			break;
		case R.id.purie:
			lihui1.setBackgroundResource(R.drawable.n136a);
			cursor.move(136);
			break;
		case R.id.mmkai_381:
			lihui1.setBackgroundResource(R.drawable.n137a);
			cursor.move(137);
			break;
		case R.id.fly:
			lihui1.setBackgroundResource(R.drawable.n138a);
			cursor.move(138);
			break;
		case R.id.cmkai_15_2:
			lihui1.setBackgroundResource(R.drawable.n139a);
			cursor.move(139);
			break;
		case R.id.btan:
			lihui1.setBackgroundResource(R.drawable.n140a);
			cursor.move(140);
			break;
		case R.id.num32kai:
			lihui1.setBackgroundResource(R.drawable.n141a);
			cursor.move(141);
			break;
		case R.id.m_15:
			lihui1.setBackgroundResource(R.drawable.n142a);
			cursor.move(142);
			break;
		case R.id.tpcun_97:
			lihui1.setBackgroundResource(R.drawable.n143a);
			cursor.move(143);
			break;
		case R.id.tenzancun:
			lihui1.setBackgroundResource(R.drawable.n144a);
			cursor.move(144);
			break;
		case R.id.food:
			lihui1.setBackgroundResource(R.drawable.n145a);
			cursor.move(145);
			break;
		case R.id.yang:
			lihui1.setBackgroundResource(R.drawable.n146a);
			cursor.move(146);
			break;
		case R.id.mm_120:
			lihui1.setBackgroundResource(R.drawable.n147a);
			cursor.move(147);
			break;
		case R.id.nanzan:
			lihui1.setBackgroundResource(R.drawable.n148a);
			cursor.move(148);
			break;
		case R.id.tpshui_4:
			lihui1.setBackgroundResource(R.drawable.n149a);
			cursor.move(149);
			break;
		case R.id.qiu:
			lihui1.setBackgroundResource(R.drawable.n150a);
			cursor.move(150);
			break;
		case R.id.keun:
			lihui1.setBackgroundResource(R.drawable.n151a);
			cursor.move(151);
			break;
		case R.id.Tp52prac:
			lihui1.setBackgroundResource(R.drawable.n152a);
			cursor.move(152);
			break;
		case R.id.Tp52fu:
			lihui1.setBackgroundResource(R.drawable.n153a);
			cursor.move(153);
			break;
		case R.id.Tp62yan:
			lihui1.setBackgroundResource(R.drawable.n154a);
			cursor.move(154);
			break;
		case R.id.Tp21fu:
			lihui1.setBackgroundResource(R.drawable.n155a);
			cursor.move(155);
			break;
		case R.id.t_Tp52jiafu:
			lihui1.setBackgroundResource(R.drawable.n156a);
			cursor.move(156);
			break;
		case R.id.Tp53:
			lihui1.setBackgroundResource(R.drawable.n157a);
			cursor.move(157);
			break;
//		case R.id.tph_94:
//			lihui1.setBackgroundResource(R.drawable.n011a);
//			cursor.move(158);
//			break;
//		case R.id.tph_94:
//			lihui1.setBackgroundResource(R.drawable.n011a);
//			cursor.move(159);
//			break;
//		case R.id.tph_94:
//			lihui1.setBackgroundResource(R.drawable.n011a);
//			cursor.move(160);
//			break;
			
		default:
			Toast.makeText(this, "There's no data here.", Toast.LENGTH_SHORT)
					.show();
			break;
		}

		// Set text
		name.setText(cursor.getString(cursor.getColumnIndex("name")));
		huoli.setText(cursor.getString(cursor.getColumnIndex("huoli")));
		leizhuang.setText(cursor.getString(cursor.getColumnIndex("leizhuang")));
		baozhuang.setText(cursor.getString(cursor.getColumnIndex("baozhuang")));
		duikong.setText(cursor.getString(cursor.getColumnIndex("duikong")));
		duiqian.setText(cursor.getString(cursor.getColumnIndex("duiqian")));
		suodi.setText(cursor.getString(cursor.getColumnIndex("suodi")));
		mingzhong.setText(cursor.getString(cursor.getColumnIndex("mingzhong")));
		huibi.setText(cursor.getString(cursor.getColumnIndex("huibi")));
		shecheng.setText(cursor.getString(cursor.getColumnIndex("shecheng")));
		zhuangjia.setText(cursor.getString(cursor.getColumnIndex("zhuangjia")));
		
		// Get Equipment requirement
		

		if (cursor.getString(cursor.getColumnIndex("DD")).equals(canNotBeEquiped)) {
			data1.setBackgroundResource(R.color.gray);
		}
		if (cursor.getString(cursor.getColumnIndex("CL")).equals(canNotBeEquiped)) {
			data2.setBackgroundResource(R.color.gray);
		}
		if (cursor.getString(cursor.getColumnIndex("CLT")).equals(canNotBeEquiped)) {
			data3.setBackgroundResource(R.color.gray);
		}
		if (cursor.getString(cursor.getColumnIndex("CA")).equals(canNotBeEquiped)) {
			data4.setBackgroundResource(R.color.gray);
		}
		if (cursor.getString(cursor.getColumnIndex("BBslow")).equals(canNotBeEquiped)) {
			data5.setBackgroundResource(R.color.gray);
		}
		if (cursor.getString(cursor.getColumnIndex("BBfast")).equals(canNotBeEquiped)) {
			data6.setBackgroundResource(R.color.gray);
		}
		if (cursor.getString(cursor.getColumnIndex("BBV")).equals(canNotBeEquiped)) {
			data7.setBackgroundResource(R.color.gray);
		}
		if (cursor.getString(cursor.getColumnIndex("CAV")).equals(canNotBeEquiped)) {
			data8.setBackgroundResource(R.color.gray);
		}
		if (cursor.getString(cursor.getColumnIndex("CVL")).equals(canNotBeEquiped)) {
			data9.setBackgroundResource(R.color.gray);
		}
		if (cursor.getString(cursor.getColumnIndex("CV")).equals(canNotBeEquiped)) {
			data10.setBackgroundResource(R.color.gray);
		}
		if (cursor.getString(cursor.getColumnIndex("AV")).equals(canNotBeEquiped)) {
			data11.setBackgroundResource(R.color.gray);
		}
		if (cursor.getString(cursor.getColumnIndex("LHA")).equals(canNotBeEquiped)) {
			data12.setBackgroundResource(R.color.gray);
		}
		if (cursor.getString(cursor.getColumnIndex("SS")).equals(canNotBeEquiped)) {
			data13.setBackgroundResource(R.color.gray);
		}
		if (cursor.getString(cursor.getColumnIndex("QSKM")).equals(canNotBeEquiped)) {
			data14.setBackgroundResource(R.color.gray);
		}
		if (cursor.getString(cursor.getColumnIndex("QSMJ")).equals(canNotBeEquiped)) {
			data15.setBackgroundResource(R.color.gray);
		}
		if (cursor.getString(cursor.getColumnIndex("GZJ")).equals(canNotBeEquiped)) {
			data16.setBackgroundResource(R.color.gray);
		}

		back = (ImageButton) findViewById(R.id.back);
		back.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				finish();
			}
		});
	}
}
