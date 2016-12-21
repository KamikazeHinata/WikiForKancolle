package com.android.wikiforkancolle;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.Toast;

public class assigndata extends Activity implements OnClickListener {

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
	private ImageButton bt33;
	private ImageButton bt34;
	private ImageButton bt35;
	private ImageButton bt36;
	private ImageButton bt37;
	private ImageButton bt38;
	private ImageButton bt39;
	private ImageButton bt40;
	private ImageButton bt41;
	private ImageButton bt42;
	private ImageButton bt43;
	private ImageButton bt44;
	private ImageButton bt45;
	private ImageButton bt46;
	private ImageButton bt47;
	private ImageButton bt48;
	private ImageButton bt49;
	private ImageButton bt50;
	private ImageButton bt51;
	private ImageButton bt52;
	private ImageButton bt53;
	private ImageButton bt54;
	private ImageButton bt55;
	private ImageButton bt56;
	private ImageButton bt57;
	private ImageButton bt58;
	private ImageButton bt59;
	private ImageButton bt60;
	private ImageButton bt61;
	private ImageButton bt62;
	private ImageButton bt63;
	private ImageButton bt64;
	private ImageButton bt65;
	private ImageButton bt66;
	private ImageButton bt67;
	private ImageButton bt68;
	private ImageButton bt69;
	private ImageButton bt70;
	private ImageButton bt71;
	private ImageButton bt72;
	private ImageButton bt73;
	private ImageButton bt74;
	private ImageButton bt75;
	private ImageButton bt76;
	private ImageButton bt77;
	private ImageButton bt78;
	private ImageButton bt79;

