package com.kennedy.cryptocurrencyc.CoinInterface;

import com.kennedy.cryptocurrencyc.CurrencyExchange;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by Kennedy on 04-Nov-17.
 */

public interface ExchangeService {
    @GET("data/price?")
    Call<CurrencyExchange> loadCurrencyExchange(@Query("fsym") String coins, @Query("tsyms") String currency);
}
