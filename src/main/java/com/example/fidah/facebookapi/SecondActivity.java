package com.example.fidah.facebookapi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import org.w3c.dom.Text;

import de.hdodenhof.circleimageview.CircleImageView;

public class SecondActivity extends AppCompatActivity {


    CircleImageView image;
    TextView username;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        image=findViewById(R.id.image);
        username=findViewById(R.id.username);
        try{
        Intent intent=getIntent();
        Picasso.get().load(intent.getStringExtra("image")).into(image);
        username.setText(intent.getStringExtra("username"));}
        catch(Exception e){
            Toast.makeText(getApplicationContext(),"Data Couldn't found "+e,Toast.LENGTH_LONG).show();
        }
    }
}
