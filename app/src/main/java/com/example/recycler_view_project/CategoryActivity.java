package com.example.recycler_view_project;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class CategoryActivity extends AppCompatActivity {
    RecyclerView categoryActivityRecyclerView;
    LinearLayoutManager layoutManager;
    List<Category_model> itemList;
    Adapter_Category adapterCategory;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        initData();
        initRecyclerView();
    }
    private void initData() {
        itemList=new ArrayList<>();
        itemList.add(new Category_model(R.drawable.almonds,"Almonds","100gm","Rs. 100",R.drawable.add_btn,R.drawable.almonds,"Almonds","100gm","Rs. 100",R.drawable.add_btn));
        itemList.add(new Category_model(R.drawable.almonds,"Almonds","100gm","Rs. 100",R.drawable.add_btn,R.drawable.almonds,"Almonds","100gm","Rs. 100",R.drawable.add_btn));
        itemList.add(new Category_model(R.drawable.almonds,"Almonds","100gm","Rs. 100",R.drawable.add_btn,R.drawable.almonds,"Almonds","100gm","Rs. 100",R.drawable.add_btn));

    }
    private void initRecyclerView() {
        categoryActivityRecyclerView=findViewById(R.id.categoryActivityRecyclerView);
        layoutManager=new LinearLayoutManager(this);
        layoutManager.setOrientation(RecyclerView.VERTICAL);
        categoryActivityRecyclerView.setLayoutManager(layoutManager);
        adapterCategory=new Adapter_Category(itemList);
        categoryActivityRecyclerView.setAdapter(adapterCategory);
        adapterCategory.notifyDataSetChanged();
    }


}