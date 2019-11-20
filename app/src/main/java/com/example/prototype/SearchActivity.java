package com.example.prototype;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SearchActivity extends AppCompatActivity {

    TextView currentTopic;
    Bundle bundle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        bundle = getIntent().getExtras();
        if(!bundle.equals(null)){
            currentTopic = findViewById(R.id.CurrentTopic);
            currentTopic.setText((String) bundle.get("topic"));
        }
        try{
            Thread.currentThread().wait(5000);
        }
        catch(InterruptedException e){
           e.printStackTrace();
        }
        startActivity(new Intent(getApplicationContext(), ConnectedActivity.class));
    }
}
