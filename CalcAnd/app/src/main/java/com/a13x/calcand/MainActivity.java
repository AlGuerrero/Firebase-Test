package com.a13x.calcand;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btCalculate_onClick(View view)
    {
        EditText tbxX = (EditText) findViewById(R.id.tbxX);
        EditText tbxY = (EditText) findViewById(R.id.tbxY);
        EditText tbxResult  = (EditText) findViewById(R.id.tbxResult);
        double x = Double.parseDouble(tbxX.getText().toString());
        double y = Double.parseDouble(tbxY.getText().toString());
        double result = x+y;
        tbxResult.setText(Double.toString(result));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
