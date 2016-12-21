package com.android.wikiforkancolle;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

public class shiptype extends Activity {

	private ImageButton back;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		// ��ȡҳ����ת��Ϣ����
		Intent intent_ship = getIntent();
		switch (intent_ship.getExtras().getInt("shipType")) {
		case R.id.AS:
			setContentView(R.layout.as);
			ImageButton taigei = (ImageButton) findViewById(R.id.taigei);
			taigei.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent intent_shipdetails = new Intent(shiptype.this,
							Activity_ship.class);
					intent_shipdetails.putExtra("shipdata", R.id.taigei);
					startActivity(intent_shipdetails);
				}
			});
			break;
		case R.id.AV:
			setContentView(R.layout.av);
			ImageButton chitose = (ImageButton) findViewById(R.id.chitose);
			chitose.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent intent_shipdetails = new Intent(shiptype.this,
							Activity_ship.class);
					intent_shipdetails.putExtra("shipdata", R.id.chitose);
					startActivity(intent_shipdetails);
				}
			});
			ImageButton chiyoda = (ImageButton) findViewById(R.id.chiyoda);
			chiyoda.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent intent_shipdetails = new Intent(shiptype.this,
							Activity_ship.class);
					intent_shipdetails.putExtra("shipdata", R.id.chiyoda);
					startActivity(intent_shipdetails);
				}
			});
			ImageButton akitsushima = (ImageButton) findViewById(R.id.akitsushima);
			akitsushima.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent intent_shipdetails = new Intent(shiptype.this,
							Activity_ship.class);
					intent_shipdetails.putExtra("shipdata", R.id.akitsushima);
					startActivity(intent_shipdetails);
				}
			});
			ImageButton zuiho = (ImageButton) findViewById(R.id.mitsuhou);
			zuiho.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent intent_shipdetails = new Intent(shiptype.this,
							Activity_ship.class);
					intent_shipdetails.putExtra("shipdata", R.id.mitsuhou);
					startActivity(intent_shipdetails);
				}
			});
			break;
		case R.id.BB:
			setContentView(R.layout.bb);
			ImageButton nagato = (ImageButton) findViewById(R.id.nagato);
			nagato.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent intent_shipdetails = new Intent(shiptype.this,
							Activity_ship.class);
					intent_shipdetails.putExtra("shipdata", R.id.nagato);
					startActivity(intent_shipdetails);
				}
			});
			ImageButton mutsu = (ImageButton) findViewById(R.id.mutsu);
			mutsu.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent intent_shipdetails = new Intent(shiptype.this,
							Activity_ship.class);
					intent_shipdetails.putExtra("shipdata", R.id.mutsu);
					startActivity(intent_shipdetails);
				}
			});
			ImageButton fusou = (ImageButton) findViewById(R.id.fusou);
			fusou.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent intent_shipdetails = new Intent(shiptype.this,
							Activity_ship.class);
					intent_shipdetails.putExtra("shipdata", R.id.fusou);
					startActivity(intent_shipdetails);
				}
			});
			ImageButton yamashiro = (ImageButton) findViewById(R.id.yamashiro);
			yamashiro.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent intent_shipdetails = new Intent(shiptype.this,
							Activity_ship.class);
					intent_shipdetails.putExtra("shipdata", R.id.yamashiro);
					startActivity(intent_shipdetails);
				}
			});
			ImageButton ise = (ImageButton) findViewById(R.id.ise);
			ise.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent intent_shipdetails = new Intent(shiptype.this,
							Activity_ship.class);
					intent_shipdetails.putExtra("shipdata", R.id.ise);
					startActivity(intent_shipdetails);
				}
			});
			ImageButton hyuuga = (ImageButton) findViewById(R.id.hyuuga);
			hyuuga.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent intent_shipdetails = new Intent(shiptype.this,
							Activity_ship.class);
					intent_shipdetails.putExtra("shipdata", R.id.hyuuga);
					startActivity(intent_shipdetails);
				}
			});
			ImageButton kongou = (ImageButton) findViewById(R.id.kongou);
			kongou.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent intent_shipdetails = new Intent(shiptype.this,
							Activity_ship.class);
					intent_shipdetails.putExtra("shipdata", R.id.kongou);
					startActivity(intent_shipdetails);
				}
			});
			ImageButton hiei = (ImageButton) findViewById(R.id.hiei);
			hiei.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent intent_shipdetails = new Intent(shiptype.this,
							Activity_ship.class);
					intent_shipdetails.putExtra("shipdata", R.id.hiei);
					startActivity(intent_shipdetails);
				}
			});
			ImageButton haruna = (ImageButton) findViewById(R.id.haruna);
			haruna.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent intent_shipdetails = new Intent(shiptype.this,
							Activity_ship.class);
					intent_shipdetails.putExtra("shipdata", R.id.haruna);
					startActivity(intent_shipdetails);
				}
			});
			ImageButton kirishima = (ImageButton) findViewById(R.id.kirishima);
			kirishima.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent intent_shipdetails = new Intent(shiptype.this,
							Activity_ship.class);
					intent_shipdetails.putExtra("shipdata", R.id.kirishima);
					startActivity(intent_shipdetails);
				}
			});
			ImageButton yamato = (ImageButton) findViewById(R.id.yamato);
			yamato.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent intent_shipdetails = new Intent(shiptype.this,
							Activity_ship.class);
					intent_shipdetails.putExtra("shipdata", R.id.yamato);
					startActivity(intent_shipdetails);
				}
			});
			ImageButton musashi = (ImageButton) findViewById(R.id.musashi);
			musashi.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent intent_shipdetails = new Intent(shiptype.this,
							Activity_ship.class);
					intent_shipdetails.putExtra("shipdata", R.id.musashi);
					startActivity(intent_shipdetails);
				}
			});
			ImageButton bismarck = (ImageButton) findViewById(R.id.bismarck);
			bismarck.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent intent_shipdetails = new Intent(shiptype.this,
							Activity_ship.class);
					intent_shipdetails.putExtra("shipdata", R.id.bismarck);
					startActivity(intent_shipdetails);
				}
			});
			ImageButton littorio = (ImageButton) findViewById(R.id.littorio);
			littorio.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent intent_shipdetails = new Intent(shiptype.this,
							Activity_ship.class);
					intent_shipdetails.putExtra("shipdata", R.id.littorio);
					startActivity(intent_shipdetails);
				}
			});
			ImageButton roma = (ImageButton) findViewById(R.id.roma);
			roma.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent intent_shipdetails = new Intent(shiptype.this,
							Activity_ship.class);
					intent_shipdetails.putExtra("shipdata", R.id.roma);
					startActivity(intent_shipdetails);
				}
			});
			break;
		case R.id.CA:
			setContentView(R.layout.ca);
			ImageButton furutaka = (ImageButton) findViewById(R.id.furutaka);
			furutaka.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent intent_shipdetails = new Intent(shiptype.this,
							Activity_ship.class);
					intent_shipdetails.putExtra("shipdata", R.id.furutaka);
					startActivity(intent_shipdetails);
				}
			});
			ImageButton kako = (ImageButton) findViewById(R.id.kako);
			kako.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent intent_shipdetails = new Intent(shiptype.this,
							Activity_ship.class);
					intent_shipdetails.putExtra("shipdata", R.id.kako);
					startActivity(intent_shipdetails);
				}
			});
			ImageButton aoba = (ImageButton) findViewById(R.id.aoba);
			aoba.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent intent_shipdetails = new Intent(shiptype.this,
							Activity_ship.class);
					intent_shipdetails.putExtra("shipdata", R.id.aoba);
					startActivity(intent_shipdetails);
				}
			});
			ImageButton kinugasa = (ImageButton) findViewById(R.id.kinugasa);
			kinugasa.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent intent_shipdetails = new Intent(shiptype.this,
							Activity_ship.class);
					intent_shipdetails.putExtra("shipdata", R.id.kinugasa);
					startActivity(intent_shipdetails);
				}
			});
			ImageButton myoukou = (ImageButton) findViewById(R.id.myoukou);
			myoukou.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent intent_shipdetails = new Intent(shiptype.this,
							Activity_ship.class);
					intent_shipdetails.putExtra("shipdata", R.id.myoukou);
					startActivity(intent_shipdetails);
				}
			});
			ImageButton nachi = (ImageButton) findViewById(R.id.nachi);
			nachi.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent intent_shipdetails = new Intent(shiptype.this,
							Activity_ship.class);
					intent_shipdetails.putExtra("shipdata", R.id.nachi);
					startActivity(intent_shipdetails);
				}
			});
			ImageButton ashigara = (ImageButton) findViewById(R.id.ashigara);
			ashigara.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent intent_shipdetails = new Intent(shiptype.this,
							Activity_ship.class);
					intent_shipdetails.putExtra("shipdata", R.id.ashigara);
					startActivity(intent_shipdetails);
				}
			});
			ImageButton haguro = (ImageButton) findViewById(R.id.haguro);
			haguro.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent intent_shipdetails = new Intent(shiptype.this,
							Activity_ship.class);
					intent_shipdetails.putExtra("shipdata", R.id.haguro);
					startActivity(intent_shipdetails);
				}
			});
			ImageButton takao = (ImageButton) findViewById(R.id.takao);
			takao.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent intent_shipdetails = new Intent(shiptype.this,
							Activity_ship.class);
					intent_shipdetails.putExtra("shipdata", R.id.takao);
					startActivity(intent_shipdetails);
				}
			});
			ImageButton atago = (ImageButton) findViewById(R.id.atago);
			atago.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent intent_shipdetails = new Intent(shiptype.this,
							Activity_ship.class);
					intent_shipdetails.putExtra("shipdata", R.id.atago);
					startActivity(intent_shipdetails);
				}
			});
			ImageButton maya = (ImageButton) findViewById(R.id.maya);
			maya.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent intent_shipdetails = new Intent(shiptype.this,
							Activity_ship.class);
					intent_shipdetails.putExtra("shipdata", R.id.maya);
					startActivity(intent_shipdetails);
				}
			});
			ImageButton chyoukai = (ImageButton) findViewById(R.id.chyoukai);
			chyoukai.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent intent_shipdetails = new Intent(shiptype.this,
							Activity_ship.class);
					intent_shipdetails.putExtra("shipdata", R.id.chyoukai);
					startActivity(intent_shipdetails);
				}
			});
			ImageButton mogami = (ImageButton) findViewById(R.id.mogami);
			mogami.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent intent_shipdetails = new Intent(shiptype.this,
							Activity_ship.class);
					intent_shipdetails.putExtra("shipdata", R.id.mogami);
					startActivity(intent_shipdetails);
				}
			});
			ImageButton mikuma = (ImageButton) findViewById(R.id.mikuma);
			mikuma.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent intent_shipdetails = new Intent(shiptype.this,
							Activity_ship.class);
					intent_shipdetails.putExtra("shipdata", R.id.mikuma);
					startActivity(intent_shipdetails);
				}
			});
			ImageButton suzuya = (ImageButton) findViewById(R.id.suzuya);
			suzuya.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent intent_shipdetails = new Intent(shiptype.this,
							Activity_ship.class);
					intent_shipdetails.putExtra("shipdata", R.id.suzuya);
					startActivity(intent_shipdetails);
				}
			});
			ImageButton kumano = (ImageButton) findViewById(R.id.kumano);
			kumano.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent intent_shipdetails = new Intent(shiptype.this,
							Activity_ship.class);
					intent_shipdetails.putExtra("shipdata", R.id.kumano);
					startActivity(intent_shipdetails);
				}
			});
			ImageButton tone = (ImageButton) findViewById(R.id.tone);
			tone.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent intent_shipdetails = new Intent(shiptype.this,
							Activity_ship.class);
					intent_shipdetails.putExtra("shipdata", R.id.tone);
					startActivity(intent_shipdetails);
				}
			});
			ImageButton chikuma = (ImageButton) findViewById(R.id.chikuma);
			chikuma.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent intent_shipdetails = new Intent(shiptype.this,
							Activity_ship.class);
					intent_shipdetails.putExtra("shipdata", R.id.chikuma);
					startActivity(intent_shipdetails);
				}
			});
			ImageButton eugen = (ImageButton) findViewById(R.id.eugen);
			eugen.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent intent_shipdetails = new Intent(shiptype.this,
							Activity_ship.class);
					intent_shipdetails.putExtra("shipdata", R.id.eugen);
					startActivity(intent_shipdetails);
				}
			});
			ImageButton zara = (ImageButton) findViewById(R.id.zara);
			zara.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent intent_shipdetails = new Intent(shiptype.this,
							Activity_ship.class);
					intent_shipdetails.putExtra("shipdata", R.id.zara);
					startActivity(intent_shipdetails);
				}
			});
			break;
		case R.id.CL:
			setContentView(R.layout.cl);
			ImageButton nagara = (ImageButton) findViewById(R.id.nagara);
			nagara.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent intent_shipdetails = new Intent(shiptype.this,
							Activity_ship.class);
					intent_shipdetails.putExtra("shipdata", R.id.nagara);
					startActivity(intent_shipdetails);
				}
			});
			ImageButton itsuzu = (ImageButton) findViewById(R.id.itsuzu);
			itsuzu.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent intent_shipdetails = new Intent(shiptype.this,
							Activity_ship.class);
					intent_shipdetails.putExtra("shipdata", R.id.itsuzu);
					startActivity(intent_shipdetails);
				}
			});
			ImageButton natori = (ImageButton) findViewById(R.id.natori);
			natori.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent intent_shipdetails = new Intent(shiptype.this,
							Activity_ship.class);
					intent_shipdetails.putExtra("shipdata", R.id.natori);
					startActivity(intent_shipdetails);
				}
			});
			ImageButton yura = (ImageButton) findViewById(R.id.yura);
			yura.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent intent_shipdetails = new Intent(shiptype.this,
							Activity_ship.class);
					intent_shipdetails.putExtra("shipdata", R.id.yura);
					startActivity(intent_shipdetails);
				}
			});
			ImageButton kinu = (ImageButton) findViewById(R.id.kinu);
			kinu.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent intent_shipdetails = new Intent(shiptype.this,
							Activity_ship.class);
					intent_shipdetails.putExtra("shipdata", R.id.kinu);
					startActivity(intent_shipdetails);
				}
			});
			ImageButton abukuma = (ImageButton) findViewById(R.id.abukuma);
			abukuma.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent intent_shipdetails = new Intent(shiptype.this,
							Activity_ship.class);
					intent_shipdetails.putExtra("shipdata", R.id.abukuma);
					startActivity(intent_shipdetails);
				}
			});
			ImageButton kuma = (ImageButton) findViewById(R.id.kuma);
			kuma.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent intent_shipdetails = new Intent(shiptype.this,
							Activity_ship.class);
					intent_shipdetails.putExtra("shipdata", R.id.kuma);
					startActivity(intent_shipdetails);
				}
			});
			ImageButton tama = (ImageButton) findViewById(R.id.tama);
			tama.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent intent_shipdetails = new Intent(shiptype.this,
							Activity_ship.class);
					intent_shipdetails.putExtra("shipdata", R.id.tama);
					startActivity(intent_shipdetails);
				}
			});
			ImageButton kitakami = (ImageButton) findViewById(R.id.kitakami);
			kitakami.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent intent_shipdetails = new Intent(shiptype.this,
							Activity_ship.class);
					intent_shipdetails.putExtra("shipdata", R.id.kitakami);
					startActivity(intent_shipdetails);
				}
			});
			ImageButton ooi = (ImageButton) findViewById(R.id.ooi);
			ooi.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent intent_shipdetails = new Intent(shiptype.this,
							Activity_ship.class);
					intent_shipdetails.putExtra("shipdata", R.id.ooi);
					startActivity(intent_shipdetails);
				}
			});
			ImageButton kiso = (ImageButton) findViewById(R.id.kiso);
			kiso.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent intent_shipdetails = new Intent(shiptype.this,
							Activity_ship.class);
					intent_shipdetails.putExtra("shipdata", R.id.kiso);
					startActivity(intent_shipdetails);
				}
			});
			ImageButton tenryuu = (ImageButton) findViewById(R.id.tenryuu);
			tenryuu.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent intent_shipdetails = new Intent(shiptype.this,
							Activity_ship.class);
					intent_shipdetails.putExtra("shipdata", R.id.tenryuu);
					startActivity(intent_shipdetails);
				}
			});
			ImageButton tatsuta = (ImageButton) findViewById(R.id.tatsuta);
			tatsuta.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent intent_shipdetails = new Intent(shiptype.this,
							Activity_ship.class);
					intent_shipdetails.putExtra("shipdata", R.id.tatsuta);
					startActivity(intent_shipdetails);
				}
			});
			ImageButton sendai = (ImageButton) findViewById(R.id.sendai);
			sendai.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent intent_shipdetails = new Intent(shiptype.this,
							Activity_ship.class);
					intent_shipdetails.putExtra("shipdata", R.id.sendai);
					startActivity(intent_shipdetails);
				}
			});
			ImageButton jintsuu = (ImageButton) findViewById(R.id.jintsuu);
			jintsuu.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent intent_shipdetails = new Intent(shiptype.this,
							Activity_ship.class);
					intent_shipdetails.putExtra("shipdata", R.id.jintsuu);
					startActivity(intent_shipdetails);
				}
			});
			ImageButton naka = (ImageButton) findViewById(R.id.naka);
			naka.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent intent_shipdetails = new Intent(shiptype.this,
							Activity_ship.class);
					intent_shipdetails.putExtra("shipdata", R.id.naka);
					startActivity(intent_shipdetails);
				}
			});
			ImageButton yuubari = (ImageButton) findViewById(R.id.yuubari);
			yuubari.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent intent_shipdetails = new Intent(shiptype.this,
							Activity_ship.class);
					intent_shipdetails.putExtra("shipdata", R.id.yuubari);
					startActivity(intent_shipdetails);
				}
			});
			ImageButton agano = (ImageButton) findViewById(R.id.agano);
			agano.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent intent_shipdetails = new Intent(shiptype.this,
							Activity_ship.class);
					intent_shipdetails.putExtra("shipdata", R.id.agano);
					startActivity(intent_shipdetails);
				}
			});
			ImageButton noshiro = (ImageButton) findViewById(R.id.noshiro);
			noshiro.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent intent_shipdetails = new Intent(shiptype.this,
							Activity_ship.class);
					intent_shipdetails.putExtra("shipdata", R.id.noshiro);
					startActivity(intent_shipdetails);
				}
			});
			ImageButton yahagi = (ImageButton) findViewById(R.id.yahagi);
			yahagi.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent intent_shipdetails = new Intent(shiptype.this,
							Activity_ship.class);
					intent_shipdetails.putExtra("shipdata", R.id.yahagi);
					startActivity(intent_shipdetails);
				}
			});
			ImageButton sakawa = (ImageButton) findViewById(R.id.sakawa);
			sakawa.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent intent_shipdetails = new Intent(shiptype.this,
							Activity_ship.class);
					intent_shipdetails.putExtra("shipdata", R.id.sakawa);
					startActivity(intent_shipdetails);
				}
			});
			ImageButton ooyodo = (ImageButton) findViewById(R.id.ooyodo);
			ooyodo.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent intent_shipdetails = new Intent(shiptype.this,
							Activity_ship.class);
					intent_shipdetails.putExtra("shipdata", R.id.ooyodo);
					startActivity(intent_shipdetails);
				}
			});
			break;
		case R.id.CLT:
			setContentView(R.layout.clt);
			ImageButton kitakamiCLT = (ImageButton) findViewById(R.id.kitakami);
			kitakamiCLT.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent intent_shipdetails = new Intent(shiptype.this,
							Activity_ship.class);
					intent_shipdetails.putExtra("shipdata", R.id.kitakami);
					startActivity(intent_shipdetails);
				}
			});
			ImageButton ooiCLT = (ImageButton) findViewById(R.id.ooi);
			ooiCLT.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent intent_shipdetails = new Intent(shiptype.this,
							Activity_ship.class);
					intent_shipdetails.putExtra("shipdata", R.id.ooi);
					startActivity(intent_shipdetails);
				}
			});
			ImageButton kisoCLT = (ImageButton) findViewById(R.id.kiso);
			kisoCLT.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent intent_shipdetails = new Intent(shiptype.this,
							Activity_ship.class);
					intent_shipdetails.putExtra("shipdata", R.id.kiso);
					startActivity(intent_shipdetails);
				}
			});
			break;
		case R.id.CV:
			setContentView(R.layout.cv);
			ImageButton akagi = (ImageButton) findViewById(R.id.akagi);
			akagi.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent intent_shipdetails = new Intent(shiptype.this,
							Activity_ship.class);
					intent_shipdetails.putExtra("shipdata", R.id.akagi);
					startActivity(intent_shipdetails);
				}
			});
			ImageButton kaga = (ImageButton) findViewById(R.id.kaga);
			kaga.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent intent_shipdetails = new Intent(shiptype.this,
							Activity_ship.class);
					intent_shipdetails.putExtra("shipdata", R.id.kaga);
					startActivity(intent_shipdetails);
				}
			});
			ImageButton souryuu = (ImageButton) findViewById(R.id.souryuu);
			souryuu.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent intent_shipdetails = new Intent(shiptype.this,
							Activity_ship.class);
					intent_shipdetails.putExtra("shipdata", R.id.souryuu);
					startActivity(intent_shipdetails);
				}
			});
			ImageButton hiryuu = (ImageButton) findViewById(R.id.hiryuu);
			hiryuu.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent intent_shipdetails = new Intent(shiptype.this,
							Activity_ship.class);
					intent_shipdetails.putExtra("shipdata", R.id.hiryuu);
					startActivity(intent_shipdetails);
				}
			});
			ImageButton shyoukaku = (ImageButton) findViewById(R.id.shyoukaku);
			shyoukaku.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent intent_shipdetails = new Intent(shiptype.this,
							Activity_ship.class);
					intent_shipdetails.putExtra("shipdata", R.id.shyoukaku);
					startActivity(intent_shipdetails);
				}
			});
			ImageButton zuikaku = (ImageButton) findViewById(R.id.zuikaku);
			zuikaku.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent intent_shipdetails = new Intent(shiptype.this,
							Activity_ship.class);
					intent_shipdetails.putExtra("shipdata", R.id.zuikaku);
					startActivity(intent_shipdetails);
				}
			});
			ImageButton taihou = (ImageButton) findViewById(R.id.taihou);
			taihou.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent intent_shipdetails = new Intent(shiptype.this,
							Activity_ship.class);
					intent_shipdetails.putExtra("shipdata", R.id.taihou);
					startActivity(intent_shipdetails);
				}
			});
			ImageButton unryuu = (ImageButton) findViewById(R.id.unryuu);
			unryuu.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent intent_shipdetails = new Intent(shiptype.this,
							Activity_ship.class);
					intent_shipdetails.putExtra("shipdata", R.id.unryuu);
					startActivity(intent_shipdetails);
				}
			});
			ImageButton amagi = (ImageButton) findViewById(R.id.amagi);
			amagi.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent intent_shipdetails = new Intent(shiptype.this,
							Activity_ship.class);
					intent_shipdetails.putExtra("shipdata", R.id.amagi);
					startActivity(intent_shipdetails);
				}
			});
			ImageButton katsuragi = (ImageButton) findViewById(R.id.katsuragi);
			katsuragi.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent intent_shipdetails = new Intent(shiptype.this,
							Activity_ship.class);
					intent_shipdetails.putExtra("shipdata", R.id.katsuragi);
					startActivity(intent_shipdetails);
				}
			});
			ImageButton GrafZeppelin = (ImageButton) findViewById(R.id.GrafZeppelin);
			GrafZeppelin.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent intent_shipdetails = new Intent(shiptype.this,
							Activity_ship.class);
					intent_shipdetails.putExtra("shipdata", R.id.GrafZeppelin);
					startActivity(intent_shipdetails);
				}
			});
			break;
		case R.id.CVL:
			setContentView(R.layout.cvl);
			ImageButton shyouhou = (ImageButton) findViewById(R.id.shyouhou);
			shyouhou.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent intent_shipdetails = new Intent(shiptype.this,
							Activity_ship.class);
					intent_shipdetails.putExtra("shipdata", R.id.shyouhou);
					startActivity(intent_shipdetails);
				}
			});
			ImageButton zuihou = (ImageButton) findViewById(R.id.zuihou);
			zuihou.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent intent_shipdetails = new Intent(shiptype.this,
							Activity_ship.class);
					intent_shipdetails.putExtra("shipdata", R.id.zuihou);
					startActivity(intent_shipdetails);
				}
			});
			ImageButton jyunyou = (ImageButton) findViewById(R.id.jyunyou);
			jyunyou.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent intent_shipdetails = new Intent(shiptype.this,
							Activity_ship.class);
					intent_shipdetails.putExtra("shipdata", R.id.jyunyou);
					startActivity(intent_shipdetails);
				}
			});
			ImageButton hiyou = (ImageButton) findViewById(R.id.hiyou);
			hiyou.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent intent_shipdetails = new Intent(shiptype.this,
							Activity_ship.class);
					intent_shipdetails.putExtra("shipdata", R.id.hiyou);
					startActivity(intent_shipdetails);
				}
			});
			ImageButton ryuujyou = (ImageButton) findViewById(R.id.ryuujyou);
			ryuujyou.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent intent_shipdetails = new Intent(shiptype.this,
							Activity_ship.class);
					intent_shipdetails.putExtra("shipdata", R.id.ryuujyou);
					startActivity(intent_shipdetails);
				}
			});
			ImageButton houshyou = (ImageButton) findViewById(R.id.houshyou);
			houshyou.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent intent_shipdetails = new Intent(shiptype.this,
							Activity_ship.class);
					intent_shipdetails.putExtra("shipdata", R.id.houshyou);
					startActivity(intent_shipdetails);
				}
			});
			ImageButton chitoseCVL = (ImageButton) findViewById(R.id.chitose);
			chitoseCVL.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent intent_shipdetails = new Intent(shiptype.this,
							Activity_ship.class);
					intent_shipdetails.putExtra("shipdata", R.id.chitose);
					startActivity(intent_shipdetails);
				}
			});
			ImageButton chiyodaCVL = (ImageButton) findViewById(R.id.chiyoda);
			chiyodaCVL.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent intent_shipdetails = new Intent(shiptype.this,
							Activity_ship.class);
					intent_shipdetails.putExtra("shipdata", R.id.chiyoda);
					startActivity(intent_shipdetails);
				}
			});
			ImageButton ryuuhou = (ImageButton) findViewById(R.id.ryuuhou);
			ryuuhou.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent intent_shipdetails = new Intent(shiptype.this,
							Activity_ship.class);
					intent_shipdetails.putExtra("shipdata", R.id.ryuuhou);
					startActivity(intent_shipdetails);
				}
			});
			break;
		case R.id.DD:
			setContentView(R.layout.dd);
			ImageButton mutsuki = (ImageButton) findViewById(R.id.mutsuki);
			mutsuki.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent intent_shipdetails = new Intent(shiptype.this,
							Activity_ship.class);
					intent_shipdetails.putExtra("shipdata", R.id.mutsuki);
					startActivity(intent_shipdetails);
				}
			});
			ImageButton kisaragi = (ImageButton) findViewById(R.id.kisaragi);
			kisaragi.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent intent_shipdetails = new Intent(shiptype.this,
							Activity_ship.class);
					intent_shipdetails.putExtra("shipdata", R.id.kisaragi);
					startActivity(intent_shipdetails);
				}
			});
			ImageButton yayoi = (ImageButton) findViewById(R.id.yayoi);
			yayoi.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent intent_shipdetails = new Intent(shiptype.this,
							Activity_ship.class);
					intent_shipdetails.putExtra("shipdata", R.id.yayoi);
					startActivity(intent_shipdetails);
				}
			});
			ImageButton uzuki = (ImageButton) findViewById(R.id.uzuki);
			uzuki.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent intent_shipdetails = new Intent(shiptype.this,
							Activity_ship.class);
					intent_shipdetails.putExtra("shipdata", R.id.uzuki);
					startActivity(intent_shipdetails);
				}
			});
			ImageButton satsuki = (ImageButton) findViewById(R.id.satsuki);
			satsuki.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent intent_shipdetails = new Intent(shiptype.this,
							Activity_ship.class);
					intent_shipdetails.putExtra("shipdata", R.id.satsuki);
					startActivity(intent_shipdetails);
				}
			});
			ImageButton fumizuki = (ImageButton) findViewById(R.id.fumizuki);
			fumizuki.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent intent_shipdetails = new Intent(shiptype.this,
							Activity_ship.class);
					intent_shipdetails.putExtra("shipdata", R.id.fumizuki);
					startActivity(intent_shipdetails);
				}
			});
			ImageButton nagatsuki = (ImageButton) findViewById(R.id.nagatsuki);
			nagatsuki.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent intent_shipdetails = new Intent(shiptype.this,
							Activity_ship.class);
					intent_shipdetails.putExtra("shipdata", R.id.nagatsuki);
					startActivity(intent_shipdetails);
				}
			});
			ImageButton kikuzuki = (ImageButton) findViewById(R.id.kikuzuki);
			kikuzuki.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent intent_shipdetails = new Intent(shiptype.this,
							Activity_ship.class);
					intent_shipdetails.putExtra("shipdata", R.id.kikuzuki);
					startActivity(intent_shipdetails);
				}
			});
			ImageButton mikazuki = (ImageButton) findViewById(R.id.mikazuki);
			mikazuki.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent intent_shipdetails = new Intent(shiptype.this,
							Activity_ship.class);
					intent_shipdetails.putExtra("shipdata", R.id.mikazuki);
					startActivity(intent_shipdetails);
				}
			});
			ImageButton mochizuki = (ImageButton) findViewById(R.id.mochizuki);
			mochizuki.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent intent_shipdetails = new Intent(shiptype.this,
							Activity_ship.class);
					intent_shipdetails.putExtra("shipdata", R.id.mochizuki);
					startActivity(intent_shipdetails);
				}
			});
			ImageButton fubuki = (ImageButton) findViewById(R.id.fubuki);
			fubuki.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent intent_shipdetails = new Intent(shiptype.this,
							Activity_ship.class);
					intent_shipdetails.putExtra("shipdata", R.id.fubuki);
					startActivity(intent_shipdetails);
				}
			});
			ImageButton shirayuki = (ImageButton) findViewById(R.id.shirayuki);
			shirayuki.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent intent_shipdetails = new Intent(shiptype.this,
							Activity_ship.class);
					intent_shipdetails.putExtra("shipdata", R.id.shirayuki);
					startActivity(intent_shipdetails);
				}
			});
			ImageButton hatsuyuki = (ImageButton) findViewById(R.id.hatsuyuki);
			hatsuyuki.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent intent_shipdetails = new Intent(shiptype.this,
							Activity_ship.class);
					intent_shipdetails.putExtra("shipdata", R.id.hatsuyuki);
					startActivity(intent_shipdetails);
				}
			});
			ImageButton miyuki = (ImageButton) findViewById(R.id.miyuki);
			miyuki.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent intent_shipdetails = new Intent(shiptype.this,
							Activity_ship.class);
					intent_shipdetails.putExtra("shipdata", R.id.miyuki);
					startActivity(intent_shipdetails);
				}
			});
			ImageButton murakumu = (ImageButton) findViewById(R.id.murakumu);
			murakumu.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent intent_shipdetails = new Intent(shiptype.this,
							Activity_ship.class);
					intent_shipdetails.putExtra("shipdata", R.id.murakumu);
					startActivity(intent_shipdetails);
				}
			});
			ImageButton isonami = (ImageButton) findViewById(R.id.isonami);
			isonami.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent intent_shipdetails = new Intent(shiptype.this,
							Activity_ship.class);
					intent_shipdetails.putExtra("shipdata", R.id.isonami);
					startActivity(intent_shipdetails);
				}
			});
			ImageButton ayanami = (ImageButton) findViewById(R.id.ayanami);
			ayanami.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent intent_shipdetails = new Intent(shiptype.this,
							Activity_ship.class);
					intent_shipdetails.putExtra("shipdata", R.id.ayanami);
					startActivity(intent_shipdetails);
				}
			});
			ImageButton shikinami = (ImageButton) findViewById(R.id.shikinami);
			shikinami.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent intent_shipdetails = new Intent(shiptype.this,
							Activity_ship.class);
					intent_shipdetails.putExtra("shipdata", R.id.shikinami);
					startActivity(intent_shipdetails);
				}
			});
			ImageButton oboro = (ImageButton) findViewById(R.id.oboro);
			oboro.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent intent_shipdetails = new Intent(shiptype.this,
							Activity_ship.class);
					intent_shipdetails.putExtra("shipdata", R.id.oboro);
					startActivity(intent_shipdetails);
				}
			});
			ImageButton akebono = (ImageButton) findViewById(R.id.akebono);
			akebono.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent intent_shipdetails = new Intent(shiptype.this,
							Activity_ship.class);
					intent_shipdetails.putExtra("shipdata", R.id.akebono);
					startActivity(intent_shipdetails);
				}
			});
			ImageButton sazanami = (ImageButton) findViewById(R.id.sazanami);
			sazanami.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent intent_shipdetails = new Intent(shiptype.this,
							Activity_ship.class);
					intent_shipdetails.putExtra("shipdata", R.id.sazanami);
					startActivity(intent_shipdetails);
				}
			});
			ImageButton ushio = (ImageButton) findViewById(R.id.ushio);
			ushio.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent intent_shipdetails = new Intent(shiptype.this,
							Activity_ship.class);
					intent_shipdetails.putExtra("shipdata", R.id.ushio);
					startActivity(intent_shipdetails);
				}
			});
			ImageButton kagerou = (ImageButton) findViewById(R.id.kagerou);
			kagerou.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent intent_shipdetails = new Intent(shiptype.this,
							Activity_ship.class);
					intent_shipdetails.putExtra("shipdata", R.id.kagerou);
					startActivity(intent_shipdetails);
				}
			});
			ImageButton shiranui = (ImageButton) findViewById(R.id.shiranui);
			shiranui.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent intent_shipdetails = new Intent(shiptype.this,
							Activity_ship.class);
					intent_shipdetails.putExtra("shipdata", R.id.shiranui);
					startActivity(intent_shipdetails);
				}
			});
			ImageButton kuroshio = (ImageButton) findViewById(R.id.kuroshio);
			kuroshio.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent intent_shipdetails = new Intent(shiptype.this,
							Activity_ship.class);
					intent_shipdetails.putExtra("shipdata", R.id.kuroshio);
					startActivity(intent_shipdetails);
				}
			});
			ImageButton hatsukaze = (ImageButton) findViewById(R.id.hatsukaze);
			hatsukaze.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent intent_shipdetails = new Intent(shiptype.this,
							Activity_ship.class);
					intent_shipdetails.putExtra("shipdata", R.id.hatsukaze);
					startActivity(intent_shipdetails);
				}
			});
			ImageButton yukikaze = (ImageButton) findViewById(R.id.yukikaze);
			yukikaze.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent intent_shipdetails = new Intent(shiptype.this,
							Activity_ship.class);
					intent_shipdetails.putExtra("shipdata", R.id.yukikaze);
					startActivity(intent_shipdetails);
				}
			});
			ImageButton amatsukaze = (ImageButton) findViewById(R.id.amatsukaze);
			amatsukaze.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent intent_shipdetails = new Intent(shiptype.this,
							Activity_ship.class);
					intent_shipdetails.putExtra("shipdata", R.id.amatsukaze);
					startActivity(intent_shipdetails);
				}
			});
			ImageButton tokitsukaze = (ImageButton) findViewById(R.id.tokitsukaze);
			tokitsukaze.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent intent_shipdetails = new Intent(shiptype.this,
							Activity_ship.class);
					intent_shipdetails.putExtra("shipdata", R.id.tokitsukaze);
					startActivity(intent_shipdetails);
				}
			});
			ImageButton urakaze = (ImageButton) findViewById(R.id.urakaze);
			urakaze.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent intent_shipdetails = new Intent(shiptype.this,
							Activity_ship.class);
					intent_shipdetails.putExtra("shipdata", R.id.urakaze);
					startActivity(intent_shipdetails);
				}
			});
			ImageButton isokaze = (ImageButton) findViewById(R.id.isokaze);
			isokaze.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent intent_shipdetails = new Intent(shiptype.this,
							Activity_ship.class);
					intent_shipdetails.putExtra("shipdata", R.id.isokaze);
					startActivity(intent_shipdetails);
				}
			});
			ImageButton hamakaze = (ImageButton) findViewById(R.id.hamakaze);
			hamakaze.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent intent_shipdetails = new Intent(shiptype.this,
							Activity_ship.class);
					intent_shipdetails.putExtra("shipdata", R.id.hamakaze);
					startActivity(intent_shipdetails);
				}
			});
			ImageButton tanikaze = (ImageButton) findViewById(R.id.tanikaze);
			tanikaze.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent intent_shipdetails = new Intent(shiptype.this,
							Activity_ship.class);
					intent_shipdetails.putExtra("shipdata", R.id.tanikaze);
					startActivity(intent_shipdetails);
				}
			});
			ImageButton nowaki = (ImageButton) findViewById(R.id.nowaki);
			nowaki.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent intent_shipdetails = new Intent(shiptype.this,
							Activity_ship.class);
					intent_shipdetails.putExtra("shipdata", R.id.nowaki);
					startActivity(intent_shipdetails);
				}
			});
			ImageButton maikaze = (ImageButton) findViewById(R.id.maikaze);
			maikaze.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent intent_shipdetails = new Intent(shiptype.this,
							Activity_ship.class);
					intent_shipdetails.putExtra("shipdata", R.id.maikaze);
					startActivity(intent_shipdetails);
				}
			});
			ImageButton akigumo = (ImageButton) findViewById(R.id.akigumo);
			akigumo.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent intent_shipdetails = new Intent(shiptype.this,
							Activity_ship.class);
					intent_shipdetails.putExtra("shipdata", R.id.akigumo);
					startActivity(intent_shipdetails);
				}
			});
			ImageButton hagikaze = (ImageButton) findViewById(R.id.hagikaze);
			hagikaze.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent intent_shipdetails = new Intent(shiptype.this,
							Activity_ship.class);
					intent_shipdetails.putExtra("shipdata", R.id.hagikaze);
					startActivity(intent_shipdetails);
				}
			});
			ImageButton arashi = (ImageButton) findViewById(R.id.arashi);
			arashi.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent intent_shipdetails = new Intent(shiptype.this,
							Activity_ship.class);
					intent_shipdetails.putExtra("shipdata", R.id.arashi);
					startActivity(intent_shipdetails);
				}
			});
			ImageButton akatsuki = (ImageButton) findViewById(R.id.akatsuki);
			akatsuki.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent intent_shipdetails = new Intent(shiptype.this,
							Activity_ship.class);
					intent_shipdetails.putExtra("shipdata", R.id.akatsuki);
					startActivity(intent_shipdetails);
				}
			});
			ImageButton hibiki = (ImageButton) findViewById(R.id.hibiki);
			hibiki.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent intent_shipdetails = new Intent(shiptype.this,
							Activity_ship.class);
					intent_shipdetails.putExtra("shipdata", R.id.hibiki);
					startActivity(intent_shipdetails);
				}
			});
			ImageButton ikazuchi = (ImageButton) findViewById(R.id.ikazuchi);
			ikazuchi.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent intent_shipdetails = new Intent(shiptype.this,
							Activity_ship.class);
					intent_shipdetails.putExtra("shipdata", R.id.ikazuchi);
					startActivity(intent_shipdetails);
				}
			});
			ImageButton inazuma = (ImageButton) findViewById(R.id.inazuma);
			inazuma.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent intent_shipdetails = new Intent(shiptype.this,
							Activity_ship.class);
					intent_shipdetails.putExtra("shipdata", R.id.inazuma);
					startActivity(intent_shipdetails);
				}
			});
			ImageButton hatsuharu = (ImageButton) findViewById(R.id.hatsuharu);
			hatsuharu.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent intent_shipdetails = new Intent(shiptype.this,
							Activity_ship.class);
					intent_shipdetails.putExtra("shipdata", R.id.hatsuharu);
					startActivity(intent_shipdetails);
				}
			});
			ImageButton nenohi = (ImageButton) findViewById(R.id.nenohi);
			nenohi.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent intent_shipdetails = new Intent(shiptype.this,
							Activity_ship.class);
					intent_shipdetails.putExtra("shipdata", R.id.nenohi);
					startActivity(intent_shipdetails);
				}
			});
			ImageButton wakaba = (ImageButton) findViewById(R.id.wakaba);
			wakaba.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent intent_shipdetails = new Intent(shiptype.this,
							Activity_ship.class);
					intent_shipdetails.putExtra("shipdata", R.id.wakaba);
					startActivity(intent_shipdetails);
				}
			});
			ImageButton hatsushimo = (ImageButton) findViewById(R.id.hatsushimo);
			hatsushimo.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent intent_shipdetails = new Intent(shiptype.this,
							Activity_ship.class);
					intent_shipdetails.putExtra("shipdata", R.id.hatsushimo);
					startActivity(intent_shipdetails);
				}
			});
			ImageButton shiratsuyu = (ImageButton) findViewById(R.id.shiratsuyu);
			shiratsuyu.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent intent_shipdetails = new Intent(shiptype.this,
							Activity_ship.class);
					intent_shipdetails.putExtra("shipdata", R.id.shiratsuyu);
					startActivity(intent_shipdetails);
				}
			});
			ImageButton shigure = (ImageButton) findViewById(R.id.shigure);
			shigure.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent intent_shipdetails = new Intent(shiptype.this,
							Activity_ship.class);
					intent_shipdetails.putExtra("shipdata", R.id.shigure);
					startActivity(intent_shipdetails);
				}
			});
			ImageButton murasame = (ImageButton) findViewById(R.id.murasame);
			murasame.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent intent_shipdetails = new Intent(shiptype.this,
							Activity_ship.class);
					intent_shipdetails.putExtra("shipdata", R.id.murasame);
					startActivity(intent_shipdetails);
				}
			});
			ImageButton yuudachi = (ImageButton) findViewById(R.id.yuudachi);
			yuudachi.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent intent_shipdetails = new Intent(shiptype.this,
							Activity_ship.class);
					intent_shipdetails.putExtra("shipdata", R.id.yuudachi);
					startActivity(intent_shipdetails);
				}
			});
			ImageButton harusame = (ImageButton) findViewById(R.id.harusame);
			harusame.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent intent_shipdetails = new Intent(shiptype.this,
							Activity_ship.class);
					intent_shipdetails.putExtra("shipdata", R.id.harusame);
					startActivity(intent_shipdetails);
				}
			});
			ImageButton samidare = (ImageButton) findViewById(R.id.samidare);
			samidare.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent intent_shipdetails = new Intent(shiptype.this,
							Activity_ship.class);
					intent_shipdetails.putExtra("shipdata", R.id.samidare);
					startActivity(intent_shipdetails);
				}
			});
			ImageButton umikaze = (ImageButton) findViewById(R.id.umikaze);
			umikaze.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent intent_shipdetails = new Intent(shiptype.this,
							Activity_ship.class);
					intent_shipdetails.putExtra("shipdata", R.id.umikaze);
					startActivity(intent_shipdetails);
				}
			});
			ImageButton kawakaze = (ImageButton) findViewById(R.id.kawakaze);
			kawakaze.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent intent_shipdetails = new Intent(shiptype.this,
							Activity_ship.class);
					intent_shipdetails.putExtra("shipdata", R.id.kawakaze);
					startActivity(intent_shipdetails);
				}
			});
			ImageButton suzukaze = (ImageButton) findViewById(R.id.suzukaze);
			suzukaze.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent intent_shipdetails = new Intent(shiptype.this,
							Activity_ship.class);
					intent_shipdetails.putExtra("shipdata", R.id.suzukaze);
					startActivity(intent_shipdetails);
				}
			});
			ImageButton asashio = (ImageButton) findViewById(R.id.asashio);
			asashio.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent intent_shipdetails = new Intent(shiptype.this,
							Activity_ship.class);
					intent_shipdetails.putExtra("shipdata", R.id.asashio);
					startActivity(intent_shipdetails);
				}
			});
			ImageButton ooshio = (ImageButton) findViewById(R.id.ooshio);
			ooshio.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent intent_shipdetails = new Intent(shiptype.this,
							Activity_ship.class);
					intent_shipdetails.putExtra("shipdata", R.id.ooshio);
					startActivity(intent_shipdetails);
				}
			});
			ImageButton michishio = (ImageButton) findViewById(R.id.michishio);
			michishio.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent intent_shipdetails = new Intent(shiptype.this,
							Activity_ship.class);
					intent_shipdetails.putExtra("shipdata", R.id.michishio);
					startActivity(intent_shipdetails);
				}
			});
			ImageButton arashio = (ImageButton) findViewById(R.id.arashio);
			arashio.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent intent_shipdetails = new Intent(shiptype.this,
							Activity_ship.class);
					intent_shipdetails.putExtra("shipdata", R.id.arashio);
					startActivity(intent_shipdetails);
				}
			});
			ImageButton asagumo = (ImageButton) findViewById(R.id.asagumo);
			asagumo.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent intent_shipdetails = new Intent(shiptype.this,
							Activity_ship.class);
					intent_shipdetails.putExtra("shipdata", R.id.asagumo);
					startActivity(intent_shipdetails);
				}
			});
			ImageButton yamagumo = (ImageButton) findViewById(R.id.yamagumo);
			yamagumo.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent intent_shipdetails = new Intent(shiptype.this,
							Activity_ship.class);
					intent_shipdetails.putExtra("shipdata", R.id.yamagumo);
					startActivity(intent_shipdetails);
				}
			});
			ImageButton arare = (ImageButton) findViewById(R.id.arare);
			arare.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent intent_shipdetails = new Intent(shiptype.this,
							Activity_ship.class);
					intent_shipdetails.putExtra("shipdata", R.id.arare);
					startActivity(intent_shipdetails);
				}
			});
			ImageButton kazumi = (ImageButton) findViewById(R.id.kazumi);
			kazumi.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent intent_shipdetails = new Intent(shiptype.this,
							Activity_ship.class);
					intent_shipdetails.putExtra("shipdata", R.id.kazumi);
					startActivity(intent_shipdetails);
				}
			});
			ImageButton shimakaze = (ImageButton) findViewById(R.id.shimakaze);
			shimakaze.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent intent_shipdetails = new Intent(shiptype.this,
							Activity_ship.class);
					intent_shipdetails.putExtra("shipdata", R.id.shimakaze);
					startActivity(intent_shipdetails);
				}
			});
			ImageButton yuugumo = (ImageButton) findViewById(R.id.yuugumo);
			yuugumo.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent intent_shipdetails = new Intent(shiptype.this,
							Activity_ship.class);
					intent_shipdetails.putExtra("shipdata", R.id.yuugumo);
					startActivity(intent_shipdetails);
				}
			});
			ImageButton makigumo = (ImageButton) findViewById(R.id.makigumo);
			makigumo.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent intent_shipdetails = new Intent(shiptype.this,
							Activity_ship.class);
					intent_shipdetails.putExtra("shipdata", R.id.makigumo);
					startActivity(intent_shipdetails);
				}
			});
			ImageButton kazagumo = (ImageButton) findViewById(R.id.kazagumo);
			kazagumo.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent intent_shipdetails = new Intent(shiptype.this,
							Activity_ship.class);
					intent_shipdetails.putExtra("shipdata", R.id.kazagumo);
					startActivity(intent_shipdetails);
				}
			});
			ImageButton naganami = (ImageButton) findViewById(R.id.naganami);
			naganami.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent intent_shipdetails = new Intent(shiptype.this,
							Activity_ship.class);
					intent_shipdetails.putExtra("shipdata", R.id.naganami);
					startActivity(intent_shipdetails);
				}
			});
			ImageButton takanami = (ImageButton) findViewById(R.id.takanami);
			takanami.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent intent_shipdetails = new Intent(shiptype.this,
							Activity_ship.class);
					intent_shipdetails.putExtra("shipdata", R.id.takanami);
					startActivity(intent_shipdetails);
				}
			});
			ImageButton asashimo = (ImageButton) findViewById(R.id.asashimo);
			asashimo.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent intent_shipdetails = new Intent(shiptype.this,
							Activity_ship.class);
					intent_shipdetails.putExtra("shipdata", R.id.asashimo);
					startActivity(intent_shipdetails);
				}
			});
			ImageButton hayashimo = (ImageButton) findViewById(R.id.hayashimo);
			hayashimo.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent intent_shipdetails = new Intent(shiptype.this,
							Activity_ship.class);
					intent_shipdetails.putExtra("shipdata", R.id.hayashimo);
					startActivity(intent_shipdetails);
				}
			});
			ImageButton kiyoshimo = (ImageButton) findViewById(R.id.kiyoshimo);
			kiyoshimo.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent intent_shipdetails = new Intent(shiptype.this,
							Activity_ship.class);
					intent_shipdetails.putExtra("shipdata", R.id.kiyoshimo);
					startActivity(intent_shipdetails);
				}
			});
			ImageButton okinami = (ImageButton) findViewById(R.id.okinami);
			okinami.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent intent_shipdetails = new Intent(shiptype.this,
							Activity_ship.class);
					intent_shipdetails.putExtra("shipdata", R.id.okinami);
					startActivity(intent_shipdetails);
				}
			});
			ImageButton z1 = (ImageButton) findViewById(R.id.z1);
			z1.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent intent_shipdetails = new Intent(shiptype.this,
							Activity_ship.class);
					intent_shipdetails.putExtra("shipdata", R.id.z1);
					startActivity(intent_shipdetails);
				}
			});
			ImageButton z3 = (ImageButton) findViewById(R.id.z3);
			z3.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent intent_shipdetails = new Intent(shiptype.this,
							Activity_ship.class);
					intent_shipdetails.putExtra("shipdata", R.id.z3);
					startActivity(intent_shipdetails);
				}
			});
			ImageButton akizuki = (ImageButton) findViewById(R.id.akizuki);
			akizuki.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent intent_shipdetails = new Intent(shiptype.this,
							Activity_ship.class);
					intent_shipdetails.putExtra("shipdata", R.id.akizuki);
					startActivity(intent_shipdetails);
				}
			});
			ImageButton teruzuki = (ImageButton) findViewById(R.id.teruzuki);
			teruzuki.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent intent_shipdetails = new Intent(shiptype.this,
							Activity_ship.class);
					intent_shipdetails.putExtra("shipdata", R.id.teruzuki);
					startActivity(intent_shipdetails);
				}
			});
			ImageButton hatsuzuki = (ImageButton) findViewById(R.id.hatsuzuki);
			hatsuzuki.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent intent_shipdetails = new Intent(shiptype.this,
							Activity_ship.class);
					intent_shipdetails.putExtra("shipdata", R.id.hatsuzuki);
					startActivity(intent_shipdetails);
				}
			});
			ImageButton libeccio = (ImageButton) findViewById(R.id.libeccio);
			libeccio.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent intent_shipdetails = new Intent(shiptype.this,
							Activity_ship.class);
					intent_shipdetails.putExtra("shipdata", R.id.libeccio);
					startActivity(intent_shipdetails);
				}
			});
			break;
		case R.id.Fix:
			setContentView(R.layout.fix);
			ImageButton akashi = (ImageButton) findViewById(R.id.akashi);
			akashi.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent intent_shipdetails = new Intent(shiptype.this,
							Activity_ship.class);
					intent_shipdetails.putExtra("shipdata", R.id.akashi);
					startActivity(intent_shipdetails);
				}
			});
			break;
		case R.id.LHA:
			setContentView(R.layout.lha);
			ImageButton akitsumaru = (ImageButton) findViewById(R.id.akitsumaru);
			akitsumaru.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent intent_shipdetails = new Intent(shiptype.this,
							Activity_ship.class);
					intent_shipdetails.putExtra("shipdata", R.id.akitsumaru);
					startActivity(intent_shipdetails);
				}
			});
			break;
		case R.id.Prac:
			setContentView(R.layout.prac);
			ImageButton katori = (ImageButton) findViewById(R.id.katori);
			katori.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent intent_shipdetails = new Intent(shiptype.this,
							Activity_ship.class);
					intent_shipdetails.putExtra("shipdata", R.id.katori);
					startActivity(intent_shipdetails);
				}
			});
			ImageButton kashima = (ImageButton) findViewById(R.id.kashima);
			kashima.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent intent_shipdetails = new Intent(shiptype.this,
							Activity_ship.class);
					intent_shipdetails.putExtra("shipdata", R.id.kashima);
					startActivity(intent_shipdetails);
				}
			});
			break;
		case R.id.Support:
			setContentView(R.layout.support);
			ImageButton hayasui = (ImageButton) findViewById(R.id.hayasui);
			hayasui.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent intent_shipdetails = new Intent(shiptype.this,
							Activity_ship.class);
					intent_shipdetails.putExtra("shipdata", R.id.hayasui);
					startActivity(intent_shipdetails);
				}
			});
			break;
		case R.id.SS:
			setContentView(R.layout.ss);
			ImageButton i168 = (ImageButton) findViewById(R.id.i168);
			i168.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent intent_shipdetails = new Intent(shiptype.this,
							Activity_ship.class);
					intent_shipdetails.putExtra("shipdata", R.id.i168);
					startActivity(intent_shipdetails);
				}
			});
			ImageButton i58 = (ImageButton) findViewById(R.id.i58);
			i58.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent intent_shipdetails = new Intent(shiptype.this,
							Activity_ship.class);
					intent_shipdetails.putExtra("shipdata", R.id.i58);
					startActivity(intent_shipdetails);
				}
			});
			ImageButton i8 = (ImageButton) findViewById(R.id.i8);
			i8.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent intent_shipdetails = new Intent(shiptype.this,
							Activity_ship.class);
					intent_shipdetails.putExtra("shipdata", R.id.i8);
					startActivity(intent_shipdetails);
				}
			});
			ImageButton i401 = (ImageButton) findViewById(R.id.i401);
			i401.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent intent_shipdetails = new Intent(shiptype.this,
							Activity_ship.class);
					intent_shipdetails.putExtra("shipdata", R.id.i401);
					startActivity(intent_shipdetails);
				}
			});
			ImageButton maruyu = (ImageButton) findViewById(R.id.maruyu);
			maruyu.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent intent_shipdetails = new Intent(shiptype.this,
							Activity_ship.class);
					intent_shipdetails.putExtra("shipdata", R.id.maruyu);
					startActivity(intent_shipdetails);
				}
			});
			ImageButton i19 = (ImageButton) findViewById(R.id.i19);
			i19.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent intent_shipdetails = new Intent(shiptype.this,
							Activity_ship.class);
					intent_shipdetails.putExtra("shipdata", R.id.i19);
					startActivity(intent_shipdetails);
				}
			});
			ImageButton yu511 = (ImageButton) findViewById(R.id.yu511);
			yu511.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent intent_shipdetails = new Intent(shiptype.this,
							Activity_ship.class);
					intent_shipdetails.putExtra("shipdata", R.id.yu511);
					startActivity(intent_shipdetails);
				}
			});
			break;
		default:
			break;
		}
		back = (ImageButton) findViewById(R.id.back);
		back.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				finish();
			}
		});
	}

}
