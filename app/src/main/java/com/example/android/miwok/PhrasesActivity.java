package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.words_list);

        ArrayList<Word> wordsList = new ArrayList<Word>();

        wordsList.add(new Word("Hi","lutti"));
        wordsList.add(new Word("How Are you ?","otiko"));
        wordsList.add(new Word("I am Good","tolukosuu"));
        wordsList.add(new Word("About You ?","mfour"));
        wordsList.add(new Word("Nice Meeting you ","mfive"));
        wordsList.add(new Word("See You","msix"));
        wordsList.add(new Word("Bye Bye","mSeven"));
        wordsList.add(new Word("eight","mEight"));
        wordsList.add(new Word("nine","mNine"));
        wordsList.add(new Word("ten","mTen"));

        WordsAdapter wordsAdapter = new WordsAdapter(this,wordsList);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(wordsAdapter);
    }
}
