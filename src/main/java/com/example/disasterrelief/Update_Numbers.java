package com.example.disasterrelief;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Update_Numbers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update__numbers);
        setTitle("Update Phone Numbers");
    }

    public void main(View view) {
        EditText localPolice = (EditText) findViewById(R.id.local_police);
        String localPoliceNum = localPolice.getText().toString();

    }

}
