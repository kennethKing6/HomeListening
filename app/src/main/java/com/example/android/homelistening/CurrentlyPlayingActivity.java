package com.example.android.homelistening;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class CurrentlyPlayingActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_currently_playing);
        ImageView imageView = findViewById(R.id.singer_image_view);

//        this variable gets the position of the button which was clicked
        int position = MusicDetailsAdapter.listItemPosition;

        // displays the image of the correct song in the CurrentlyPlayingActivity
        if (position == 0) {
            imageView.setImageResource(R.drawable.angus__julia__stone);

        } else if (position == 1) {
            imageView.setImageResource(R.drawable.adult_chill_computer);
        } else if (position == 2) {
            imageView.setImageResource(R.drawable.ben_howard);
        } else if (position == 3) {
            imageView.setImageResource(R.drawable.bon_iver);
        } else if ((position == 4)) {
            imageView.setImageResource(R.drawable.bebe);
        } else if ((position == 5)) {
            imageView.setImageResource(R.drawable.affection);
        } else if ((position == 6)) {
            imageView.setImageResource(R.drawable.cigarettes_after_sex);
        } else if ((position == 7)) {
            imageView.setImageResource(R.drawable.cigarettes_after_sex);
        }
    }


}
