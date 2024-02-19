package com.example.mylibraryapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class BookActivity extends AppCompatActivity {

    public static  final String BOOK_ID_KEY="bookId";

    private TextView txtBookName,txtauthor,txtpages,txtdescription;
    private Button btnAddWantToRead,btnAddToAlreadyRead,btnAddToCurrread,btnAddToFavourite;
    private ImageView bookImage;
    private TextView InformationLink;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book);

        initViews();

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
//        String longdescription="Psychiatrist Viktor Frankl’s discusses in-depth his experience with living in Nazi death camps and describes the lessons it taught him about spiritual survival. Frankl puts forth a convincing argument that avoiding suffering isn’t realistic. However, through choosing how we cope with that suffering and the meaning we ascribe to it, we retain the ability to move forward with renewed purpose.\n This certainly is a book for the generations that anyone can gain value from. Man’s Search for Meaning has been listed as one of the most influential books in America and has currently sold over 10 million copies in twenty-four languages.\n Through this book, Jen provides her readers with simple exercises to help people identify their self-limiting beliefs, attitudes, and habits. She provides some great advice and does so in a humorous way to truly captivate her audience and motivate them to begin achieving the success they want from their lives.\n Jen’s goal is to help her readers truly understand why they have developed certain thought and behavior patterns. She helps us to focus on the things that we can change and accept the things which we cannot. ";

  //      Book book=new Book(1,"Thomson","kathan patel",1350,"https://bookmanager.com/i/m?b=jpo2KjG8N1UghWjRSCvc_Q","A work of madding brilliance",longdescription);

        Intent intent =getIntent();
        if(null != intent)
        {
            int bookId= intent.getIntExtra(BOOK_ID_KEY,-1);
            if(bookId != -1)
            {
                    Book incomingbook =Utils.getInstance().getBookbyid(bookId);
                    if(null != incomingbook)
                    {
                        setData(incomingbook);

                        handleAlreadyRead(incomingbook);
                        handleWantToReadBook(incomingbook);
                        handleCurrentlyReadBook(incomingbook);
                        handleFavouriteBook(incomingbook);

                    }
            }
        }

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId())
        {
            case android.R.id.home:
                onBackPressed();
                break;

            default:
                break;
        }

        return super.onOptionsItemSelected(item);
    }

    private void handleFavouriteBook(final Book book) {
        ArrayList<Book> FavoriteBooks = Utils.getInstance().getFavouritebooks();
        boolean exitsinFavoriteBooks = false;

        for(Book b: FavoriteBooks) {
            if (b.getId() == book.getId()) {
                exitsinFavoriteBooks = true;

            }
        }
        if(exitsinFavoriteBooks)
        {
            btnAddToFavourite.setEnabled(false);
        }
        else
        {
            btnAddToFavourite.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(Utils.getInstance().addTofavouriteBook(book))
                    {
                        Toast.makeText(BookActivity.this, "Book Added", Toast.LENGTH_SHORT).show();

                        Intent intent =new Intent(BookActivity.this,FavouriteBookActivity.class);
                        startActivity(intent);
                    }
                    else
                    {
                        Toast.makeText(BookActivity.this, "Somthing wrong Happened, try again", Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }
    }

    private void handleCurrentlyReadBook(final Book book) {
        ArrayList<Book> currentlyREadBook = Utils.getInstance().getCureentlyReadingBooks();
        boolean exitsinCurrentlyReadBooks = false;

        for(Book b: currentlyREadBook) {
            if (b.getId() == book.getId()) {
                exitsinCurrentlyReadBooks = true;

            }
        }
        if(exitsinCurrentlyReadBooks)
        {
            btnAddToCurrread.setEnabled(false);
        }
        else
        {
            btnAddToCurrread.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(Utils.getInstance().addToCurrentlyRead(book))
                    {
                        Toast.makeText(BookActivity.this, "Book Added", Toast.LENGTH_SHORT).show();

                        Intent intent =new Intent(BookActivity.this,currentlyReadBookActivity.class);
                        startActivity(intent);
                    }
                    else
                    {
                        Toast.makeText(BookActivity.this, "Somthing wrong Happened, try again", Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }
    }

    private void handleWantToReadBook(final Book book) {
        ArrayList<Book> wantToReadBooks = Utils.getInstance().getWantToReadbooks();
        boolean exitsinWantToReadBooks = false;

        for(Book b: wantToReadBooks) {
            if (b.getId() == book.getId()) {
                exitsinWantToReadBooks = true;

            }
        }
        if(exitsinWantToReadBooks)
        {
            btnAddWantToRead.setEnabled(false);
        }
        else
        {
            btnAddWantToRead.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(Utils.getInstance().addToWantToRead(book))
                    {
                        Toast.makeText(BookActivity.this, "Book Added", Toast.LENGTH_SHORT).show();

                        Intent intent =new Intent(BookActivity.this,WantToReadBook.class);
                        startActivity(intent);
                    }
                    else
                    {
                        Toast.makeText(BookActivity.this, "Somthing wrong Happened, try again", Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }

    }

    /**
     *
     * Enable and Disable button
     * add the book to already read book arrarylist
      * @param book
     */

    private void handleAlreadyRead(Book book) {
        ArrayList<Book> alreadyreadbooks = Utils.getInstance().getAlreadyReadbooks();
        boolean exitsinAlreadyBooks = false;

        for(Book b: alreadyreadbooks) {
            if (b.getId() == book.getId()) {
                exitsinAlreadyBooks = true;

            }
        }
            if(exitsinAlreadyBooks)
            {
                btnAddToAlreadyRead.setEnabled(false);
            }
            else
            {
                btnAddToAlreadyRead.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(Utils.getInstance().addToAlreadyRead(book))
                        {
                            Toast.makeText(BookActivity.this, "Book Added", Toast.LENGTH_SHORT).show();

                            Intent intent =new Intent(BookActivity.this,Alreadyreadbook.class);
                            startActivity(intent);
                        }
                        else
                        {
                            Toast.makeText(BookActivity.this, "Somthing wrong Happened, try again", Toast.LENGTH_SHORT).show();
                        }
                    }
                });
            }


    }

    private void setData(Book book) {
        txtBookName.setText(book.getName());
        txtauthor.setText(book.getAuthor());
        txtpages.setText(String.valueOf(book.getPages()));
        txtdescription.setText(book.getLongDesc());
        InformationLink.setText(book.getLink());
        Glide.with(this)
                .asBitmap().load(book.getImgurl())
                .into(bookImage);
    }

    private void initViews() {

        txtauthor =findViewById(R.id.txtauthor1);
        txtBookName =findViewById(R.id.txtname);
        txtpages =findViewById(R.id.txtpagecount);
        txtdescription =findViewById(R.id.txtLongdesc);
        InformationLink =findViewById(R.id.link);

        btnAddToCurrread = findViewById(R.id.btn1);
        btnAddWantToRead= findViewById(R.id.btn2);
        btnAddToAlreadyRead = findViewById(R.id.btn3);
        btnAddToFavourite = findViewById(R.id.btn4);

        bookImage= findViewById(R.id.bookimage);


    }


}