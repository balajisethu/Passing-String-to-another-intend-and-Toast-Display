package com.bseth.values;

/**
 * Created by bseth on 30-12-2016.
 */

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import static android.provider.Contacts.SettingsColumns.KEY;

public class Second_Act extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Bundle applesData = getIntent().getExtras();
        if (applesData== null)
            return;
        {
            String appleMessages = applesData.getString("appleMessage");
            final EditText edittext=(EditText) findViewById((R.id.editText2));
            edittext.setText(appleMessages);

            String iphone = applesData.getString("appleMessage2");
            final EditText edi=(EditText) findViewById((R.id.editText4));
            edi.setText(iphone);
        }


    }




}