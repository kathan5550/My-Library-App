package com.example.mylibraryapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.MenuItem;

import java.util.ArrayList;

public class AllBooksActivity extends AppCompatActivity {

    private RecyclerView booksRecview;
    private BookRecviewAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_books);

        //For the animation:-
        //overridePendingTransition(R.anim.slide_in,R.anim.slide_out);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        booksRecview = findViewById(R.id.booksRecycleview);
        adapter = new BookRecviewAdapter(this,"allBooks");

        booksRecview.setAdapter(adapter);
        booksRecview.setLayoutManager(new LinearLayoutManager(this));

        adapter.setBooks(Utils.getInstance().getAllbooks());
    }

    /*public void finish()
    {
        super.finish();
        overridePendingTransition(R.anim.slide_out,R.anim.slide_in);
    }*/



    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

       switch(item.getItemId())
       {
           case android.R.id.home:
               onBackPressed();
               break;

           default:
               break;
       }



        return super.onOptionsItemSelected(item);
    }
}