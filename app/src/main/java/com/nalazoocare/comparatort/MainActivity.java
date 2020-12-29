package com.nalazoocare.comparatort;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import com.nalazoocare.comparatort.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rc;
    private MAdapter mAdapter;
    private LinearLayoutManager mLayoutManager;

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        int[] testArr = new int[]{3, 24, 253, 53256, 46};

        //영화
        ArrayList<Movie> movies = new ArrayList<>();

        movies.add(new Movie("어벤져스","액션","12세관람가"));
        movies.add(new Movie("범죄도시","액션","19세관람가"));
        movies.add(new Movie("미션임파서블","액션","15세 관람가"));
        ArrayList<Integer> integerArrayList = new ArrayList<>();


        for (Movie movie : movies) {
            Log.d("meme movie", movie.getTitle());
        }


        Collections.sort(movies);

        for (Movie movie:movies) {
            Log.d("meme asen", movie.getTitle());
        }

        integerArrayList.add(4541);
        integerArrayList.add(3);
        integerArrayList.add(65344);
        integerArrayList.add(23);
        integerArrayList.add(13);
        integerArrayList.add(564654);
        Collections.sort(integerArrayList, new Descending());

        for (Integer integer : integerArrayList) {
            Log.d("meme","[" + integer + "]");
        }


        Collections.sort(integerArrayList, new Ascending());

        for (Integer meme : integerArrayList) {
            Log.d("meme ascending","["+ meme+"]");
        }
        mAdapter = new MAdapter();
        mLayoutManager = new LinearLayoutManager(this);
        rc = binding.rv;

        rc.setLayoutManager(mLayoutManager);
        rc.setAdapter(mAdapter);


    }
}