	// private ImageButton bt59;
	// private ImageButton bt60;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		// 获取跳转信息
		Intent intent_assgin = getIntent();
		switch (intent_assgin.getExtras().getInt("assgindata")) {

		case R.id.make:
			setContentView(R.layout.make);
			/***************************** ↓这里开始是一次性任务（编成）↓ *************************/
			bt1 = (ImageButton) findViewById(R.id.a1);
			bt1.setOnClickListener(this);
			bt2 = (ImageButton) findViewById(R.id.a2);
			bt2.setOnClickListener(this);
			bt3 = (ImageButton) findViewById(R.id.a3);
			bt3.setOnClickListener(this);
			bt4 = (ImageButton) findViewById(R.id.a4);
			bt4.setOnClickListener(this);
			bt5 = (ImageButton) findViewById(R.id.a5);
			bt5.setOnClickListener(this);
			bt6 = (ImageButton) findViewById(R.id.a6);
			bt6.setOnClickListener(this);
			bt7 = (ImageButton) findViewById(R.id.a7);
			bt7.setOnClickListener(this);
			bt8 = (ImageButton) findViewById(R.id.a8);
			bt8.setOnClickListener(this);
			bt9 = (ImageButton) findViewById(R.id.a9);
			bt9.setOnClickListener(this);
			bt10 = (ImageButton) findViewById(R.id.a10);
			bt10.setOnClickListener(this);
			bt11 = (ImageButton) findViewById(R.id.a11);
			bt11.setOnClickListener(this);
			bt12 = (ImageButton) findViewById(R.id.a12);
			bt12.setOnClickListener(this);
			bt13 = (ImageButton) findViewById(R.id.a13);
			bt13.setOnClickListener(this);
			bt14 = (ImageButton) findViewById(R.id.a14);
			bt14.setOnClickListener(this);
			bt15 = (ImageButton) findViewById(R.id.a15);
			bt15.setOnClickListener(this);
			bt16 = (ImageButton) findViewById(R.id.a16);
			bt16.setOnClickListener(this);
			bt17 = (ImageButton) findViewById(R.id.a17);
			bt17.setOnClickListener(this);
			bt18 = (ImageButton) findViewById(R.id.a18);
			bt18.setOnClickListener(this);
			bt19 = (ImageButton) findViewById(R.id.a19);
			bt19.setOnClickListener(this);
			bt20 = (ImageButton) findViewById(R.id.a20);
			bt20.setOnClickListener(this);
			bt21 = (ImageButton) findViewById(R.id.a21);
			bt21.setOnClickListener(this);
			bt22 = (ImageButton) findViewById(R.id.a22);
			bt22.setOnClickListener(this);
			bt23 = (ImageButton) findViewById(R.id.a23);
			bt23.setOnClickListener(this);
			bt24 = (ImageButton) findViewById(R.id.a24);
			bt24.setOnClickListener(this);
			bt25 = (ImageButton) findViewById(R.id.a25);
			bt25.setOnClickListener(this);
			bt26 = (ImageButton) findViewById(R.id.a26);
			bt26.setOnClickListener(this);
			bt27 = (ImageButton) findViewById(R.id.a27);
			bt27.setOnClickListener(this);
			bt28 = (ImageButton) findViewById(R.id.a28);
			bt28.setOnClickListener(this);
			bt29 = (ImageButton) findViewById(R.id.a29);
			bt29.setOnClickListener(this);
			bt30 = (ImageButton) findViewById(R.id.a30);
			bt30.setOnClickListener(this);
			bt31 = (ImageButton) findViewById(R.id.a31);
			bt31.setOnClickListener(this);
			bt32 = (ImageButton) findViewById(R.id.a32);
			bt32.setOnClickListener(this);
			bt33 = (ImageButton) findViewById(R.id.a33);
			bt33.setOnClickListener(this);
			bt34 = (ImageButton) findViewById(R.id.a34);
			bt34.setOnClickListener(this);
			bt35 = (ImageButton) findViewById(R.id.a35);
			bt35.setOnClickListener(this);
			bt36 = (ImageButton) findViewById(R.id.a36);
			bt36.setOnClickListener(this);
			bt37 = (ImageButton) findViewById(R.id.a37);
			bt37.setOnClickListener(this);
			bt38 = (ImageButton) findViewById(R.id.a38);
			bt38.setOnClickListener(this);
			bt39 = (ImageButton) findViewById(R.id.a39);
			bt39.setOnClickListener(this);
			bt40 = (ImageButton) findViewById(R.id.a40);
			bt40.setOnClickListener(this);
			bt41 = (ImageButton) findViewById(R.id.a41);
			bt41.setOnClickListener(this);
			bt42 = (ImageButton) findViewById(R.id.a42);
			bt42.setOnClickListener(this);
			bt43 = (ImageButton) findViewById(R.id.a43);
			bt43.setOnClickListener(this);
			bt44 = (ImageButton) findViewById(R.id.a44);
			bt44.setOnClickListener(this);
			bt45 = (ImageButton) findViewById(R.id.a45);
			bt45.setOnClickListener(this);
			bt46 = (ImageButton) findViewById(R.id.a46);
			bt46.setOnClickListener(this);
			bt47 = (ImageButton) findViewById(R.id.a47);
			bt47.setOnClickListener(this);
			bt48 = (ImageButton) findViewById(R.id.a48);
			bt48.setOnClickListener(this);
			bt49 = (ImageButton) findViewById(R.id.a49);
			bt49.setOnClickListener(this);
			bt50 = (ImageButton) findViewById(R.id.a50);
			bt50.setOnClickListener(this);
			bt51 = (ImageButton) findViewById(R.id.a51);
			bt51.setOnClickListener(this);
			bt52 = (ImageButton) findViewById(R.id.a52);
			bt52.setOnClickListener(this);
			bt53 = (ImageButton) findViewById(R.id.a53);
			bt53.setOnClickListener(this);
			bt54 = (ImageButton) findViewById(R.id.a54);
			bt54.setOnClickListener(this);
			bt55 = (ImageButton) findViewById(R.id.a55);
			bt55.setOnClickListener(this);
			bt56 = (ImageButton) findViewById(R.id.a56);
			bt56.setOnClickListener(this);
			bt57 = (ImageButton) findViewById(R.id.a57);
			bt57.setOnClickListener(this);
			bt58 = (ImageButton) findViewById(R.id.a58);
			bt58.setOnClickListener(this);
			bt59 = (ImageButton) findViewById(R.id.a59);
			bt59.setOnClickListener(this);
			break;
		case R.id.go:
			setContentView(R.layout.go);
			/***************************** ↓这里开始是一次性任务（出击）↓ *************************/
			bt1 = (ImageButton) findViewById(R.id.b1);
			bt1.setOnClickListener(this);
			bt2 = (ImageButton) findViewById(R.id.b2);
			bt2.setOnClickListener(this);
			bt3 = (ImageButton) findViewById(R.id.b3);
			bt3.setOnClickListener(this);
			bt4 = (ImageButton) findViewById(R.id.b4);
			bt4.setOnClickListener(this);
			bt5 = (ImageButton) findViewById(R.id.b5);
			bt5.setOnClickListener(this);
			bt6 = (ImageButton) findViewById(R.id.b6);
			bt6.setOnClickListener(this);
			bt7 = (ImageButton) findViewById(R.id.b7);
			bt7.setOnClickListener(this);
			bt8 = (ImageButton) findViewById(R.id.b8);
			bt8.setOnClickListener(this);
			bt9 = (ImageButton) findViewById(R.id.b9);
			bt9.setOnClickListener(this);
			bt10 = (ImageButton) findViewById(R.id.b10);
			bt10.setOnClickListener(this);
			bt11 = (ImageButton) findViewById(R.id.b11);
			bt11.setOnClickListener(this);
			bt12 = (ImageButton) findViewById(R.id.b12);
			bt12.setOnClickListener(this);
			bt13 = (ImageButton) findViewById(R.id.b13);
			bt13.setOnClickListener(this);
			bt14 = (ImageButton) findViewById(R.id.b14);
			bt14.setOnClickListener(this);
			bt15 = (ImageButton) findViewById(R.id.b15);
			bt15.setOnClickListener(this);
			bt16 = (ImageButton) findViewById(R.id.b16);
			bt16.setOnClickListener(this);
			bt17 = (ImageButton) findViewById(R.id.b17);
			bt17.setOnClickListener(this);
			bt18 = (ImageButton) findViewById(R.id.b18);
			bt18.setOnClickListener(this);
			bt19 = (ImageButton) findViewById(R.id.b19);
			bt19.setOnClickListener(this);
			bt20 = (ImageButton) findViewById(R.id.b20);
			bt20.setOnClickListener(this);
			bt21 = (ImageButton) findViewById(R.id.b21);
			bt21.setOnClickListener(this);
			bt22 = (ImageButton) findViewById(R.id.b22);
			bt22.setOnClickListener(this);
			bt23 = (ImageButton) findViewById(R.id.b23);
			bt23.setOnClickListener(this);
			bt24 = (ImageButton) findViewById(R.id.b24);
			bt24.setOnClickListener(this);
			bt25 = (ImageButton) findViewById(R.id.b25);
			bt25.setOnClickListener(this);
			bt26 = (ImageButton) findViewById(R.id.b26);
			bt26.setOnClickListener(this);
			bt27 = (ImageButton) findViewById(R.id.b27);
			bt27.setOnClickListener(this);
			bt28 = (ImageButton) findViewById(R.id.b28);
			bt28.setOnClickListener(this);
			bt29 = (ImageButton) findViewById(R.id.b29);
			bt29.setOnClickListener(this);
			bt30 = (ImageButton) findViewById(R.id.b30);
			bt30.setOnClickListener(this);
			bt31 = (ImageButton) findViewById(R.id.b31);
			bt31.setOnClickListener(this);
			bt32 = (ImageButton) findViewById(R.id.b32);
			bt32.setOnClickListener(this);
			bt33 = (ImageButton) findViewById(R.id.b33);
			bt33.setOnClickListener(this);
			bt34 = (ImageButton) findViewById(R.id.b34);
			bt34.setOnClickListener(this);
			bt35 = (ImageButton) findViewById(R.id.b35);
			bt35.setOnClickListener(this);
			bt36 = (ImageButton) findViewById(R.id.b36);
			bt36.setOnClickListener(this);
			bt37 = (ImageButton) findViewById(R.id.b37);
			bt37.setOnClickListener(this);
			bt38 = (ImageButton) findViewById(R.id.b38);
			bt38.setOnClickListener(this);
			bt39 = (ImageButton) findViewById(R.id.b39);
			bt39.setOnClickListener(this);
			bt40 = (ImageButton) findViewById(R.id.b40);
			bt40.setOnClickListener(this);
			bt41 = (ImageButton) findViewById(R.id.b41);
			bt41.setOnClickListener(this);
			bt42 = (ImageButton) findViewById(R.id.b42);
			bt42.setOnClickListener(this);
			bt43 = (ImageButton) findViewById(R.id.b43);
			bt43.setOnClickListener(this);
			bt44 = (ImageButton) findViewById(R.id.b44);
			bt44.setOnClickListener(this);
			bt45 = (ImageButton) findViewById(R.id.b45);
			bt45.setOnClickListener(this);
			bt46 = (ImageButton) findViewById(R.id.b46);
			bt46.setOnClickListener(this);
			bt47 = (ImageButton) findViewById(R.id.b47);
			bt47.setOnClickListener(this);
			bt48 = (ImageButton) findViewById(R.id.b48);
			bt48.setOnClickListener(this);
			bt49 = (ImageButton) findViewById(R.id.b49);
			bt49.setOnClickListener(this);
			bt50 = (ImageButton) findViewById(R.id.b50);
			bt50.setOnClickListener(this);
			bt51 = (ImageButton) findViewById(R.id.b51);
			bt51.setOnClickListener(this);
			bt52 = (ImageButton) findViewById(R.id.b52);
			bt52.setOnClickListener(this);
			bt53 = (ImageButton) findViewById(R.id.b53);
			bt53.setOnClickListener(this);
			/***************************** ↓这里开始是日常任务（出击）↓ *************************/
			bt54 = (ImageButton) findViewById(R.id.bd1);
			bt54.setOnClickListener(this);
			bt55 = (ImageButton) findViewById(R.id.bd2);
			bt55.setOnClickListener(this);
			bt56 = (ImageButton) findViewById(R.id.bd3);
			bt56.setOnClickListener(this);
			bt57 = (ImageButton) findViewById(R.id.bd4);
			bt57.setOnClickListener(this);
			bt58 = (ImageButton) findViewById(R.id.bd5);
			bt58.setOnClickListener(this);
			bt59 = (ImageButton) findViewById(R.id.bd6);
			bt59.setOnClickListener(this);
			bt60 = (ImageButton) findViewById(R.id.bd7);
			bt60.setOnClickListener(this);
			bt61 = (ImageButton) findViewById(R.id.bd8);
			bt61.setOnClickListener(this);
			/***************************** ↓这里开始是周常任务（出击）↓ *************************/
			bt62 = (ImageButton) findViewById(R.id.bw1);
			bt62.setOnClickListener(this);
			bt63 = (ImageButton) findViewById(R.id.bw2);
			bt63.setOnClickListener(this);
			bt64 = (ImageButton) findViewById(R.id.bw3);
			bt64.setOnClickListener(this);
			bt65 = (ImageButton) findViewById(R.id.bw4);
			bt65.setOnClickListener(this);
			bt66 = (ImageButton) findViewById(R.id.bw5);
			bt66.setOnClickListener(this);
			bt67 = (ImageButton) findViewById(R.id.bw6);
			bt67.setOnClickListener(this);
			bt68 = (ImageButton) findViewById(R.id.bw7);
			bt68.setOnClickListener(this);
			bt69 = (ImageButton) findViewById(R.id.bw8);
			bt69.setOnClickListener(this);
			bt70 = (ImageButton) findViewById(R.id.bw9);
			bt70.setOnClickListener(this);
			bt71 = (ImageButton) findViewById(R.id.bw10);
			bt71.setOnClickListener(this);
			/***************************** ↓这里开始是月常任务（出击）↓ *************************/
			bt72 = (ImageButton) findViewById(R.id.bm1);
			bt72.setOnClickListener(this);
			bt73 = (ImageButton) findViewById(R.id.bm2);
			bt73.setOnClickListener(this);
			bt74 = (ImageButton) findViewById(R.id.bm3);
			bt74.setOnClickListener(this);
			bt75 = (ImageButton) findViewById(R.id.bm4);
			bt75.setOnClickListener(this);
			bt76 = (ImageButton) findViewById(R.id.bm5);
			bt76.setOnClickListener(this);
			bt77 = (ImageButton) findViewById(R.id.bm6);
			bt77.setOnClickListener(this);
			bt78 = (ImageButton) findViewById(R.id.bm7);
			bt78.setOnClickListener(this);
			break;
		case R.id.exer:
			setContentView(R.layout.manoeuvre);
			/***************************** ↓这里开始是一次性任务（演习）↓ *************************/
			bt1 = (ImageButton) findViewById(R.id.c1);
			bt1.setOnClickListener(this);
			bt5 = (ImageButton) findViewById(R.id.c5);
			bt5.setOnClickListener(this);
			bt6 = (ImageButton) findViewById(R.id.c6);
			bt6.setOnClickListener(this);
			bt7 = (ImageButton) findViewById(R.id.c7);
			bt7.setOnClickListener(this);
			/***************************** ↓这里开始是日常任务（演习）↓ *************************/
			bt2 = (ImageButton) findViewById(R.id.c2);
			bt2.setOnClickListener(this);
			bt3 = (ImageButton) findViewById(R.id.c3);
			bt3.setOnClickListener(this);
			/***************************** ↓这里开始是周常任务（演习）↓ *************************/
			bt4 = (ImageButton) findViewById(R.id.c4);
			bt4.setOnClickListener(this);
			/***************************** ↓这里开始是月常任务（演习）↓ *************************/
			bt8 = (ImageButton) findViewById(R.id.c8);
			bt8.setOnClickListener(this);
			break;
		case R.id.expe:
			setContentView(R.layout.resource);
			/***************************** ↓这里开始是一次性任务（远征）↓ *************************/
			bt1 = (ImageButton) findViewById(R.id.d1);
			bt1.setOnClickListener(this);
			bt5 = (ImageButton) findViewById(R.id.d5);
			bt5.setOnClickListener(this);
			bt6 = (ImageButton) findViewById(R.id.d6);
			bt6.setOnClickListener(this);
			bt7 = (ImageButton) findViewById(R.id.d7);
			bt7.setOnClickListener(this);
			bt8 = (ImageButton) findViewById(R.id.d8);
			bt8.setOnClickListener(this);
			bt10 = (ImageButton) findViewById(R.id.d10);
			bt10.setOnClickListener(this);
			bt12 = (ImageButton) findViewById(R.id.d12);
			bt12.setOnClickListener(this);
			bt13 = (ImageButton) findViewById(R.id.d13);
			bt13.setOnClickListener(this);
			bt14 = (ImageButton) findViewById(R.id.d14);
			bt14.setOnClickListener(this);
			bt15 = (ImageButton) findViewById(R.id.d15);
			bt15.setOnClickListener(this);
			bt16 = (ImageButton) findViewById(R.id.d16);
			bt16.setOnClickListener(this);
			bt17 = (ImageButton) findViewById(R.id.d17);
			bt17.setOnClickListener(this);
			bt18 = (ImageButton) findViewById(R.id.d18);
			bt18.setOnClickListener(this);
			bt19 = (ImageButton) findViewById(R.id.d19);
			bt19.setOnClickListener(this);
			/***************************** ↓这里开始是日常任务（远征）↓ *************************/
			bt2 = (ImageButton) findViewById(R.id.d2);
			bt2.setOnClickListener(this);
			bt3 = (ImageButton) findViewById(R.id.d3);
			bt3.setOnClickListener(this);
			/***************************** ↓这里开始是周常任务（远征）↓ *************************/
			bt4 = (ImageButton) findViewById(R.id.d4);
			bt4.setOnClickListener(this);
			bt9 = (ImageButton) findViewById(R.id.d9);
			bt9.setOnClickListener(this);
			bt11 = (ImageButton) findViewById(R.id.d11);
			bt11.setOnClickListener(this);
			break;
		case R.id.sup:
			setContentView(R.layout.supply);
			/***************************** ↓这里开始是一次性任务（补给）↓ *************************/
			bt1 = (ImageButton) findViewById(R.id.e1);
			bt1.setOnClickListener(this);
			bt2 = (ImageButton) findViewById(R.id.e2);
			bt2.setOnClickListener(this);
			/***************************** ↓这里开始是日常任务（补给）↓ *************************/
			bt3 = (ImageButton) findViewById(R.id.e3);
			bt3.setOnClickListener(this);
			bt4 = (ImageButton) findViewById(R.id.e4);
			bt4.setOnClickListener(this);
			break;
		case R.id.fcry:
			setContentView(R.layout.factory);
			/***************************** ↓这里开始是一次性任务（工厂）↓ *************************/
			bt1 = (ImageButton) findViewById(R.id.f1);
			bt1.setOnClickListener(this);
			bt2 = (ImageButton) findViewById(R.id.f2);
			bt2.setOnClickListener(this);
			bt3 = (ImageButton) findViewById(R.id.f3);
			bt3.setOnClickListener(this);
			bt4 = (ImageButton) findViewById(R.id.f4);
			bt4.setOnClickListener(this);
			bt10 = (ImageButton) findViewById(R.id.f10);
			bt10.setOnClickListener(this);
			bt11 = (ImageButton) findViewById(R.id.f11);
			bt11.setOnClickListener(this);
			bt13 = (ImageButton) findViewById(R.id.f13);
			bt13.setOnClickListener(this);
			bt14 = (ImageButton) findViewById(R.id.f14);
			bt14.setOnClickListener(this);
			bt15 = (ImageButton) findViewById(R.id.f15);
			bt15.setOnClickListener(this);
			bt16 = (ImageButton) findViewById(R.id.f16);
			bt16.setOnClickListener(this);
			bt17 = (ImageButton) findViewById(R.id.f17);
			bt17.setOnClickListener(this);
			bt19 = (ImageButton) findViewById(R.id.f19);
			bt19.setOnClickListener(this);
			bt20 = (ImageButton) findViewById(R.id.f20);
			bt20.setOnClickListener(this);
			bt21 = (ImageButton) findViewById(R.id.f21);
			bt21.setOnClickListener(this);
			/***************************** ↓这里开始是日常任务（工厂）↓ *************************/
			bt5 = (ImageButton) findViewById(R.id.f5);
			bt5.setOnClickListener(this);
			bt6 = (ImageButton) findViewById(R.id.f6);
			bt6.setOnClickListener(this);
			bt7 = (ImageButton) findViewById(R.id.f7);
			bt7.setOnClickListener(this);
			bt8 = (ImageButton) findViewById(R.id.f8);
			bt8.setOnClickListener(this);
			bt9 = (ImageButton) findViewById(R.id.f9);
			bt9.setOnClickListener(this);
			bt18 = (ImageButton) findViewById(R.id.f18);
			bt18.setOnClickListener(this);
			/***************************** ↓这里开始是周常任务（工厂）↓ *************************/
			bt12 = (ImageButton) findViewById(R.id.f12);
			bt12.setOnClickListener(this);
			break;
		case R.id.chge:
			setContentView(R.layout.change);
			/***************************** ↓这里开始是一次性任务（改装）↓ *************************/
			bt1 = (ImageButton) findViewById(R.id.g1);
			bt1.setOnClickListener(this);
			bt4 = (ImageButton) findViewById(R.id.g4);
			bt4.setOnClickListener(this);
			/***************************** ↓这里开始是日常任务（改装）↓ *************************/
			bt2 = (ImageButton) findViewById(R.id.g2);
			bt2.setOnClickListener(this);
			/***************************** ↓这里开始是周常任务（改装）↓ *************************/
			bt3 = (ImageButton) findViewById(R.id.g3);
			bt3.setOnClickListener(this);
			break;
		case R.id.wedd:
			setContentView(R.layout.wedding);
			bt1 = (ImageButton) findViewById(R.id.wf01);
			bt1.setOnClickListener(this);
			bt2 = (ImageButton) findViewById(R.id.wc01);
			bt2.setOnClickListener(this);
			bt3 = (ImageButton) findViewById(R.id.wa01);
			bt3.setOnClickListener(this);
			bt4 = (ImageButton) findViewById(R.id.wb01);
			bt4.setOnClickListener(this);
			bt5 = (ImageButton) findViewById(R.id.wa02);
			bt5.setOnClickListener(this);
			bt6 = (ImageButton) findViewById(R.id.wb02);
			bt6.setOnClickListener(this);
			break;
		default:
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
		AlertDialog.Builder builder = new AlertDialog.Builder(this);
		switch (v.getId()) {
		/***************************** ↓这里开始是编成的信息↓ *************************/
		case R.id.a1:
			builder.setTitle("A1.はじめての「编成」！")
					// 设置标题
					.setMessage(
							"内容：两艘以上的舰队编成\n报酬：\n油：20\n弹：20\n钢：0\n铝：0\n其他：驱逐舰白雪")// 设置文本
					.setPositiveButton("确定", null)// 确定按钮
					.show();// 显示
			break;
		case R.id.a2:
			builder.setTitle("A2.「駆逐队」を编成せよ！")
					// 设置标题
					.setMessage(
							"内容：驱逐舰4艘以上编成\n报酬：\n油：30\n弹：30\n钢：30\n铝：0\n其他：高速建造材x1")// 设置文本
					.setPositiveButton("确定", null)// 确定按钮
					.show();// 显示
			break;
		case R.id.a3:
			builder.setTitle("A3.「水雷戦队」を编成せよ！")
					// 设置标题
					.setMessage(
							"内容：轻巡洋舰旗舰、用数艘驱逐舰编成「水雷战队」\n报酬：\n油：40\n弹：40\n钢：0\n铝：40\n其他：开発资材x1")// 设置文本
					.setPositiveButton("确定", null)// 确定按钮
					.show();// 显示
			break;
		case R.id.a4:
			builder.setTitle("A4.6只编成の舰队を编成せよ！")
					// 设置标题
					.setMessage(
							"内容：编成6艘舰娘构成的主力舰队\n报酬：\n油：50\n弹：0\n钢：50\n铝：0\n其他：开放第二舰队\n前置：「水雷戦队」を编成せよ！(A3)")// 设置文本
					.setPositiveButton("确定", null)// 确定按钮
					.show();// 显示
			break;
		case R.id.a5:
			builder.setTitle("A5.軽巡2只を拥する队を编成せよ！")
					// 设置标题
					.setMessage(
							"内容：编编成拥有2艘轻巡洋舰的高速舰队\n报酬：\n油：60\n弹：60\n钢：0\n铝：0\n其他：开発资材x1")// 设置文本
					.setPositiveButton("确定", null)// 确定按钮
					.show();// 显示
			break;
		case R.id.a6:
			builder.setTitle("A6.第2舰队を编成せよ！")
					// 设置标题
					.setMessage(
							"内容：第二舰队、指定第2舰队的旗舰、编成第2舰队！\n报酬：\n油：50\n弹：50\n钢：100\n铝：0\n其他：高速建造材x1")// 设置文本
					.setPositiveButton("确定", null)// 确定按钮
					.show();// 显示
			break;
		case R.id.a7:
			builder.setTitle("A7.「重巡戦队」を编成せよ！")
					// 设置标题
					.setMessage(
							"内容：编成拥有重巡洋舰2艘的重巡舰队！\n报酬：\n油：0\n弹：70\n钢：0\n铝：30\n其他：高速修复材x1\n前置：軽巡2只を拥する队を编成せよ！(A5)")// 设置文本
					.setPositiveButton("确定", null)// 确定按钮
					.show();// 显示
			break;
		case R.id.a8:
			builder.setTitle("A8.「天龙」型軽巡姊妹の全2舰を编成せよ！")
					// 设置标题
					.setMessage(
							"内容：将天龙型轻巡洋舰「天龙」「龙田」配属在同一舰队！\n报酬：\n油：100\n弹：100\n钢：100\n铝：50\n其他：高速修复材x2\n前置：軽巡2只を拥する队を编成せよ！(A5)")// 设置文本
					.setPositiveButton("确定", null)// 确定按钮
					.show();// 显示
			break;
		case R.id.a9:
			builder.setTitle("A9.「水上机母舰」を配备せよ！")
					// 设置标题
					.setMessage(
							"内容：将使用多个的水上侦察机的「水上机母舰」配属在同一舰队！\n报酬：\n油：0\n弹：0\n钢：0\n铝：200\n其他：开発资材x1")// 设置文本
					.setPositiveButton("确定", null)// 确定按钮
					.show();// 显示
			break;
		case R.id.a10:
			builder.setTitle("A10.「第六駆逐队」を编成せよ！")
					// 设置标题
					.setMessage(
							"内容：编成由「暁」「响」「雷」「电」4艘舰娘组成的第六驱逐队！\n报酬：\n油：150\n弹：150\n钢：0\n铝：0\n其他：応急修理要员x1\n备注：舰队内有且只有这4艘方可达成（响改二Верный也可以达成任务）\n前置：水上机母舰」を配备せよ！(A9)")// 设置文本
					.setPositiveButton("确定", null)// 确定按钮
					.show();// 显示
			break;
		case R.id.a11:
			builder.setTitle("A11.第2舰队で空母机动部队を编成せよ！")
					// 设置标题
					.setMessage(
							"内容：在第2舰队配备空母、编成空母机动部队！\n报酬：\n油：100\n弹：0\n钢：0\n铝：100\n其他：高速建造材x2\n备注：第二舰队内轻空母/空母/装母＋驱逐舰3艘达成")// 设置文本
					.setPositiveButton("确定", null)// 确定按钮
					.show();// 显示
			break;
		case R.id.a12:
			builder.setTitle("A12.空母机动部队を编成せよ！")
					// 设置标题
					.setMessage(
							"内容：旗舰空母1艘以上加上护卫舰队、编成空母机动部队！\n报酬：\n油：50\n弹：0\n钢：0\n铝：100\n其他：开発资材x1\n备注：旗舰轻空母/空母/装母＋3艘驱逐舰达成")// 设置文本
					.setPositiveButton("确定", null)// 确定按钮
					.show();// 显示
			break;
		case R.id.a13:
			builder.setTitle("A13.戦舰と重巡による主力舰队を编成せよ！")
					// 设置标题
					.setMessage(
							"内容：编成以战列舰1艘以上、重巡2艘以上的水上打击部队！\n报酬：\n油：0\n弹：150\n钢：0\n铝：0\n其他：高速建造材x2\n备注：航空战列舰（伊势改 等）不可\n前置：空母机动部队を编成せよ！(A12)")// 设置文本
					.setPositiveButton("确定", null)// 确定按钮
					.show();// 显示
			break;
		case R.id.a14:
			builder.setTitle("A14.「川内」型軽巡姊妹の全3舰を编成せよ！")
					// 设置标题
					.setMessage(
							"内容：将川内型轻巡洋舰、「川内」「神通」「那珂」编成在同一舰队！\n报酬：\n油：100\n弹：0\n钢：100\n铝：0\n其他：开放第3舰队\n前置：「重巡戦队」を编成せよ！(A7)")// 设置文本
					.setPositiveButton("确定", null)// 确定按钮
					.show();// 显示
			break;
		case R.id.a15:
			builder.setTitle("A15.「妙高」型重巡姊妹の全4只を编成せよ！")
					// 设置标题
					.setMessage(
							"内容：配属妙高型重巡洋舰「妙高」「那智」「足柄」「羽黒」于同一舰队！\n报酬：\n油：150\n弹：100\n钢：150\n铝：100\n其他：高速修复材x1，开発资材x1\n前置：「川内」型軽巡姊妹の全3舰を编成せよ！(A14)")// 设置文本
					.setPositiveButton("确定", null)// 确定按钮
					.show();// 显示
			break;
		case R.id.a16:
			builder.setTitle("A16.「金刚」型による高速戦舰部队を编成せよ！")
					// 设置标题
					.setMessage(
							"内容：集中配备金刚型战列舰「金刚」「比叡」「榛名」「雾岛」全4艘的高速战列舰！\n报酬：\n油：0\n弹：0\n钢：0\n铝：0\n其他：开放第4舰队\n前置：「妙高」型重巡姊妹の全4只を编成せよ！(A15)")// 设置文本
					.setPositiveButton("确定", null)// 确定按钮
					.show();// 显示
			break;
		case R.id.a17:
			builder.setTitle("A17.「扶桑」型戦舰姊妹の全2只を编成せよ！")
					// 设置标题
					.setMessage(
							"内容：配属扶桑型战列舰「扶桑」「山城」于同一舰队！\n报酬：\n油：200\n弹：200\n钢：200\n铝：200\n其他：高速修复材x2，开発资材x1\n前置：「天龙」型軽巡姊妹の全2舰を编成せよ！(A8)")// 设置文本
					.setPositiveButton("确定", null)// 确定按钮
					.show();// 显示
			break;
		case R.id.a18:
			builder.setTitle("A18.「伊势」型戦舰姊妹の全2只を编成せよ！")
					// 设置标题
					.setMessage(
							"内容：配属伊势型战列舰「伊势」「日向」于同一舰队！\n报酬：\n油：300\n弹：200\n钢：300\n铝：200\n其他：高速修复材x2，开発资材x2\n前置：「扶桑」型戦舰姊妹の全2只を编成せよ！(A17)")// 设置文本
					.setPositiveButton("确定", null)// 确定按钮
					.show();// 显示
			break;
		case R.id.a19:
			builder.setTitle("A19.南云机动部队を编成せよ！")
					// 设置标题
					.setMessage(
							"内容：用一航战「赤城」「加贺」二航战「飞龙」「苍龙」编成第一机动部队！\n报酬：\n油：500\n弹：500\n钢：500\n铝：500\n其他：高速修复材x2，开発资材x4\n备注：只能用这4艘达成\n前置：戦舰と重巡による主力舰队を编成せよ！(A13)")// 设置文本
					.setPositiveButton("确定", null)// 确定按钮
					.show();// 显示
			break;
		case R.id.a20:
			builder.setTitle("A20.「三川舰队」を编成せよ！")
					// 设置标题
					.setMessage(
							"内容：编成包含「鸟海」「青叶」「加古」「古鹰」「天龙」的高速舰队！\n报酬：\n油：400\n弹：0\n钢：200\n铝：0\n其他：高速修复材x3\n前置：戦舰と重巡による主力舰队を编成せよ！(A13)")// 设置文本
					.setPositiveButton("确定", null)// 确定按钮
					.show();// 显示
			break;
		case R.id.a21:
			builder.setTitle("A21.「第四戦队」を编成せよ！")
					// 设置标题
					.setMessage(
							"内容：编成由「爱宕」「高雄」「鸟海」「摩耶」作为基干的第四战队！\n报酬：\n油：300\n弹：150\n钢：0\n铝：0\n其他：高速修复材x2，开発资材x1\n前置：「三川舰队」を编成せよ！(A20)")// 设置文本
					.setPositiveButton("确定", null)// 确定按钮
					.show();// 显示
			break;
		case R.id.a22:
			builder.setTitle("A22.「西村舰队」を编成せよ！")
					// 设置标题
					.setMessage(
							"内容：编成由「扶桑」「山城」「最上」「时雨」作为基干的西村舰队！\n报酬：\n油：200\n弹：200\n钢：200\n铝：0\n其他：给粮舰「间宫」x1\n前置：「第四戦队」を编成せよ！(A21)")// 设置文本
					.setPositiveButton("确定", null)// 确定按钮
					.show();// 显示
			break;
		case R.id.a23:
			builder.setTitle("A23.「第五航空戦队」を编成せよ！")
					// 设置标题
					.setMessage(
							"内容：编成由「翔鹤」「瑞鹤」作为基干、加上2艘驱逐舰的第五航空战队！\n报酬：\n油：300\n弹：0\n钢：0\n铝：300\n其他：応急修理要员x1\n前置：「西村舰队」を编成せよ！(A22)")// 设置文本
					.setPositiveButton("确定", null)// 确定按钮
					.show();// 显示
			break;
		case R.id.a24:
			builder.setTitle("A24.新「三川舰队」を编成せよ！")
					// 设置标题
					.setMessage(
							"内容：编成由「鸟海」「青叶」「衣笠」「加古」「古鹰」「天龙」组成的三川舰队！\n报酬：\n油：300\n弹：0\n钢：300\n铝：0\n其他：给粮舰「间宫」x1\n前置：「第四戦队」を编成せよ！(A21)")// 设置文本
					.setPositiveButton("确定", null)// 确定按钮
					.show();// 显示
			break;
		case R.id.a25:
			builder.setTitle("A25.潜水舰队を编成せよ！")
					// 设置标题
					.setMessage(
							"内容：编成伊号潜水艇2艘！\n报酬：\n油：150\n弹：150\n钢：0\n铝：0\n其他：応急修理要员x1\n备注：潜水空母也可 ，まるゆ、U-511也可。吕500尚未确认\n前置：「第四戦队」を编成せよ！(A21)")// 设置文本
					.setPositiveButton("确定", null)// 确定按钮
					.show();// 显示
			break;
		case R.id.a26:
			builder.setTitle("A26.航空水上打撃舰队を编成せよ！")
					// 设置标题
					.setMessage(
							"内容：编成由航空战列舰2艘和航空巡洋舰2艘作为基干的舰队\n报酬：\n油：0\n弹：0\n钢：200\n铝：200\n其他：高速修复材x2\n前置：「西村舰队」を编成せよ！(A22)")// 设置文本
					.setPositiveButton("确定", null)// 确定按钮
					.show();// 显示
			break;
		case R.id.a27:
			builder.setTitle("A27.中规模潜水舰队を编成せよ！")
					// 设置标题
					.setMessage(
							"内容：编成伊号潜水舰3只以上组成的潜水舰队！\n报酬：\n油：150\n弹：150\n钢：0\n铝：0\n其他：给粮舰「间宫」x1\n备注：潜水空母也可 ，まるゆ、U-511也可。吕500尚未确认\n前置：「第四戦队」を编成せよ！(A21)")// 设置文本
					.setPositiveButton("确定", null)// 确定按钮
					.show();// 显示
			break;
		case R.id.a28:
			builder.setTitle("A28.「第六戦队」を编成せよ！")
					// 设置标题
					.setMessage(
							"内容：编成由「古鹰」「加古」「青叶」「衣笠」组成的第六舰队！\n报酬：\n油：250\n弹：300\n钢：0\n铝：0\n其他：给粮舰「间宫」x1\n前置：「第六駆逐队」を编成せよ！(A10)")// 设置文本
					.setPositiveButton("确定", null)// 确定按钮
					.show();// 显示
			break;
		case R.id.a29:
			builder.setTitle("A29.「第五舰队」を编成せよ！")
					// 设置标题
					.setMessage(
							"内容：编成由「那智」「足柄」「多摩」「木曾」为中心的第五舰队！\n报酬：\n油：200\n弹：0\n钢：300\n铝：0\n其他：高速修复材x3\n前置：「第四戦队」を编成せよ！(A21)")// 设置文本
					.setPositiveButton("确定", null)// 确定按钮
					.show();// 显示
			break;
		case R.id.a30:
			builder.setTitle("A30.「第一水雷戦队」を编成せよ！")
					// 设置标题
					.setMessage(
							"内容：编成由「阿武隈」「曙」「潮」「霞」「不知火」为中心的第1水雷战队！\n报酬：\n油：200\n弹：300\n钢：0\n铝：0\n其他：応急修理要员x1\n前置：「第5舰队」を编成せよ！(A29)")// 设置文本
					.setPositiveButton("确定", null)// 确定按钮
					.show();// 显示
			break;
		case R.id.a31:
			builder.setTitle("A31.「第八駆逐队」を编成せよ！")
					// 设置标题
					.setMessage(
							"内容：编成由「朝潮」「满潮」「大潮」「荒潮」4艘组成的第八驱逐队！\n报酬：\n油：150\n弹：150\n钢：0\n铝：0\n其他：开発资材x3\n备注：仅且只能配置这4艘才能达成\n前置：潜水舰队を编成せよ！(A25)")// 设置文本
					.setPositiveButton("确定", null)// 确定按钮
					.show();// 显示
			break;
		case R.id.a32:
			builder.setTitle("A32.「第十八駆逐队」を编成せよ！")
					// 设置标题
					.setMessage(
							"内容：编成由「霞」「霰」「阳炎」「不知火」4艘组成的第十八驱逐队！\n报酬：\n油：180\n弹：180\n钢：0\n铝：0\n其他：开発资材x1，応急修理要员x1\n备注：仅且只能配置这4艘才能达成\n前置：「第八駆逐队」出撃せよ！(B20)")// 设置文本
					.setPositiveButton("确定", null)// 确定按钮
					.show();// 显示
			break;
		case R.id.a33:
			builder.setTitle("A33.「第三十駆逐队(第一次)」を编成せよ！")
					// 设置标题
					.setMessage(
							"内容：编成由「睦月」「如月」「弥生」「望月」4艘组成的第三十驱逐队(第一次)！\n报酬：\n油：200\n弹：200\n钢：0\n铝：0\n其他：高速修复材x2，応急修理要员x1\n备注：仅且只能配置这4艘才能达成\n前置：「第八駆逐队」を编成せよ！(A31)")// 设置文本
					.setPositiveButton("确定", null)// 确定按钮
					.show();// 显示
			break;
		case R.id.a34:
			builder.setTitle("A34.「第三十駆逐队(第二次)」を编成せよ！")
					// 设置标题
					.setMessage(
							"内容：编成由「睦月」「如月」「弥生」「望月」4艘组成的第三十驱逐队(第二次)！\n报酬：\n油：220\n弹：220\n钢：0\n铝：0\n其他：开発资材x3\n备注：仅且只能配置这4艘才能达成\n前置：「第三十駆逐队(第一次)」を编成せよ！(A33)")// 设置文本
					.setPositiveButton("确定", null)// 确定按钮
					.show();// 显示
			break;
		case R.id.a35:
			builder.setTitle("A35.「第五戦队」を编成せよ！")
					// 设置标题
					.setMessage(
							"内容：编成由「妙高」「那智」「羽黒」为基干的第五战队！\n报酬：\n油：0\n弹：0\n钢：300\n铝：0\n其他：开発资材x5\n前置：「第三十駆逐队」対潜哨戒(B24)")// 设置文本
					.setPositiveButton("确定", null)// 确定按钮
					.show();// 显示
			break;
		case R.id.a36:
			builder.setTitle("A36.新编「第二航空戦队」を编成せよ！")
					// 设置标题
					.setMessage(
							"内容：编成「飞龙改二」(※旗舰)及「苍龙」为基干的二航战！\n报酬：\n油：0\n弹：0\n钢：0\n铝：400\n其他：高速修复材x2，开発资材x2\n备注：需要駆逐舰2艘，苍龙改二也可以达成)\n前置：「第六戦队」を编成せよ！(A28)")// 设置文本
					.setPositiveButton("确定", null)// 确定按钮
					.show();// 显示
			break;
		case R.id.a37:
			builder.setTitle("A37.潜水舰队「第六舰队」を编成せよ！")
					// 设置标题
					.setMessage(
							"内容：编成由「潜水母舰」(※旗舰)和复数的潜水艇(4艘以上)组成的潜水舰队「第六舰队」！\n报酬：\n油：250\n弹：250\n钢：0\n铝：0\n其他：开発资材x3\n备注：注意不是潜水空母而是潜水母舰（大鲸）！)\n前置：中规模潜水舰队を编成せよ！(A27)")// 设置文本
					.setPositiveButton("确定", null)// 确定按钮
					.show();// 显示
			break;
		case R.id.a38:
			builder.setTitle("A38.新型电探を配备せよ！")
					// 设置标题
					.setMessage(
							"内容：将「妙高改二」配备在第一舰队的旗舰上！\n报酬：\n油：300\n弹：0\n钢：0\n铝：300\n其他：小型电探22号対水上电探改四\n备注：注意不是潜水空母而是潜水母舰（大鲸）！)\n前置：「第五戦队」を编成せよ！(A35)")// 设置文本
					.setPositiveButton("确定", null)// 确定按钮
					.show();// 显示
			break;
		case R.id.a39:
			builder.setTitle("A39.再编成「第二航空戦队」を强化せよ！")
					// 设置标题
					.setMessage(
							"内容：编成由「苍龙改二」(※旗舰)及「飞龙改二」为基干的二航战\n报酬：\n油：0\n弹：0\n钢：0\n铝：450\n其他：高速修复材x2，开発资材x2\n备注：需要驱逐舰2艘\n前置：新编「第二航空戦队」出撃せよ！(B25)")// 设置文本
					.setPositiveButton("确定", null)// 确定按钮
					.show();// 显示
			break;
		case R.id.a40:
			builder.setTitle("A40.精锐「第三戦队」全舰集结せよ！")
					// 设置标题
					.setMessage(
							"内容：集结四艘二改后的金刚型高速战舰！\n报酬：\n油：0\n弹：100\n钢：0\n铝：0\n其他：大口径主炮试制35.6cm三连装炮\n前置：二人でする初めての任务！(WB02)")// 设置文本
					.setPositiveButton("确定", null)// 确定按钮
					.show();// 显示
			break;
		case R.id.a41:
			builder.setTitle("A41.「新型正规空母」を配备せよ！")
					// 设置标题
					.setMessage(
							"内容：将云龙型航空母舰一号舰「云龙」配备在第一舰队旗舰上！\n报酬：\n油：100\n弹：100\n钢：100\n铝：300\n其他：开発资材x2\n前置：「第五航空戦队」を编成せよ！(A23)")// 设置文本
					.setPositiveButton("确定", null)// 确定按钮
					.show();// 显示
			break;
		case R.id.a42:
			builder.setTitle("A42.主力戦舰部队「第二戦队」を编成せよ！")
					// 设置标题
					.setMessage(
							"内容：编成由长门型2艘及扶桑型2艘共4艘的主力战列舰组成的第二戦队！\n报酬：\n油：0\n弹：250\n钢：250\n铝：0\n其他：高速修复材x2\n前置：「第十八駆逐队」を编成せよ！(A32)")// 设置文本
					.setPositiveButton("确定", null)// 确定按钮
					.show();// 显示
			break;
		case R.id.a43:
			builder.setTitle("A43.戦舰を主力とした水上打撃部队を编成せよ！")
					// 设置标题
					.setMessage(
							"内容：配备大和型・长门型・伊势型・扶桑型中任意的3艘和軽巡1艘的水上打击部队！\n报酬：\n油：300\n弹：300\n钢：0\n铝：0\n其他：开発资材x3\n备注：仅允许只有四艘舰娘才可达成\n前置：「第二戦队」抜锚！(B31)")// 设置文本
					.setPositiveButton("确定", null)// 确定按钮
					.show();// 显示
			break;
		case R.id.a44:
			builder.setTitle("A44.「西村舰队」を再编成せよ！")
					// 设置标题
					.setMessage(
							"内容：编成由「扶桑」「山城」「最上」「时雨」「满潮」为基干的西村舰队！\n报酬：\n油：300\n弹：300\n钢：0\n铝：0\n其他：开発资材x2，改修资材x3\n前置：「第五戦队」を编成せよ！(A35)及「西村舰队」出撃せよ！(B14)")// 设置文本
					.setPositiveButton("确定", null)// 确定按钮
					.show();// 显示
			break;
		case R.id.a45:
			builder.setTitle("A45.改修工厂を准备せよ！")
					// 设置标题
					.setMessage(
							"内容：第一舰队旗舰配备明石\n报酬：\n油：100\n弹：0\n钢：100\n铝：0\n其他：改修资材x5，开放改修工厂\n前置：「水上机母舰」を配备せよ！(A9)")// 设置文本
					.setPositiveButton("确定", null)// 确定按钮
					.show();// 显示
			break;
		case R.id.a46:
			builder.setTitle("A46.軽快な「水上反撃部队」を编成せよ！")
					// 设置标题
					.setMessage(
							"内容：编成驱逐舰「霞」为旗舰的重巡「足柄」及轻巡一艘驱逐舰4艘的水上挺身部队！\n报酬：\n油：250\n弹：250\n钢：0\n铝：50\n其他：高速修复材x2，开発资材x2\n前置：「第五航空戦队」を编成せよ！(A23)及「西村舰队」出撃せよ！(B14)")// 设置文本
					.setPositiveButton("确定", null)// 确定按钮
					.show();// 显示
			break;
		case R.id.a47:
			builder.setTitle("A47.「第十一駆逐队」を编成せよ！")
					// 设置标题
					.setMessage(
							"内容：编成由特Ⅰ型驱逐舰「吹雪」「白雪」「初雪」「丛云」4艘组成的第十一驱逐队！\n报酬：\n油：110\n弹：110\n钢：110\n铝：0\n其他：开発资材x3\n备注：仅且只能用这4艘达成\n前置：「第十八駆逐队」を编成せよ！(A32)")// 设置文本
					.setPositiveButton("确定", null)// 确定按钮
					.show();// 显示
			break;
		case R.id.a48:
			builder.setTitle("A48.「第二一駆逐队」を编成せよ！")
					// 设置标题
					.setMessage(
							"内容：编成由「初春」「子日」「若叶」「初霜」4艘组成的「第二一驱逐队」！\n报酬：\n油：210\n弹：210\n钢：0\n铝：0\n其他：高速修复材x3\n备注：仅且只能用这4艘达成\n前置：「第十一駆逐队」出撃せよ！(B35)")// 设置文本
					.setPositiveButton("确定", null)// 确定按钮
					.show();// 显示
			break;
		case R.id.a49:
			builder.setTitle("A49.「第二二駆逐队」を编成せよ！")
					// 设置标题
					.setMessage(
							"内容：编成由「皋月」「文月」「长月」和其他1艘共计4艘驱逐舰组成的第二二驱逐队！\n报酬：\n油：220\n弹：220\n钢：0\n铝：0\n其他：高速修复材x3，开発资材x2\n备注：仅且只能用这4艘达成\n前置：「那智戦队」抜锚せよ！(B38)")// 设置文本
					.setPositiveButton("确定", null)// 确定按钮
					.show();// 显示
			break;
		case R.id.a50:
			builder.setTitle("A50.「三川舰队」を新编、突入准备せよ！")
					// 设置标题
					.setMessage(
							"内容：在第一舰队编成「鸟海改二」为旗舰的三川舰队！\n报酬：\n油：300\n弹：300\n钢：0\n铝：0\n其他：高速修复材x2\n备注：鸟海改二」设为旗舰，「古鹰」「加古」「青叶」「衣笠改二」「夕张」「天龙」中的5只，合计6只编成后达成\n前置：新「三川舰队」出撃せよ！(B16)")// 设置文本
					.setPositiveButton("确定", null)// 确定按钮
					.show();// 显示
			break;
		case R.id.a51:
			builder.setTitle("A51.「第十八戦队」を新编成せよ！")
					// 设置标题
					.setMessage(
							"内容：用4只以上的舰娘，编成以轻巡洋舰「天龙」「龙田」作为基干战力的「第十八戦队」！\n报酬：\n油：180\n弹：180\n钢：0\n铝：180\n其他：开発资材x2\n前置：「第六駆逐队」対潜哨戒なのです！(B42)")// 设置文本
					.setPositiveButton("确定", null)// 确定按钮
					.show();// 显示
			break;
		case R.id.a52:
			builder.setTitle("A52.海上突入部队を编成せよ！")
					// 设置标题
					.setMessage(
							"内容：编成含有战舰「比叡」「雾岛」、轻巡洋舰「长良」、驱逐舰「暁」「雷」「电」的海上突入部队！\n报酬：\n油：0\n弹：300\n钢：0\n铝：0\n其他：高速修复材x2，开発资材x2\n前置：新「三川舰队」出撃せよ！(B16)")// 设置文本
					.setPositiveButton("确定", null)// 确定按钮
					.show();// 显示
			break;
		case R.id.a53:
			builder.setTitle("A53.新编「第六駆逐队」を编成せよ！")
					// 设置标题
					.setMessage(
							"内容：编成以驱逐舰「晓改二」为旗舰并含有「响」「雷」「电」的第六驱逐队！\n报酬：\n油：150\n弹：150\n钢：0\n铝：0\n其他：探照灯x1\n备注：要求仅含有这四艘舰，响改二（Верный）也可以\n前置：「西村舰队」出撃せよ！(B14)")// 设置文本
					.setPositiveButton("确定", null)// 确定按钮
					.show();// 显示
			break;
		case R.id.a54:
			builder.setTitle("A54.「第一水雷戦队」北方突入准备！")
					// 设置标题
					.setMessage(
							"内容：编成以轻巡洋舰「阿武隈」为旗舰并含有「响」「初霜」「若叶」「五月雨」「岛风」的第一水雷战队！\n报酬：\n油：150\n弹：150\n钢：0\n铝：0\n其他：家具箱（中）x1，高速修复材x2\n前置：「第十八駆逐队」出撃せよ！(B21)")// 设置文本
					.setPositiveButton("确定", null)// 确定按钮
					.show();// 显示
			break;
		case R.id.a55:
			builder.setTitle("A55.「第一水雷戦队」北方再突入准备！")
					// 设置标题
					.setMessage(
							"内容：再度编成以轻巡洋舰「阿武隈改二」为旗舰并含有「响」「夕云」「秋云」「长波」「岛风」的第一水雷战队！\n报酬：\n油：200\n弹：200\n钢：0\n铝：0\n其他：家具箱（大）x1，高速修复材x2\n前置：北方再突入に备え、练度向上に努めよ！(C7)")// 设置文本
					.setPositiveButton("确定", null)// 确定按钮
					.show();// 显示
			break;
		case R.id.a56:
			builder.setTitle("A56.「第五航空戦队」を再编成せよ！")
					// 设置标题
					.setMessage(
							"内容：编成含有「翔鹤」「瑞鹤」「胧」「秋云」的第5航空战队\n报酬：\n油：300\n弹：0\n钢：0\n铝：300\n其他：开凳资材x3\n前置：「空母机动部队」西へ！(BM6)")// 设置文本
					.setPositiveButton("确定", null)// 确定按钮
					.show();// 显示
			break;
		case R.id.a57:
			builder.setTitle("A57.新编「第二一戦队」出撃准备！")
					// 设置标题
					.setMessage(
							"内容：编成含有「那智改二」「足柄改二」「多摩」「木曾」的第二一战队\n报酬：\n油：150\n弹：150\n钢：150\n铝：0\n其他：开凳资材x2，改修资材x2\n前置：「三川舰队」を新编、突入准备せよ！(A50)及「第六戦队」南西海域へ出撃せよ！(B34)")// 设置文本
					.setPositiveButton("确定", null)// 确定按钮
					.show();// 显示
			break;
		case R.id.a58:
			builder.setTitle("A58.「第十六戦队(第一次)」を编成せよ！")
					// 设置标题
					.setMessage(
							"内容：编成以「足柄」为旗舰并含有「球磨」「长良」的第十六战队\n报酬：\n油：150\n弹：150\n钢：150\n铝：0\n其他：开凳资材x2，高速修复材x2\n前置：敌舰队主力を撃灭せよ！(Bd2)")// 设置文本
					.setPositiveButton("确定", null)// 确定按钮
					.show();// 显示
			break;
		case R.id.a59:
			builder.setTitle("A59.「第三航空戦队」を编成せよ！")
					// 设置标题
					.setMessage(
							"内容：编成以「瑞鹤改」为旗舰，再配置「瑞凤」「千岁」「千代田」共四只空母 在同一舰队中\n报酬：\n油：200\n弹：200\n钢：0\n铝：200\n其他：开凳资材x2，熟练搭乘员x1\n备注：注意「千岁」「千代田」需要改装成为轻空母\n前置：「空母机动部队」西へ！(Bm6)及试作舣装の准备(F21)")// 设置文本
					.setPositiveButton("确定", null)// 确定按钮
					.show();// 显示
			break;
		/***************************** ↓这里开始是出击的信息↓ *************************/
		/***************************** ↓这里开始是出击的信息（一次性）↓ *************************/
		case R.id.b1:
			builder.setTitle("B1.はじめての「出撃」！")
					// 设置标题
					.setMessage(
							"内容：出击舰队\n报酬：\n油：20\n弹：20\n钢：0\n铝：0\n其他：高速修复材x1")// 设置文本
					.setPositiveButton("确定", null)// 确定按钮
					.show();// 显示
			break;
		case R.id.b2:
			builder.setTitle("B2.镇守府正面海域を护れ！")
					// 设置标题
					.setMessage(
							"内容：1-1boss胜利\n报酬：\n油：30\n弹：30\n钢：30\n铝：0\n其他：高速修复材x1")// 设置文本
					.setPositiveButton("确定", null)// 确定按钮
					.show();// 显示
			break;
		case R.id.b3:
			builder.setTitle("B3.第2舰队、出撃せよ！")
					// 设置标题
					.setMessage(
							"内容：出击新编成的第2舰队\n报酬：\n油：0\n弹：0\n钢：200\n铝：200\n其他：开発资材x1\n前置：第2舰队を编成せよ！(A6)")// 设置文本
					.setPositiveButton("确定", null)// 确定按钮
					.show();// 显示
			break;
		case R.id.b4:
			builder.setTitle("B4.南西诸岛冲に出撃せよ！")
					// 设置标题
					.setMessage(
							"内容：出击南西诸岛冲\n报酬：\n油：40\n弹：40\n钢：0\n铝：0\n其他：高速修复材x1")// 设置文本
					.setPositiveButton("确定", null)// 确定按钮
					.show();// 显示
			break;
		case R.id.b5:
			builder.setTitle("B5.接近する「敌前卫舰队」を迎撃せよ！")
					// 设置标题
					.setMessage(
							"内容：1-2boss战胜利\n报酬：\n油：50\n弹：0\n钢：50\n铝：0\n其他：开発资材x1，驱逐舰深雪")// 设置文本
					.setPositiveButton("确定", null)// 确定按钮
					.show();// 显示
			break;
		case R.id.b6:
			builder.setTitle("B6.「水雷戦队」で出撃せよ！")
					.setMessage(
							"内容：旗舰轻巡洋舰1艘与多艘驱逐舰出击\n报酬：\n油：60\n弹：60\n钢：0\n铝：60\n其他：轻巡洋舰龙田\n前置：接近する「敌前卫舰队」を迎撃せよ！(B5)")
					.setPositiveButton("确定", null).show();
			break;
		case R.id.b7:
			builder.setTitle("B7.「重巡洋舰」を出撃させよ！")
					.setMessage(
							"内容：旗舰重巡洋舰 出击\n报酬：\n油：70\n弹：0\n钢：70\n铝：0\n其他：开発资材x1\n前置：「水雷戦队」で出撃せよ！(B6)")
					.setPositiveButton("确定", null).show();
			break;
		case R.id.b8:
			builder.setTitle("B8.「戦舰」を出撃させよ！")
					.setMessage(
							"内容：战列舰为旗舰 出击\n报酬：\n油：0\n弹：150\n钢：150\n铝：0\n其他：开発资材x1\n前置：「重巡洋舰」を出撃させよ！(B7)")
					.setPositiveButton("确定", null).show();
			break;
		case R.id.b9:
			builder.setTitle("B9.「空母机动部队」出撃せよ！")
					.setMessage(
							"内容：空母1艘和其他护卫舰艇所编成的空母机动部队 出击！\n报酬：\n油：200\n弹：0\n钢：0\n铝：300\n其他：高速修复材x1，开発资材x1\n备注：轻空母也可、水上机母舰不可 ，空母1艘、其他舰种3艘共计4艘需要\n前置：「戦舰」を出撃させよ！(B8)")
					.setPositiveButton("确定", null).show();
			break;
		case R.id.b10:
			builder.setTitle("B10.敌空母を撃沈せよ！")
					.setMessage(
							"内容：击沉空母\n报酬：\n油：200\n弹：0\n钢：0\n铝：100\n其他：正规空母赤城（追加报酬）\n备注：轻空母也可以 ，敌空母须为旗舰；当我方舰队中有空母（包括轻母）时追加奖励赤城\n前置：第2舰队で空母机动部队を编成せよ！(A11)")
					.setPositiveButton("确定", null).show();
			break;
		case R.id.b11:
			builder.setTitle("B11.「三川舰队」出撃せよ！")
					.setMessage(
							"内容：「三川舰队」的5艘（「古鹰」「加古」「青叶」「鸟海」「天龙」）＋任意的1艘（高速）共计6艘出击方可达成。\n报酬：\n油：0\n弹：200\n钢：0\n铝：0\n其他：応急修理要员x1\n备注：途中归还也可\n前置：「三川舰队」を编成せよ！(A20)")
					.setPositiveButton("确定", null).show();
			break;
		case R.id.b12:
			builder.setTitle("B12.「第六駆逐队」出撃せよ！")
					.setMessage(
							"内容：不含其他舰娘，仅由「暁」「响」「雷」「电」组成的第六驱逐队出击方可达成\n报酬：\n油：200\n弹：0\n钢：0\n铝：0\n其他：高速修复材x1\n前置：「第六駆逐队」を编成せよ！(A10)及海上通商破壊作戦(Bw3)")
					.setPositiveButton("确定", null).show();
			break;
		case R.id.b13:
			builder.setTitle("B13.「第四戦队」出撃せよ！")
					.setMessage(
							"内容：含「爱宕」「高雄」「鸟海」「摩耶」4艘舰娘+任意舰娘2-2boss胜利\n报酬：\n油：150\n弹：100\n钢：150\n铝：100\n其他：高速修复材x2\n前置：「第四戦队」を编成せよ！(A21)")
					.setPositiveButton("确定", null).show();
			break;
		case R.id.b14:
			builder.setTitle("B14.「西村舰队」出撃せよ！")
					.setMessage(
							"内容：含「扶桑」「山城」「最上」「时雨」4艘舰娘+任意舰娘2-3boss胜利\n报酬：\n油：400\n弹：0\n钢：400\n铝：0\n其他：高速修复材x2，家具箱(小)x1\n前置：「西村舰队」を编成せよ！(A22)")
					.setPositiveButton("确定", null).show();
			break;
		case R.id.b15:
			builder.setTitle("B15.「第五航空戦队」出撃せよ！")
					.setMessage(
							"内容：含「翔鹤」「瑞鹤」2艘舰娘+任意舰娘3-1boss胜利 \n报酬：\n油：200\n弹：200\n钢：0\n铝：700\n其他：高速修复材x2，家具箱(中)x1\n前置：「第五航空戦队」を编成せよ！(A23)")
					.setPositiveButton("确定", null).show();
			break;
		case R.id.b16:
			builder.setTitle("B16.「第五航空戦队」出撃せよ！")
					.setMessage(
							"内容：「鸟海」「青叶」「衣笠」「加古」「古鹰」「天龙」6艘编成舰队2-3boss胜利 \n报酬：\n油：100\n弹：150\n钢：100\n铝：150\n其他：応急修理要员x1\n前置：新「三川舰队」を编成せよ！(A24)")
					.setPositiveButton("确定", null).show();
			break;
		case R.id.b17:
			builder.setTitle("B17.「潜水舰队」出撃せよ！")
					.setMessage(
							"内容：2艘潜水艇+任意舰娘2-3boss胜利 \n报酬：\n油：150\n弹：0\n钢：300\n铝：0\n其他：特注家具职人×1\n备注：まるゆ，U-511，吕500也可；有同名的其他任务「潜水舰队」出撃せよ！(Bm2)，注意区分\n前置：潜水舰队を编成せよ！(A25)")
					.setPositiveButton("确定", null).show();
			break;
		case R.id.b18:
			builder.setTitle("B18.「航空水上打撃舰队」出撃せよ！")
					.setMessage(
							"内容：航空戦舰2艘、航空巡洋舰2艘+任意舰娘4-2boss胜利 \n报酬：\n油：0\n弹：150\n钢：0\n铝：300\n其他：给粮舰「间宫」×1\n前置：航空水上打撃舰队を编成せよ！(A26)")
					.setPositiveButton("确定", null).show();
			break;
		case R.id.b19:
			builder.setTitle("B19.「第六戦队」出撃せよ！")
					.setMessage(
							"内容：「古鹰」「加古」「青叶」「衣笠」4艘+任意舰娘2-3bossS胜 \n报酬：\n油：0\n弹：150\n钢：0\n铝：300\n其他：家具箱(中)x1，応急修理要员x1\n前置：「第六戦队」を编成せよ！(A28)")
					.setPositiveButton("确定", null).show();
			break;
		case R.id.b20:
			builder.setTitle("B20.「第八駆逐队」出撃せよ！")
					.setMessage(
							"内容：「朝潮」「满潮」「大潮」「荒潮」4艘+任意舰娘2-3boss胜利 \n报酬：\n油：0\n弹：100\n钢：400\n铝：0\n其他：开発资材x1，家具箱(中)x1\n前置：「第八駆逐队」を编成せよ！(A31)")
					.setPositiveButton("确定", null).show();
			break;
		case R.id.b21:
			builder.setTitle("B21.「第十八駆逐队」出撃せよ！")
					.setMessage(
							"内容：「霰」「霞」「阳炎」「不知火」4艘+任意舰娘3-1boss胜利 \n报酬：\n油：0\n弹：100\n钢：0\n铝：400\n其他：开発资材x2，家具箱(大)x1\n前置：「第十八駆逐队」を编成せよ！(A32)")
					.setPositiveButton("确定", null).show();
			break;
		case R.id.b22:
			builder.setTitle("B22.「第三十駆逐队(第一次)」出撃せよ！")
					.setMessage(
							"内容：「睦月」「如月」「弥生」「望月」4艘+任意驱逐舰娘(或轻巡做旗舰)3-2boss胜利或C败 \n报酬：\n油：100\n弹：100\n钢：100\n铝：500\n其他：给粮舰「间宫」×1\n前置：「第三十駆逐队(一次)」を编成せよ！(A33)")
					.setPositiveButton("确定", null).show();
			break;
		case R.id.b23:
			builder.setTitle("B23.「航空戦舰」抜锚せよ！")
					.setMessage(
							"内容：航空戦舰2艘+其他舰娘4-4boss胜利\n报酬：\n油：0\n弹：300\n钢：300\n铝：900\n其他：高速修复材x3，家具箱(大)x1\n前置：航空火力舰の运用を强化せよ！(D10)")
					.setPositiveButton("确定", null).show();
			break;
		case R.id.b24:
			builder.setTitle("B24.「第三十駆逐队」対潜哨戒！")
					.setMessage(
							"内容：仅「睦月」「卯月」「弥生」「望月」4艘1-5boss胜利或C败\n报酬：\n油：330\n弹：330\n钢：330\n铝：0\n其他：特注家具职人x1\n前置：「第三十駆逐队(第二次)」を编成せよ！(A34)")
					.setPositiveButton("确定", null).show();
			break;
		case R.id.b25:
			builder.setTitle("B25.新编「第二航空戦队」出撃せよ！")
					.setMessage(
							"内容：旗舰飞龙改二+苍龙(改二）+驱逐舰娘2艘+任意舰娘5-2boss S胜\n报酬：\n油：0\n弹：500\n钢：0\n铝：500\n其他：给粮舰「间宫」×1\n前置：新编「第二航空戦队」を编成せよ！(A36)")
					.setPositiveButton("确定", null).show();
			break;
		case R.id.b26:
			builder.setTitle("B26.精锐「第二航空戦队」抜锚せよ！")
					.setMessage(
							"内容：旗舰苍龙改二+飞龙改二+驱逐舰2艘+任意舰娘4-3bossS胜\n报酬：\n油：500\n弹：0\n钢：500\n铝：0\n其他：特注家具职人×1\n前置：再编成「第二航空戦队」を强化せよ！(A39)")
					.setPositiveButton("确定", null).show();
			break;
		case R.id.b27:
			builder.setTitle("B27.戦舰「榛名」出撃せよ！")
					.setMessage(
							"内容：榛名改二（不需旗舰）+任意舰娘5-1boss S胜\n报酬：\n油：100\n弹：0\n钢：0\n铝：0\n其他：大口径主炮试制35.6cm三连装炮\n前置：「第三十駆逐队」対潜哨戒！(B24)")
					.setPositiveButton("确定", null).show();
			break;
		case R.id.b28:
			builder.setTitle("B28.「第六〇一航空队」出撃せよ！")
					.setMessage(
							"内容：云龙改（不需旗舰）+任意舰娘5-2boss S胜\n报酬：\n油：0\n弹：300\n钢：0\n铝：300\n其他：家具箱(大)x1，航空要员熟练舰载机整备员\n备注：未改造云龙无法达成\n前置：「新型正规空母」を配备せよ！(A41)")
					.setPositiveButton("确定", null).show();
			break;
		case R.id.b29:
			builder.setTitle("B29.「軽空母」戦队、出撃せよ！")
					.setMessage(
							"内容：轻空母1～2艘、轻巡1艘、驱逐舰3～4艘的舰队2-1boss S胜\n报酬：\n油：0\n弹：300\n钢：0\n铝：300\n其他：高速修复材x3，応急修理要员x1\n备注：其他舰种投入不可\n前置：軽巡2只を拥する队を编成せよ！(A5)")
					.setPositiveButton("确定", null).show();
			break;
		case R.id.b30:
			builder.setTitle("B30.「水雷戦队」バシー岛冲紧急展开")
					.setMessage(
							"内容：轻巡旗舰，轻巡最大2艘+其他驱逐舰2-2boss S胜\n报酬：\n油：300\n弹：300\n钢：0\n铝：0\n其他：家具箱(大)x1，特注家具职人x1\n前置：「水雷戦队」で出撃せよ！(B6)")
					.setPositiveButton("确定", null).show();
			break;
		case R.id.b31:
			builder.setTitle("B31.「第二戦队」抜锚！")
					.setMessage(
							"内容：(长门型/扶桑型)的4艘+任意舰娘4-2boss S胜2次\n报酬：\n油：0\n弹：400\n钢：0\n铝：0\n其他：対舰强化弾一式彻甲弾\n前置：主力戦舰部队「第二戦队」を编成せよ！(A42)")
					.setPositiveButton("确定", null).show();
			break;
		case R.id.b32:
			builder.setTitle("B32.「戦舰部队」北方海域に突入せよ！")
					.setMessage(
							"内容：战舰2艘+轻空母1艘（正规空母禁止）+任意舰娘3-5boss战 S胜\n报酬：\n油：0\n弹：500\n钢：0\n铝：250\n其他：开発资材x2，対舰强化弾一式彻甲弾\n备注：航空战舰不可达成\n前置：「水上打撃部队」南方へ！(Bm4)")
					.setPositiveButton("确定", null).show();
			break;
		case R.id.b33:
			builder.setTitle("B33.「西村舰队」南方海域へ进出せよ！")
					.setMessage(
							"内容：扶桑/山城/最上/时雨/满潮 5艘+任意舰娘5-1boss S胜\n报酬：\n油：0\n弹：0\n钢：500\n铝：300\n其他：改修资材x5，勲章x1\n前置：「西村舰队」を再编成せよ！(A44)")
					.setPositiveButton("确定", null).show();
			break;
		case R.id.b34:
			builder.setTitle("B34.「第六戦队」南西海域へ出撃せよ！")
					.setMessage(
							"内容：「古鹰（改二）」「加古（改二）」「青叶」「衣笠（改二）」4艘+任意舰娘2-5boss S胜\n报酬：\n油：0\n弹：400\n钢：0\n铝：400\n其他：家具箱(大)x1，特注家具职人\n前置：「第六戦队」出撃せよ！(B19)")
					.setPositiveButton("确定", null).show();
			break;
		case R.id.b35:
			builder.setTitle("B35.「第十一駆逐队」出撃せよ！")
					.setMessage(
							"内容：「吹雪」「白雪」「初雪」「丛云」4艘+任意舰娘2-3boss胜利\n报酬：\n油：0\n弹：300\n钢：300\n铝：0\n其他：给粮舰「间宫」×1\n前置：「第十一駆逐队」を编成せよ！(A47)")
					.setPositiveButton("确定", null).show();
			break;
		case R.id.b36:
			builder.setTitle("B36.「第十一駆逐队」対潜哨戒！")
					.setMessage(
							"内容：「吹雪」「白雪」「初雪」「丛云」仅这4艘出击1-5BOSS胜利或C败\n报酬：\n油：400\n弹：0\n钢：0\n铝：200\n其他：开発资材×2，三式水中探信仪\n前置：「第十一駆逐队」を编成せよ！(A47)")
					.setPositiveButton("确定", null).show();
			break;
		case R.id.b37:
			builder.setTitle("B37.「第二一駆逐队」出撃せよ！")
					.setMessage(
							"内容：「初春」「子日」「若叶」「初霜」4艘+任意舰娘3-1boss S胜\n报酬：\n油：300\n弹：300\n钢：300\n铝：0\n其他：プレゼント箱×1\n前置：「第二一駆逐队」を编成せよ！(A48)")
					.setPositiveButton("确定", null).show();
			break;
		case R.id.b38:
			builder.setTitle("B38.「那智戦队」抜锚せよ！")
					.setMessage(
							"内容：旗舰那智(改二)+「初霜」「霞」「潮」「曙」4艘+任意舰娘2-2boss S胜\n报酬：\n油：500\n弹：300\n钢：0\n铝：0\n其他：改修资材x2，家具箱(大)x1\n前置：「第二一駆逐队」出撃せよ！(B37)及「第五戦队」出撃せよ！(Bm1)")
					.setPositiveButton("确定", null).show();
			break;
		case R.id.b39:
			builder.setTitle("B39.「第二二駆逐队」出撃せよ！")
					.setMessage(
							"内容：「皋月」「文月」「长月」3艘+驱逐舰1艘+任意舰娘1-4boss S胜\n报酬：\n油：0\n弹：0\n钢：0\n铝：400\n其他：给粮舰「伊良湖」x1，家具箱(中)x1\n前置：「第二二駆逐队」を编成せよ！(A49)")
					.setPositiveButton("确定", null).show();
			break;
		case R.id.b40:
			builder.setTitle("B40.「改装防空重巡」出撃せよ！")
					.setMessage(
							"内容：摩耶改或摩耶改二+轻巡1只+驱逐2只 2-3boss S胜\n报酬：\n油：300\n弹：0\n钢：300\n铝：0\n其他：対空機銃25mm三連装機銃，対空強化弾三式弾\n前置：防空射撃演习を实施せよ！(D15)")
					.setPositiveButton("确定", null).show();
			break;
		case R.id.b41:
			builder.setTitle("B41.新编「三川舰队」ソロモン方面へ！")
					.setMessage(
							"内容：鸟海改二旗舰，并从「古鹰」「加古」「青叶」「衣笠」「夕张」「天龙」中选取5艘 5-1boss S胜\n报酬：\n油：480\n弹：480\n钢：0\n铝：0\n其他：开発资材x3，改修资材x3\n前置：舰队の练度向上に努めよ！(C5)")
					.setPositiveButton("确定", null).show();
			break;
		case R.id.b42:
			builder.setTitle("B42.「第六駆逐队」対潜哨戒なのです！")
					.setMessage(
							"内容：「暁」「响」「雷」「电」1-5boss C败以上\n报酬：\n油：200\n弹：200\n钢：200\n铝：0\n其他：开発资材x3，九三式水中聴音机\n备注：由于带路原因，只能这四艘船出击；响二改Верный也可以达成任务\n前置：「第六駆逐队」を编成せよ！(A10)")
					.setPositiveButton("确定", null).show();
			break;
		case R.id.b43:
			builder.setTitle("B43.抜锚！「第十八戦队」")
					.setMessage(
							"内容：「天龙」「龙田」+其他舰娘2-3boss S胜\n报酬：\n油：350\n弹：0\n钢：0\n铝：250\n其他：高速修复材x3，特注家具职人x1\n前置：「第十八戦队」を新编成せよ！(A51) ")
					.setPositiveButton("确定", null).show();
			break;
		case R.id.b44:
			builder.setTitle("B44.海上突入部队、进発せよ！")
					.setMessage(
							"内容：以「比叡」「雾岛」「长良」「暁」「雷」「电」组成的舰队取得5-1boss S胜\n报酬：\n油：500\n弹：0\n钢：500\n铝：0\n其他：开発资材x5，改修资材x2\n前置：海上突入部队を编成せよ！(A52) 及 南方海域珊瑚诸岛冲の制空権を握れ！(Bw9)")
					.setPositiveButton("确定", null).show();
			break;
		case R.id.b45:
			builder.setTitle("B45.「第六駆逐队」対潜哨戒を彻底なのです！")
					.setMessage(
							"内容：使用「晓」、「响」、「雷」、「电」组成的舰队取得1-5BOSS B胜以上\n报酬：\n油：300\n弹：300\n钢：0\n铝：0\n其他：改修资材x2，九三式水中聴音机\n备注：响二改Верный也可以达成任务\n前置：新编「第六駆逐队」を编成せよ！(A53) 及「第六駆逐队」対潜哨戒なのです！(B42)")
					.setPositiveButton("确定", null).show();
			break;
		case R.id.b46:
			builder.setTitle("B46.「第一水雷戦队」ケ号作戦、突入せよ！")
					.setMessage(
							"内容：旗舰「阿武隈」+「响」「初霜」「五月雨」「若叶」「岛风」组成的舰队3-2BOSS 胜利\n报酬：\n油：0\n弹：300\n钢：0\n铝：400\n其他：高速修复材x3，特注家具职人x1\n前置：「第一水雷戦队」北方突入准备！(A54)")
					.setPositiveButton("确定", null).show();
			break;
		case R.id.b47:
			builder.setTitle("B47.「第一水雷戦队」北方ケ号作戦、再突入！")
					.setMessage(
							"内容：旗舰「阿武隈改二」+「响」「夕云」「秋云」「长波」「岛风」组成的舰队 3-2BOSS S胜\n报酬：\n油：0\n弹：400\n钢：0\n铝：500\n其他：开发资材x4，改修资材x4\n前置：「第一水雷戦队」北方再突入准备！(A55)")
					.setPositiveButton("确定", null).show();
			break;
		case R.id.b48:
			builder.setTitle("B48.镇守府正面の対潜哨戒を强化せよ！")
					.setMessage(
							"内容：1-5BOSS四次 B胜以上\n报酬：\n油：300\n弹：300\n钢：0\n铝：0\n其他：特注家具职人x1\n前置：敌舰队を撃破せよ！(Bd1)")
					.setPositiveButton("确定", null).show();
			break;
		case R.id.b49:
			builder.setTitle("B49.「空母机动部队」北方海域に进出せよ！")
					.setMessage(
							"内容：旗舰航空母舰（装母可，正航可，轻母不可）3-5BOSS S胜利\n报酬：\n油：500\n弹：0\n钢：500\n铝：0\n其他：改修资材x3，战斗粮食x2\n前置：「戦舰部队」北方海域に突入せよ！（B32)及日常任务 敌潜水舰を制圧せよ！（BD8)")
					.setPositiveButton("确定", null).show();
			break;
		case R.id.b50:
			builder.setTitle("B50.「第五航空戦队」珊瑚诸岛冲に出撃せよ！")
					.setMessage(
							"内容：「翔鹤」「瑞鹤」「胧」「秋云」4艘+任意舰娘5-2BOSS S胜利\n报酬：\n油：0\n弹：500\n钢：0\n铝：0\n其他：高速修复材x3，给粮舰「伊良湖」x1\n前置：「第五航空戦队」を再编成せよ！（A56)")
					.setPositiveButton("确定", null).show();
			break;
		case R.id.b51:
			builder.setTitle("B51.新编「第二一戦队」北方へ出撃せよ！")
					.setMessage(
							"内容：「那智改二」「足柄改二」「多摩」「木曾」4艘+任意舰娘3-1BOSS S胜利\n报酬：\n油：300\n弹：300\n钢：0\n铝：0\n其他：战斗粮食x1，礼物盒x1\n前置：新编「第二一戦队」出撃准备！（A57)")
					.setPositiveButton("确定", null).show();
			break;
		case R.id.b52:
			builder.setTitle("B52.「第十六戦队(第一次)」出撃せよ！")
					.setMessage(
							"内容：旗舰「足柄」+「球磨」「长良」3艘+任意舰娘2-2BOSS S胜利\n报酬：\n油：200\n弹：0\n钢：200\n铝：0\n其他：家具箱（中）x1，礼物盒x1\n前置：「第十六戦队(第一次)」を编成せよ！（A58)")
					.setPositiveButton("确定", null).show();
			break;
		case R.id.b53:
			builder.setTitle("B53.「第三航空戦队」南西诸岛防卫线に出撃！")
					.setMessage(
							"内容：「瑞鹤改」旗舰+「千岁」+「千代田」+「瑞凤」+2任意舰娘1-4BOSS S胜\n报酬：\n油：0\n弹：0\n钢：300\n铝：0\n其他：高速修复材×2，给粮舰「伊良湖」×1\n备注：「千岁」「千代田」必须改造为轻空母\n前置：「第三航空戦队」を编成せよ！(A59)")
					.setPositiveButton("确定", null).show();
			break;
		/***************************** ↓这里开始是出击的信息（日常）↓ *************************/
		case R.id.bd1:
			builder.setTitle("Bd1.敌舰队を撃破せよ！")
					.setMessage(
							"内容：任意出击一次且胜利\n报酬：\n油：50\n弹：50\n钢：0\n铝：0\n其他：开発资材x1\n备注：C败、D败无法达成任务请注意\n前置：南西诸岛冲に出撃せよ！(B4)")
					.setPositiveButton("确定", null).show();
			break;
		case R.id.bd2:
			builder.setTitle("Bd2.敌舰队主力を撃灭せよ！")
					.setMessage(
							"内容：任意出击一次且胜利\n报酬：\n油：50\n弹：50\n钢：50\n铝：50\n其他：高速修复材x1，开発资材x1\n备注：C败、D败无法达成任务请注意\n前置：敌舰队を撃破せよ！(Bd1)")
					.setPositiveButton("确定", null).show();
			break;
		case R.id.bd3:
			builder.setTitle("Bd3.敌舰队を10回邀撃せよ！")
					.setMessage(
							"内容：任意出击十次\n报酬：\n油：150\n弹：150\n钢：200\n铝：100\n其他：开発资材x1\n前置：敌舰队主力を撃灭せよ！(Bd2)")
					.setPositiveButton("确定", null).show();
			break;
		case R.id.bd4:
			builder.setTitle("Bd4.敌空母を3只撃沈せよ！")
					.setMessage(
							"内容：轻/正规空母击沉3次\n报酬：\n油：150\n弹：150\n钢：150\n铝：300\n其他：高速修复材x2\n备注：装甲空母鬼・姬等舰种为航战，不计算在内；此任务仅在日期末尾为3,7,0的日子里出现\n前置：敌舰队を撃破せよ！(Bd1)")
					.setPositiveButton("确定", null).show();
			break;
		case R.id.bd5:
			builder.setTitle("Bd5.敌补给舰を3只撃沈せよ！")
					.setMessage(
							"内容：击沉3艘补给舰\n报酬：\n油：100\n弹：50\n钢：200\n铝：50\n其他：高速修复材x1，开発资材x1\n前置：敌舰队主力を撃灭せよ！(Bd2)")
					.setPositiveButton("确定", null).show();
			break;
		case R.id.bd6:
			builder.setTitle("Bd6.敌输送船団を叩け！")
					.setMessage(
							"内容：击沉5艘补给舰\n报酬：\n油：0\n弹：200\n钢：0\n铝：0\n其他：开発资材x2\n备注：仅在日期末尾是2,8的日子出现\n前置：敌舰队を撃破せよ！(Bd1)")
					.setPositiveButton("确定", null).show();
			break;
		case R.id.bd7:
			builder.setTitle("Bd7.南西诸岛海域の制海権を握れ！")
					.setMessage(
							"内容：2-1~2-5 boss战 5次胜利\n报酬：\n油：300\n弹：0\n钢：0\n铝：200\n其他：高速建造材x1，高速修复材x1\n前置：敌补给舰を3只撃沈せよ！(Bd5)")
					.setPositiveButton("确定", null).show();
			break;
		case R.id.bd8:
			builder.setTitle("Bd8.敌潜水舰を制圧せよ！")
					.setMessage(
							"内容：敌潜水艇 6艘 击沉\n报酬：\n油：300\n弹：30\n钢：300\n铝：30\n其他：高速修复材x1\n前置：南西诸岛海域の制海権を握れ！(Bd7)")
					.setPositiveButton("确定", null).show();
			break;
		/***************************** ↓这里开始是出击的信息（周常）↓ *************************/
		case R.id.bw1:
			builder.setTitle("Bw1.あ号作戦")
					.setMessage(
							"内容：出击36次，S胜6次，进BOSS点24次，BOSS战胜利12次\n报酬：\n油：300\n弹：300\n钢：300\n铝：100\n其他：高速修复材x2，开発资材x2\n前置：敌舰队主力を撃灭せよ！(Bd2)")
					.setPositiveButton("确定", null).show();
			break;
		case R.id.bw2:
			builder.setTitle("Bw2.い号作戦")
					.setMessage(
							"内容：轻/正规空母击沉20次\n报酬：\n油：0\n弹：500\n钢：0\n铝：500\n其他：开発资材x2\n前置：敌补给舰を3只撃沈せよ！(Bd5)")
					.setPositiveButton("确定", null).show();
			break;
		case R.id.bw3:
			builder.setTitle("Bw3.海上通商破壊作戦")
					.setMessage(
							"内容：击沉20艘补给舰\n报酬：\n油：500\n弹：0\n钢：400\n铝：0\n其他：开発资材x3\n前置：敌舰队主力を撃灭せよ！(Bd2)")
					.setPositiveButton("确定", null).show();
			break;
		case R.id.bw4:
			builder.setTitle("Bw4.ろ号作戦")
					.setMessage(
							"内容：击沉20艘补给舰\n报酬：\n油：400\n弹：0\n钢：800\n铝：0\n其他：高速修复材x3\n前置：あ号作戦(Bw1)")
					.setPositiveButton("确定", null).show();
			break;
		case R.id.bw5:
			builder.setTitle("Bw5.海上护卫戦")
					.setMessage(
							"内容：击沉15艘潜水艇\n报酬：\n油：600\n弹：0\n钢：0\n铝：0\n其他：高速修复材x2，改修资材x1\n前置：い号作戦(Bw2)")
					.setPositiveButton("确定", null).show();
			break;
		case R.id.bw6:
			builder.setTitle("Bw6.敌东方舰队を撃灭せよ！")
					.setMessage(
							"内容：4-1~4-5 boss战 12次胜利\n报酬：\n油：400\n弹：0\n钢：0\n铝：700\n其他：开発资材x2\n前置：海上护卫戦(Bw5)")
					.setPositiveButton("确定", null).show();
			break;
		case R.id.bw7:
			builder.setTitle("Bw7.敌北方舰队主力を撃灭せよ！")
					.setMessage(
							"内容：3-3~3-5 boss战 5次胜利\n报酬：\n油：300\n弹：300\n钢：400\n铝：300\n其他：开発资材x3，改修资材x3\n前置：海上护卫戦(Bw5)")
					.setPositiveButton("确定", null).show();
			break;
		case R.id.bw8:
			builder.setTitle("Bw8.敌东方中枢舰队を撃破せよ！")
					.setMessage(
							"内容：4-4 boss战 1次胜利\n报酬：\n油：500\n弹：0\n钢：500\n铝：0\n其他：高速修复材x1，开発资材x1\n前置：敌东方舰队を撃灭せよ！(Bw6)")
					.setPositiveButton("确定", null).show();
			break;
		case R.id.bw9:
			builder.setTitle("Bw9.南方海域珊瑚诸岛冲の制空権を握れ！")
					.setMessage(
							"内容：5-2 boss战 2次S胜\n报酬：\n油：0\n弹：300\n钢：0\n铝：800\n其他：开発资材x2，改修资材x2\n前置：敌东方中枢舰队を撃破せよ！(Bw8)")
					.setPositiveButton("确定", null).show();
			break;
		case R.id.bw10:
			builder.setTitle("Bw10.海上输送路の安全确保に努めよ！")
					.setMessage(
							"内容：1-5 boss战 3次A胜以上\n报酬：\n油：100\n弹：0\n钢：0\n铝：0\n其他：改修资材x3\n前置：改修工厂を准备せよ！(A45)及ろ号作戦(Bw4)")
					.setPositiveButton("确定", null).show();
			break;
		/***************************** ↓这里开始是出击的信息（月常）↓ *************************/
		case R.id.bm1:
			builder.setTitle("Bm1.「第五戦队」出撃せよ！")
					.setMessage(
							"内容：第五战队「妙高」「那智」「羽黒」(可加其他舰娘)击败2-5 BOSS (S胜利)\n报酬：\n油：0\n弹：550\n钢：550\n铝：0\n其他：开発资材x5，家具箱(大)\n前置：「第五戦队」を编成せよ！(A35)")
					.setPositiveButton("确定", null).show();
			break;
		case R.id.bm2:
			builder.setTitle("Bm2.「潜水舰队」出撃せよ！")
					.setMessage(
							"内容：6-1boss S胜3次\n报酬：\n油：0\n弹：600\n钢：0\n铝：0\n其他：家具箱(大)，给粮舰「伊良湖」\n备注：注意有同名称的「潜水舰队」出撃せよ！(B17)任务\n前置：「水雷戦队」バシー岛冲紧急展开(B30)")
					.setPositiveButton("确定", null).show();
			break;
		case R.id.bm3:
			builder.setTitle("Bm3.「水雷戦队」南西へ！")
					.setMessage(
							"内容：轻巡旗舰，最多3艘轻巡其他驱逐1-4 BOSS S胜\n报酬：\n油：500\n弹：0\n钢：0\n铝：300\n其他：改修资材x3，给粮舰「伊良湖」\n备注：投入轻巡、驱逐以外的舰种的话无法达成\n前置：ろ号作戦(Bw4)")
					.setPositiveButton("确定", null).show();
			break;
		case R.id.bm4:
			builder.setTitle("Bm4.「水上打撃部队」南方へ！")
					.setMessage(
							"内容：战舰3只 轻巡1只(可加其他舰娘)5-1BOSS S胜\n报酬：\n油：350\n弹：400\n钢：350\n铝：0\n其他：高速修复材x3，改修资材x4\n备注：高速战舰不可 航战可\n前置：戦舰を主力とした水上打撃部队を编成せよ！(A43)")
					.setPositiveButton("确定", null).show();
			break;
		case R.id.bm5:
			builder.setTitle("Bm5.海上护卫强化月间")
					.setMessage(
							"内容：1-5 BOSS A胜以上10次\n报酬：\n油：800\n弹：0\n钢：0\n铝：0\n其他：开発资材x5，改修资材x3\n前置：「第十八駆逐队」出撃せよ！(B21)及「第五戦队」出撃せよ！(Bm1)")
					.setPositiveButton("确定", null).show();
			break;
		case R.id.bm6:
			builder.setTitle("Bm6.「空母机动部队」西へ！")
					.setMessage(
							"内容：以2空母+2驱逐做基础 4-2 BOSS S胜利\n报酬：\n油：0\n弹：0\n钢：600\n铝：800\n其他：改修资材x2，家具箱(大)x2\n前置：「第八駆逐队」出撃せよ！(B20)及ろ号作戦(Bw4)")
					.setPositiveButton("确定", null).show();
			break;
		case R.id.bm7:
			builder.setTitle("Bm6.「空母机动部队」西へ！")
					.setMessage(
							"内容：驱逐旗舰+重巡1只+轻巡1只+其他驱逐舰3只 2-5 BOSS S胜\n报酬：\n油：0\n弹：600\n钢：0\n铝：200\n其他：开発资材x4，改修资材x2\n前置：軽快な「水上反撃部队」を编成せよ！(A46)及「空母机动部队」西へ！(Bm6)")
					.setPositiveButton("确定", null).show();
			break;
		/***************************** ↓这里开始是演习的信息↓ *************************/
		case R.id.c1:
			builder.setTitle("C1.はじめての「演习」！")
					.setMessage(
							"内容：与其他提督的舰队进行演习！\n报酬：\n油：10\n弹：10\n钢：0\n铝：0\n其他：开発资材x1")
					.setPositiveButton("确定", null).show();
			break;
		case R.id.c2:
			builder.setTitle("C2.「演习」で练度向上！")
					.setMessage(
							"内容：本日内与其他司令官的舰队进行三次「演习」！\n报酬：\n油：50\n弹：0\n钢：50\n铝：0\n其他：高速建造材x1")
					.setPositiveButton("确定", null).show();
			break;
		case R.id.c3:
			builder.setTitle("C3.「演习」で他提督を圧倒せよ！")
					.setMessage(
							"内容：本日内在与其他司令官的舰队的「演习」中获得5次胜利！\n报酬：\n油：0\n弹：50\n钢：0\n铝：50\n其他：开発资材x1\n前置：「演习」で练度向上！(C2)")
					.setPositiveButton("确定", null).show();
			break;
		case R.id.c4:
			builder.setTitle("C4.大规模演习")
					.setMessage(
							"内容：本周中与其他司令官的舰队的「演习」中获得20次胜利！\n报酬：\n油：200\n弹：200\n钢：200\n铝：200\n其他：开発资材x1，改修资材x1\n前置：「演习」で练度向上！(C2)")
					.setPositiveButton("确定", null).show();
			break;
		case R.id.c5:
			builder.setTitle("C5.舰队の练度向上に努めよ！")
					.setMessage(
							"内容：本日中「演习」获得3回以上的「胜利」！\n报酬：\n油：0\n弹：0\n钢：300\n铝：300\n其他：高速修复材x2\n前置：「三川舰队」を新编、突入准备せよ！(A50)")
					.setPositiveButton("确定", null).show();
			break;
		case R.id.c6:
			builder.setTitle("C6.演习を强化、舰队の练度向上に努めよ！")
					.setMessage(
							"内容：本日中「演习」获得4回以上的「胜利」！\n报酬：\n油：0\n弹：300\n钢：0\n铝：0\n其他：高速修复材x2，改修资材x1\n前置：「観舰式予行を实施せよ！(D17)")
					.setPositiveButton("确定", null).show();
			break;
		case R.id.c7:
			builder.setTitle("C7.北方再突入に备え、练度向上に努めよ！")
					.setMessage(
							"内容：本日中「演习」获得4回以上的「胜利」！\n报酬：\n油：300\n弹：0\n钢：0\n铝：0\n其他：高速修复材x2，改修资材x1\n前置：「第一水雷戦队」ケ号作戦、突入せよ！(B46)")
					.setPositiveButton("确定", null).show();
			break;
		case R.id.c8:
			builder.setTitle("C8.精锐舰队演习")
					.setMessage(
							"内容：本日中「演习」获得7回以上的「胜利」\n报酬：\n油：0\n弹：400\n钢：0\n铝：200\n其他：高速修复材x2，战斗粮食x1\n前置：敌舰队を撃破せよ！(Bd1)")
					.setPositiveButton("确定", null).show();
			break;
		/***************************** ↓这里开始是远征的信息↓ *************************/
		case R.id.d1:
			builder.setTitle("D1.はじめての「远征」！")
					.setMessage(
							"内容：令舰队出发「远征」一次\n报酬：\n油：30\n弹：30\n钢：30\n铝：30\n其他：家具箱(小)x1\n前置：軽巡2只を拥する队を编成せよ！(A5)")
					.setPositiveButton("确定", null).show();
			break;
		case R.id.d2:
			builder.setTitle("D2.「远征」を3回成功させよう！")
					.setMessage(
							"内容：本日内「远征」成功3次！\n报酬：\n油：100\n弹：100\n钢：100\n铝：100\n其他：开発资材x1")
					.setPositiveButton("确定", null).show();
			break;
		case R.id.d3:
			builder.setTitle("D3.「远征」を10回成功させよう！")
					.setMessage(
							"内容：本日内「远征」成功10次！\n报酬：\n油：150\n弹：300\n钢：300\n铝：150\n其他：家具箱(小)x1，家具箱(中)x1\n前置：「远征」を3回成功させよう！(D2)")
					.setPositiveButton("确定", null).show();
			break;
		case R.id.d4:
			builder.setTitle("D4.大规模远征作戦，発令！")
					.setMessage(
							"内容：本周内「远征」成功30次！\n报酬：\n油：300\n弹：500\n钢：500\n铝：300\n其他：开発资材x3，家具箱(大)x1")
					.setPositiveButton("确定", null).show();
			break;
		case R.id.d5:
			builder.setTitle("D5.第一次潜水舰派遣作戦")
					.setMessage(
							"内容：远征「潜水舰派遣作戦」成功一次\n报酬：\n油：0\n弹：0\n钢：10\n铝：10\n其他：応急修理要员x1\n备注：注意不是「潜水舰派遣演习」\n前置：中规模潜水舰队を编成せよ！(A27)")
					.setPositiveButton("确定", null).show();
			break;
		case R.id.d6:
			builder.setTitle("D6.第二次潜水舰派遣作戦")
					.setMessage(
							"内容：远征「潜水舰派遣作戦」成功一次\n报酬：\n油：0\n弹：0\n钢：10\n铝：10\n其他：艦上爆撃機Ju87C改\n备注：注意不是「潜水舰派遣演习」\n前置：第一次潜水舰派遣作戦(D5)")
					.setPositiveButton("确定", null).show();
			break;
		case R.id.d7:
			builder.setTitle("D7.潜水舰派遣作戦による技术入手の継続")
					.setMessage(
							"内容：远征「潜水舰派遣作戦」成功2次\n报酬：\n油：0\n弹：0\n钢：0\n铝：800\n其他：艦上爆撃機Ju87C改，特注家具职人x1\n备注：注意不是「潜水舰派遣演习」；本任务刚出现的时候右侧就有「50%以上达成」的标记\n前置：第二次潜水舰派遣作戦(D6)")
					.setPositiveButton("确定", null).show();
			break;
		case R.id.d8:
			builder.setTitle("D8.潜水舰派遣による海外舰との接触作戦")
					.setMessage(
							"内容：远征「海外舰との接触」成功1次\n报酬：\n油：0\n弹：100\n钢：0\n铝：0\n其他：駆逐艦Z1\n前置：潜水舰派遣作戦による技术入手の継続！(D7)")
					.setPositiveButton("确定", null).show();
			break;
		case R.id.d9:
			builder.setTitle("D9.南方への输送作戦を成功させよ！")
					.setMessage(
							"内容：远征「东京急行」或「东京急行(弐)」成功1次\n报酬：\n油：150\n弹：0\n钢：0\n铝：0\n其他：家具箱(小)x1\n前置：「第1水雷戦队」を编成せよ！(A30)")
					.setPositiveButton("确定", null).show();
			break;
		case R.id.d10:
			builder.setTitle("D10.航空火力舰の运用を强化せよ！")
					.setMessage(
							"内容：远征「航空戦舰运用演习」成功1次\n报酬：\n油：0\n弹：0\n钢：0\n铝：100\n其他：水上爆撃機瑞雲(六三四空)\n前置：「第八駆逐队」出撃せよ！(B20)")
					.setPositiveButton("确定", null).show();
			break;
		case R.id.d11:
			builder.setTitle("D11.南方への鼠输送を継続实施せよ!")
					.setMessage(
							"内容：远征「东京急行」或「东京急行(弐)」成功6次（与D9合计共7次）\n报酬：\n油：400\n弹：0\n钢：0\n铝：400\n其他：开発资材x2，改修资材x1\n前置：南方への输送作戦を成功させよ！(D9)")
					.setPositiveButton("确定", null).show();
			break;
		case R.id.d12:
			builder.setTitle("D12.(続)航空火力舰の运用を强化せよ！")
					.setMessage(
							"内容：远征「航空戦舰运用演习」成功3次（与D10合计共4次）\n报酬：\n油：0\n弹：0\n钢：0\n铝：200\n其他：水上爆撃機瑞雲(六三四空)\n前置：航空火力舰の运用を强化せよ！(D10)")
					.setPositiveButton("确定", null).show();
			break;
		case R.id.d13:
			builder.setTitle("D13.远洋潜水舰作戦を实施せよ！")
					.setMessage(
							"内容：远征「远洋潜水舰作戦」成功1次\n报酬：\n油：0\n弹：200\n钢：0\n铝：0\n其他：潜水艦魚雷潜水艦53cm艦首魚雷(8門)\n前置：潜水舰队「第六舰队」を编成せよ！(A37)")
					.setPositiveButton("确定", null).show();
			break;
		case R.id.d14:
			builder.setTitle("D14.远洋潜水舰作戦の成果を拡大せよ！")
					.setMessage(
							"内容：远征「远洋潜水舰作戦」成功2次（与D13合计共3次）\n报酬：\n油：0\n弹：400\n钢：0\n铝：0\n其他：潜水艦魚雷潜水艦53cm艦首魚雷(8門)\n前置：远洋潜水舰作戦を实施せよ！(D13)")
					.setPositiveButton("确定", null).show();
			break;
		case R.id.d15:
			builder.setTitle("D15.防空射撃演习を实施せよ！")
					.setMessage(
							"内容：远征「防空射撃演习」3回成功\n报酬：\n油：0\n弹：200\n钢：0\n铝：200\n其他：対空機銃25mm三連装機銃，开発资材x2\n前置：「重巡洋舰」を出撃させよ！(B7)")
					.setPositiveButton("确定", null).show();
			break;
		case R.id.d16:
			builder.setTitle("D16.「囮机动部队支援作戦」を实施せよ！")
					.setMessage(
							"内容：远征「囮机动部队支援作戦」1回成功\n报酬：\n油：400\n弹：0\n钢：0\n铝：400\n其他：射装置91式高射装置，开発资材x2\n前置：「改装防空重巡」出撃せよ！(B40)")
					.setPositiveButton("确定", null).show();
			break;
		case R.id.d17:
			builder.setTitle("D17.観舰式予行を实施せよ！")
					.setMessage(
							"内容：远征「観舰式予行」2回成功\n报酬：\n油：150\n弹：0\n钢：0\n铝：150\n其他：开発资材x3\n前置：「第五戦队」を编成せよ！(A35)")
					.setPositiveButton("确定", null).show();
			break;
		case R.id.d18:
			builder.setTitle("D18.観舰式を敢行せよ！")
					.setMessage(
							"内容：远征「観舰式」成功1次\n报酬：\n油：300\n弹：300\n钢：300\n铝：0\n其他：改修资材x1，司令部要员x1\n前置：演习を强化、舰队の练度向上に努めよ！(C6)")
					.setPositiveButton("确定", null).show();
			break;
		case R.id.d19:
			builder.setTitle("D19.机动部队の运用を强化せよ！")
					.setMessage(
							"内容：远征26「敌母港空袭作战」及远征35「MO作战」各1回成功\n报酬：\n油：200\n弹：200\n钢：400\n铝：0\n前置：「第五航空戦队」珊瑚诸岛冲に出撃せよ！(B50)及南方への输送作戦を成功させよ！(D9)")
					.setPositiveButton("确定", null).show();
			break;
		/***************************** ↓这里开始是补给/入渠的信息↓ *************************/
		case R.id.e1:
			builder.setTitle("E1.はじめての「补给」！")
					.setMessage(
							"内容：给舰娘「补给」燃料・弹药！\n报酬：\n油：20\n弹：20\n钢：0\n铝：0\n其他：高速修复材x1\n前置：镇守府正面海域を护れ！(B2)")
					.setPositiveButton("确定", null).show();
			break;
		case R.id.e2:
			builder.setTitle("E2.はじめての「入渠」！")
					.setMessage(
							"内容：令在战斗中负伤的舰娘「入渠」修理\n报酬：\n油：0\n弹：0\n钢：30\n铝：0\n其他：开発资材x1\n前置：镇守府正面海域を护れ！(B2)")
					.setPositiveButton("确定", null).show();
			break;
		case R.id.e3:
			builder.setTitle("E3.舰队大整备！")
					.setMessage(
							"内容：「入渠」5次\n报酬：\n油：30\n弹：30\n钢：30\n铝：30\n其他：高速修复材x2")
					.setPositiveButton("确定", null).show();
			break;
		case R.id.e4:
			builder.setTitle("E4.舰队酒保祭り！")
					.setMessage(
							"内容：为各舰实施共计15次以上的补给！\n报酬：\n油：50\n弹：50\n钢：50\n铝：50\n其他：开発资材x1，高速修复材x1\n备注：只计算按下了几次补给按钮、与补给了几艘船无关。给全员打上勾按下「まとめて补给」的话只算作1次，一只一只分别补给燃料和弹药的话一个6只编成的舰队可以最多进行12次补给。\n前置：舰队大整备！(E3)")
					.setPositiveButton("确定", null).show();
			break;
		/***************************** ↓这里开始是工厂的信息↓ *************************/
		case R.id.f1:
			builder.setTitle("F1.はじめての「建造」！")
					.setMessage(
							"内容：在工厂中建造新的舰娘\n报酬：\n油：50\n弹：50\n钢：50\n铝：50\n其他：开発资材x1")
					.setPositiveButton("确定", null).show();
			break;
		case R.id.f2:
			builder.setTitle("F2.はじめての「开発」！")
					.setMessage(
							"内容：在工厂中开发新的装备\n报酬：\n油：100\n弹：100\n钢：100\n铝：100\n其他：开発资材x1")
					.setPositiveButton("确定", null).show();
			break;
		case R.id.f3:
			builder.setTitle("F3.はじめての「解体」！")
					.setMessage(
							"内容：在工厂中解体不需要的舰娘\n报酬：\n油：60\n弹：60\n钢：60\n铝：60\n其他：高速建造材x1，开発资材x1")
					.setPositiveButton("确定", null).show();
			break;
		case R.id.f4:
			builder.setTitle("F4.はじめての「廃弃」！")
					.setMessage(
							"内容：在工厂中废弃不需要的装备\n报酬：\n油：80\n弹：80\n钢：80\n铝：80\n其他：高速建造材x1，开発资材x1")
					.setPositiveButton("确定", null).show();
			break;
		case R.id.f5:
			builder.setTitle("F5.新装备「开発」指令")
					.setMessage(
							"内容：在工厂中开发新的装备\n报酬：\n油：40\n弹：40\n钢：40\n铝：40\n其他：高速建造材x1，开発资材x1\n备注：开发失败也可以")
					.setPositiveButton("确定", null).show();
			break;
		case R.id.f6:
			builder.setTitle("F6.新造舰「建造」指令")
					.setMessage(
							"内容：在工厂中建造一艘新舰娘\n报酬：\n油：50\n弹：50\n钢：50\n铝：50\n其他：高速建造材x1，开発资材x1\n前置：新装备「开発」指令(F05)")
					.setPositiveButton("确定", null).show();
			break;
		case R.id.f7:
			builder.setTitle("F7.装备「开発」集中强化！")
					.setMessage(
							"内容：在工厂中开发3件新装备\n报酬：\n油：100\n弹：100\n钢：100\n铝：100\n其他：开発资材x2\n备注：开发失败也可以\n前置：新造舰「建造」指令(F06)")
					.setPositiveButton("确定", null).show();
			break;
		case R.id.f8:
			builder.setTitle("F8.舰娘「建造」舰队强化！")
					.setMessage(
							"内容：在工厂中建造3艘新舰娘\n报酬：\n油：200\n弹：200\n钢：300\n铝：100\n其他：高速建造材x1，开発资材x2\n前置：装备「开発」集中强化！(F07)")
					.setPositiveButton("确定", null).show();
			break;
		case R.id.f9:
			builder.setTitle("F9.军缩条约対応！")
					.setMessage(
							"内容：在工厂中解体2艘不需要的舰娘\n报酬：\n油：0\n弹：0\n钢：0\n铝：50\n其他：高速建造材x1\n前置：舰娘「建造」舰队强化！(F08)")
					.setPositiveButton("确定", null).show();
			break;
		case R.id.f10:
			builder.setTitle("F10.「大型舰建造」の准备！(その弐)")
					.setMessage(
							"内容：在工厂中废弃4回不需要的装备\n报酬：\n油：800\n弹：800\n钢：0\n铝：0\n其他：「大型舰建造」解放\n前置：「大型舰建造」の准备！(その壹)(G4)")
					.setPositiveButton("确定", null).show();
			break;
		case R.id.f11:
			builder.setTitle("F11.输送用ドラム缶の准备")
					.setMessage(
							"内容：在工厂中废弃3回不需要的装备\n报酬：\n油：0\n弹：0\n钢：30\n铝：0\n其他：简易输送部材ドラム缶(输送用)x3\n前置：軽巡2只を拥する队を编成せよ！(A5)")
					.setPositiveButton("确定", null).show();
			break;
		case R.id.f12:
			builder.setTitle("F12.资源の再利用")
					.setMessage(
							"内容：在工厂中废弃装备24回\n报酬：\n油：0\n弹：0\n钢：100\n铝：0\n其他：简易输送部材ドラム缶(输送用)x1\n备注：选择多个装备废弃只能算一次\n前置：ウィークリー海上护卫戦(Bw5)")
					.setPositiveButton("确定", null).show();
			break;
		case R.id.f13:
			builder.setTitle("F13.机种転换")
					.setMessage(
							"内容：搭载「九七式舰攻(友永队)」的空母作为秘书舰时废弃两架「天山」\n报酬：\n油：0\n弹：0\n钢：0\n铝：50\n其他：舰上攻撃机天山一二型(友永队)\n备注：「九七式舰攻(友永队)」此装备不能上锁\n前置：新编「第二航空戦队」出撃せよ！(B25)")
					.setPositiveButton("确定", null).show();
			break;
		case R.id.f14:
			builder.setTitle("F14.机种転换")
					.setMessage(
							"内容：搭载「九九式舰爆(江草队)」的空母作为秘书舰时废弃两架「彗星」\n报酬：\n油：0\n弹：0\n钢：0\n铝：50\n其他：舰上爆撃机彗星(江草队)\n备注：「九九式舰爆(江草队)」此装备不能上锁\n前置：新编「第二航空戦队」出撃せよ！(B25)")
					.setPositiveButton("确定", null).show();
			break;
		case R.id.f15:
			builder.setTitle("F15.机种転换")
					.setMessage(
							"内容：搭载「零戦52型丙(六〇一空)」的空母作为秘书舰时废弃两架「烈风」\n报酬：\n油：0\n弹：0\n钢：0\n铝：50\n其他：舰上戦闘机烈风(六〇一空)\n备注：「零戦52型丙(六〇一空)」此装备不能上锁\n前置：「第六〇一航空队」出撃せよ！(B28)")
					.setPositiveButton("确定", null).show();
			break;
		case R.id.f16:
			builder.setTitle("F16.「伊良湖」の准备")
					.setMessage(
							"内容：在工厂中废弃10个装备\n报酬：\n油：100\n弹：0\n钢：0\n铝：0\n其他：给粮舰「伊良湖」x4\n前置：舰娘「建造」舰队强化！(F8)")
					.setPositiveButton("确定", null).show();
			break;
		case R.id.f17:
			builder.setTitle("F17.はじめての「装备改修」！")
					.setMessage(
							"内容：改修一回装备\n报酬：\n油：0\n弹：0\n钢：100\n铝：0\n其他：改修资材x7\n前置：改修工厂を准备せよ！(A45)")
					.setPositiveButton("确定", null).show();
			break;
		case R.id.f18:
			builder.setTitle("F18.装备の改修强化")
					.setMessage(
							"内容：改修一回装备\n报酬：\n油：0\n弹：50\n钢：0\n铝：0\n其他：改修资材x1\n备注：改修失败也可以\n前置：舰娘「建造」舰队强化！(F8) 及 はじめての「装备改修」！(F17)")
					.setPositiveButton("确定", null).show();
			break;
		case R.id.f19:
			builder.setTitle("F19.精锐「九七式舰攻」部队の编成")
					.setMessage(
							"内容：旗舰为「翔鹤」或「赤城」的情况下废弃3只「九七式舰攻」\n报酬：\n油：0\n弹：0\n钢：0\n铝：50\n其他：舰上攻撃机九七式舰攻(村田队)\n前置：「第五航空戦队」珊瑚诸岛冲に出撃せよ！(B50)")
					.setPositiveButton("确定", null).show();
			break;
		case R.id.f20:
			builder.setTitle("F20.机种転换")
					.setMessage(
							"内容：旗舰为「翔鹤」并装备「九七式舰攻(村田队)」的情况下废弃2只「天山」\n报酬：\n油：0\n弹：0\n钢：0\n铝：50\n其他：舰上攻撃机天山一二型(村田队)\n备注：「九七式舰攻(村田队)」此装备不能上锁\n前置：「第五航空戦队」珊瑚诸岛冲に出撃せよ！(B50)")
					.setPositiveButton("确定", null).show();
			break;
		case R.id.f21:
			builder.setTitle("F21.试作舣装の准备")
					.setMessage(
							"内容：在工厂中废弃7个装备\n报酬：\n油：0\n弹：0\n钢：100\n铝：0\n其他：试制甲板カタパルト×1\n前置：机动部队の运用を强化せよ！(D19)")
					.setPositiveButton("确定", null).show();
			break;
		/***************************** ↓这里开始是改装的信息↓ *************************/
		case R.id.g1:
			builder.setTitle("G1.はじめての「近代化改修」！")
					.setMessage(
							"内容：进行近代化改修并成功1回以上\n报酬：\n油：0\n弹：0\n钢：50\n铝：50\n其他：开発资材x1")
					.setPositiveButton("确定", null).show();
			break;
		case R.id.g2:
			builder.setTitle("G2.舰の「近代化改修」を实施せよ！")
					.setMessage(
							"内容：进行近代化改修并成功2回以上\n报酬：\n油：20\n弹：20\n钢：50\n铝：0\n其他：高速修复材x1")
					.setPositiveButton("确定", null).show();
			break;
		case R.id.g3:
			builder.setTitle("G3.「近代化改修」を进め、戦备を整えよ！")
					.setMessage(
							"内容：一周内进行近代化改修并成功15回以上\n报酬：\n油：200\n弹：200\n钢：300\n铝：100\n其他：高速修复材x1，开発资材x2\n前置：舰の「近代化改修」を实施せよ！(G2)")
					.setPositiveButton("确定", null).show();
			break;
		case R.id.g4:
			builder.setTitle("G4.「大型舰建造」の准备！(その壹)")
					.setMessage(
							"内容：进行近代化改修并成功4回以上\n报酬：\n油：0\n弹：0\n钢：400\n铝：400\n其他：开発资材x1\n前置：「川内」型軽巡姊妹の全3舰を编成せよ！(A14)")
					.setPositiveButton("确定", null).show();
			break;
		/***************************** ↓这里开始是婚礼的信息↓ *************************/
		case R.id.wf01:
			builder.setTitle("WF01.式の准备！(その壹)")
					.setMessage(
							"内容：为了准备仪式，在[工厂]中进行2回废弃装备，进行身边的整理\n报酬：\n油：88\n弹：88\n钢：0\n铝：0\n其他：开発资材x1\n前置：「金刚」型による高速戦舰部队を编成せよ！(A16)")
					.setPositiveButton("确定", null).show();
			break;
		case R.id.wc01:
			builder.setTitle("WC01.式の准备！(その弐)")
					.setMessage(
							"内容：本日内[演习]取得两次胜利以上，为了仪式进行心情准备\n报酬：\n油：0\n弹：0\n钢：88\n铝：88\n其他：开発资材x1\n前置：式の准备！(その壹)（WF01）")
					.setPositiveButton("确定", null).show();
			break;
		case R.id.wa01:
			builder.setTitle("WA01.式の准备！(その参)")
					.setMessage(
							"内容：为第一舰队旗舰配置高练度（Lv90～99）的舰娘，仪式的心情准备\n报酬：\n油：88\n弹：88\n钢：88\n铝：88\n其他：家具箱(大)×1\n前置：式の准备！(その弐)（WC01）")
					.setPositiveButton("确定", null).show();
			break;
		case R.id.wb01:
			builder.setTitle("WB01.式の准备！(最终) ")
					.setMessage(
							"内容：第一舰队高练度（Lv90～99）旗舰出击2-3海域boss S胜\n报酬：\n油：0\n弹：0\n钢：0\n铝：0\n其他：书类一式&指轮×1\n备注：旗舰Lv100以上无法完成\n前置：式の准备！(その参)（WA01）")
					.setPositiveButton("确定", null).show();
			break;
		case R.id.wa02:
			builder.setTitle("WA02.新たなる旅立ち！")
					.setMessage(
							"内容：为第一舰队旗舰配置具有深刻羁绊的Lv100以上的舰娘并编成有6艘舰娘的舰队\n报酬：\n油：200\n弹：200\n钢：200\n铝：200\n其他：応急修理要员×1\n前置：式の准备！(最终)（WB01）")
					.setPositiveButton("确定", null).show();
			break;
		case R.id.wb02:
			builder.setTitle("WB02.二人でする初めての任务！")
					.setMessage(
							"内容：Lv100以上舰娘作为旗舰出击4-3海域boss S胜\n报酬：\n油：300\n弹：300\n钢：300\n铝：300\n其他：シークレット家具(煎饼布団)\n前置：新たなる旅立ち！（WA02）")
					.setPositiveButton("确定", null).show();
			break;
	
		default:
			Toast.makeText(this, "暂未录入", Toast.LENGTH_SHORT).show();
			break;
		}
	}
}
