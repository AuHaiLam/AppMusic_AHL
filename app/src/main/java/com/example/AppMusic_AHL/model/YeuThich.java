package com.example.AppMusic_AHL.model;

public class YeuThich {
    public int IDFavorite;
    public String TenBaiHat, TenCasi;
    public int LinkAnhBaiHat, LinkBaiHat;

    public YeuThich() {
    }

    public YeuThich(String tenBaiHat, String tenCasi, int linkAnhBaiHat, int linkBaiHat) {
        TenBaiHat = tenBaiHat;
        TenCasi = tenCasi;
        LinkAnhBaiHat = linkAnhBaiHat;
        LinkBaiHat = linkBaiHat;
    }

    public int getIDFavorite() {
        return IDFavorite;
    }

    public void setIDFavorite(int IDFavorite) {
        this.IDFavorite = IDFavorite;
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

    public int getLinkAnhBaiHat() {
        return LinkAnhBaiHat;
    }

    public void setLinkAnhBaiHat(int linkAnhBaiHat) {
        LinkAnhBaiHat = linkAnhBaiHat;
    }

    public int getLinkBaiHat() {
        return LinkBaiHat;
    }

    public void setLinkBaiHat(int linkBaiHat) {
        LinkBaiHat = linkBaiHat;
    }


}
