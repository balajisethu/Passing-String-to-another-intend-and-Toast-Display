package com.bseth.values;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

import static com.bseth.values.R.id.editText;


public class MainActivity extends AppCompatActivity {

    public final static String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
  //  private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        //client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }

    public void next(View view) {

        Intent i = new Intent(this, Second_Act.class);

        final EditText applesInput = (EditText) findViewById(editText);
        String userMessage = applesInput.getText().toString();
        applesInput.setSelection(0);
        i.putExtra("appleMessage", userMessage);


        final EditText applesInput2 = (EditText) findViewById(R.id.editText3);
        String userMessage2 = applesInput2.getText().toString();
        i.putExtra("appleMessage2", userMessage2);


        startActivity(i);

        //Method 1: Using Multiple Edittext in Toast.
        Toast toast=Toast.makeText(MainActivity.this,"" + userMessage + " " + userMessage2 ,Toast.LENGTH_LONG);
        //Method 2: Displaying Message in Second Page Using Toast.
        Toast toast1=Toast.makeText(this, "Second Page", Toast.LENGTH_LONG);
        toast1.show();
        toast.show();
    }



}
