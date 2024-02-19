package com.example.mylibraryapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class currentlyReadBookActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_currently_read_book);

        ArrayList<Book> curReadingBooks = Utils.getCureentlyReadingBooks();
        TextView emptyscreen= findViewById(R.id.EmptyScreenMsg);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        if(curReadingBooks.isEmpty())
        {
            emptyscreen.setVisibility(View.VISIBLE);
        }
        else
        {
            RecyclerView recyclerView =findViewById(R.id.BOOkrecview);
            BookRecviewAdapter adapter = new BookRecviewAdapter(this,"currentlyReading");
            recyclerView.setAdapter(adapter);
            recyclerView.setLayoutManager(new LinearLayoutManager(this));
            adapter.setBooks(Utils.getCureentlyReadingBooks());

            adapter.registerAdapterDataObserver(new RecyclerView.AdapterDataObserver() {
                @Override
                public void onChanged() {
                    //Do some task.
                    ArrayList<Book> curReadingBooks = Utils.getCureentlyReadingBooks();
                    if (curReadingBooks.isEmpty()) {
                        recyclerView.setVisibility(View.INVISIBLE);
                        emptyscreen.setVisibility(View.VISIBLE);
                    }
                }
            });
        }

    }
    public void onBackPressed()
    {
        Intent intent= new Intent(this,MainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK|Intent.FLAG_ACTIVITY_NEW_TASK);

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