package com.example.AppMusic_AHL.model;

public class Nhac {

    public String IDBaiHat;
    public String TenCasi, TenBaiHat, ThoiGian;
    public int LinkAnhbh, LinkNhacbh;

    public Nhac() {
    }

    public Nhac(String IDBaiHat, String tenBaiHat, String tenCasi, String thoiGian, int linkAnhbh, int linkNhacbh) {
        this.IDBaiHat = IDBaiHat;
        TenCasi = tenCasi;
        TenBaiHat = tenBaiHat;
        ThoiGian = thoiGian;
        LinkAnhbh = linkAnhbh;
        LinkNhacbh = linkNhacbh;
    }

    public String getIDBaiHat() {
        return IDBaiHat;
    }

    public void setIDBaiHat(String IDBaiHat) {
        this.IDBaiHat = IDBaiHat;
    }

    public String getTenCasi() {
        return TenCasi;
    }

    public void setTenCasi(String tenCasi) {
        TenCasi = tenCasi;
    }

    public String getTenBaiHat() {
        return TenBaiHat;
    }

    public void setTenBaiHat(String tenBaiHat) {
        TenBaiHat = tenBaiHat;
    }

    public String getThoiGian() {
        return ThoiGian;
    }

    public void setThoiGian(String thoiGian) {
        ThoiGian = thoiGian;
    }

    public int getLinkAnhbh() {
        return LinkAnhbh;
    }

    public void setLinkAnhbh(int linkAnhbh) {
        LinkAnhbh = linkAnhbh;
    }

    public int getLinkNhacbh() {
        return LinkNhacbh;
    }

    public void setLinkNhacbh(int linkNhacbh) {
        LinkNhacbh = linkNhacbh;
    }
}
