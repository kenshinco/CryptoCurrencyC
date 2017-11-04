package com.kennedy.cryptocurrencyc;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Kennedy on 01-Nov-17.
 */

public class EthCoinActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eth_coin);
        EthereumFragment ethereumFragment = new EthereumFragment();
        FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction()
                .add(R.id.ethfragment, ethereumFragment)
                .commit();
    }
}
