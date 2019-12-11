package com.example.AppMusic_AHL.model;

public class PlayList {

    public int idPlaylist;
    public String TenBaiHat, TenCaSi;
    public int LinkAnhBaiHat, LinkBaiHat;

    public PlayList() {
    }

    public PlayList(int idPlaylist, String tenBaiHat, String tenCaSi, int linkAnhBaiHat, int linkBaiHat) {
        this.idPlaylist = idPlaylist;
        TenBaiHat = tenBaiHat;
        TenCaSi = tenCaSi;
        LinkAnhBaiHat = linkAnhBaiHat;
        LinkBaiHat = linkBaiHat;
    }

    public int getIdPlaylist() {
        return idPlaylist;
    }

    public void setIdPlaylist(int idPlaylist) {
        this.idPlaylist = idPlaylist;
    }

    public String getTenBaiHat() {
        return TenBaiHat;
    }

    public void setTenBaiHat(String tenBaiHat) {
        TenBaiHat = tenBaiHat;
    }

    public String getTenCaSi() {
        return TenCaSi;
    }

    public void setTenCaSi(String tenCaSi) {
        TenCaSi = tenCaSi;
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
