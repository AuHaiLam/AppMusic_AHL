package com.example.AppMusic_AHL.dao;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.AppMusic_AHL.model.Music;
import com.example.AppMusic_AHL.model.Nhac;
import com.example.AppMusic_AHL.sqlite.MusicOpenHelper;

import java.util.ArrayList;
import java.util.List;

public class MusicDAO {

    public static final String SQL_TABLE_MUSIC = "CREATE TABLE MUSIC (" +
            " IDBaiHat integer primary key AUTOINCREMENT,"
            + " IDPlaylist integer,"
            + " IDTheLoai integer,"
            + " IDCaSi integer,"
            + " Time text,"
            + " TenBaiHat text,"
            + " TenCaSi text,"
            + " LinkBaiHat integer,"
            + " LinkAnhBaiHat integer,"
            + " LinkBaiHatShare text)";
    public static final String TABLE_NAME_BAIHAT = "MUSIC";
    public static final String al_IDBAIHAT = "IDBaiHat";
    public static final String al_IDPLAYLIST = "IDPlaylist";
    public static final String al_IDTHELOAI = "IDTheLoai";
    public static final String al_IDCaSi = "IDCaSi";
    public static final String al_TIME = "Time";
    public static final String al_TENBAIHAT = "TenBaiHat";
    public static final String al_TENCASI = "TenCaSi";
    public static final String al_LINKNHAC = "LinkBaiHat";
    public static final String al_LINKANHNHAC = "LinkAnhBaiHat";
    public static final String al_LINKNHACSHARE = "LinkBaiHatShare";
    MusicOpenHelper musicOpenHelper;
    SQLiteDatabase sqLiteDatabase;


    public MusicDAO(Context context) {
        musicOpenHelper = new MusicOpenHelper(context);//tao DB
        sqLiteDatabase = musicOpenHelper.getWritableDatabase();//cho phep ghi
    }


    public int InsertMusic(Music music) {
        ContentValues values = new ContentValues();
        // chèn 1 hàng mới
        values.put(al_IDTHELOAI, music.getIdTheLoai() + "");
        values.put(al_IDPLAYLIST, music.getIdPlayList() + "");
        values.put(al_IDCaSi, music.getIdCaSi() + "");
        values.put(al_TENBAIHAT, music.getTenBaiHat());
        values.put(al_TENCASI, music.getTenCasi());
        values.put(al_TIME, music.getTime());
        values.put(al_LINKNHAC, music.getLinknhac() + "");
        values.put(al_LINKANHNHAC, music.getLinkAnh() + "");
        values.put(al_LINKNHACSHARE, music.getLinkShare());

        if (sqLiteDatabase.insert(TABLE_NAME_BAIHAT, null, values) < 0) {

            return -1; //insert khong thanh cong
        }
        return 1; //insert thanh cong
    }


    public List<Nhac> ALLMusic() {
        List<Nhac> musicList = new ArrayList<Nhac>();
        Cursor cursor = sqLiteDatabase.query(TABLE_NAME_BAIHAT, null, null, null, null, null, null);
        cursor.moveToFirst();
        while (cursor.isAfterLast() == false) {
            Nhac music = new Nhac();
            music.setTenBaiHat(cursor.getString(cursor.getColumnIndex(al_TENBAIHAT)));
            music.setTenCasi(cursor.getString(cursor.getColumnIndex(al_TENCASI)));
            music.setThoiGian(cursor.getString(cursor.getColumnIndex(al_TIME)));
            music.setLinkAnhbh(cursor.getInt(cursor.getColumnIndex(al_LINKANHNHAC)));
            music.setLinkNhacbh(cursor.getInt(cursor.getColumnIndex(al_LINKNHAC)));
            musicList.add(music);
            cursor.moveToNext();
        }
        cursor.close();
        return musicList;

    }

    public List<Music> ALLPlaylist() {
        List<Music> musicList = new ArrayList<>();

        SQLiteDatabase sqLiteDatabase = musicOpenHelper.getReadableDatabase();

        String select2 = "SELECT SONG.IDPlaylist, SONG.TenBaiHat, SONG.TenCaSi, SONG.LinkBaiHat, SONG.LinkAnhBaiHat," + " PLAYLIST.IDPlaylist, PLAYLIST.TenPlaylist"
                + " FROM " + TABLE_NAME_BAIHAT + " INNER JOIN " + NhacYeuThichDAO.TABLE_NAME_MYFAVORITE
                + " ON SONG.IDPlaylist = PLAYLIST.IDPlaylist "
                + " WHERE SONG.IDPlaylist = PLAYLIST.IDPlaylist ";

        Cursor cursor = sqLiteDatabase.rawQuery(select2, null);
        cursor.moveToFirst();
        while (cursor.isAfterLast() == false) {
            Music music = new Music();
            music.setTenBaiHat(cursor.getString(cursor.getColumnIndex(al_TENBAIHAT)));
            music.setTenCasi(cursor.getString(cursor.getColumnIndex(al_TENCASI)));
            music.setLinkAnh(cursor.getInt(cursor.getColumnIndex(al_LINKANHNHAC)));
            music.setLinknhac(cursor.getInt(cursor.getColumnIndex(al_LINKNHAC)));
            musicList.add(music);
            cursor.moveToNext();
        }
        // dong ket noi con tro
        cursor.close();
        // dong ket noi DB
        sqLiteDatabase.close();
        return musicList;
    }


}
