package com.kennedy.cryptocurrencyc;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Kennedy on 04-Nov-17.
 */

public class ActivityBtcCoin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_btc_coin);

        BtcFragment btcCoinFragment = new BtcFragment();
        FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction()
                .add(R.id.ethfragment, btcCoinFragment)
                .commit();


    }
}
