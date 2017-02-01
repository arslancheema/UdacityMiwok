package com.example.android.miwok;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    MediaPlayer mediaPlayer;

    MediaPlayer.OnCompletionListener onCompletionListener = new MediaPlayer.OnCompletionListener() {
        @Override
        public void onCompletion(MediaPlayer mp) {
            releaseMediaPlayer();
        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.words_list);

        final ArrayList<Word> wordsList = new ArrayList<Word>();

        wordsList.add(new Word("Black","lutti",R.drawable.color_black,R.raw.color_black));
        wordsList.add(new Word("White","otiko",R.drawable.color_white,R.raw.color_white));
        wordsList.add(new Word("Red","tolukosuu",R.drawable.color_red,R.raw.color_red));
        wordsList.add(new Word("Yello","mfour",R.drawable.color_dusty_yellow,R.raw.color_dusty_yellow));
        wordsList.add(new Word("Mustard","mfive",R.drawable.color_mustard_yellow,R.raw.color_mustard_yellow));
        wordsList.add(new Word("Green","msix",R.drawable.color_green,R.raw.color_green));
        wordsList.add(new Word("Blue","mSeven",R.drawable.color_black,R.raw.color_green));
        wordsList.add(new Word("Grey","mEight",R.drawable.color_gray,R.raw.color_green));
        wordsList.add(new Word("brown","mNine",R.drawable.color_brown,R.raw.color_green));
        wordsList.add(new Word("Pale yellow","mTen",R.drawable.color_mustard_yellow,R.raw.color_green));

        WordsAdapter wordsAdapter = new WordsAdapter(this,wordsList,R.color.category_colors);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(wordsAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Word word = wordsList.get(position);
                MediaPlayer mediaPlayer = MediaPlayer.create(ColorsActivity.this, word.getmAudioResourceId());
                mediaPlayer.start();
            }
        });
    }
    private void releaseMediaPlayer() {
        // If the media player is not null, then it may be currently playing a sound.
        if (mediaPlayer != null) {
            // Regardless of the current state of the media player, release its resources
            // because we no longer need it.
            mediaPlayer.release();

            // Set the media player back to null. For our code, we've decided that
            // setting the media player to null is an easy way to tell that the media player
            // is not configured to play an audio file at the moment.
            mediaPlayer = null;
        }
    }
}
