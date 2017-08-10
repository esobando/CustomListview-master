package com.example.customlistview;

import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

public class ListActivity extends AppCompatActivity {

    ListView listView;
    String[] states;
    ImageView flag;
    ImageView Faces;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        flag = (ImageView) findViewById(R.id.imageView);
        Faces= (ImageView) findViewById(R.id.imageView2);
        listView = (ListView) findViewById(R.id.listView);
        Bundle mBundle = getIntent().getExtras();
        if (mBundle != null) {
            String country = mBundle.getString("CountryName");
            if (country.equalsIgnoreCase("Australia")) {
                states = getResources().getStringArray(R.array.australia_states);
                flag.setImageResource(R.drawable.flag_australia);
                Faces.setImageResource(R.drawable.irwin2);

            } else if (country.equalsIgnoreCase("US")) {
                states = getResources().getStringArray(R.array.us_states);
                flag.setImageResource(R.drawable.flag_us);
                Faces.setImageResource(R.drawable.damon);

            }
            else if (country.equalsIgnoreCase("China")) {
                states = getResources().getStringArray(R.array.China_states);
                flag.setImageResource(R.drawable.flag_china);
                Faces.setImageResource(R.drawable.chan);


            }
            else if (country.equalsIgnoreCase("Germany")) {
                states = getResources().getStringArray(R.array.Germany_states);
                flag.setImageResource(R.drawable.flag_germany);
                Faces.setImageResource(R.drawable.waltz2);


            }
            else if (country.equalsIgnoreCase("Russia")) {
                states = getResources().getStringArray(R.array.Russia_states);
                flag.setImageResource(R.drawable.flag_russia);
                Faces.setImageResource(R.drawable.mashkov);


            }

        }

        ArrayAdapter<String> mAdapter = new ArrayAdapter<String>(ListActivity.this,
                android.R.layout.simple_list_item_1,
                states);
        listView.setAdapter(mAdapter);
    }
}
