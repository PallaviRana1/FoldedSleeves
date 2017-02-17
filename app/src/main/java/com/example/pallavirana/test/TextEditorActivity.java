package com.example.pallavirana.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

import java.io.File;

public class TextEditorActivity extends AppCompatActivity {

    private static final int REQUEST_PICK_FILE = 1;

    private TextView fileName;
    private Button browse,save,save_as;
    private File selectedFile;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_editor);

        //--save as button
        save_as=(Button) findViewById(R.id.save_as);
        save_as.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //save as code
            }
        });

        //--save button
        save=(Button) findViewById(R.id.save);
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //save code
            }
        });

        //--save button
        browse=(Button) findViewById(R.id.browse);
        browse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //browse code

                Intent intent=new Intent(TextEditorActivity.this, ListFileActivity.class);
                startActivity(intent);


            }
        });

        fileName=(TextView) findViewById(R.id.filename);


    }




}
