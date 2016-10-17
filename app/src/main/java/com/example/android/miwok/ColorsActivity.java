package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.words_list);

        ArrayList<Word> wordsList = new ArrayList<Word>();

        wordsList.add(new Word("Black","lutti"));
        wordsList.add(new Word("White","otiko"));
        wordsList.add(new Word("Red","tolukosuu"));
        wordsList.add(new Word("Yello","mfour"));
        wordsList.add(new Word("Mustard","mfive"));
        wordsList.add(new Word("Green","msix"));
        wordsList.add(new Word("Blue","mSeven"));
        wordsList.add(new Word("Grey","mEight"));
        wordsList.add(new Word("Pink","mNine"));
        wordsList.add(new Word("Pale yellow","mTen"));

        WordsAdapter wordsAdapter = new WordsAdapter(this,wordsList);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(wordsAdapter);
    }
}
