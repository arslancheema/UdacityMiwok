package com.example.android.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.words_list);

       // LinearLayout rootView = (LinearLayout) findViewById(R.id.rootView);

        ArrayList<Word> wordsList = new ArrayList<Word>();

        wordsList.add(new Word("one","lutti"));
        wordsList.add(new Word("two","otiko"));
        wordsList.add(new Word("three","tolukosuu"));
        wordsList.add(new Word("four","mfour"));
        wordsList.add(new Word("five","mfive"));
        wordsList.add(new Word("six","msix"));
        wordsList.add(new Word("seven","mSeven"));
        wordsList.add(new Word("eight","mEight"));
        wordsList.add(new Word("nine","mNine"));
        wordsList.add(new Word("ten","mTen"));

        WordsAdapter wordsAdapter = new WordsAdapter(this,wordsList);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(wordsAdapter);



    }
}
