package com.nabilawanda.utslancardong;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    //vars
    private ArrayList<String> mNames = new ArrayList<>();
    private ArrayList<String> mImageUrls = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Log.d(TAG, "onCreate: started.");

        initImageBitmaps();
    }

    private void initImageBitmaps(){
        Log.d(TAG, "initImageBitmaps: preparing bitmaps.");

        mImageUrls.add("https://pngimage.net/wp-content/uploads/2018/06/hangul-png-4.png");
        mNames.add("Membaca Hangeul");

        mImageUrls.add("https://previews.123rf.com/images/paperlystudio/paperlystudio1801/paperlystudio180100029/93728408-heart-shape-with-korean-letters-hangul-hand-lettering-korean-modern-brush-calligraphy-korean-alphabe.jpg");
        mNames.add("Menulis Hangeul");

        mImageUrls.add("https://i.pinimg.com/originals/4a/e6/b2/4ae6b277dcdec4a06c70b0a966da1bb3.jpg");
        mNames.add("Pola Kalimat");

        initRecyclerView();
    }

    private void initRecyclerView(){
        Log.d(TAG, "initRecyclerView: init recyclerview.");
        RecyclerView recyclerView = findViewById(R.id.recyclerv_view);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this, mNames, mImageUrls);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
