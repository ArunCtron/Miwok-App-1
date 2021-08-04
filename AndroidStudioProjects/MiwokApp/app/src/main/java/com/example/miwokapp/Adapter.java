package com.example.miwokapp;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class Adapter extends ArrayAdapter<Conversion> {
    public static MediaPlayer m;
    private int mcolor;
    public MediaPlayer.OnCompletionListener media=new MediaPlayer.OnCompletionListener() {
        @Override
        public void onCompletion(MediaPlayer mp) {
            releaseMediaPlayer();
        }
    };
    public Adapter(Activity context, ArrayList<Conversion> words, int color)
    {
        super(context, 0, words);
        this.mcolor=color;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.univ_layout, parent, false);
        }
        Conversion value = getItem(position);

        LinearLayout bg=listItemView.findViewById(R.id.bg);
        bg.setBackgroundColor(mcolor);

        TextView miwok = listItemView.findViewById(R.id.miwok);
        miwok.setText(value.getMiwokTranslation());
        miwok.setTextColor(Color.parseColor("#FDFDFD"));

        TextView english = listItemView.findViewById(R.id.english);
        english.setText(value.getDefaultTranslation());
        english.setTextColor(Color.parseColor("#FDFDFD"));

        ImageView img=listItemView.findViewById(R.id.image);
        if(value.hasImage()==false) {
            img.setImageResource(value.getImage());
            img.setVisibility(View.VISIBLE);
        }
        else
        {
            img.setVisibility(View.GONE);
        }

        int aud=value.getAudio();
        bg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                releaseMediaPlayer();
                m=MediaPlayer.create(getContext(),aud);
                m.start();
                m.setOnCompletionListener(media);
            }
        });

        return listItemView;
    }
    public static void releaseMediaPlayer()
    {
        if(m!=null){
            m.release();
            m=null;
        }
    }


}
