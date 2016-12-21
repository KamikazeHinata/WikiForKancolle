package com.android.wikiforkancolle;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.Toast;

public class equiptype extends Activity implements OnClickListener {

	private ImageButton back;
	private ImageButton bt1;
	private ImageButton bt2;
	private ImageButton bt3;
	private ImageButton bt4;
	private ImageButton bt5;
	private ImageButton bt6;
	private ImageButton bt7;
	private ImageButton bt8;
	private ImageButton bt9;
	private ImageButton bt10;
	private ImageButton bt11;
	private ImageButton bt12;
	private ImageButton bt13;
	private ImageButton bt14;
	private ImageButton bt15;
	private ImageButton bt16;
	private ImageButton bt17;
	private ImageButton bt18;
	private ImageButton bt19;
	private ImageButton bt20;
	private ImageButton bt21;
	private ImageButton bt22;
	private ImageButton bt23;
	private ImageButton bt24;
	private ImageButton bt25;
	private ImageButton bt26;
	private ImageButton bt27;
	private ImageButton bt28;
	private ImageButton bt29;
	private ImageButton bt30;
	private ImageButton bt31;
	private ImageButton bt32;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		// 获取跳转页面信息
		Intent intent_equip = getIntent();
		switch (intent_equip.getExtras().getInt("equiptype")) {
		case R.id.gao:
			setContentView(R.layout.aafd);
			bt1 = (ImageButton) findViewById(R.id.tph_91);
			bt1.setOnClickListener(this);
			bt2 = (ImageButton) findViewById(R.id.tph_94);
			bt2.setOnClickListener(this);
			break;
		case R.id.kong:
			setContentView(R.layout.aagun);
			/*********************↓对空机枪↓*********************/
			bt1 = (ImageButton) findViewById(R.id.mm_7_7);
			bt1.setOnClickListener(this);
			bt2 = (ImageButton) findViewById(R.id.mm_12_7);
			bt2.setOnClickListener(this);
			bt3 = (ImageButton) findViewById(R.id.mm_25);
			bt3.setOnClickListener(this);
			bt4 = (ImageButton) findViewById(R.id.mm25_3);
			bt4.setOnClickListener(this);
			bt5 = (ImageButton) findViewById(R.id.mm_40);
			bt5.setOnClickListener(this);
			bt6 = (ImageButton) findViewById(R.id.flak38);
			bt6.setOnClickListener(this);
			bt7 = (ImageButton) findViewById(R.id.cm12_30);
			bt7.setOnClickListener(this);
			bt8 = (ImageButton) findViewById(R.id.flakm42);
			bt8.setOnClickListener(this);
			bt9 = (ImageButton) findViewById(R.id.mm25_3ji);
			bt9.setOnClickListener(this);
			/*********************↓对空强化弹↓*********************/
			bt10 = (ImageButton) findViewById(R.id.tp_3);
			bt10.setOnClickListener(this);
			break;
		case R.id.na:
			setContentView(R.layout.aswsonar);
			/*********************↓水听↓*********************/
			bt1 = (ImageButton) findViewById(R.id.tpshui_93);
			bt1.setOnClickListener(this);
			bt2 = (ImageButton) findViewById(R.id.tpshui_3);
			bt2.setOnClickListener(this);
			bt3 = (ImageButton) findViewById(R.id.tpshui_4);
			bt3.setOnClickListener(this);
			bt4 = (ImageButton) findViewById(R.id.tpshui_0);
			bt4.setOnClickListener(this);
			break;
		case R.id.bao:
			setContentView(R.layout.bomber);
			/*********************↓舰上暴击机↓*********************/
			bt1 = (ImageButton) findViewById(R.id.Tp62);
			bt1.setOnClickListener(this);
			bt2 = (ImageButton) findViewById(R.id.Tp62yan);
			bt2.setOnClickListener(this);
			bt3 = (ImageButton) findViewById(R.id.tp_99);
			bt3.setOnClickListener(this);
			bt4 = (ImageButton) findViewById(R.id.tpprac_99);
			bt4.setOnClickListener(this);
			bt5 = (ImageButton) findViewById(R.id.suisei);
			bt5.setOnClickListener(this);
			bt6 = (ImageButton) findViewById(R.id.ju87c);
			bt6.setOnClickListener(this);
			bt7 = (ImageButton) findViewById(R.id.suiseiTp12);
			bt7.setOnClickListener(this);
			bt8 = (ImageButton) findViewById(R.id.tpjiang_99);
			bt8.setOnClickListener(this);
			bt9 = (ImageButton) findViewById(R.id.suisei601);
			bt9.setOnClickListener(this);
			bt10 = (ImageButton) findViewById(R.id.nanzan);
			bt10.setOnClickListener(this);
			bt11 = (ImageButton) findViewById(R.id.suiseijiang);
			bt11.setOnClickListener(this);
			/*********************↓水上暴击机↓*********************/
			bt12 = (ImageButton) findViewById(R.id.zuiun);
			bt12.setOnClickListener(this);
			bt13 = (ImageButton) findViewById(R.id.zuiun634);
			bt13.setOnClickListener(this);
			bt14 = (ImageButton) findViewById(R.id.zuiunTp12);
			bt14.setOnClickListener(this);
			bt15 = (ImageButton) findViewById(R.id.zuiun634Tp12);
			bt15.setOnClickListener(this);
			bt16 = (ImageButton) findViewById(R.id.seiran);
			bt16.setOnClickListener(this);
			break;
		case R.id.zen:
			setContentView(R.layout.bulge);
			/*********************↓增设护甲↓*********************/
			bt1 = (ImageButton) findViewById(R.id.barujim);
			bt1.setOnClickListener(this);
			bt2 = (ImageButton) findViewById(R.id.purie);
			bt2.setOnClickListener(this);
			bt3 = (ImageButton) findViewById(R.id.barujib);
			bt3.setOnClickListener(this);
			break;
		case R.id.baolei:
			setContentView(R.layout.depth);
			/*********************↓爆雷↓*********************/
			bt1 = (ImageButton) findViewById(R.id.tpbao_94);
			bt1.setOnClickListener(this);
			bt2 = (ImageButton) findViewById(R.id.tpbao_3);
			bt2.setOnClickListener(this);
			break;
		case R.id.zhen:
			setContentView(R.layout.econ);
			/*********************↓舰上侦察机↓*********************/
			bt1 = (ImageButton) findViewById(R.id.tp_2);
			bt1.setOnClickListener(this);
			bt2 = (ImageButton) findViewById(R.id.saiun);
			bt2.setOnClickListener(this);
			bt3 = (ImageButton) findViewById(R.id.keun);
			bt3.setOnClickListener(this);
			/*********************↓水上侦察机↓*********************/
			bt4 = (ImageButton) findViewById(R.id.tp_98);
			bt4.setOnClickListener(this);
			bt5 = (ImageButton) findViewById(R.id.tp_0);
			bt5.setOnClickListener(this);
			bt6 = (ImageButton) findViewById(R.id.ar196);
			bt6.setOnClickListener(this);
			bt7 = (ImageButton) findViewById(R.id.tpguan_0);
			bt7.setOnClickListener(this);
			bt8 = (ImageButton) findViewById(R.id.shiun);
			bt8.setOnClickListener(this);
			break;
		case R.id.ji:
			setContentView(R.layout.engine);
			/*********************↓锅↓*********************/
			bt1 = (ImageButton) findViewById(R.id.gailiang);
			bt1.setOnClickListener(this);
			bt2 = (ImageButton) findViewById(R.id.qianhua);
			bt2.setOnClickListener(this);
			bt3 = (ImageButton) findViewById(R.id.xinxing);
			bt3.setOnClickListener(this);
			break;
		case R.id.zhan:
			setContentView(R.layout.fighter);
			/*********************↓舰上战斗机↓*********************/
			bt1 = (ImageButton) findViewById(R.id.tp_96);
			bt1.setOnClickListener(this);
			bt2 = (ImageButton) findViewById(R.id.Tp21);
			bt2.setOnClickListener(this);
			bt3 = (ImageButton) findViewById(R.id.Tp52);
			bt3.setOnClickListener(this);
			bt4 = (ImageButton) findViewById(R.id.Tp21prac);
			bt4.setOnClickListener(this);
			bt5 = (ImageButton) findViewById(R.id.shiden);
			bt5.setOnClickListener(this);
			bt6 = (ImageButton) findViewById(R.id.Tp52601);
			bt6.setOnClickListener(this);
			bt7 = (ImageButton) findViewById(R.id.Tp52prac);
			bt7.setOnClickListener(this);
			bt8 = (ImageButton) findViewById(R.id.Tp21fu);
			bt8.setOnClickListener(this);
			bt9 = (ImageButton) findViewById(R.id.reppu);
			bt9.setOnClickListener(this);
			bt10 = (ImageButton) findViewById(R.id.Tp52fu);
			bt10.setOnClickListener(this);
			bt11 = (ImageButton) findViewById(R.id.reppukai);
			bt11.setOnClickListener(this);
			bt12 = (ImageButton) findViewById(R.id.Tp53);
			bt12.setOnClickListener(this);
			bt13 = (ImageButton) findViewById(R.id.zhendian);
			bt13.setOnClickListener(this);
			bt14 = (ImageButton) findViewById(R.id.reppu601);
			bt14.setOnClickListener(this);
			bt15 = (ImageButton) findViewById(R.id.Tp52jiafu);
			bt15.setOnClickListener(this);

			break;
		case R.id.ting:
			setContentView(R.layout.ld);
			/*********************↓特殊潜航艇↓*********************/
			bt1 = (ImageButton) findViewById(R.id.nail);
			bt1.setOnClickListener(this);
			/*********************↓上陆用舟艇↓*********************/
			bt2 = (ImageButton) findViewById(R.id.big);
			bt2.setOnClickListener(this);
			break;
		case R.id.zhu:
			setContentView(R.layout.main);
			/*********************↓小口径主炮↓*********************/
			bt1 = (ImageButton) findViewById(R.id.cmdan_12);
			bt1.setOnClickListener(this);
			bt2 = (ImageButton) findViewById(R.id.cmh_12_7);
			bt2.setOnClickListener(this);
			bt3 = (ImageButton) findViewById(R.id.cm_12_7);
			bt3.setOnClickListener(this);
			bt4 = (ImageButton) findViewById(R.id.cmlian_12_7);
			bt4.setOnClickListener(this);
			bt5 = (ImageButton) findViewById(R.id.cmlianh_12_7);
			bt5.setOnClickListener(this);
			bt6 = (ImageButton) findViewById(R.id.cm_10);
			bt6.setOnClickListener(this);
			bt7 = (ImageButton) findViewById(R.id.cmlianB_12_7);
			bt7.setOnClickListener(this);
			bt8 = (ImageButton) findViewById(R.id.mm_120);
			bt8.setOnClickListener(this);
			bt9 = (ImageButton) findViewById(R.id.cmh_10);
			bt9.setOnClickListener(this);
			/*********************↓中口径主炮↓*********************/
			bt10 = (ImageButton) findViewById(R.id.cmdan_14);
			bt10.setOnClickListener(this);
			bt11 = (ImageButton) findViewById(R.id.cmlian_14);
			bt11.setOnClickListener(this);
			bt12 = (ImageButton) findViewById(R.id.cm_15_2);
			bt12.setOnClickListener(this);
			bt13 = (ImageButton) findViewById(R.id.cmkai_15_2);
			bt13.setOnClickListener(this);
			bt14 = (ImageButton) findViewById(R.id.cm_15_5);
			bt14.setOnClickListener(this);
			bt15 = (ImageButton) findViewById(R.id.cm_20_3);
			bt15.setOnClickListener(this);
			bt16 = (ImageButton) findViewById(R.id.cm20_3_2);
			bt16.setOnClickListener(this);
			bt17 = (ImageButton) findViewById(R.id.skc);
			bt17.setOnClickListener(this);
			bt18 = (ImageButton) findViewById(R.id.cm20_3_3);
			bt18.setOnClickListener(this);
			/*********************↓大口径主炮↓*********************/
			bt19 = (ImageButton) findViewById(R.id.cm_35_6);
			bt19.setOnClickListener(this);
			bt20 = (ImageButton) findViewById(R.id.cmdzr_35_6);
			bt20.setOnClickListener(this);
			bt21 = (ImageButton) findViewById(R.id.cm_38);
			bt21.setOnClickListener(this);
			bt22 = (ImageButton) findViewById(R.id.cmkai_38);
			bt22.setOnClickListener(this);
			bt23 = (ImageButton) findViewById(R.id.cm35_6_3);
			bt23.setOnClickListener(this);
			bt24 = (ImageButton) findViewById(R.id.mm_381);
			bt24.setOnClickListener(this);
			bt25 = (ImageButton) findViewById(R.id.cm_41);
			bt25.setOnClickListener(this);
			bt26 = (ImageButton) findViewById(R.id.mmkai_381);
			bt26.setOnClickListener(this);
			bt27 = (ImageButton) findViewById(R.id.cm41_3);
			bt27.setOnClickListener(this);
			bt28 = (ImageButton) findViewById(R.id.cm_46);
			bt28.setOnClickListener(this);
			bt29 = (ImageButton) findViewById(R.id.cm46_3);
			bt29.setOnClickListener(this);
			bt30 = (ImageButton) findViewById(R.id.cm_51);
			bt30.setOnClickListener(this);
			/*********************↓对舰强化弹↓*********************/
			bt31 = (ImageButton) findViewById(R.id.tp_91);
			bt31.setOnClickListener(this);
			bt32 = (ImageButton) findViewById(R.id.tp_1);
			bt32.setOnClickListener(this);
			break;
		case R.id.others:
			setContentView(R.layout.notknow);
			/*********************↓分类不详↓*********************/
			bt1 = (ImageButton) findViewById(R.id.tan);
			bt1.setOnClickListener(this);
			bt2 = (ImageButton) findViewById(R.id.btan);
			bt2.setOnClickListener(this);
			bt3 = (ImageButton) findViewById(R.id.zhao);
			bt3.setOnClickListener(this);
			bt4 = (ImageButton) findViewById(R.id.shu);
			bt4.setOnClickListener(this);
			bt5 = (ImageButton) findViewById(R.id.xiu);
			bt5.setOnClickListener(this);
			bt6 = (ImageButton) findViewById(R.id.hang);
			bt6.setOnClickListener(this);
			bt7 = (ImageButton) findViewById(R.id.si);
			bt7.setOnClickListener(this);
			bt8 = (ImageButton) findViewById(R.id.di);
			bt8.setOnClickListener(this);
			bt9 = (ImageButton) findViewById(R.id.jian);
			bt9.setOnClickListener(this);
			bt10 = (ImageButton) findViewById(R.id.food);
			bt10.setOnClickListener(this);
			bt11 = (ImageButton) findViewById(R.id.qiu);
			bt11.setOnClickListener(this);
			bt12 = (ImageButton) findViewById(R.id.yang);
			bt12.setOnClickListener(this);
			break;
		case R.id.tan:
			setContentView(R.layout.radar);
			/*********************↓小型电探↓*********************/
			bt1 = (ImageButton) findViewById(R.id.num13);
			bt1.setOnClickListener(this);
			bt2 = (ImageButton) findViewById(R.id.num13kai);
			bt2.setOnClickListener(this);
			bt3 = (ImageButton) findViewById(R.id.num22);
			bt3.setOnClickListener(this);
			bt4 = (ImageButton) findViewById(R.id.num22kai);
			bt4.setOnClickListener(this);
			bt5 = (ImageButton) findViewById(R.id.num33);
			bt5.setOnClickListener(this);
			/*********************↓大型电探↓*********************/
			bt6 = (ImageButton) findViewById(R.id.num21);
			bt6.setOnClickListener(this);
			bt7 = (ImageButton) findViewById(R.id.num14);
			bt7.setOnClickListener(this);
			bt8 = (ImageButton) findViewById(R.id.num21kai);
			bt8.setOnClickListener(this);
			bt9 = (ImageButton) findViewById(R.id.fumo25);
			bt9.setOnClickListener(this);
			bt10 = (ImageButton) findViewById(R.id.num32);
			bt10.setOnClickListener(this);
			bt11 = (ImageButton) findViewById(R.id.num32kai);
			bt11.setOnClickListener(this);
			bt12 = (ImageButton) findViewById(R.id.m_15);
			bt12.setOnClickListener(this);
			break;
		case R.id.xiu:
			setContentView(R.layout.repair);
			/*********************↓应急修理要员↓*********************/
			bt1 = (ImageButton) findViewById(R.id.member);
			bt1.setOnClickListener(this);
			bt2 = (ImageButton) findViewById(R.id.megami);
			bt2.setOnClickListener(this);
			break;
		case R.id.shao:
			setContentView(R.layout.sentry);
			/*********************↓大型飞行艇↓*********************/
			bt1 = (ImageButton) findViewById(R.id.fly);
			bt1.setOnClickListener(this);
			/*********************↓对潜哨戒机↓*********************/
			bt2 = (ImageButton) findViewById(R.id.toss);
			bt2.setOnClickListener(this);
			/*********************↓オートジャイロ↓*********************/
			bt3 = (ImageButton) findViewById(R.id.numka);
			bt3.setOnClickListener(this);
			break;
		case R.id.fu:
			setContentView(R.layout.sub);
			bt1 = (ImageButton) findViewById(R.id.cm_8);
			bt1.setOnClickListener(this);
			bt2 = (ImageButton) findViewById(R.id.cm_10);
			bt2.setOnClickListener(this);
			bt3 = (ImageButton) findViewById(R.id.mm_90);
			bt3.setOnClickListener(this);
			bt4 = (ImageButton) findViewById(R.id.cmhh_12_7);
			bt4.setOnClickListener(this);
			bt5 = (ImageButton) findViewById(R.id.cmdan_15_2);
			bt5.setOnClickListener(this);
			bt6 = (ImageButton) findViewById(R.id.cmlianh_12_7);
			bt6.setOnClickListener(this);
			bt7 = (ImageButton) findViewById(R.id.cm_15);
			bt7.setOnClickListener(this);
			bt8 = (ImageButton) findViewById(R.id.cm15_5_3);
			bt8.setOnClickListener(this);
			bt9 = (ImageButton) findViewById(R.id.OTO);
			bt9.setOnClickListener(this);
			break;
		case R.id.gong:
			setContentView(R.layout.torpedo);
			/*********************↓舰上攻击机↓*********************/
			bt1 = (ImageButton) findViewById(R.id.tp_97);
			bt1.setOnClickListener(this);
			bt2 = (ImageButton) findViewById(R.id.tp97_931);
			bt2.setOnClickListener(this);
			bt3 = (ImageButton) findViewById(R.id.tenzan);
			bt3.setOnClickListener(this);
			bt4 = (ImageButton) findViewById(R.id.tpprac_97);
			bt4.setOnClickListener(this);
			bt5 = (ImageButton) findViewById(R.id.tenzan931);
			bt5.setOnClickListener(this);
			bt6 = (ImageButton) findViewById(R.id.ryuusei);
			bt6.setOnClickListener(this);
			bt7 = (ImageButton) findViewById(R.id.tenzan601);
			bt7.setOnClickListener(this);
			bt8 = (ImageButton) findViewById(R.id.tpyou_97);
			bt8.setOnClickListener(this);
			bt9 = (ImageButton) findViewById(R.id.tpcun_97);
			bt9.setOnClickListener(this);
			bt10 = (ImageButton) findViewById(R.id.ryuuseikai);
			bt10.setOnClickListener(this);
			bt11 = (ImageButton) findViewById(R.id.ryuusei601);
			bt11.setOnClickListener(this);
			bt12 = (ImageButton) findViewById(R.id.tenzanyou);
			bt12.setOnClickListener(this);
			bt13 = (ImageButton) findViewById(R.id.tenzancun);
			bt13.setOnClickListener(this);
			break;
		case R.id.lei:
			setContentView(R.layout.tpd);
			/*********************↓鱼雷↓*********************/
			bt1 = (ImageButton) findViewById(R.id.cm61_3);
			bt1.setOnClickListener(this);
			bt2 = (ImageButton) findViewById(R.id.cm61_4);
			bt2.setOnClickListener(this);
			bt3 = (ImageButton) findViewById(R.id.cm61_3op);
			bt3.setOnClickListener(this);
			bt4 = (ImageButton) findViewById(R.id.cm61_4op);
			bt4.setOnClickListener(this);
			bt5 = (ImageButton) findViewById(R.id.cm61_5op);
			bt5.setOnClickListener(this);
			bt6 = (ImageButton) findViewById(R.id.cm_53);
			bt6.setOnClickListener(this);
			/*********************↓潜水艇鱼雷↓*********************/
			bt7 = (ImageButton) findViewById(R.id.FaT);
			bt7.setOnClickListener(this);
			bt8 = (ImageButton) findViewById(R.id.cm53_8);
			bt8.setOnClickListener(this);
			break;
		default:
			Toast.makeText(this, "未知错误", Toast.LENGTH_SHORT).show();
			break;
		}

