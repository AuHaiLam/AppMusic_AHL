package com.example.AppMusic_AHL.model;

public class CaSi {
    private int idCaSi;
    private String tencasi;
    private int anhcasi;

    public CaSi() {

    }

    public CaSi(int idCaSi, String tencasi, int anhcasi) {
        this.idCaSi = idCaSi;
        this.tencasi = tencasi;
        this.anhcasi = anhcasi;
    }

    public int getIdCaSi() {
        return idCaSi;
    }

    public void setIdCaSi(int idCaSi) {
        this.idCaSi = idCaSi;
    }

    public String getTencasi() {
        return tencasi;
    }

    public void setTencasi(String tencasi) {
        this.tencasi = tencasi;
    }

    public int getAnhcasi() {
        return anhcasi;
    }

    public void setAnhcasi(int anhcasi) {
        this.anhcasi = anhcasi;
    }
}
