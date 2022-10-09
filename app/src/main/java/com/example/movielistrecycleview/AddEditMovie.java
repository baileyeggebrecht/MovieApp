package com.example.movielistrecycleview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.List;

public class AddEditMovie extends AppCompatActivity {

    Button btn_ok, btn_cancel;
    List<Movie> movieList;
    EditText et_movieName, et_recommendedBy, et_pictureURL, et_awfulFactor;
    MyApplication myApplication = (MyApplication) this.getApplication();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_edit_movie);

        movieList = myApplication.getMovieList();

        btn_ok = findViewById(R.id.btn_ok);
        btn_cancel = findViewById(R.id.btn_cancel);
        et_movieName = findViewById(R.id.et_movieName);
        et_recommendedBy = findViewById(R.id.et_recommendedBy);
        et_pictureURL = findViewById(R.id.et_pictureURL);
        et_awfulFactor = findViewById(R.id.et_awfulFactor);

        btn_ok.setOnClickListener((view) -> {

            // create Movie object
            int nextId = myApplication.getNextId();
            Movie newMovie = new Movie(nextId, et_movieName.getText().toString(), et_recommendedBy.getText().toString(), et_pictureURL.getText().toString(), Integer.parseInt(et_awfulFactor.getText().toString()));

            // add the object to the global list
            movieList.add(newMovie);
            myApplication.setNextId(nextId++);

            // go back to main activity
            Intent intent = new Intent(AddEditMovie.this, MainActivity.class);
            startActivity(intent);
        });

        btn_cancel.setOnClickListener((view) -> {
            Intent intent = new Intent(AddEditMovie.this, MainActivity.class);
            startActivity(intent);
        });
    }
}