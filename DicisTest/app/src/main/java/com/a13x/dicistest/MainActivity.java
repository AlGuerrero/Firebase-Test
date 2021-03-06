package com.a13x.dicistest;

/**
 * Created by Alejandro on 17/11/2016.
 */
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.editText)
    EditText editText;
    @Bind(R.id.button)
    Button button;

    FirebaseDatabase database;
    DatabaseReference myReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        database = FirebaseDatabase.getInstance();
        myReference = database.getReference("message"); //mensaje
    }

    @OnClick(R.id.button)
    public void clickSubmitHandler() {
        String message = editText.getText().toString();
        myReference.setValue(message);
        editText.setText("");
    }
}