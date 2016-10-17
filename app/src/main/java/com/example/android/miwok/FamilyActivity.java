package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.words_list);

        ArrayList<Word> wordsList = new ArrayList<Word>();

        wordsList.add(new Word("Father","lutti"));
        wordsList.add(new Word("Mother","otiko"));
        wordsList.add(new Word("Son","tolukosuu"));
        wordsList.add(new Word("Daughter","mfour"));
        wordsList.add(new Word("Brother","mfive"));
        wordsList.add(new Word("Older Brother","msix"));
        wordsList.add(new Word("Sister","mSeven"));
        wordsList.add(new Word("Older Sister","mEight"));
        wordsList.add(new Word("Grand Mother","mNine"));
        wordsList.add(new Word("Grand Father","mTen"));

        WordsAdapter wordsAdapter = new WordsAdapter(this,wordsList);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(wordsAdapter);
    }
}
