package com.example.android.homelistening;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //creates the array list of music details
        ArrayList<MusicDetails> musicInfo = new ArrayList<MusicDetails>();
        musicInfo.add(new MusicDetails(" Cigarettes After Sex", "Affection"));
        musicInfo.add(new MusicDetails(" For you", "Angus & Julia Stone"));
        musicInfo.add(new MusicDetails(" I'm Not Yours", "Angus & Julia Stone"));
        musicInfo.add(new MusicDetails(" Big Jet Plane ", "Angus and Julia Stone"));
        musicInfo.add(new MusicDetails(" Cocaine", " Bebe"));
        musicInfo.add(new MusicDetails(" Promise", "Ben Howard"));
        musicInfo.add(new MusicDetails(" I Can't Make You Love Me _ Nick of Time", " Bon Iver "));
        musicInfo.add(new MusicDetails("  Nothing's Gonna Hurt You Baby", " Cigarettes After Sex  "));


        MusicDetailsAdapter adapter = new MusicDetailsAdapter(this, musicInfo);

        ListView listView = findViewById(R.id.list);

        listView.setAdapter(adapter);


    }


}
