package com.example.android.homelistening;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class MusicDetailsAdapter extends ArrayAdapter<MusicDetails> {

    //    this stores the position of the list item in order to be used in the currentPlayingActivity.java file to display the correct image
    public static int listItemPosition;
    //    get the context of the app in order to create intent object and open CurrentlyPlayingActivity
    private Context c;

    /**
     * This is our own custom constructor (it doesn't mirror a superclass constructor).
     * The context is used to inflate the layout file, and the list is the data we want
     * to populate into the lists.
     *
     * @param context      The current context. Used to inflate the layout file.
     * @param musicDetails A List of AndroidFlavor objects to display in a list
     */
    public MusicDetailsAdapter(Activity context, ArrayList<MusicDetails> musicDetails) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, musicDetails);
        this.c = context;

    }

    @NonNull
    @Override
    public View getView(final int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link AndroidFlavor} object located at this position in the list
        MusicDetails currentMusic = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID song_title_text_view)
        TextView songTitle = (TextView) listItemView.findViewById(R.id.song_title_text_view);

        // Get the song title from the current word object and
        // set this text on the song title TextView
        songTitle.setText(currentMusic.getSongTitle());


        // Find the TextView in the list_item.xml layout with the ID singer_name_text_view
        TextView singerName = (TextView) listItemView.findViewById(R.id.singer_name_text_view);
        // Get the singer"s name from the current MusicDetails  object and
        // set this text on the SingerName TextView
        singerName.setText(currentMusic.getSingerName());

//        finds the imageButton in the list item
        ImageButton imageButton = listItemView.findViewById(R.id.now_playing_activity);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                listItemPosition = position;

                Intent intent = new Intent(c, CurrentlyPlayingActivity.class);

                c.startActivity(intent);

            }
        });


        // Return the whole list item layout (containing 2 TextViews and an ImageButton)
        // so that it can be shown in the ListView
        return listItemView;
    }

}
