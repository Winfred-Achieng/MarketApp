package com.winfred.marketapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    List<Item> itemList;
    MyAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=findViewById(R.id.recyclerview);

        itemList=new ArrayList<>();
        Item item1= new Item("Fruits","Fresh Fruits from the Garden",R.drawable.grocery1);
        Item item2= new Item("Fruits","Fresh Fruits from the Garden",R.drawable.grocery1);
        Item item3= new Item("Fruits","Fresh Fruits from the Garden",R.drawable.grocery1);
        Item item4= new Item("Fruits","Fresh Fruits from the Garden",R.drawable.grocery1);
        Item item5= new Item("Fruits","Fresh Fruits from the Garden",R.drawable.grocery1);
        Item item6= new Item("Fruits","Fresh Fruits from the Garden",R.drawable.grocery1);

        itemList.add(item1);
        itemList.add(item2);
        itemList.add(item3);
        itemList.add(item4);
        itemList.add(item5);
        itemList.add(item6);

        LinearLayoutManager layoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        adapter=new MyAdapter(itemList);
        recyclerView.setAdapter(adapter);


    }
}