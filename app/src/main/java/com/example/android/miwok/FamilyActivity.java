package com.example.android.miwok;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

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

        wordsList.add(new Word("Father","lutti",R.drawable.family_father,R.raw.family_father));
        wordsList.add(new Word("Mother","otiko",R.drawable.family_mother,R.raw.family_mother));
        wordsList.add(new Word("Son","tolukosuu",R.drawable.family_son,R.raw.family_son));
        wordsList.add(new Word("Daughter","mfour",R.drawable.family_daughter,R.raw.family_daughter));
        wordsList.add(new Word("Brother","mfive",R.drawable.family_older_brother,R.raw.family_older_brother));
        wordsList.add(new Word("Older Brother","msix",R.drawable.family_older_brother,R.raw.family_older_brother));
        wordsList.add(new Word("Sister","mSeven",R.drawable.family_younger_sister,R.raw.family_younger_sister));
        wordsList.add(new Word("Older Sister","mEight",R.drawable.family_older_sister,R.raw.family_older_sister));
        wordsList.add(new Word("Grand Mother","mNine",R.drawable.family_grandmother,R.raw.family_grandmother));
        wordsList.add(new Word("Grand Father","mTen",R.drawable.family_grandfather,R.raw.family_grandfather));

        WordsAdapter wordsAdapter = new WordsAdapter(this,wordsList,R.color.category_family);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(wordsAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Word word = wordsList.get(position);
                MediaPlayer mediaPlayer = MediaPlayer.create(FamilyActivity.this, word.getmAudioResourceId());
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
