package com.example.AppMusic_AHL;

public class CaSi {

    private String tencasi;
    private int anhcasi;

    public CaSi() {

    }


    public CaSi(String tencasi, int anhcasi) {
        this.tencasi = tencasi;
        this.anhcasi = anhcasi;
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

    @Override
    public String toString() {
        return "CaSi{" +
                "tencasi='" + tencasi + '\'' +
                ", anhcasi=" + anhcasi +
                '}';
    }
}
