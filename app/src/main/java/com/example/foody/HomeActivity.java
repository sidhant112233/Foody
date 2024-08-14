package com.example.foody;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.foody.Adapter.CardAdapter;

public class HomeActivity extends AppCompatActivity {

    RecyclerView recycler_view;
    CardView card1;

    int[] images = {
            R.drawable.gujarati,
            R.drawable.punjabi,
            R.drawable.gujarati,
            R.drawable.gujarati
    };

    String[] texts = {
            "Gujarati",
            "Punjabi",
            "South indian",
            "Rajasthani"
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

               recycler_view = findViewById(R.id.recycler_view);
               card1 = findViewById(R.id.card1);
        AtachAdapter();

        card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(HomeActivity.this,ShopActivity.class);
                startActivity(intent);
            }
        });


    }

    private void AtachAdapter() {
        CardAdapter adapter = new CardAdapter(this, images, texts);
        RecyclerView.LayoutManager lm = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);
        recycler_view.setAdapter(adapter);
        recycler_view.setLayoutManager(lm);

    }

}
