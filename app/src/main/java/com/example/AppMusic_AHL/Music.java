package com.example.AppMusic_AHL;

public class Music {

    private String tenbaihat;
    private String casi;
    private String thoigian;
    private int anhbh;
    private int forder;

    public Music(String tiTi, int iconsinger) {
    }


    public Music(String tenbaihat, String casi, String thoigian, int anhbh, int forder) {

        this.tenbaihat = tenbaihat;
        this.casi = casi;
        this.thoigian = thoigian;
        this.anhbh = anhbh;
        this.forder = forder;
    }


    public String getTenbaihat() {
        return tenbaihat;
    }

    public void setTenbaihat(String tenbaihat) {
        this.tenbaihat = tenbaihat;
    }

    public String getCasi() {
        return casi;
    }

    public void setCasi(String casi) {
        this.casi = casi;
    }

    public String getThoigian() {
        return thoigian;
    }

    public void setThoigian(String thoigian) {
        this.thoigian = thoigian;
    }

    public int getAnhbh() {
        return anhbh;
    }

    public void setAnhbh(int anhbh) {
        this.anhbh = anhbh;
    }

    public int getForder() {
        return forder;
    }

    public void setForder(int forder) {
        this.forder = forder;
    }

    @Override
    public String toString() {
        return "Music{" +
                ", tenbaihat='" + tenbaihat + '\'' +
                ", casi='" + casi + '\'' +
                ", thoigian='" + thoigian + '\'' +
                ", anhbh=" + anhbh +
                ", forder=" + forder +
                '}';
    }
}
