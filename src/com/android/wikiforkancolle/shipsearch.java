package com.android.wikiforkancolle;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.SearchView.OnQueryTextListener;
import android.widget.Toast;

public class shipsearch extends Activity implements OnQueryTextListener {

	private ImageView back;
	private SearchView sv;
	private Context mContext;
	private MyDBOpenHelper myDBHelper;
	private SQLiteDatabase db;
	private Object[] names;
	private ArrayAdapter<String> adapter;
	private ArrayList<String> mAllList = new ArrayList<String>();
	private ListView listview;
	private List<Kanmusu> resultList;

	private List<Kanmusu> kanmusuList = new ArrayList<Kanmusu>();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.shipsearch);
		// Define the back button
		back = (ImageButton) findViewById(R.id.back);
		back.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				finish();
			}
		});

		// Init listview
		initKanmusuData();
		listview = (ListView) findViewById(R.id.hintListView);
		listview.setAdapter(new KanmusuAdapter(shipsearch.this,
				R.layout.search_item, kanmusuList));
		listview.setOnItemClickListener(new OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				Kanmusu kanmusu = kanmusuList.get(position);
				findKanmusu(kanmusu.getName());
			}
		});

		// Define the searchview
		sv = (SearchView) findViewById(R.id.searchShip);
		sv.setIconified(false);
		sv.setSubmitButtonEnabled(true);
		sv.setQueryHint("搜索你想要查找的舰娘");
		sv.setOnQueryTextListener(this);

		// Initiation
		mContext = shipsearch.this;
		myDBHelper = new MyDBOpenHelper(mContext, "kancolle.db", null, 1);
		db = myDBHelper.getReadableDatabase();
		String querySql = "select * from kanmusu";
		Cursor cursor = db.rawQuery(querySql, null);

	}

	public boolean onQueryTextChange(String newText) {
		if (TextUtils.isEmpty(newText)) {
			listview.setAdapter(new KanmusuAdapter(shipsearch.this,
					R.layout.search_item, kanmusuList));
			listview.setOnItemClickListener(new OnItemClickListener() {
				@Override
				public void onItemClick(AdapterView<?> parent, View view,
						int position, long id) {
					Kanmusu kanmusu = kanmusuList.get(position);
					findKanmusu(kanmusu.getName());
				}
			});
		} else {
			resultList = searchItem(newText);
			listview.setAdapter(new KanmusuAdapter(shipsearch.this,
					R.layout.search_item, resultList));
			listview.setOnItemClickListener(new OnItemClickListener() {
				@Override
				public void onItemClick(AdapterView<?> parent, View view,
						int position, long id) {
					Kanmusu kanmusu = resultList.get(position);
					findKanmusu(kanmusu.getName());
				}
			});
		}
		return false;
	}

	@Override
	public boolean onQueryTextSubmit(String query) {
		findKanmusu(query);
		return false;
	}

	// Other functions
	private List<Kanmusu> searchItem(String name) {
		List<Kanmusu> kanmusuSearchList = new ArrayList<Kanmusu>();
		for (int i = 0; i < kanmusuList.size(); ++i) {
			int index = kanmusuList.get(i).getName().indexOf(name);
			if (index != -1) {
				kanmusuSearchList.add(kanmusuList.get(i));
			}
		}
		return kanmusuSearchList;
	}

	private void initKanmusuData() {
		// 1-10
		Kanmusu nagato = new Kanmusu("长门", R.drawable.k001);
		kanmusuList.add(nagato);
		Kanmusu mutsu = new Kanmusu("陆奥", R.drawable.k002);
		kanmusuList.add(mutsu);
		Kanmusu ise = new Kanmusu("伊势", R.drawable.k003);
		kanmusuList.add(ise);
		Kanmusu hyuuga = new Kanmusu("日向", R.drawable.k004);
		kanmusuList.add(hyuuga);
		Kanmusu yukikaze = new Kanmusu("雪风", R.drawable.k005);
		kanmusuList.add(yukikaze);
		Kanmusu akagi = new Kanmusu("赤城", R.drawable.k006);
		kanmusuList.add(akagi);
		Kanmusu kaga = new Kanmusu("加贺", R.drawable.k007);
		kanmusuList.add(kaga);
		Kanmusu souryuu = new Kanmusu("苍龙", R.drawable.k008);
		kanmusuList.add(souryuu);
		Kanmusu hiryuu = new Kanmusu("飞龙", R.drawable.k009);
		kanmusuList.add(hiryuu);
		Kanmusu shimakaze = new Kanmusu("岛风", R.drawable.k010);
		kanmusuList.add(shimakaze);
		// 11-20
		Kanmusu fubuki = new Kanmusu("吹雪", R.drawable.k011);
		kanmusuList.add(fubuki);
		Kanmusu shirayuki = new Kanmusu("白雪", R.drawable.k012);
		kanmusuList.add(shirayuki);
		Kanmusu hatsuyuki = new Kanmusu("初雪", R.drawable.k013);
		kanmusuList.add(hatsuyuki);
		Kanmusu miyuki = new Kanmusu("深雪", R.drawable.k014);
		kanmusuList.add(miyuki);
		Kanmusu murakumo = new Kanmusu("丛云", R.drawable.k015);
		kanmusuList.add(murakumo);
		Kanmusu isonami = new Kanmusu("矶波", R.drawable.k016);
		kanmusuList.add(isonami);
		Kanmusu ayanami = new Kanmusu("绫波", R.drawable.k017);
		kanmusuList.add(ayanami);
		Kanmusu shikinami = new Kanmusu("敷波", R.drawable.k018);
		kanmusuList.add(shikinami);
		Kanmusu ooi = new Kanmusu("大井", R.drawable.k019);
		kanmusuList.add(ooi);
		Kanmusu kitakami = new Kanmusu("北上", R.drawable.k020);
		kanmusuList.add(kitakami);
		// 21-30
		Kanmusu kongou = new Kanmusu("金刚", R.drawable.k021);
		kanmusuList.add(kongou);
		Kanmusu hiei = new Kanmusu("比叡", R.drawable.k022);
		kanmusuList.add(hiei);
		Kanmusu haruna = new Kanmusu("榛名", R.drawable.k023);
		kanmusuList.add(haruna);
		Kanmusu kirishima = new Kanmusu("雾岛", R.drawable.k024);
		kanmusuList.add(kirishima);
		Kanmusu hoshyou = new Kanmusu("凤翔", R.drawable.k025);
		kanmusuList.add(hoshyou);
		Kanmusu fusou = new Kanmusu("扶桑", R.drawable.k026);
		kanmusuList.add(fusou);
		Kanmusu yamashiro = new Kanmusu("山城", R.drawable.k027);
		kanmusuList.add(yamashiro);
		Kanmusu tenryuu = new Kanmusu("天龙", R.drawable.k028);
		kanmusuList.add(tenryuu);
		Kanmusu tatsuta = new Kanmusu("龙田", R.drawable.k029);
		kanmusuList.add(tatsuta);
		Kanmusu ryuuzhyou = new Kanmusu("龙骧", R.drawable.k030);
		kanmusuList.add(ryuuzhyou);
		// 31-40
		Kanmusu mutsuki = new Kanmusu("睦月", R.drawable.k031);
		kanmusuList.add(mutsuki);
		Kanmusu kisaragi = new Kanmusu("如月", R.drawable.k032);
		kanmusuList.add(kisaragi);
		Kanmusu satsuki = new Kanmusu("皋月", R.drawable.k033);
		kanmusuList.add(satsuki);
		Kanmusu fumizuki = new Kanmusu("文月", R.drawable.k034);
		kanmusuList.add(fumizuki);
		Kanmusu nakatsuki = new Kanmusu("长月", R.drawable.k035);
		kanmusuList.add(nakatsuki);
		Kanmusu kikuzuki = new Kanmusu("菊月", R.drawable.k036);
		kanmusuList.add(kikuzuki);
		Kanmusu mikazuki = new Kanmusu("三日月", R.drawable.k037);
		kanmusuList.add(mikazuki);
		Kanmusu nmochizuki = new Kanmusu("望月", R.drawable.k038);
		kanmusuList.add(nmochizuki);
		Kanmusu kuma = new Kanmusu("球磨", R.drawable.k039);
		kanmusuList.add(kuma);
		Kanmusu tama = new Kanmusu("多摩", R.drawable.k040);
		kanmusuList.add(tama);
		// 41-50
		Kanmusu kiso = new Kanmusu("木曾", R.drawable.k041);
		kanmusuList.add(kiso);
		Kanmusu nagara = new Kanmusu("长良", R.drawable.k042);
		kanmusuList.add(nagara);
		Kanmusu isuzu = new Kanmusu("五十铃", R.drawable.k043);
		kanmusuList.add(isuzu);
		Kanmusu natori = new Kanmusu("名取", R.drawable.k044);
		kanmusuList.add(natori);
		Kanmusu yura = new Kanmusu("由良", R.drawable.k045);
		kanmusuList.add(yura);
		Kanmusu sendai = new Kanmusu("川内", R.drawable.k046);
		kanmusuList.add(sendai);
		Kanmusu zhintsuu = new Kanmusu("神通", R.drawable.k047);
		kanmusuList.add(zhintsuu);
		Kanmusu naka = new Kanmusu("那珂", R.drawable.k048);
		kanmusuList.add(naka);
		Kanmusu chitose = new Kanmusu("千岁", R.drawable.k049);
		kanmusuList.add(chitose);
		Kanmusu chiyoda = new Kanmusu("千代田", R.drawable.k050);
		kanmusuList.add(chiyoda);
		// 51-60
		Kanmusu mogami = new Kanmusu("最上", R.drawable.k051);
		kanmusuList.add(mogami);
		Kanmusu furutaka = new Kanmusu("古鹰", R.drawable.k052);
		kanmusuList.add(furutaka);
		Kanmusu kako = new Kanmusu("加古", R.drawable.k053);
		kanmusuList.add(kako);
		Kanmusu aoba = new Kanmusu("青叶", R.drawable.k054);
		kanmusuList.add(aoba);
		Kanmusu myoukou = new Kanmusu("妙高", R.drawable.k055);
		kanmusuList.add(myoukou);
		Kanmusu nachi = new Kanmusu("那智", R.drawable.k056);
		kanmusuList.add(nachi);
		Kanmusu ashigara = new Kanmusu("足柄", R.drawable.k057);
		kanmusuList.add(ashigara);
		Kanmusu haguro = new Kanmusu("羽黑", R.drawable.k058);
		kanmusuList.add(haguro);
		Kanmusu takao = new Kanmusu("高雄", R.drawable.k059);
		kanmusuList.add(takao);
		Kanmusu atago = new Kanmusu("爱宕", R.drawable.k060);
		kanmusuList.add(atago);
		// 61-70
		Kanmusu maya = new Kanmusu("摩耶", R.drawable.k061);
		kanmusuList.add(maya);
		Kanmusu chyoukai = new Kanmusu("鸟海", R.drawable.k062);
		kanmusuList.add(chyoukai);
		Kanmusu tone = new Kanmusu("利根", R.drawable.k063);
		kanmusuList.add(tone);
		Kanmusu chikuma = new Kanmusu("筑摩", R.drawable.k064);
		kanmusuList.add(chikuma);
		Kanmusu hiyou = new Kanmusu("飞鹰", R.drawable.k065);
		kanmusuList.add(hiyou);
		Kanmusu zhyunyou = new Kanmusu("隼鹰", R.drawable.k066);
		kanmusuList.add(zhyunyou);
		Kanmusu oboro = new Kanmusu("胧", R.drawable.k067);
		kanmusuList.add(oboro);
		Kanmusu akebono = new Kanmusu("曙", R.drawable.k068);
		kanmusuList.add(akebono);
		Kanmusu sazanami = new Kanmusu("涟", R.drawable.k069);
		kanmusuList.add(sazanami);
		Kanmusu ushio = new Kanmusu("潮", R.drawable.k070);
		kanmusuList.add(ushio);
		// 71-80
		Kanmusu akatsuki = new Kanmusu("晓", R.drawable.k071);
		kanmusuList.add(akatsuki);
		Kanmusu hibiki = new Kanmusu("响", R.drawable.k072);
		kanmusuList.add(hibiki);
		Kanmusu ikazuchi = new Kanmusu("雷", R.drawable.k073);
		kanmusuList.add(ikazuchi);
		Kanmusu inazuma = new Kanmusu("电", R.drawable.k074);
		kanmusuList.add(inazuma);
		Kanmusu hatsuharu = new Kanmusu("初春", R.drawable.k075);
		kanmusuList.add(hatsuharu);
		Kanmusu nenohi = new Kanmusu("子日", R.drawable.k076);
		kanmusuList.add(nenohi);
		Kanmusu wakaba = new Kanmusu("若叶", R.drawable.k077);
		kanmusuList.add(wakaba);
		Kanmusu hatsushimo = new Kanmusu("初霜", R.drawable.k078);
		kanmusuList.add(hatsushimo);
		Kanmusu shiratsuyu = new Kanmusu("白露", R.drawable.k079);
		kanmusuList.add(shiratsuyu);
		Kanmusu shigure = new Kanmusu("时雨", R.drawable.k080);
		kanmusuList.add(shigure);
		// 81-90
		Kanmusu murasame = new Kanmusu("村雨", R.drawable.k081);
		kanmusuList.add(murasame);
		Kanmusu yuudachi = new Kanmusu("夕立", R.drawable.k082);
		kanmusuList.add(yuudachi);
		Kanmusu samidare = new Kanmusu("五月雨", R.drawable.k083);
		kanmusuList.add(samidare);
		Kanmusu suzukaze = new Kanmusu("凉风", R.drawable.k084);
		kanmusuList.add(suzukaze);
		Kanmusu asashio = new Kanmusu("朝潮", R.drawable.k085);
		kanmusuList.add(asashio);
		Kanmusu ooshio = new Kanmusu("大潮", R.drawable.k086);
		kanmusuList.add(ooshio);
		Kanmusu michishio = new Kanmusu("满潮", R.drawable.k087);
		kanmusuList.add(michishio);
		Kanmusu arashio = new Kanmusu("荒潮", R.drawable.k088);
		kanmusuList.add(arashio);
		Kanmusu arare = new Kanmusu("霰", R.drawable.k089);
		kanmusuList.add(arare);
		Kanmusu kasumi = new Kanmusu("霞", R.drawable.k090);
		kanmusuList.add(kasumi);
		// 91-94
		Kanmusu kagerou = new Kanmusu("阳炎", R.drawable.k091);
		kanmusuList.add(kagerou);
		Kanmusu shiranui = new Kanmusu("不知火", R.drawable.k092);
		kanmusuList.add(shiranui);
		Kanmusu kuroshio = new Kanmusu("黑潮", R.drawable.k093);
		kanmusuList.add(kuroshio);
		Kanmusu shouhou = new Kanmusu("祥凤", R.drawable.k094);
		kanmusuList.add(shouhou);
		// 100-150
		Kanmusu shoukaku = new Kanmusu("翔鹤", R.drawable.k106);
		kanmusuList.add(shoukaku);
		Kanmusu zuikaku = new Kanmusu("瑞鹤", R.drawable.k107);
		kanmusuList.add(zuikaku);
		Kanmusu kinu = new Kanmusu("鬼怒", R.drawable.k109);
		kanmusuList.add(kinu);
		Kanmusu abukuma = new Kanmusu("阿武隈", R.drawable.k110);
		kanmusuList.add(abukuma);
		Kanmusu yuubari = new Kanmusu("夕张", R.drawable.k111);
		kanmusuList.add(yuubari);
		Kanmusu zuihou = new Kanmusu("瑞凤", R.drawable.k112);
		kanmusuList.add(zuihou);
		Kanmusu mikuma = new Kanmusu("三隈", R.drawable.k116);
		kanmusuList.add(mikuma);
		Kanmusu hatsukaze = new Kanmusu("初风", R.drawable.k118);
		kanmusuList.add(hatsukaze);
		Kanmusu maikaze = new Kanmusu("舞风", R.drawable.k119);
		kanmusuList.add(maikaze);
		Kanmusu kinugasa = new Kanmusu("衣笠", R.drawable.k120);
		kanmusuList.add(kinugasa);
		Kanmusu i19 = new Kanmusu("伊19", R.drawable.k123);
		kanmusuList.add(i19);
		Kanmusu suzuya = new Kanmusu("铃谷", R.drawable.k124);
		kanmusuList.add(suzuya);
		Kanmusu kumano = new Kanmusu("熊野", R.drawable.k125);
		kanmusuList.add(kumano);
		Kanmusu i168 = new Kanmusu("伊168", R.drawable.k126);
		kanmusuList.add(i168);
		Kanmusu i58 = new Kanmusu("伊58", R.drawable.k127);
		kanmusuList.add(i58);
		Kanmusu i8 = new Kanmusu("伊8", R.drawable.k128);
		kanmusuList.add(i8);
		Kanmusu yamato = new Kanmusu("大和", R.drawable.k131);
		kanmusuList.add(yamato);
		Kanmusu akigumo = new Kanmusu("秋云", R.drawable.k132);
		kanmusuList.add(akigumo);
		Kanmusu yuugumo = new Kanmusu("夕云", R.drawable.k133);
		kanmusuList.add(yuugumo);
		Kanmusu makigumo = new Kanmusu("卷云", R.drawable.k134);
		kanmusuList.add(makigumo);
		Kanmusu naganami = new Kanmusu("长波", R.drawable.k135);
		kanmusuList.add(naganami);
		Kanmusu agano = new Kanmusu("阿贺野", R.drawable.k137);
		kanmusuList.add(agano);
		Kanmusu noshiro = new Kanmusu("能代", R.drawable.k138);
		kanmusuList.add(noshiro);
		Kanmusu yahagi = new Kanmusu("矢矧", R.drawable.k139);
		kanmusuList.add(yahagi);
		Kanmusu sakawa = new Kanmusu("酒匂", R.drawable.k140);
		kanmusuList.add(sakawa);
		Kanmusu musashi = new Kanmusu("武藏", R.drawable.k143);
		kanmusuList.add(musashi);
		// 151-200
		Kanmusu taihou = new Kanmusu("大凤", R.drawable.k153);
		kanmusuList.add(taihou);
		Kanmusu katori = new Kanmusu("香取", R.drawable.k154);
		kanmusuList.add(katori);
		Kanmusu i401 = new Kanmusu("伊401", R.drawable.k155);
		kanmusuList.add(i401);
		Kanmusu akitsumaru = new Kanmusu("秋津丸", R.drawable.k161);
		kanmusuList.add(akitsumaru);
		Kanmusu maruyu = new Kanmusu("马路油", R.drawable.k163);
		kanmusuList.add(maruyu);
		Kanmusu yayoi = new Kanmusu("弥生", R.drawable.k164);
		kanmusuList.add(yayoi);
		Kanmusu uzuki = new Kanmusu("卯月", R.drawable.k165);
		kanmusuList.add(uzuki);
		Kanmusu isokaze = new Kanmusu("矶风", R.drawable.k167);
		kanmusuList.add(isokaze);
		Kanmusu urakaze = new Kanmusu("浦风", R.drawable.k168);
		kanmusuList.add(urakaze);
		Kanmusu tanikaze = new Kanmusu("谷风", R.drawable.k169);
		kanmusuList.add(tanikaze);
		Kanmusu hamakaze = new Kanmusu("浜风", R.drawable.k170);
		kanmusuList.add(hamakaze);
		Kanmusu bismarck = new Kanmusu("俾斯麦", R.drawable.k171);
		kanmusuList.add(bismarck);
		Kanmusu z1 = new Kanmusu("z1", R.drawable.k174);
		kanmusuList.add(z1);
		Kanmusu z3 = new Kanmusu("z3", R.drawable.k175);
		kanmusuList.add(z3);
		Kanmusu eugen = new Kanmusu("欧根亲王", R.drawable.k176);
		kanmusuList.add(eugen);
		Kanmusu amatsukaze = new Kanmusu("天津风", R.drawable.k181);
		kanmusuList.add(amatsukaze);
		Kanmusu akashi = new Kanmusu("明石", R.drawable.k182);
		kanmusuList.add(akashi);
		Kanmusu ooyodo = new Kanmusu("大淀", R.drawable.k183);
		kanmusuList.add(ooyodo);
		Kanmusu taigei = new Kanmusu("大鲸", R.drawable.k184);
		kanmusuList.add(taigei);
		Kanmusu tokitsukaze = new Kanmusu("时津风", R.drawable.k186);
		kanmusuList.add(tokitsukaze);
		// 201-250
		Kanmusu unryuu = new Kanmusu("云龙", R.drawable.k201);
		kanmusuList.add(unryuu);
		Kanmusu amagi = new Kanmusu("天城", R.drawable.k202);
		kanmusuList.add(amagi);
		Kanmusu katsuragi = new Kanmusu("葛城", R.drawable.k203);
		kanmusuList.add(katsuragi);
		Kanmusu harusame = new Kanmusu("春雨", R.drawable.k205);
		kanmusuList.add(harusame);
		Kanmusu hayashimo = new Kanmusu("早霜", R.drawable.k209);
		kanmusuList.add(hayashimo);
		Kanmusu kiyoshimo = new Kanmusu("清霜", R.drawable.k210);
		kanmusuList.add(kiyoshimo);
		Kanmusu asagumo = new Kanmusu("朝云", R.drawable.k213);
		kanmusuList.add(asagumo);
		Kanmusu yamagumo = new Kanmusu("山云", R.drawable.k214);
		kanmusuList.add(yamagumo);
		Kanmusu nowaki = new Kanmusu("野分", R.drawable.k215);
		kanmusuList.add(nowaki);
		Kanmusu akizuki = new Kanmusu("秋月", R.drawable.k221);
		kanmusuList.add(akizuki);
		Kanmusu teruzuki = new Kanmusu("照月", R.drawable.k222);
		kanmusuList.add(teruzuki);
		Kanmusu hatsuzuki = new Kanmusu("初月", R.drawable.k223);
		kanmusuList.add(hatsuzuki);
		Kanmusu takanami = new Kanmusu("高波", R.drawable.k224);
		kanmusuList.add(takanami);
		Kanmusu asashimo = new Kanmusu("朝霜", R.drawable.k225);
		kanmusuList.add(asashimo);
		Kanmusu u511 = new Kanmusu("u511", R.drawable.k231);
		kanmusuList.add(u511);
		Kanmusu littorio = new Kanmusu("利托里奥", R.drawable.k241);
		kanmusuList.add(littorio);
		Kanmusu roma = new Kanmusu("罗马", R.drawable.k242);
		kanmusuList.add(roma);
		Kanmusu libeccio = new Kanmusu("西南风", R.drawable.k243);
		kanmusuList.add(libeccio);
		Kanmusu akitsushima = new Kanmusu("秋津洲", R.drawable.k245);
		kanmusuList.add(akitsushima);
		Kanmusu zara = new Kanmusu("扎拉", R.drawable.k248);
		kanmusuList.add(zara);
		// 251-300
		Kanmusu mizuho = new Kanmusu("瑞穗", R.drawable.k251);
		kanmusuList.add(mizuho);
		Kanmusu okinami = new Kanmusu("冲波", R.drawable.k252);
		kanmusuList.add(okinami);
		Kanmusu kazagumo = new Kanmusu("风云", R.drawable.k253);
		kanmusuList.add(kazagumo);
		Kanmusu arashi = new Kanmusu("岚", R.drawable.k254);
		kanmusuList.add(arashi);
		Kanmusu hazakaze = new Kanmusu("萩风", R.drawable.k255);
		kanmusuList.add(hazakaze);
		Kanmusu umikaze = new Kanmusu("海风", R.drawable.k258);
		kanmusuList.add(umikaze);
		Kanmusu kawakaze = new Kanmusu("江风", R.drawable.k259);
		kanmusuList.add(kawakaze);
		Kanmusu hayasui = new Kanmusu("速吸", R.drawable.k260);
		kanmusuList.add(hayasui);
		Kanmusu kashima = new Kanmusu("鹿岛", R.drawable.k265);
		kanmusuList.add(kashima);

		// Ao no hagane
		Kanmusu Aiona = new Kanmusu("イオナ", R.drawable.a001);
		kanmusuList.add(Aiona);
		Kanmusu Atakao = new Kanmusu("タカオ", R.drawable.a002);
		kanmusuList.add(Atakao);
		Kanmusu Aharuna = new Kanmusu("ハルナ", R.drawable.a003);
		kanmusuList.add(Aharuna);
	}

	private void findKanmusu(String kanmusuName) {
		Intent intent_shipdetails;
		switch (kanmusuName) {

		// 1-10

		case "长门":
			intent_shipdetails = new Intent(shipsearch.this,
					Activity_ship.class);
			intent_shipdetails.putExtra("shipdata", R.id.nagato);
			startActivity(intent_shipdetails);
			break;
		case "陆奥":
			intent_shipdetails = new Intent(shipsearch.this,
					Activity_ship.class);
			intent_shipdetails.putExtra("shipdata", R.id.mutsu);
			startActivity(intent_shipdetails);
			break;
		case "伊势":
			intent_shipdetails = new Intent(shipsearch.this,
					Activity_ship.class);
			intent_shipdetails.putExtra("shipdata", R.id.ise);
			startActivity(intent_shipdetails);
			break;
		case "日向":
			intent_shipdetails = new Intent(shipsearch.this,
					Activity_ship.class);
			intent_shipdetails.putExtra("shipdata", R.id.hyuuga);
			startActivity(intent_shipdetails);
			break;
		case "雪风":
			intent_shipdetails = new Intent(shipsearch.this,
					Activity_ship.class);
			intent_shipdetails.putExtra("shipdata", R.id.yukikaze);
			startActivity(intent_shipdetails);
			break;
		case "赤城":
			intent_shipdetails = new Intent(shipsearch.this,
					Activity_ship.class);
			intent_shipdetails.putExtra("shipdata", R.id.akagi);
			startActivity(intent_shipdetails);
			break;
		case "加贺":
			intent_shipdetails = new Intent(shipsearch.this,
					Activity_ship.class);
			intent_shipdetails.putExtra("shipdata", R.id.kaga);
			startActivity(intent_shipdetails);
			break;
		case "苍龙":
			intent_shipdetails = new Intent(shipsearch.this,
					Activity_ship.class);
			intent_shipdetails.putExtra("shipdata", R.id.souryuu);
			startActivity(intent_shipdetails);
			break;
		case "飞龙":
			intent_shipdetails = new Intent(shipsearch.this,
					Activity_ship.class);
			intent_shipdetails.putExtra("shipdata", R.id.hiryuu);
			startActivity(intent_shipdetails);
			break;
		case "岛风":
			intent_shipdetails = new Intent(shipsearch.this,
					Activity_ship.class);
			intent_shipdetails.putExtra("shipdata", R.id.shimakaze);
			startActivity(intent_shipdetails);
			break;

		// 11-20

		case "吹雪":
			intent_shipdetails = new Intent(shipsearch.this,
					Activity_ship.class);
			intent_shipdetails.putExtra("shipdata", R.id.fubuki);
			startActivity(intent_shipdetails);
			break;
		case "白雪":
			intent_shipdetails = new Intent(shipsearch.this,
					Activity_ship.class);
			intent_shipdetails.putExtra("shipdata", R.id.shirayuki);
			startActivity(intent_shipdetails);
			break;
		case "初雪":
			intent_shipdetails = new Intent(shipsearch.this,
					Activity_ship.class);
			intent_shipdetails.putExtra("shipdata", R.id.hatsuyuki);
			startActivity(intent_shipdetails);
			break;
		case "深雪":
			intent_shipdetails = new Intent(shipsearch.this,
					Activity_ship.class);
			intent_shipdetails.putExtra("shipdata", R.id.miyuki);
			startActivity(intent_shipdetails);
			break;
		case "丛云":
			intent_shipdetails = new Intent(shipsearch.this,
					Activity_ship.class);
			intent_shipdetails.putExtra("shipdata", R.id.murakumu);
			startActivity(intent_shipdetails);
			break;
		case "矶波":
			intent_shipdetails = new Intent(shipsearch.this,
					Activity_ship.class);
			intent_shipdetails.putExtra("shipdata", R.id.isonami);
			startActivity(intent_shipdetails);
			break;
		case "绫波":
			intent_shipdetails = new Intent(shipsearch.this,
					Activity_ship.class);
			intent_shipdetails.putExtra("shipdata", R.id.ayanami);
			startActivity(intent_shipdetails);
			break;
		case "敷波":
			intent_shipdetails = new Intent(shipsearch.this,
					Activity_ship.class);
			intent_shipdetails.putExtra("shipdata", R.id.shikinami);
			startActivity(intent_shipdetails);
			break;
		case "大井":
			intent_shipdetails = new Intent(shipsearch.this,
					Activity_ship.class);
			intent_shipdetails.putExtra("shipdata", R.id.ooi);
			startActivity(intent_shipdetails);
			break;
		case "北上":
			intent_shipdetails = new Intent(shipsearch.this,
					Activity_ship.class);
			intent_shipdetails.putExtra("shipdata", R.id.kitakami);
			startActivity(intent_shipdetails);
			break;

		// 21-30

		case "金刚":
			intent_shipdetails = new Intent(shipsearch.this,
					Activity_ship.class);
			intent_shipdetails.putExtra("shipdata", R.id.kongou);
			startActivity(intent_shipdetails);
			break;
		case "比叡":
			intent_shipdetails = new Intent(shipsearch.this,
					Activity_ship.class);
			intent_shipdetails.putExtra("shipdata", R.id.hiei);
			startActivity(intent_shipdetails);
			break;
		case "榛名":
			intent_shipdetails = new Intent(shipsearch.this,
					Activity_ship.class);
			intent_shipdetails.putExtra("shipdata", R.id.haruna);
			startActivity(intent_shipdetails);
			break;
		case "雾岛":
			intent_shipdetails = new Intent(shipsearch.this,
					Activity_ship.class);
			intent_shipdetails.putExtra("shipdata", R.id.kirishima);
			startActivity(intent_shipdetails);
			break;
		case "凤翔":
			intent_shipdetails = new Intent(shipsearch.this,
					Activity_ship.class);
			intent_shipdetails.putExtra("shipdata", R.id.houshyou);
			startActivity(intent_shipdetails);
			break;
		case "扶桑":
			intent_shipdetails = new Intent(shipsearch.this,
					Activity_ship.class);
			intent_shipdetails.putExtra("shipdata", R.id.fusou);
			startActivity(intent_shipdetails);
			break;
		case "山城":
			intent_shipdetails = new Intent(shipsearch.this,
					Activity_ship.class);
			intent_shipdetails.putExtra("shipdata", R.id.yamashiro);
			startActivity(intent_shipdetails);
			break;
		case "天龙":
			intent_shipdetails = new Intent(shipsearch.this,
					Activity_ship.class);
			intent_shipdetails.putExtra("shipdata", R.id.tenryuu);
			startActivity(intent_shipdetails);
			break;
		case "龙田":
			intent_shipdetails = new Intent(shipsearch.this,
					Activity_ship.class);
			intent_shipdetails.putExtra("shipdata", R.id.tatsuta);
			startActivity(intent_shipdetails);
			break;
		case "龙骧":
			intent_shipdetails = new Intent(shipsearch.this,
					Activity_ship.class);
			intent_shipdetails.putExtra("shipdata", R.id.ryuujyou);
			startActivity(intent_shipdetails);
			break;

		// 31-40

		case "睦月":
			intent_shipdetails = new Intent(shipsearch.this,
					Activity_ship.class);
			intent_shipdetails.putExtra("shipdata", R.id.mutsuki);
			startActivity(intent_shipdetails);
			break;
		case "如月":
			intent_shipdetails = new Intent(shipsearch.this,
					Activity_ship.class);
			intent_shipdetails.putExtra("shipdata", R.id.kisaragi);
			startActivity(intent_shipdetails);
			break;
		case "皋月":
			intent_shipdetails = new Intent(shipsearch.this,
					Activity_ship.class);
			intent_shipdetails.putExtra("shipdata", R.id.satsuki);
			startActivity(intent_shipdetails);
			break;
		case "文月":
			intent_shipdetails = new Intent(shipsearch.this,
					Activity_ship.class);
			intent_shipdetails.putExtra("shipdata", R.id.fumizuki);
			startActivity(intent_shipdetails);
			break;
		case "长月":
			intent_shipdetails = new Intent(shipsearch.this,
					Activity_ship.class);
			intent_shipdetails.putExtra("shipdata", R.id.nagatsuki);
			startActivity(intent_shipdetails);
			break;
		case "菊月":
			intent_shipdetails = new Intent(shipsearch.this,
					Activity_ship.class);
			intent_shipdetails.putExtra("shipdata", R.id.kikuzuki);
			startActivity(intent_shipdetails);
			break;
		case "三日月":
			intent_shipdetails = new Intent(shipsearch.this,
					Activity_ship.class);
			intent_shipdetails.putExtra("shipdata", R.id.mikazuki);
			startActivity(intent_shipdetails);
			break;
		case "望月":
			intent_shipdetails = new Intent(shipsearch.this,
					Activity_ship.class);
			intent_shipdetails.putExtra("shipdata", R.id.mochizuki);
			startActivity(intent_shipdetails);
			break;
		case "球磨":
			intent_shipdetails = new Intent(shipsearch.this,
					Activity_ship.class);
			intent_shipdetails.putExtra("shipdata", R.id.kuma);
			startActivity(intent_shipdetails);
			break;
		case "多摩":
			intent_shipdetails = new Intent(shipsearch.this,
					Activity_ship.class);
			intent_shipdetails.putExtra("shipdata", R.id.tama);
			startActivity(intent_shipdetails);
			break;

		// 41-50

		case "木曾":
			intent_shipdetails = new Intent(shipsearch.this,
					Activity_ship.class);
			intent_shipdetails.putExtra("shipdata", R.id.kiso);
			startActivity(intent_shipdetails);
			break;
		case "长良":
			intent_shipdetails = new Intent(shipsearch.this,
					Activity_ship.class);
			intent_shipdetails.putExtra("shipdata", R.id.nagara);
			startActivity(intent_shipdetails);
			break;
		case "五十铃":
			intent_shipdetails = new Intent(shipsearch.this,
					Activity_ship.class);
			intent_shipdetails.putExtra("shipdata", R.id.itsuzu);
			startActivity(intent_shipdetails);
			break;
		case "名取":
			intent_shipdetails = new Intent(shipsearch.this,
					Activity_ship.class);
			intent_shipdetails.putExtra("shipdata", R.id.natori);
			startActivity(intent_shipdetails);
			break;
		case "由良":
			intent_shipdetails = new Intent(shipsearch.this,
					Activity_ship.class);
			intent_shipdetails.putExtra("shipdata", R.id.yura);
			startActivity(intent_shipdetails);
			break;
		case "川内":
			intent_shipdetails = new Intent(shipsearch.this,
					Activity_ship.class);
			intent_shipdetails.putExtra("shipdata", R.id.sendai);
			startActivity(intent_shipdetails);
			break;
		case "神通":
			intent_shipdetails = new Intent(shipsearch.this,
					Activity_ship.class);
			intent_shipdetails.putExtra("shipdata", R.id.jintsuu);
			startActivity(intent_shipdetails);
			break;
		case "那珂":
			intent_shipdetails = new Intent(shipsearch.this,
					Activity_ship.class);
			intent_shipdetails.putExtra("shipdata", R.id.naka);
			startActivity(intent_shipdetails);
			break;
		case "千岁":
			intent_shipdetails = new Intent(shipsearch.this,
					Activity_ship.class);
			intent_shipdetails.putExtra("shipdata", R.id.chitose);
			startActivity(intent_shipdetails);
			break;
		case "千代田":
			intent_shipdetails = new Intent(shipsearch.this,
					Activity_ship.class);
			intent_shipdetails.putExtra("shipdata", R.id.chiyoda);
			startActivity(intent_shipdetails);
			break;

		// 51-60

		case "最上":
			intent_shipdetails = new Intent(shipsearch.this,
					Activity_ship.class);
			intent_shipdetails.putExtra("shipdata", R.id.mogami);
			startActivity(intent_shipdetails);
			break;
		case "古鹰":
			intent_shipdetails = new Intent(shipsearch.this,
					Activity_ship.class);
			intent_shipdetails.putExtra("shipdata", R.id.furutaka);
			startActivity(intent_shipdetails);
			break;
		case "加古":
			intent_shipdetails = new Intent(shipsearch.this,
					Activity_ship.class);
			intent_shipdetails.putExtra("shipdata", R.id.kako);
			startActivity(intent_shipdetails);
			break;
		case "青叶":
			intent_shipdetails = new Intent(shipsearch.this,
					Activity_ship.class);
			intent_shipdetails.putExtra("shipdata", R.id.aoba);
			startActivity(intent_shipdetails);
			break;
		case "妙高":
			intent_shipdetails = new Intent(shipsearch.this,
					Activity_ship.class);
			intent_shipdetails.putExtra("shipdata", R.id.myoukou);
			startActivity(intent_shipdetails);
			break;
		case "那智":
			intent_shipdetails = new Intent(shipsearch.this,
					Activity_ship.class);
			intent_shipdetails.putExtra("shipdata", R.id.nachi);
			startActivity(intent_shipdetails);
			break;
		case "足柄":
			intent_shipdetails = new Intent(shipsearch.this,
					Activity_ship.class);
			intent_shipdetails.putExtra("shipdata", R.id.ashigara);
			startActivity(intent_shipdetails);
			break;
		case "羽黑":
			intent_shipdetails = new Intent(shipsearch.this,
					Activity_ship.class);
			intent_shipdetails.putExtra("shipdata", R.id.haguro);
			startActivity(intent_shipdetails);
			break;
		case "高雄":
			intent_shipdetails = new Intent(shipsearch.this,
					Activity_ship.class);
			intent_shipdetails.putExtra("shipdata", R.id.takao);
			startActivity(intent_shipdetails);
			break;
		case "爱宕":
			intent_shipdetails = new Intent(shipsearch.this,
					Activity_ship.class);
			intent_shipdetails.putExtra("shipdata", R.id.atago);
			startActivity(intent_shipdetails);
			break;

		// 61-70

		case "摩耶":
			intent_shipdetails = new Intent(shipsearch.this,
					Activity_ship.class);
			intent_shipdetails.putExtra("shipdata", R.id.maya);
			startActivity(intent_shipdetails);
			break;
		case "鸟海":
			intent_shipdetails = new Intent(shipsearch.this,
					Activity_ship.class);
			intent_shipdetails.putExtra("shipdata", R.id.chyoukai);
			startActivity(intent_shipdetails);
			break;
		case "利根":
			intent_shipdetails = new Intent(shipsearch.this,
					Activity_ship.class);
			intent_shipdetails.putExtra("shipdata", R.id.tone);
			startActivity(intent_shipdetails);
			break;
		case "筑摩":
			intent_shipdetails = new Intent(shipsearch.this,
					Activity_ship.class);
			intent_shipdetails.putExtra("shipdata", R.id.chikuma);
			startActivity(intent_shipdetails);
			break;
		case "飞鹰":
			intent_shipdetails = new Intent(shipsearch.this,
					Activity_ship.class);
			intent_shipdetails.putExtra("shipdata", R.id.hiyou);
			startActivity(intent_shipdetails);
			break;
		case "隼鹰":
			intent_shipdetails = new Intent(shipsearch.this,
					Activity_ship.class);
			intent_shipdetails.putExtra("shipdata", R.id.jyunyou);
			startActivity(intent_shipdetails);
			break;
		case "胧":
			intent_shipdetails = new Intent(shipsearch.this,
					Activity_ship.class);
			intent_shipdetails.putExtra("shipdata", R.id.oboro);
			startActivity(intent_shipdetails);
			break;
		case "曙":
			intent_shipdetails = new Intent(shipsearch.this,
					Activity_ship.class);
			intent_shipdetails.putExtra("shipdata", R.id.akebono);
			startActivity(intent_shipdetails);
			break;
		case "涟":
			intent_shipdetails = new Intent(shipsearch.this,
					Activity_ship.class);
			intent_shipdetails.putExtra("shipdata", R.id.sazanami);
			startActivity(intent_shipdetails);
			break;
		case "潮":
			intent_shipdetails = new Intent(shipsearch.this,
					Activity_ship.class);
			intent_shipdetails.putExtra("shipdata", R.id.ushio);
			startActivity(intent_shipdetails);
			break;

		// 71-80

		case "晓":
			intent_shipdetails = new Intent(shipsearch.this,
					Activity_ship.class);
			intent_shipdetails.putExtra("shipdata", R.id.akatsuki);
			startActivity(intent_shipdetails);
			break;
		case "响":
			intent_shipdetails = new Intent(shipsearch.this,
					Activity_ship.class);
			intent_shipdetails.putExtra("shipdata", R.id.hibiki);
			startActivity(intent_shipdetails);
			break;
		case "雷":
			intent_shipdetails = new Intent(shipsearch.this,
					Activity_ship.class);
			intent_shipdetails.putExtra("shipdata", R.id.ikazuchi);
			startActivity(intent_shipdetails);
			break;
		case "电":
			intent_shipdetails = new Intent(shipsearch.this,
					Activity_ship.class);
			intent_shipdetails.putExtra("shipdata", R.id.inazuma);
			startActivity(intent_shipdetails);
			break;
		case "初春":
			intent_shipdetails = new Intent(shipsearch.this,
					Activity_ship.class);
			intent_shipdetails.putExtra("shipdata", R.id.hatsuharu);
			startActivity(intent_shipdetails);
			break;
		case "子日":
			intent_shipdetails = new Intent(shipsearch.this,
					Activity_ship.class);
			intent_shipdetails.putExtra("shipdata", R.id.nenohi);
			startActivity(intent_shipdetails);
			break;
		case "若叶":
			intent_shipdetails = new Intent(shipsearch.this,
					Activity_ship.class);
			intent_shipdetails.putExtra("shipdata", R.id.wakaba);
			startActivity(intent_shipdetails);
			break;
		case "初霜":
			intent_shipdetails = new Intent(shipsearch.this,
					Activity_ship.class);
			intent_shipdetails.putExtra("shipdata", R.id.hatsushimo);
			startActivity(intent_shipdetails);
			break;
		case "白露":
			intent_shipdetails = new Intent(shipsearch.this,
					Activity_ship.class);
			intent_shipdetails.putExtra("shipdata", R.id.shiratsuyu);
			startActivity(intent_shipdetails);
			break;
		case "时雨":
			intent_shipdetails = new Intent(shipsearch.this,
					Activity_ship.class);
			intent_shipdetails.putExtra("shipdata", R.id.shigure);
			startActivity(intent_shipdetails);
			break;

		// 81-90

		case "村雨":
			intent_shipdetails = new Intent(shipsearch.this,
					Activity_ship.class);
			intent_shipdetails.putExtra("shipdata", R.id.murasame);
			startActivity(intent_shipdetails);
			break;
		case "夕立":
			intent_shipdetails = new Intent(shipsearch.this,
					Activity_ship.class);
			intent_shipdetails.putExtra("shipdata", R.id.yuudachi);
			startActivity(intent_shipdetails);
			break;
		case "五月雨":
			intent_shipdetails = new Intent(shipsearch.this,
					Activity_ship.class);
			intent_shipdetails.putExtra("shipdata", R.id.samidare);
			startActivity(intent_shipdetails);
			break;
		case "凉风":
			intent_shipdetails = new Intent(shipsearch.this,
					Activity_ship.class);
			intent_shipdetails.putExtra("shipdata", R.id.suzukaze);
			startActivity(intent_shipdetails);
			break;
		case "朝潮":
			intent_shipdetails = new Intent(shipsearch.this,
					Activity_ship.class);
			intent_shipdetails.putExtra("shipdata", R.id.asashio);
			startActivity(intent_shipdetails);
			break;
		case "大潮":
			intent_shipdetails = new Intent(shipsearch.this,
					Activity_ship.class);
			intent_shipdetails.putExtra("shipdata", R.id.ooshio);
			startActivity(intent_shipdetails);
			break;
		case "满潮":
			intent_shipdetails = new Intent(shipsearch.this,
					Activity_ship.class);
			intent_shipdetails.putExtra("shipdata", R.id.michishio);
			startActivity(intent_shipdetails);
			break;
		case "荒潮":
			intent_shipdetails = new Intent(shipsearch.this,
					Activity_ship.class);
			intent_shipdetails.putExtra("shipdata", R.id.arashio);
			startActivity(intent_shipdetails);
			break;
		case "霰":
			intent_shipdetails = new Intent(shipsearch.this,
					Activity_ship.class);
			intent_shipdetails.putExtra("shipdata", R.id.arare);
			startActivity(intent_shipdetails);
			break;
		case "霞":
			intent_shipdetails = new Intent(shipsearch.this,
					Activity_ship.class);
			intent_shipdetails.putExtra("shipdata", R.id.kazumi);
			startActivity(intent_shipdetails);
			break;

		// 91-94

		case "阳炎":
			intent_shipdetails = new Intent(shipsearch.this,
					Activity_ship.class);
			intent_shipdetails.putExtra("shipdata", R.id.kagerou);
			startActivity(intent_shipdetails);
			break;
		case "不知火":
			intent_shipdetails = new Intent(shipsearch.this,
					Activity_ship.class);
			intent_shipdetails.putExtra("shipdata", R.id.shiranui);
			startActivity(intent_shipdetails);
			break;
		case "黑潮":
			intent_shipdetails = new Intent(shipsearch.this,
					Activity_ship.class);
			intent_shipdetails.putExtra("shipdata", R.id.kuroshio);
			startActivity(intent_shipdetails);
			break;
		case "祥凤":
			intent_shipdetails = new Intent(shipsearch.this,
					Activity_ship.class);
			intent_shipdetails.putExtra("shipdata", R.id.shyouhou);
			startActivity(intent_shipdetails);
			break;

		// 101-150

		case "翔鹤":
			intent_shipdetails = new Intent(shipsearch.this,
					Activity_ship.class);
			intent_shipdetails.putExtra("shipdata", R.id.shyoukaku);
			startActivity(intent_shipdetails);
			break;
		case "瑞鹤":
			intent_shipdetails = new Intent(shipsearch.this,
					Activity_ship.class);
			intent_shipdetails.putExtra("shipdata", R.id.zuikaku);
			startActivity(intent_shipdetails);
			break;
		case "鬼怒":
			intent_shipdetails = new Intent(shipsearch.this,
					Activity_ship.class);
			intent_shipdetails.putExtra("shipdata", R.id.kinu);
			startActivity(intent_shipdetails);
			break;
		case "阿武隈":
			intent_shipdetails = new Intent(shipsearch.this,
					Activity_ship.class);
			intent_shipdetails.putExtra("shipdata", R.id.abukuma);
			startActivity(intent_shipdetails);
			break;
		case "夕张":
			intent_shipdetails = new Intent(shipsearch.this,
					Activity_ship.class);
			intent_shipdetails.putExtra("shipdata", R.id.yuubari);
			startActivity(intent_shipdetails);
			break;
		case "瑞凤":
			intent_shipdetails = new Intent(shipsearch.this,
					Activity_ship.class);
			intent_shipdetails.putExtra("shipdata", R.id.zuihou);
			startActivity(intent_shipdetails);
			break;
		case "三隈":
			intent_shipdetails = new Intent(shipsearch.this,
					Activity_ship.class);
			intent_shipdetails.putExtra("shipdata", R.id.mikuma);
			startActivity(intent_shipdetails);
		case "初风":
			intent_shipdetails = new Intent(shipsearch.this,
					Activity_ship.class);
			intent_shipdetails.putExtra("shipdata", R.id.hatsukaze);
			startActivity(intent_shipdetails);
			break;
		case "舞风":
			intent_shipdetails = new Intent(shipsearch.this,
					Activity_ship.class);
			intent_shipdetails.putExtra("shipdata", R.id.maikaze);
			startActivity(intent_shipdetails);
			break;
		case "衣笠":
			intent_shipdetails = new Intent(shipsearch.this,
					Activity_ship.class);
			intent_shipdetails.putExtra("shipdata", R.id.kinugasa);
			startActivity(intent_shipdetails);
			break;
		case "伊19":
			intent_shipdetails = new Intent(shipsearch.this,
					Activity_ship.class);
			intent_shipdetails.putExtra("shipdata", R.id.i19);
			startActivity(intent_shipdetails);
			break;
		case "铃谷":
			intent_shipdetails = new Intent(shipsearch.this,
					Activity_ship.class);
			intent_shipdetails.putExtra("shipdata", R.id.suzuya);
			startActivity(intent_shipdetails);
			break;
		case "熊野":
			intent_shipdetails = new Intent(shipsearch.this,
					Activity_ship.class);
			intent_shipdetails.putExtra("shipdata", R.id.kumano);
			startActivity(intent_shipdetails);
			break;
		case "伊58":
			intent_shipdetails = new Intent(shipsearch.this,
					Activity_ship.class);
			intent_shipdetails.putExtra("shipdata", R.id.i58);
			startActivity(intent_shipdetails);
			break;
		case "伊168":
			intent_shipdetails = new Intent(shipsearch.this,
					Activity_ship.class);
			intent_shipdetails.putExtra("shipdata", R.id.i168);
			startActivity(intent_shipdetails);
			break;
		case "伊8":
			intent_shipdetails = new Intent(shipsearch.this,
					Activity_ship.class);
			intent_shipdetails.putExtra("shipdata", R.id.i8);
			startActivity(intent_shipdetails);
			break;
		case "大和":
			intent_shipdetails = new Intent(shipsearch.this,
					Activity_ship.class);
			intent_shipdetails.putExtra("shipdata", R.id.yamato);
			startActivity(intent_shipdetails);
			break;
		case "秋云":
			intent_shipdetails = new Intent(shipsearch.this,
					Activity_ship.class);
			intent_shipdetails.putExtra("shipdata", R.id.akigumo);
			startActivity(intent_shipdetails);
			break;
		case "夕云":
			intent_shipdetails = new Intent(shipsearch.this,
					Activity_ship.class);
			intent_shipdetails.putExtra("shipdata", R.id.yuugumo);
			startActivity(intent_shipdetails);
			break;
		case "卷云":
			intent_shipdetails = new Intent(shipsearch.this,
					Activity_ship.class);
			intent_shipdetails.putExtra("shipdata", R.id.makigumo);
			startActivity(intent_shipdetails);
			break;
		case "长波":
			intent_shipdetails = new Intent(shipsearch.this,
					Activity_ship.class);
			intent_shipdetails.putExtra("shipdata", R.id.naganami);
			startActivity(intent_shipdetails);
			break;
		case "阿贺野":
			intent_shipdetails = new Intent(shipsearch.this,
					Activity_ship.class);
			intent_shipdetails.putExtra("shipdata", R.id.agano);
			startActivity(intent_shipdetails);
			break;
		case "能代":
			intent_shipdetails = new Intent(shipsearch.this,
					Activity_ship.class);
			intent_shipdetails.putExtra("shipdata", R.id.noshiro);
			startActivity(intent_shipdetails);
			break;
		case "矢矧":
			intent_shipdetails = new Intent(shipsearch.this,
					Activity_ship.class);
			intent_shipdetails.putExtra("shipdata", R.id.yahagi);
			startActivity(intent_shipdetails);
			break;
		case "酒匂":
			intent_shipdetails = new Intent(shipsearch.this,
					Activity_ship.class);
			intent_shipdetails.putExtra("shipdata", R.id.sakawa);
			startActivity(intent_shipdetails);
			break;
		case "武藏":
			intent_shipdetails = new Intent(shipsearch.this,
					Activity_ship.class);
			intent_shipdetails.putExtra("shipdata", R.id.musashi);
			startActivity(intent_shipdetails);
			break;

		// 151-200

		case "大凤":
			intent_shipdetails = new Intent(shipsearch.this,
					Activity_ship.class);
			intent_shipdetails.putExtra("shipdata", R.id.taihou);
			startActivity(intent_shipdetails);
			break;
		case "香取":
			intent_shipdetails = new Intent(shipsearch.this,
					Activity_ship.class);
			intent_shipdetails.putExtra("shipdata", R.id.katori);
			startActivity(intent_shipdetails);
			break;
		case "i401":
			intent_shipdetails = new Intent(shipsearch.this,
					Activity_ship.class);
			intent_shipdetails.putExtra("shipdata", R.id.i401);
			startActivity(intent_shipdetails);
			break;
		case "秋津丸":
			intent_shipdetails = new Intent(shipsearch.this,
					Activity_ship.class);
			intent_shipdetails.putExtra("shipdata", R.id.akitsumaru);
			startActivity(intent_shipdetails);
			break;
		case "马路油":
			intent_shipdetails = new Intent(shipsearch.this,
					Activity_ship.class);
			intent_shipdetails.putExtra("shipdata", R.id.maruyu);
			startActivity(intent_shipdetails);
			break;
		case "弥生":
			intent_shipdetails = new Intent(shipsearch.this,
					Activity_ship.class);
			intent_shipdetails.putExtra("shipdata", R.id.yayoi);
			startActivity(intent_shipdetails);
			break;
		case "卯月":
			intent_shipdetails = new Intent(shipsearch.this,
					Activity_ship.class);
			intent_shipdetails.putExtra("shipdata", R.id.uzuki);
			startActivity(intent_shipdetails);
			break;
		case "矶风":
			intent_shipdetails = new Intent(shipsearch.this,
					Activity_ship.class);
			intent_shipdetails.putExtra("shipdata", R.id.isokaze);
			startActivity(intent_shipdetails);
			break;
		case "浦风":
			intent_shipdetails = new Intent(shipsearch.this,
					Activity_ship.class);
			intent_shipdetails.putExtra("shipdata", R.id.urakaze);
			startActivity(intent_shipdetails);
			break;
		case "谷风":
			intent_shipdetails = new Intent(shipsearch.this,
					Activity_ship.class);
			intent_shipdetails.putExtra("shipdata", R.id.tanikaze);
			startActivity(intent_shipdetails);
			break;
		case "浜风":
			intent_shipdetails = new Intent(shipsearch.this,
					Activity_ship.class);
			intent_shipdetails.putExtra("shipdata", R.id.hamakaze);
			startActivity(intent_shipdetails);
			break;
		case "俾斯麦":
		case "bismarck":
		case "Bismarck":
			intent_shipdetails = new Intent(shipsearch.this,
					Activity_ship.class);
			intent_shipdetails.putExtra("shipdata", R.id.bismarck);
			startActivity(intent_shipdetails);
			break;
		case "z1":
			intent_shipdetails = new Intent(shipsearch.this,
					Activity_ship.class);
			intent_shipdetails.putExtra("shipdata", R.id.z1);
			startActivity(intent_shipdetails);
			break;
		case "z3":
			intent_shipdetails = new Intent(shipsearch.this,
					Activity_ship.class);
			intent_shipdetails.putExtra("shipdata", R.id.z3);
			startActivity(intent_shipdetails);
			break;
		case "欧根亲王":
			intent_shipdetails = new Intent(shipsearch.this,
					Activity_ship.class);
			intent_shipdetails.putExtra("shipdata", R.id.eugen);
			startActivity(intent_shipdetails);
			break;
		case "天津风":
			intent_shipdetails = new Intent(shipsearch.this,
					Activity_ship.class);
			intent_shipdetails.putExtra("shipdata", R.id.amatsukaze);
			startActivity(intent_shipdetails);
			break;
		case "明石":
			intent_shipdetails = new Intent(shipsearch.this,
					Activity_ship.class);
			intent_shipdetails.putExtra("shipdata", R.id.akashi);
			startActivity(intent_shipdetails);
			break;
		case "大淀":
			intent_shipdetails = new Intent(shipsearch.this,
					Activity_ship.class);
			intent_shipdetails.putExtra("shipdata", R.id.ooyodo);
			startActivity(intent_shipdetails);
			break;
		case "大鲸":
			intent_shipdetails = new Intent(shipsearch.this,
					Activity_ship.class);
			intent_shipdetails.putExtra("shipdata", R.id.taigei);
			startActivity(intent_shipdetails);
			break;
		case "时津风":
			intent_shipdetails = new Intent(shipsearch.this,
					Activity_ship.class);
			intent_shipdetails.putExtra("shipdata", R.id.tokitsukaze);
			startActivity(intent_shipdetails);
			break;

		// 201-250

		case "云龙":
			intent_shipdetails = new Intent(shipsearch.this,
					Activity_ship.class);
			intent_shipdetails.putExtra("shipdata", R.id.unryuu);
			startActivity(intent_shipdetails);
			break;
		case "天城":
			intent_shipdetails = new Intent(shipsearch.this,
					Activity_ship.class);
			intent_shipdetails.putExtra("shipdata", R.id.amagi);
			startActivity(intent_shipdetails);
			break;
		case "葛城":
			intent_shipdetails = new Intent(shipsearch.this,
					Activity_ship.class);
			intent_shipdetails.putExtra("shipdata", R.id.katsuragi);
			startActivity(intent_shipdetails);
			break;
		case "春雨":
			intent_shipdetails = new Intent(shipsearch.this,
					Activity_ship.class);
			intent_shipdetails.putExtra("shipdata", R.id.harusame);
			startActivity(intent_shipdetails);
			break;
		case "早霜":
			intent_shipdetails = new Intent(shipsearch.this,
					Activity_ship.class);
			intent_shipdetails.putExtra("shipdata", R.id.hayashimo);
			startActivity(intent_shipdetails);
			break;
		case "清霜":
			intent_shipdetails = new Intent(shipsearch.this,
					Activity_ship.class);
			intent_shipdetails.putExtra("shipdata", R.id.kiyoshimo);
			startActivity(intent_shipdetails);
			break;
		case "朝云":
			intent_shipdetails = new Intent(shipsearch.this,
					Activity_ship.class);
			intent_shipdetails.putExtra("shipdata", R.id.asagumo);
			startActivity(intent_shipdetails);
			break;
		case "山云":
			intent_shipdetails = new Intent(shipsearch.this,
					Activity_ship.class);
			intent_shipdetails.putExtra("shipdata", R.id.yamagumo);
			startActivity(intent_shipdetails);
			break;
		case "野分":
			intent_shipdetails = new Intent(shipsearch.this,
					Activity_ship.class);
			intent_shipdetails.putExtra("shipdata", R.id.nowaki);
			startActivity(intent_shipdetails);
			break;
		case "秋月":
			intent_shipdetails = new Intent(shipsearch.this,
					Activity_ship.class);
			intent_shipdetails.putExtra("shipdata", R.id.akizuki);
			startActivity(intent_shipdetails);
			break;
		case "照月":
			intent_shipdetails = new Intent(shipsearch.this,
					Activity_ship.class);
			intent_shipdetails.putExtra("shipdata", R.id.teruzuki);
			startActivity(intent_shipdetails);
			break;
		case "初月":
			intent_shipdetails = new Intent(shipsearch.this,
					Activity_ship.class);
			intent_shipdetails.putExtra("shipdata", R.id.hatsuzuki);
			startActivity(intent_shipdetails);
			break;
		case "高波":
			intent_shipdetails = new Intent(shipsearch.this,
					Activity_ship.class);
			intent_shipdetails.putExtra("shipdata", R.id.takanami);
			startActivity(intent_shipdetails);
			break;
		case "朝霜":
			intent_shipdetails = new Intent(shipsearch.this,
					Activity_ship.class);
			intent_shipdetails.putExtra("shipdata", R.id.asashimo);
			startActivity(intent_shipdetails);
			break;
		case "U-511":
			intent_shipdetails = new Intent(shipsearch.this,
					Activity_ship.class);
			intent_shipdetails.putExtra("shipdata", R.id.yu511);
			startActivity(intent_shipdetails);
			break;
		case "齐柏林":
		case "齐柏林伯爵":
			intent_shipdetails = new Intent(shipsearch.this,
					Activity_ship.class);
			intent_shipdetails.putExtra("shipdata", R.id.GrafZeppelin);
			startActivity(intent_shipdetails);
			break;
		case "Littorio":
		case "利托里奥":
			intent_shipdetails = new Intent(shipsearch.this,
					Activity_ship.class);
			intent_shipdetails.putExtra("shipdata", R.id.littorio);
			startActivity(intent_shipdetails);
			break;
		case "罗马":
			intent_shipdetails = new Intent(shipsearch.this,
					Activity_ship.class);
			intent_shipdetails.putExtra("shipdata", R.id.roma);
			startActivity(intent_shipdetails);
			break;
		case "Libeccio":
		case "西南风":
			intent_shipdetails = new Intent(shipsearch.this,
					Activity_ship.class);
			intent_shipdetails.putExtra("shipdata", R.id.libeccio);
			startActivity(intent_shipdetails);
			break;
		case "Zara":
			intent_shipdetails = new Intent(shipsearch.this,
					Activity_ship.class);
			intent_shipdetails.putExtra("shipdata", R.id.zara);
			startActivity(intent_shipdetails);
			break;
		case "瑞穗":
			intent_shipdetails = new Intent(shipsearch.this,
					Activity_ship.class);
			intent_shipdetails.putExtra("shipdata", R.id.mitsuhou);
			startActivity(intent_shipdetails);
			break;
		case "冲波":
			intent_shipdetails = new Intent(shipsearch.this,
					Activity_ship.class);
			intent_shipdetails.putExtra("shipdata", R.id.okinami);
			startActivity(intent_shipdetails);
			break;
		case "风云":
			intent_shipdetails = new Intent(shipsearch.this,
					Activity_ship.class);
			intent_shipdetails.putExtra("shipdata", R.id.kazagumo);
			startActivity(intent_shipdetails);
			break;
		case "岚":
			intent_shipdetails = new Intent(shipsearch.this,
					Activity_ship.class);
			intent_shipdetails.putExtra("shipdata", R.id.arashi);
			startActivity(intent_shipdetails);
			break;
		case "萩风":
			intent_shipdetails = new Intent(shipsearch.this,
					Activity_ship.class);
			intent_shipdetails.putExtra("shipdata", R.id.hagikaze);
			startActivity(intent_shipdetails);
			break;
		case "海风":
			intent_shipdetails = new Intent(shipsearch.this,
					Activity_ship.class);
			intent_shipdetails.putExtra("shipdata", R.id.umikaze);
			startActivity(intent_shipdetails);
			break;
		case "江风":
			intent_shipdetails = new Intent(shipsearch.this,
					Activity_ship.class);
			intent_shipdetails.putExtra("shipdata", R.id.kawakaze);
			startActivity(intent_shipdetails);
			break;
		case "速吸":
			intent_shipdetails = new Intent(shipsearch.this,
					Activity_ship.class);
			intent_shipdetails.putExtra("shipdata", R.id.hayasui);
			startActivity(intent_shipdetails);
			break;
		case "本子岛":
		case "鹿岛":
			intent_shipdetails = new Intent(shipsearch.this,
					Activity_ship.class);
			intent_shipdetails.putExtra("shipdata", R.id.kashima);
			startActivity(intent_shipdetails);
			break;

		// Add kanmusu above
		default:
			Toast.makeText(shipsearch.this, "您要找的舰娘看到您后惊慌失措地逃走咯",
					Toast.LENGTH_SHORT).show();
			break;
		}
	}

}
