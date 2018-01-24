package com.trevor.model;

public class SongRequest {

    private String mSingerName;
    private Song mSong;

    public SongRequest(String singerName, Song song) {
        this.mSingerName = singerName;
        this.mSong = song;
    }

    public String getmSingerName() {
        return mSingerName;
    }

    public void setmSingerName(String mSingerName) {
        this.mSingerName = mSingerName;
    }

    public Song getmSong() {
        return mSong;
    }

    public void setmSong(Song mSong) {
        this.mSong = mSong;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SongRequest that = (SongRequest) o;

        if (!mSingerName.equals(that.mSingerName)) return false;
        return mSong.equals(that.mSong);
    }

    @Override
    public int hashCode() {
        int result = mSingerName.hashCode();
        result = 31 * result + mSong.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "SongRequest{" +
                "mSingerName='" + mSingerName + '\'' +
                ", mSong=" + mSong +
                '}';
    }
}
