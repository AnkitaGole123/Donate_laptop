package com.example.navgurukul.book_collection;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class first1 extends AppCompatActivity {

    TextView collection;
    ListView list;

    static final String[] booksList = new String[] { "Horror_books", "Funny_books", "Motivational_books",
            "Historic_books", "Mystery_books"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first1);
        list =(ListView)findViewById(R.id.list);


        ArrayAdapter<String> itemsAdapter =
                new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,booksList);
        list.setAdapter(itemsAdapter);
    }
}
