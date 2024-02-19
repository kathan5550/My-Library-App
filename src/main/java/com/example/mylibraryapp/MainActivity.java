package com.example.mylibraryapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnAllBooks,btnAlreadyRead,btnWantToRead,btnCurrentlyReading,btnFavorite,btnAbout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initviews();

        btnAllBooks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,AllBooksActivity.class);
                startActivity(intent);
            }
        });

        Utils.getInstance();
        btnAlreadyRead.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MainActivity.this,Alreadyreadbook.class);
                startActivity(intent);
            }
        });

        Utils.getInstance();
        btnWantToRead.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MainActivity.this,WantToReadBook.class);
                startActivity(intent);
            }
        });

        Utils.getInstance();
        btnCurrentlyReading.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MainActivity.this,currentlyReadBookActivity.class);
                startActivity(intent);
            }
        });

        Utils.getInstance();
        btnFavorite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MainActivity.this,FavouriteBookActivity.class);
                startActivity(intent);
            }
        });

        btnAbout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder= new AlertDialog.Builder(MainActivity.this);
                builder.setTitle(getString(R.string.app_name));
                builder.setMessage("Designed and Developed with Love by Kathan Patel\n"+
                        "check my website for more awesome content and applications:");
                builder.setNegativeButton("Dismiss", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
                builder.setPositiveButton("Visit", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                            Intent intent = new Intent(MainActivity.this,websiteActivity.class);
                            intent.putExtra("url","https://google.com/");
                            startActivity(intent);
                    }
                });
                builder.create().show();
            }
        });

    }

    private void initviews()
    {
        btnAllBooks = findViewById(R.id.btnallbooks);
        btnAlreadyRead = findViewById(R.id.btnalreadyread);
        btnWantToRead = findViewById(R.id.btnwanttoreadbooks);
        btnCurrentlyReading = findViewById(R.id.btncurreading);
        btnFavorite = findViewById(R.id.btnfavourite);
        btnAbout = findViewById(R.id.btnabout);

    }
}