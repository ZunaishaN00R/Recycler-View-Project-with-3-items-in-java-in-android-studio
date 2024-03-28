package com.zunaisha.recycularview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerview);

        List<Item> items=new ArrayList<Item>();
        items.add(new Item("Zunaisha Noor", "biet-f21-049@superior.edu.pk" , R.drawable.zunaisha));
        items.add(new Item("Zunaisha Noor", "biet-f21-049@superior.edu.pk" , R.drawable.zunaisha));
        items.add(new Item("Zunaisha Noor", "biet-f21-049@superior.edu.pk" , R.drawable.zunaisha));
        items.add(new Item("Zunaisha Noor", "biet-f21-049@superior.edu.pk" , R.drawable.zunaisha));
        items.add(new Item("Zunaisha Noor", "biet-f21-049@superior.edu.pk" , R.drawable.zunaisha));
        items.add(new Item("Zunaisha Noor", "biet-f21-049@superior.edu.pk" , R.drawable.zunaisha));
        items.add(new Item("Zunaisha Noor", "biet-f21-049@superior.edu.pk" , R.drawable.zunaisha));
        items.add(new Item("Zunaisha Noor", "biet-f21-049@superior.edu.pk" , R.drawable.zunaisha));
        items.add(new Item("Zunaisha Noor", "biet-f21-049@superior.edu.pk" , R.drawable.zunaisha));
        items.add(new Item("Zunaisha Noor", "biet-f21-049@superior.edu.pk" , R.drawable.zunaisha));
        items.add(new Item("Zunaisha Noor", "biet-f21-049@superior.edu.pk" , R.drawable.zunaisha));
        items.add(new Item("Zunaisha Noor", "biet-f21-049@superior.edu.pk" , R.drawable.zunaisha));
        items.add(new Item("Zunaisha Noor", "biet-f21-049@superior.edu.pk" , R.drawable.zunaisha));
        items.add(new Item("Zunaisha Noor", "biet-f21-049@superior.edu.pk" , R.drawable.zunaisha));
        items.add(new Item("Zunaisha Noor", "biet-f21-049@superior.edu.pk" , R.drawable.zunaisha));
        items.add(new Item("Zunaisha Noor", "biet-f21-049@superior.edu.pk" , R.drawable.zunaisha));
        items.add(new Item("Zunaisha Noor", "biet-f21-049@superior.edu.pk" , R.drawable.zunaisha));
        items.add(new Item("Zunaisha Noor", "biet-f21-049@superior.edu.pk" , R.drawable.zunaisha));
        items.add(new Item("Zunaisha Noor", "biet-f21-049@superior.edu.pk" , R.drawable.zunaisha));
        items.add(new Item("Zunaisha Noor", "biet-f21-049@superior.edu.pk" , R.drawable.zunaisha));
        items.add(new Item("Zunaisha Noor", "biet-f21-049@superior.edu.pk" , R.drawable.zunaisha));
        items.add(new Item("Zunaisha Noor", "biet-f21-049@superior.edu.pk" , R.drawable.zunaisha));
        items.add(new Item("Zunaisha Noor", "biet-f21-049@superior.edu.pk" , R.drawable.zunaisha));
        items.add(new Item("Zunaisha Noor", "biet-f21-049@superior.edu.pk" , R.drawable.zunaisha));
        items.add(new Item("Zunaisha Noor", "biet-f21-049@superior.edu.pk" , R.drawable.zunaisha));

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new MyAdapter(getApplicationContext(),items));
    }
}
