package com.example.AppMusic_AHL;

public class TheLoai {
    private String tentheloai;
    private int anhtheloai;

    public TheLoai() {
    }

    public TheLoai(String tentheloai, int anhtheloai) {
        this.tentheloai = tentheloai;
        this.anhtheloai = anhtheloai;
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

    @Override
    public String toString() {
        return "TheLoai{" +
                "tentheloai='" + tentheloai + '\'' +
                ", anhtheloai=" + anhtheloai +
                '}';
    }
}
