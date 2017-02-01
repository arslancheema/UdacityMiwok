package com.example.android.miwok;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

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

        wordsList.add(new Word("Hi","lutti",R.raw.phrase_how_are_you_feeling));
        wordsList.add(new Word("How Are you ?","otiko",R.raw.phrase_how_are_you_feeling));
        wordsList.add(new Word("I am Good","tolukosuu",R.raw.phrase_how_are_you_feeling));
        wordsList.add(new Word("About You ?","mfour",R.raw.phrase_how_are_you_feeling));
        wordsList.add(new Word("Nice Meeting you ","mfive",R.raw.phrase_how_are_you_feeling));
        wordsList.add(new Word("See You","msix",R.raw.phrase_how_are_you_feeling));
        wordsList.add(new Word("Bye Bye","mSeven",R.raw.phrase_how_are_you_feeling));
        wordsList.add(new Word("eight","mEight",R.raw.phrase_how_are_you_feeling));
        wordsList.add(new Word("nine","mNine",R.raw.phrase_how_are_you_feeling));
        wordsList.add(new Word("ten","mTen",R.raw.phrase_how_are_you_feeling));

        WordsAdapter wordsAdapter = new WordsAdapter(this,wordsList,R.color.category_phrases);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(wordsAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Word word = wordsList.get(position);
                MediaPlayer mediaPlayer = MediaPlayer.create(PhrasesActivity.this, word.getmAudioResourceId());
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
