package com.example.AppMusic_AHL.model;

public class TheLoai {
    public int IDTheLoai;
    private String tentheloai;
    private int anhtheloai;

    public TheLoai() {
    }

    public TheLoai(int IDTheLoai, String tentheloai, int anhtheloai) {
        this.IDTheLoai = IDTheLoai;
        this.tentheloai = tentheloai;
        this.anhtheloai = anhtheloai;
    }


    public int getIDTheLoai() {
        return IDTheLoai;
    }

    public void setIDTheLoai(int IDTheLoai) {
        this.IDTheLoai = IDTheLoai;
    }

    public String getTentheloai() {
        return tentheloai;
    }

    public void setTentheloai(String tentheloai) {
        this.tentheloai = tentheloai;
    }

    public int getAnhtheloai() {
        return anhtheloai;
    }

    public void setAnhtheloai(int anhtheloai) {
        this.anhtheloai = anhtheloai;
    }
}
