package com.example.AppMusic_AHL.dao;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.AppMusic_AHL.model.YeuThich;
import com.example.AppMusic_AHL.sqlite.MusicOpenHelper;

import java.util.ArrayList;
import java.util.List;

public class NhacYeuThichDAO {
    public static final String SQL_NEWTABLE_MYFAVORITE = "CREATE TABLE FAVORITE (" +
            " IDBaiHat integer primary key AUTOINCREMENT,"
            + " TenBaiHat text,"
            + " TenCaSi text,"
            + " LinkBaiHat integer,"
            + " LinkAnhBaiHat integer,";
    public static final String TABLE_NAME_MYFAVORITE = "FAVORITE";
    public static final String tc_IDBAIHAT = "IDBaiHat";
    public static final String tc_TENBAIHAT = "TenBaiHat";
    public static final String tc_TENCASI = "TenCaSi";
    public static final String tc_LINKBAIHAT = "LinkBaiHat";
    public static final String tc_LINKANHBAIHAT = "LinkAnhBaiHat";
    MusicOpenHelper musicOpenHelper;
    SQLiteDatabase sqLiteDatabase;


    public NhacYeuThichDAO(Context context) {
        musicOpenHelper = new MusicOpenHelper(context);//tao DB
        sqLiteDatabase = musicOpenHelper.getWritableDatabase();//cho phep ghi
    }

    public int InsertSONGFV(YeuThich yeuThich) {
        ContentValues values = new ContentValues();
        // chèn 1 hàng mới
        values.put(tc_TENBAIHAT, yeuThich.getTenBaiHat());
        values.put(tc_TENCASI, yeuThich.getTenCasi());
        values.put(tc_LINKBAIHAT, yeuThich.getLinkBaiHat() + "");
        values.put(tc_LINKANHBAIHAT, yeuThich.getLinkAnhBaiHat() + "");
        if (sqLiteDatabase.insert(TABLE_NAME_MYFAVORITE, null, values) < 0) {

            return -1; //insert khong thanh cong
        }
        return 1; //insert thanh cong
    }


    public List<YeuThich> ALLYeuThich() {
        List<YeuThich> list = new ArrayList<YeuThich>();
        Cursor cursor = sqLiteDatabase.query(TABLE_NAME_MYFAVORITE, null, null, null, null, null, null);
        cursor.moveToFirst();
        while (cursor.isAfterLast() == false) {
            YeuThich favorite = new YeuThich();
            favorite.setIDFavorite(cursor.getInt(cursor.getColumnIndex(tc_IDBAIHAT)));
            favorite.setTenBaiHat(cursor.getString(cursor.getColumnIndex(tc_TENBAIHAT)));
            favorite.setTenCasi(cursor.getString(cursor.getColumnIndex(tc_TENCASI)));
            favorite.setLinkAnhBaiHat(cursor.getInt(cursor.getColumnIndex(tc_LINKANHBAIHAT)));
            favorite.setLinkBaiHat(cursor.getInt(cursor.getColumnIndex(tc_LINKBAIHAT)));
            list.add(favorite);
            cursor.moveToNext();
        }
        cursor.close();
        return list;
    }
}
