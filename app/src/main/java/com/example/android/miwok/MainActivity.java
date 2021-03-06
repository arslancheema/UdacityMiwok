/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    TextView numbers;
    TextView colors;
    TextView family;
    TextView phrases;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        numbers = (TextView) findViewById(R.id.numbers);
        colors = (TextView) findViewById(R.id.colors);
        family = (TextView) findViewById(R.id.family);
        phrases = (TextView) findViewById(R.id.phrases);

        numbers.setOnClickListener(this);
        colors.setOnClickListener(this);
        family.setOnClickListener(this);
        phrases.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.numbers:
                Intent i = new Intent(this,NumbersActivity.class );
                startActivity(i);
                break;
            case R.id.colors:
                Intent colorIntent = new Intent(this,ColorsActivity.class );
                startActivity(colorIntent);
                break;
            case R.id.phrases:
                Intent phrasesIntent = new Intent(this,PhrasesActivity.class );
                startActivity(phrasesIntent);
                break;
            case R.id.family:
                Intent familyIntent = new Intent(this,FamilyActivity.class );
                startActivity(familyIntent);
                break;

            default:
                break;

        }


    }
}
