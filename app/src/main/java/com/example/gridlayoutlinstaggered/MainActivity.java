package com.example.gridlayoutlinstaggered;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    RecyclerView recyclerView;
    ProduitAdapter adapter;

    ArrayList<Produit> listproduit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        listproduit = new ArrayList<Produit>();
        Bitmap img = BitmapFactory.decodeResource(getResources(), R.drawable.kaiden1);
        listproduit.add(new Produit("Kaiden 1", img));
        Bitmap img2 = BitmapFactory.decodeResource(getResources(), R.drawable.kaiden2);
        listproduit.add(new Produit("Kaiden 2", img2));
        Bitmap img3 = BitmapFactory.decodeResource(getResources(), R.drawable.kaiden3);
        listproduit.add(new Produit("Kaiden 3", img3));
        Bitmap img4 = BitmapFactory.decodeResource(getResources(), R.drawable.kaiden4);
        listproduit.add(new Produit("Kaiden 4", img4));
        Bitmap img5 = BitmapFactory.decodeResource(getResources(), R.drawable.kaiden5);
        listproduit.add(new Produit("Kaiden 5", img5));
        Bitmap img6 = BitmapFactory.decodeResource(getResources(), R.drawable.kaiden6);
        listproduit.add(new Produit("Kaiden 6", img6));


        // Setting our Layout Manager
        GridLayoutManager layoutManager =
                new GridLayoutManager(this,2);

        recyclerView.setLayoutManager(layoutManager);



        adapter = new ProduitAdapter(this,listproduit);
        recyclerView.setAdapter(adapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }
}