package com.a13x.tempconverter.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import com.a13x.tempconverter.R;
import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by Alejandro on 11/11/2016.
 */

public class TipDetailActivity extends AppCompatActivity {

    @Bind(R.id.txtBillTotal)
    TextView txtBillTotal;
    @Bind(R.id.txtTip)
    TextView txtTip;
    @Bind(R.id.txtTime)
    TextView txtTime;

    public final static String TIP_KEY = "tip";
    public final static String DATE_KEY = "timestamp";
    public final static String BILL_TOTAL_KEY = "total";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tip_detail);
        ButterKnife.bind(this);

        Intent intent = getIntent();

        String strTotal = String.format(getString(R.string.tipdetail_message_bill),
                intent.getDoubleExtra(BILL_TOTAL_KEY, 0d));
        String strTip = String.format(getString(R.string.global_message_tip),
                intent.getDoubleExtra(TIP_KEY, 0d));



        txtTime.setText(intent.getStringExtra(DATE_KEY));
        txtBillTotal.setText(strTotal);
        txtTip.setText(strTip);
    }
}
