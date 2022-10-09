package com.example.movielistrecycleview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "Movies App";
    Button btn_addMovie;

    List<Movie> movieList = new ArrayList<Movie>();
    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fillMovieList();
        Log.d(TAG, "onCreate: " + movieList.toString());

        btn_addMovie = findViewById(R.id.btn_addMovie);

        btn_addMovie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, AddEditMovie.class);
                startActivity(intent);

            }
        });
    }

    private void fillMovieList() {
        Movie m0 = new Movie(0, "Eat the Rich: The GameStop Saga", "Kyle", "https://flxt.tmsimg.com/assets/p22842914_b_h8_ab.jpg", 0);
        Movie m1 = new Movie(1, "Don't Worry Darling", "Bailey", "https://upload.wikimedia.org/wikipedia/en/4/4c/Don't_Worry_Darling_Poster_2.jpg", 0);
        Movie m2 = new Movie(2, "The Rehearsal", "Bailey", "https://static.hbo.com/2022-06/the-rehearsal-1920x1080.jpg", 0);
        Movie m3 = new Movie(3, "Lord of the Rings: The Rings of Power", "Kyle", "https://upload.wikimedia.org/wikipedia/commons/thumb/2/2a/The-Lord-of-the-Rings-The-Rings-of-Power-key-art-holizontal.jpg/500px-The-Lord-of-the-Rings-The-Rings-of-Power-key-art-holizontal.jpg", 1);
        Movie m4 = new Movie(4, "House of the Dragon", "Kyle", "https://static.onecms.io/wp-content/uploads/sites/6/2022/07/07/House_Of_The_Dragon_Considine_DArcy_Smith_1.jpg", 0);
        Movie m5 = new Movie(5, "Chris Chan: A Comprehensive History", "Bailey", "https://m.media-amazon.com/images/M/MV5BNThlZjc5ZmUtYzAwNS00YTk4LWI3NzEtZTgyNTI5ZjNmYzQ4XkEyXkFqcGdeQXVyODk0ODQ2OTU@._V1_FMjpg_UX1000_.jpg", 5);
        Movie m6 = new Movie(6, "The Real Bling Ring: Hollywood Heist", "Bailey", "https://m.media-amazon.com/images/M/MV5BNmZmZTE0NzMtMzcxZC00OWI1LWJhNDYtMjBjMzdkZDU0OGQwXkEyXkFqcGdeQXVyMTA3MTI2ODc5._V1_.jpg", 0);
        Movie m7 = new Movie(7, "The Boys", "Kyle", "https://m.media-amazon.com/images/M/MV5BOTEyNDJhMDAtY2U5ZS00OTMzLTkwODktMjU3MjFkZWVlMGYyXkEyXkFqcGdeQXVyMjkwOTAyMDU@._V1_.jpg", 0);
        Movie m8 = new Movie(8, "Tucker and Dale vs Evil", "Bailey", "https://m.media-amazon.com/images/M/MV5BODQ5NDQ0MjkwMF5BMl5BanBnXkFtZTcwNDg1OTU4NQ@@._V1_.jpg", 0);

        movieList.addAll(Arrays.asList(new Movie[]{m1, m2, m3, m4, m5, m6, m7, m8}));
    }
}