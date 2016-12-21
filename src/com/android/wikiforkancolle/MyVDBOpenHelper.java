package com.android.wikiforkancolle;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteDatabase.CursorFactory;

public class MyVDBOpenHelper extends SQLiteOpenHelper {
	public MyVDBOpenHelper(Context context, String name, CursorFactory factory,
			int version) {
		super(context, "voice.db", null, 1);
	}

	@Override
	// 调用SQLiteOpenHelper的create方法，在没有相应数据库时创建同名数据库
	public void onCreate(SQLiteDatabase db) {
		db.execSQL("CREATE TABLE person(personid INTEGER PRIMARY KEY AUTOINCREMENT,name VARCHAR(20))");

	}

	// 调用SQLiteOpenHelper的onUpgrade方法，数据库版本号变换时更新数据库，暂未使用
	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

	}
}
