package com.example.AppMusic_AHL;

public class Video {
    private String tenvideo;
    private String time;
    private String casi;
    private int forder;
    private int anhvideo;

    public Video() {
    }

    public Video(String tenvideo, String time, String casi, int forder, int anhvideo) {
        this.tenvideo = tenvideo;
        this.time = time;
        this.casi = casi;
        this.forder = forder;
        this.anhvideo = anhvideo;
    }

    public String getTenvideo() {
        return tenvideo;
    }

    public void setTenvideo(String tenvideo) {
        this.tenvideo = tenvideo;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getCasi() {
        return casi;
    }

    public void setCasi(String casi) {
        this.casi = casi;
    }

    public int getForder() {
        return forder;
    }

    public void setForder(int forder) {
        this.forder = forder;
    }

    public int getAnhvideo() {
        return anhvideo;
    }

    public void setAnhvideo(int anhvideo) {
        this.anhvideo = anhvideo;
    }
}
