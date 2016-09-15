package com.a13x.myfirstapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {


    @Bind(R.id.edit_message)
    EditText message;
    @Bind(R.id.buttonSend)
    Button buttonSend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

    }

    public void sendMessage(View view) {
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        String messageToSend = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        startActivity(intent);

        Log.v("Escribi:", message.getText().ToString());
    }

    @OnClick({R.id.edit_message, R.id.buttonSend})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.edit_message:
                break;
            case R.id.buttonSend:
                break;
        }
    }
}
}
        }
