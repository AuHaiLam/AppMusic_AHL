package com.example.AppMusic_AHL.model;

public class Music {

    public int idBaiHat, idTheLoai, idPlayList, idCaSi;
    public String TenBaiHat, TenCasi, time, LinkShare;
    public int LinkAnh, Linknhac;

    public Music() {

    }


    public Music(int idTheLoai, int idPlayList, int idCaSi, String tenBaiHat, String tenCasi, String time, int linknhac, int linkAnh, String linkShare) {

        this.idTheLoai = idTheLoai;
        this.idPlayList = idPlayList;
        this.idCaSi = idCaSi;
        TenBaiHat = tenBaiHat;
        TenCasi = tenCasi;
        this.time = time;
        Linknhac = linknhac;
        LinkAnh = linkAnh;
        LinkShare = linkShare;
    }


    public int getIdBaiHat() {
        return idBaiHat;
    }

    public void setIdBaiHat(int idBaiHat) {
        this.idBaiHat = idBaiHat;
    }

    public int getIdTheLoai() {
        return idTheLoai;
    }

    public void setIdTheLoai(int idTheLoai) {
        this.idTheLoai = idTheLoai;
    }

    public int getIdPlayList() {
        return idPlayList;
    }

    public void setIdPlayList(int idPlayList) {
        this.idPlayList = idPlayList;
    }

    public int getIdCaSi() {
        return idCaSi;
    }

    public void setIdCaSi(int idCaSi) {
        this.idCaSi = idCaSi;
    }

    public String getTenBaiHat() {
        return TenBaiHat;
    }

    public void setTenBaiHat(String tenBaiHat) {
        TenBaiHat = tenBaiHat;
    }

    public String getTenCasi() {
        return TenCasi;
    }

    public void setTenCasi(String tenCasi) {
        TenCasi = tenCasi;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getLinkShare() {
        return LinkShare;
    }

    public void setLinkShare(String linkShare) {
        LinkShare = linkShare;
    }

    public int getLinkAnh() {
        return LinkAnh;
    }

    public void setLinkAnh(int linkAnh) {
        LinkAnh = linkAnh;
    }

    public int getLinknhac() {
        return Linknhac;
    }

    public void setLinknhac(int linknhac) {
        Linknhac = linknhac;
    }
}
