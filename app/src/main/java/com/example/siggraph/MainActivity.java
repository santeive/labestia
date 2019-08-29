package com.example.siggraph;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.ARbutton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Opening Unity 3D", Toast.LENGTH_LONG).show();

                Intent unityIntent = new Intent(MainActivity.this, com.example.siggraph.UnityPlayerActivity.class);
                MainActivity.this.startActivity(unityIntent);
            }
        });
    }
}
