package com.example.foody;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.foody.Adapter.CategoryAdapter;


public class CategoryActivity2 extends AppCompatActivity {

    RecyclerView Rvcategory;
    ImageView back;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_category2);
       Rvcategory = findViewById(R.id.RvCategory);
       back = findViewById(R.id.back);

       Rvcategory.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));

       int[] images = {
               R.drawable.brad,
               R.drawable.brad
       };
       back.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               finish();
           }
       });
        CategoryAdapter categoryAdapter = new CategoryAdapter(this,images);
        RecyclerView.LayoutManager lm = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        Rvcategory.setAdapter(categoryAdapter);
        Rvcategory.setLayoutManager(lm);
    }
}