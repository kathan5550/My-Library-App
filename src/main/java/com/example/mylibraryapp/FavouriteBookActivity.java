package com.example.mylibraryapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class FavouriteBookActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favourite_book);

        ArrayList<Book> favouritebooks = Utils.getFavouritebooks();
        TextView emptyScreenMsg = findViewById(R.id.EmptyScreenMsg);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        if (favouritebooks.isEmpty()) {
            emptyScreenMsg.setVisibility(View.VISIBLE);
        } else {
            RecyclerView recyclerView = findViewById(R.id.BooKRecview);
            BookRecviewAdapter adapter = new BookRecviewAdapter(this, "favoriteBook");
            recyclerView.setAdapter(adapter);
            recyclerView.setLayoutManager(new LinearLayoutManager(this));
            adapter.setBooks(favouritebooks);
            adapter.registerAdapterDataObserver(new RecyclerView.AdapterDataObserver() {
                @Override
                public void onChanged() {
                    //Do some task.
                    ArrayList<Book> favouritebooks = Utils.getFavouritebooks();
                    if(favouritebooks.isEmpty()){
                        recyclerView.setVisibility(View.INVISIBLE);
                        emptyScreenMsg.setVisibility(View.VISIBLE);
                    }
                }
            });
        }
    }

    public void onBackPressed() {
        Intent intent = new Intent(this, MainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);

        startActivity(intent);
    }
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch(item.getItemId())
        {
            case android.R.id.home:
                onBackPressed();
                break;

            default:
                break;
        }return super.onOptionsItemSelected(item);
    }
}