package com.example.recycler_view_project;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements SelectListner{
    RecyclerView recyclerView;
    LinearLayoutManager layoutManager;
    List<ModelClass> userList;
    Adapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      // initCategoryActivity();
        initData();
        initRecyclerView();



    }

    private void initCategoryActivity() {
      Intent intent=new Intent(getApplicationContext(),CategoryActivity.class);
      startActivity(intent);
    }

    private void initData() {
        userList =new ArrayList<>();
        userList.add(new ModelClass(R.drawable.yuvraj,"Yuvraj","12:54 Am","क्षत्रियाः स्मृता ।।","_______________________________________________________"));
        userList.add(new ModelClass(R.drawable.aaditry,"Aadaitry","10:44 Am","One Day It will be ALl Fine","_______________________________________________________"));
        userList.add(new ModelClass(R.drawable.ishika,"Ishika","08:12 Am","Who's gonna walk you through.........","_______________________________________________________"));
        userList.add(new ModelClass(R.drawable.yuichebusho,"Yuichebusho","11:34 Pm","Busybee\uD83C\uDF3B","_______________________________________________________"));
        userList.add(new ModelClass(R.drawable.kavya,"Kavya","11:34 Pm","Anteda Chestadu","_______________________________________________________"));
        userList.add(new ModelClass(R.drawable.erp,"ERP Project","10:34 Pm","He gave less marks to everyone","_______________________________________________________"));
        userList.add(new ModelClass(R.drawable.manan,"Nasa Wale Khatarnak Log","09:24 Pm","One day i'm gonna make onions cry \uD83E\uDDC5","_______________________________________________________"));
        userList.add(new ModelClass(R.drawable.priyanshu,"Priyanshu","07:34 Pm","Naam Sune To Duniya Maun","_______________________________________________________"));
        userList.add(new ModelClass(R.drawable.sahil,"Sahil","01:34 Pm","Khao Piyau Miaaoooo","_______________________________________________________"));
        userList.add(new ModelClass(R.drawable.chirag,"Chirag Garg","11:34 Pm","Khakra Party Tonight \uD83D\uDE42","_______________________________________________________"));
        userList.add(new ModelClass(R.drawable.devaih,"Devu Don","02:31 Pm","Where is lakshm20an Bro??","_______________________________________________________"));
    }

    private void initRecyclerView() {
        recyclerView=findViewById(R.id.recyclerView);
        layoutManager=new LinearLayoutManager(this);
        layoutManager.setOrientation(RecyclerView.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        adapter=new Adapter (userList,this);
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }


    @Override
    public void onItemClicked(ModelClass modelClass) {
        Intent intent=new Intent(getApplicationContext(),CategoryActivity.class);
        startActivity(intent);
    }
}

