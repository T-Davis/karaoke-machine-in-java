package com.trevor.model;

public class SongRequest {

    private String mSingerName;
    private Song mSong;

    public SongRequest(String singerName, Song song) {
        this.mSingerName = singerName;
        this.mSong = song;
    }

    public String getSingerName() {
        return mSingerName;
    }

    public void setSingerName(String mSingerName) {
        this.mSingerName = mSingerName;
    }

    public Song getSong() {
        return mSong;
    }

    public void setSong(Song mSong) {
        this.mSong = mSong;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SongRequest that = (SongRequest) o;

        if (mSingerName != null ? !mSingerName.equals(that.mSingerName) : that.mSingerName != null) return false;
        return mSong != null ? mSong.equals(that.mSong) : that.mSong == null;
    }

    @Override
    public int hashCode() {
        int result = mSingerName != null ? mSingerName.hashCode() : 0;
        result = 31 * result + (mSong != null ? mSong.hashCode() : 0);
        return result;
    }
}
