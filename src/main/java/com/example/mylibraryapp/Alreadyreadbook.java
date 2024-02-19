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

public class Alreadyreadbook extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alreadyreadbook);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ArrayList<Book> alreadyREadbook = Utils.getAlreadyReadbooks();
        TextView emptyscreen = findViewById(R.id.EmptyScreenMsg);

        if(alreadyREadbook.isEmpty())
        {
            emptyscreen.setVisibility(View.VISIBLE);
        }
        else
        {
            RecyclerView recyclerView =findViewById(R.id.bookrecyView);
            BookRecviewAdapter adapter = new BookRecviewAdapter(this,"alreadyRead");
            recyclerView.setAdapter(adapter);
            recyclerView.setLayoutManager(new LinearLayoutManager(this));
            adapter.setBooks(Utils.getAlreadyReadbooks());

            adapter.registerAdapterDataObserver(new RecyclerView.AdapterDataObserver() {
                @Override
                public void onChanged() {
                    //Do some task.
                    ArrayList<Book>  alreadyREadbook = Utils.getAlreadyReadbooks();
                    if(alreadyREadbook.isEmpty()){
                        recyclerView.setVisibility(View.INVISIBLE);
                        emptyscreen.setVisibility(View.VISIBLE);
                    }
                }
            });
        }




    }
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


    public void onBackPressed()
    {
        Intent intent= new Intent(this,MainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK|Intent.FLAG_ACTIVITY_NEW_TASK);

        startActivity(intent);
    }
}