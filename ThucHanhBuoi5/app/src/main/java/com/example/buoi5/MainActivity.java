package com.example.buoi5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ListView listView;
    private final List<Student> list = new ArrayList<Student>();
    private ArrayAdapter<Student> listViewAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.listView = (ListView) findViewById(R.id.listView);
        DatabaseHandler  handler = new DatabaseHandler(this);

        handler.addStudent(new Student( 1,"phuc","123", "012" ));
        Log.d("tag", "onCreate: ");

        List<Student> students = handler.getAllStudents();
        list.addAll(students);

        listViewAdapter = new ArrayAdapter<Student>(this, android.R.layout.simple_expandable_list_item_1,list);
        listView.setAdapter(listViewAdapter);
    }



}