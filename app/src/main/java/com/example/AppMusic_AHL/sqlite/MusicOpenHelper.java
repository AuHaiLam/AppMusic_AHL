package com.example.AppMusic_AHL.sqlite;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.AppMusic_AHL.dao.MusicDAO;

public class MusicOpenHelper extends SQLiteOpenHelper {

    public static final String DB_MUSIC = "MUSIC";
    public static final int VERSION = 1;

    public MusicOpenHelper(Context context) {
        super(context, DB_MUSIC, null, VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(MusicDAO.SQL_TABLE_MUSIC);


    }


    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL(" DROP TABLE IF EXISTS " + MusicDAO.TABLE_NAME_BAIHAT);

    }


}