		back = (ImageButton) findViewById(R.id.back);
		back.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				finish();
			}
		});
	}
	@Override
	public void onClick(View v) {
		Intent intent = new Intent(equiptype.this, equipdata.class);
		switch (v.getId()) {
		case R.id.cmdan_12:
			intent.putExtra("equipdata", R.id.cmdan_12);
			startActivity(intent);
			break;
		case R.id.cmlian_12_7:
			intent.putExtra("equipdata", R.id.cmlian_12_7);
			startActivity(intent);
			break;
		case R.id.cm_10:
			intent.putExtra("equipdata", R.id.cm_10);
			startActivity(intent);
			break;
		case R.id.cmdan_14:
			intent.putExtra("equipdata", R.id.cmdan_14);
			startActivity(intent);
			break;
		case R.id.cm_15_5:
			intent.putExtra("equipdata", R.id.cm_15_5);
			startActivity(intent);
			break;
		case R.id.cm_20_3:
			intent.putExtra("equipdata", R.id.cm_20_3);
			startActivity(intent);
			break;
		case R.id.cm_35_6:
			intent.putExtra("equipdata", R.id.cm_35_6);
			startActivity(intent);
			break;
		case R.id.cm_41:
			intent.putExtra("equipdata", R.id.cm_41);
			startActivity(intent);
			break;
		case R.id.cm_46:
			intent.putExtra("equipdata", R.id.cm_46);
			startActivity(intent);
			break;
		case R.id.cmdan_15_2:
			intent.putExtra("equipdata", R.id.cmdan_15_2);
			startActivity(intent);
			break;
		case R.id.cm15_5_3:
			intent.putExtra("equipdata", R.id.cm15_5_3);
			startActivity(intent);
			break;
		case R.id.cm61_3:
			intent.putExtra("equipdata", R.id.cm61_3);
			startActivity(intent);
			break;
		case R.id.cm61_4:
			intent.putExtra("equipdata", R.id.cm61_4);
			startActivity(intent);
			break;
		case R.id.cm61_4op:
			intent.putExtra("equipdata", R.id.cm61_4op);
			startActivity(intent);
			break;
		case R.id.tp_97:
			intent.putExtra("equipdata", R.id.tp_97);
			startActivity(intent);
			break;
		case R.id.tenzan:
			intent.putExtra("equipdata", R.id.tenzan);
			startActivity(intent);
			break;
		case R.id.ryuusei:
			intent.putExtra("equipdata", R.id.ryuusei);
			startActivity(intent);
			break;
		case R.id.tp_96:
			intent.putExtra("equipdata", R.id.tp_96);
			startActivity(intent);
			break;
		case R.id.Tp21:
			intent.putExtra("equipdata", R.id.Tp21);
			startActivity(intent);
			break;
		case R.id.Tp52:
			intent.putExtra("equipdata", R.id.Tp52);
			startActivity(intent);
			break;
		case R.id.reppu:
			intent.putExtra("equipdata", R.id.reppu);
			startActivity(intent);
			break;
		case R.id.tp_99:
			intent.putExtra("equipdata", R.id.tp_99);
			startActivity(intent);
			break;
		case R.id.suisei:
			intent.putExtra("equipdata", R.id.suisei);
			startActivity(intent);
			break;
		case R.id.zuiun:
			intent.putExtra("equipdata", R.id.zuiun);
			startActivity(intent);
			break;
		case R.id.num13:
			intent.putExtra("equipdata", R.id.num13);
			startActivity(intent);
			break;
		case R.id.num22:
			intent.putExtra("equipdata", R.id.num22);
			startActivity(intent);
			break;
		case R.id.num33:
			intent.putExtra("equipdata", R.id.num33);
			startActivity(intent);
			break;
		case R.id.num21:
			intent.putExtra("equipdata", R.id.num21);
			startActivity(intent);
			break;
		case R.id.num32:
			intent.putExtra("equipdata", R.id.num32);
			startActivity(intent);
			break;
		case R.id.num14:
			intent.putExtra("equipdata", R.id.num14);
			startActivity(intent);
			break;
		case R.id.gailiang:
			intent.putExtra("equipdata", R.id.gailiang);
			startActivity(intent);
			break;
		case R.id.qianhua:
			intent.putExtra("equipdata", R.id.qianhua);
			startActivity(intent);
			break;
		case R.id.tp_3:
			intent.putExtra("equipdata", R.id.tp_3);
			startActivity(intent);
			break;
		case R.id.tp_91:
			intent.putExtra("equipdata", R.id.tp_91);
			startActivity(intent);
			break;
		case R.id.mm_7_7:
			intent.putExtra("equipdata", R.id.mm_7_7);
			startActivity(intent);
			break;
		case R.id.mm_12_7:
			intent.putExtra("equipdata", R.id.mm_12_7);
			startActivity(intent);
			break;
		case R.id.mm_25:
			intent.putExtra("equipdata", R.id.mm_25);
			startActivity(intent);
			break;
		case R.id.mm25_3:
			intent.putExtra("equipdata", R.id.mm25_3);
			startActivity(intent);
			break;
		case R.id.nail:
			intent.putExtra("equipdata", R.id.nail);
			startActivity(intent);
			break;
		case R.id.tpbao_94:
			intent.putExtra("equipdata", R.id.tpbao_94);
			startActivity(intent);
			break;
		case R.id.tpbao_3:
			intent.putExtra("equipdata", R.id.tpbao_3);
			startActivity(intent);
			break;
		case R.id.tpshui_93:
			intent.putExtra("equipdata", R.id.tpshui_93);
			startActivity(intent);
			break;
		case R.id.tpshui_3:
			intent.putExtra("equipdata", R.id.tpshui_3);
			startActivity(intent);
			break;
		case R.id.cmh_12_7:
			intent.putExtra("equipdata", R.id.cmh_12_7);
			startActivity(intent);
			break;
		case R.id.cm20_3_3:
			intent.putExtra("equipdata", R.id.cm20_3_3);
			startActivity(intent);
			break;
		case R.id.cm12_30:
			intent.putExtra("equipdata", R.id.cm12_30);
			startActivity(intent);
			break;
		case R.id.ryuuseikai:
			intent.putExtra("equipdata", R.id.ryuuseikai);
			startActivity(intent);
			break;
		case R.id.reppukai:
			intent.putExtra("equipdata", R.id.reppukai);
			startActivity(intent);
			break;
		case R.id.saiun:
			intent.putExtra("equipdata", R.id.saiun);
			startActivity(intent);
			break;
		case R.id.shiden:
			intent.putExtra("equipdata", R.id.shiden);
			startActivity(intent);
			break;
		case R.id.zhendian:
			intent.putExtra("equipdata", R.id.zhendian);
			startActivity(intent);
			break;
		case R.id.suiseiTp12:
			intent.putExtra("equipdata", R.id.suiseiTp12);
			startActivity(intent);
			break;
		case R.id.cm61_5op:
			intent.putExtra("equipdata", R.id.cm61_5op);
			startActivity(intent);
			break;
		case R.id.tpguan_0:
			intent.putExtra("equipdata", R.id.tpguan_0);
			startActivity(intent);
			break;
		case R.id.Tp62:
			intent.putExtra("equipdata", R.id.Tp62);
			startActivity(intent);
			break;
		case R.id.tp_2:
			intent.putExtra("equipdata", R.id.tp_2);
			startActivity(intent);
			break;
		case R.id.seiran:
			intent.putExtra("equipdata", R.id.seiran);
			startActivity(intent);
			break;
		case R.id.cmlianB_12_7:
			intent.putExtra("equipdata", R.id.cmlianB_12_7);
			startActivity(intent);
			break;
		case R.id.ju87c:
			intent.putExtra("equipdata", R.id.ju87c);
			startActivity(intent);
			break;
		case R.id.cm_15_2:
			intent.putExtra("equipdata", R.id.cm_15_2);
			startActivity(intent);
			break;
		case R.id.cm_8:
			intent.putExtra("equipdata", R.id.cm_8);
			startActivity(intent);
			break;
		case R.id.cm_53:
			intent.putExtra("equipdata", R.id.cm_53);
			startActivity(intent);
			break;
		case R.id.big:
			intent.putExtra("equipdata", R.id.big);
			startActivity(intent);
			break;
		case R.id.numka:
			intent.putExtra("equipdata", R.id.numka);
			startActivity(intent);
			break;
		case R.id.toss:
			intent.putExtra("equipdata", R.id.toss);
			startActivity(intent);
			break;
		case R.id.t_cm_10:
			intent.putExtra("equipdata", R.id.t_cm_10);
			startActivity(intent);
			break;
		case R.id.barujim:
			intent.putExtra("equipdata", R.id.barujim);
			startActivity(intent);
			break;
		case R.id.barujib:
			intent.putExtra("equipdata", R.id.barujib);
			startActivity(intent);
			break;
		case R.id.tan:
			intent.putExtra("equipdata", R.id.tan);
			startActivity(intent);
			break;
		case R.id.shu:
			intent.putExtra("equipdata", R.id.shu);
			startActivity(intent);
			break;
		case R.id.cm_38:
			intent.putExtra("equipdata", R.id.cm_38);
			startActivity(intent);
			break;
		case R.id.cm_15:
			intent.putExtra("equipdata", R.id.cm_15);
			startActivity(intent);
			break;
		case R.id.cm_12_7:
			intent.putExtra("equipdata", R.id.cm_12_7);
			startActivity(intent);
			break;
		case R.id.zuiun634:
			intent.putExtra("equipdata", R.id.zuiun634);
			startActivity(intent);
			break;
		case R.id.zuiunTp12:
			intent.putExtra("equipdata", R.id.zuiunTp12);
			startActivity(intent);
			break;
		case R.id.zuiun634Tp12:
			intent.putExtra("equipdata", R.id.zuiun634Tp12);
			startActivity(intent);
			break;
		case R.id.tp97_931:
			intent.putExtra("equipdata", R.id.tp97_931);
			startActivity(intent);
			break;
		case R.id.tenzan931:
			intent.putExtra("equipdata", R.id.tenzan931);
			startActivity(intent);
			break;
		case R.id.flak38:
			intent.putExtra("equipdata", R.id.flak38);
			startActivity(intent);
			break;
		case R.id.flakm42:
			intent.putExtra("equipdata", R.id.flakm42);
			startActivity(intent);
			break;
		case R.id.xiu:
			intent.putExtra("equipdata", R.id.xiu);
			startActivity(intent);
			break;
		case R.id.xinxing:
			intent.putExtra("equipdata", R.id.xinxing);
			startActivity(intent);
			break;
		case R.id.num22kai:
			intent.putExtra("equipdata", R.id.num22kai);
			startActivity(intent);
			break;
		case R.id.num21kai:
			intent.putExtra("equipdata", R.id.num21kai);
			startActivity(intent);
			break;
		case R.id.cm20_3_2:
			intent.putExtra("equipdata", R.id.cm20_3_2);
			startActivity(intent);
			break;
		case R.id.t_cmlianh_12_7:
			intent.putExtra("equipdata", R.id.t_cmlianh_12_7);
			startActivity(intent);
			break;
		case R.id.mm_40:
			intent.putExtra("equipdata", R.id.mm_40);
			startActivity(intent);
			break;
		case R.id.tpyou_97:
			intent.putExtra("equipdata", R.id.tpyou_97);
			startActivity(intent);
			break;
		case R.id.tenzanyou:
			intent.putExtra("equipdata", R.id.tenzanyou);
			startActivity(intent);
			break;
		case R.id.cm53_8:
			intent.putExtra("equipdata", R.id.cm53_8);
			startActivity(intent);
			break;
		case R.id.Tp21prac:
			intent.putExtra("equipdata", R.id.Tp21prac);
			startActivity(intent);
			break;
		case R.id.tpprac_99:
			intent.putExtra("equipdata", R.id.tpprac_99);
			startActivity(intent);
			break;
		case R.id.tpprac_97:
			intent.putExtra("equipdata", R.id.tpprac_97);
			startActivity(intent);
			break;
		case R.id.tpjiang_99:
			intent.putExtra("equipdata", R.id.tpjiang_99);
			startActivity(intent);
			break;
		case R.id.suiseijiang:
			intent.putExtra("equipdata", R.id.suiseijiang);
			startActivity(intent);
			break;
		case R.id.zhao:
			intent.putExtra("equipdata", R.id.zhao);
			startActivity(intent);
			break;
		case R.id.tp_98:
			intent.putExtra("equipdata", R.id.tp_98);
			startActivity(intent);
			break;
		case R.id.cm35_6_3:
			intent.putExtra("equipdata", R.id.cm35_6_3);
			startActivity(intent);
			break;
		case R.id.cmdzr_35_6:
			intent.putExtra("equipdata", R.id.cmdzr_35_6);
			startActivity(intent);
			break;
		case R.id.cm41_3:
			intent.putExtra("equipdata", R.id.cm41_3);
			startActivity(intent);
			break;
		case R.id.num13kai:
			intent.putExtra("equipdata", R.id.num13kai);
			startActivity(intent);
			break;
		case R.id.si:
			intent.putExtra("equipdata", R.id.si);
			startActivity(intent);
			break;
		case R.id.hang:
			intent.putExtra("equipdata", R.id.hang);
			startActivity(intent);
			break;
		case R.id.Tp52601:
			intent.putExtra("equipdata", R.id.Tp52601);
			startActivity(intent);
			break;
		case R.id.reppu601:
			intent.putExtra("equipdata", R.id.reppu601);
			startActivity(intent);
			break;
		case R.id.suisei601:
			intent.putExtra("equipdata", R.id.suisei601);
			startActivity(intent);
			break;
		case R.id.tenzan601:
			intent.putExtra("equipdata", R.id.tenzan601);
			startActivity(intent);
			break;
		case R.id.ryuusei601:
			intent.putExtra("equipdata", R.id.ryuusei601);
			startActivity(intent);
			break;
		case R.id.cmkai_38:
			intent.putExtra("equipdata", R.id.cmkai_38);
			startActivity(intent);
			break;
		case R.id.ar196:
			intent.putExtra("equipdata", R.id.ar196);
			startActivity(intent);
			break;
		case R.id.tp_1:
			intent.putExtra("equipdata", R.id.tp_1);
			startActivity(intent);
			break;
		case R.id.cm46_3:
			intent.putExtra("equipdata", R.id.cm46_3);
			startActivity(intent);
			break;
		case R.id.shiun:
			intent.putExtra("equipdata", R.id.shiun);
			startActivity(intent);
			break;
		case R.id.cmlian_14:
			intent.putExtra("equipdata", R.id.cmlian_14);
			startActivity(intent);
			break;
		case R.id.tph_91:
			intent.putExtra("equipdata", R.id.tph_91);
			startActivity(intent);
			break;
		case R.id.tph_94:
			intent.putExtra("equipdata", R.id.tph_94);
			startActivity(intent);
			break;
		case R.id.cmh_10:
			intent.putExtra("equipdata", R.id.cmh_10);
			startActivity(intent);
			break;
		case R.id.skc:
			intent.putExtra("equipdata", R.id.skc);
			startActivity(intent);
			break;
		case R.id.fumo25:
			intent.putExtra("equipdata", R.id.fumo25);
			startActivity(intent);
			break;
		case R.id.cm61_3op:
			intent.putExtra("equipdata", R.id.cm61_3op);
			startActivity(intent);
			break;
		case R.id.di:
			intent.putExtra("equipdata", R.id.di);
			startActivity(intent);
			break;
		case R.id.FaT:
			intent.putExtra("equipdata", R.id.FaT);
			startActivity(intent);
			break;
		case R.id.cm_51:
			intent.putExtra("equipdata", R.id.cm_51);
			startActivity(intent);
			break;
		case R.id.jian:
			intent.putExtra("equipdata", R.id.jian);
			startActivity(intent);
			break;
		case R.id.cmlianh_12_7:
			intent.putExtra("equipdata", R.id.cmlianh_12_7);
			startActivity(intent);
			break;
		case R.id.mm25_3ji:
			intent.putExtra("equipdata", R.id.mm25_3ji);
			startActivity(intent);
			break;
		case R.id.tpshui_0:
			intent.putExtra("equipdata", R.id.tpshui_0);
			startActivity(intent);
			break;
		case R.id.mm_381:
			intent.putExtra("equipdata", R.id.mm_381);
			startActivity(intent);
			break;
		case R.id.OTO:
			intent.putExtra("equipdata", R.id.OTO);
			startActivity(intent);
			break;
		case R.id.mm_90:
			intent.putExtra("equipdata", R.id.mm_90);
			startActivity(intent);
			break;
		case R.id.purie:
			intent.putExtra("equipdata", R.id.purie);
			startActivity(intent);
			break;
		case R.id.mmkai_381:
			intent.putExtra("equipdata", R.id.mmkai_381);
			startActivity(intent);
			break;
		case R.id.fly:
			intent.putExtra("equipdata", R.id.fly);
			startActivity(intent);
			break;
		case R.id.cmkai_15_2:
			intent.putExtra("equipdata", R.id.cmkai_15_2);
			startActivity(intent);
			break;
		case R.id.btan:
			intent.putExtra("equipdata", R.id.btan);
			startActivity(intent);
			break;
		case R.id.num32kai:
			intent.putExtra("equipdata", R.id.num32kai);
			startActivity(intent);
			break;
		case R.id.m_15:
			intent.putExtra("equipdata", R.id.m_15);
			startActivity(intent);
			break;
		case R.id.tpcun_97:
			intent.putExtra("equipdata", R.id.tpcun_97);
			startActivity(intent);
			break;
		case R.id.tenzancun:
			intent.putExtra("equipdata", R.id.tenzancun);
			startActivity(intent);
			break;
		case R.id.food:
			intent.putExtra("equipdata", R.id.food);
			startActivity(intent);
			break;
		case R.id.yang:
			intent.putExtra("equipdata", R.id.yang);
			startActivity(intent);
			break;
		case R.id.mm_120:
			intent.putExtra("equipdata", R.id.mm_120);
			startActivity(intent);
			break;
		case R.id.nanzan:
			intent.putExtra("equipdata", R.id.nanzan);
			startActivity(intent);
			break;
		case R.id.tpshui_4:
			intent.putExtra("equipdata", R.id.tpshui_4);
			startActivity(intent);
			break;
		case R.id.qiu:
			intent.putExtra("equipdata", R.id.qiu);
			startActivity(intent);
			break;
		case R.id.keun:
			intent.putExtra("equipdata", R.id.keun);
			startActivity(intent);
			break;
		case R.id.Tp52prac:
			intent.putExtra("equipdata", R.id.Tp52prac);
			startActivity(intent);
			break;
		case R.id.Tp52fu:
			intent.putExtra("equipdata", R.id.Tp52fu);
			startActivity(intent);
			break;
		case R.id.Tp62yan:
			intent.putExtra("equipdata", R.id.Tp62yan);
			startActivity(intent);
			break;
		case R.id.Tp21fu:
			intent.putExtra("equipdata", R.id.Tp21fu);
			startActivity(intent);
			break;
		case R.id.Tp52jiafu:
			intent.putExtra("equipdata", R.id.t_Tp52jiafu);
			startActivity(intent);
			break;
		case R.id.Tp53:
			intent.putExtra("equipdata", R.id.Tp53);
			startActivity(intent);
			break;
		case R.id.member:
			intent.putExtra("equipdata", R.id.member);
			startActivity(intent);
			break;
		case R.id.megami:
			intent.putExtra("equipdata", R.id.megami);
			startActivity(intent);
			break;
			
			
		default:
			Toast.makeText(this, "No data here now.", Toast.LENGTH_SHORT).show();
			break;
		}
	}

}
