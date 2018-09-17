package com.example.android.homelistening;

public class MusicDetails {

    //    stores the title of the song
    private String mSongTitle;
    //    Strores the name of the singer
    private String mSingerName;


    public MusicDetails(String songTitle, String singerNAme) {
        mSongTitle = songTitle;
        mSingerName = singerNAme;

    }


    /*this method gets the song title
     *
     * @return the song title*/
    public String getSongTitle() {
        return mSongTitle;
    }

    /*this method gets singer's name
     *
     *@Return the name of the singer  */
    public String getSingerName() {
        return mSingerName;
    }


}
