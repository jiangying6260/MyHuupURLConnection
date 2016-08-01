package com.example.lsx.myhttpurlconnection;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText mUrlEditText;
    private TextView mUrlResultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mUrlEditText= (EditText) findViewById(R.id.activity_main_url_edit_text);
        mUrlResultTextView= (TextView) findViewById(R.id.activity_main_url_text_view);

    }
    public void myClickHandler(View view){
        ConnectivityManager connectivityManager=(ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo=connectivityManager.getActiveNetworkInfo();
        if(networkInfo!=null && networkInfo.isConnected()){
            Toast.makeText(MainActivity.this,"download...........",Toast.LENGTH_SHORT).show();
        }else{
            mUrlResultTextView.setText("No network connection available.");
        }

    }
}
