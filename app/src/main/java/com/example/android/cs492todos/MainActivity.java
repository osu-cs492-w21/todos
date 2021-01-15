package com.example.android.cs492todos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText todoEntryET;
    private TextView todoListTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.todoListTV = findViewById(R.id.tv_todo_list);
        this.todoListTV.setText("TODO: finish my TODO app");

        this.todoEntryET = findViewById(R.id.et_todo_entry_box);

        Button addTodoBtn = findViewById(R.id.btn_add_todo);
    }
}