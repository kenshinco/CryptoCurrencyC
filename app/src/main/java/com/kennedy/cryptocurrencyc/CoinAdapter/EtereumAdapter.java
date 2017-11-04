package com.kennedy.cryptocurrencyc.CoinAdapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.kennedy.cryptocurrencyc.BitcActivityConversion;
import com.kennedy.cryptocurrencyc.CoinModel.Currency;
import com.kennedy.cryptocurrencyc.EthereumConversionActivity;
import com.kennedy.cryptocurrencyc.R;
import com.kennedy.cryptocurrencyc.Utils;

import java.util.ArrayList;

/**
 * Created by Kennedy on 01-Nov-17.
 */

public class EtereumAdapter extends RecyclerView.Adapter<EtereumAdapter.ViewHolder> {
    private Context mContext;

    private ArrayList<Currency> mList;


    public EtereumAdapter(Context mContext, ArrayList<Currency> mList) {
        this.mContext = mContext;
        this.mList = mList;

    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.custom_ethereum, parent, false);
               return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Currency currency = mList.get(position);
        holder.currencyName.setText(currency.getName());
        holder.currencyAmount.setText(String.valueOf(currency.getRate()));

        Glide.with(mContext).load(new Utils().getImageId(currency.getName())).into(holder.currencyImage);
    }

    @Override
    public int getItemCount() {

        return mList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView currencyName,currencyAmount;
        ImageView currencyImage;


        public ViewHolder(View itemView) {
            super(itemView);
            currencyImage = itemView.findViewById(R.id.flag_image_view);
            currencyName = itemView.findViewById(R.id.currency_name);
            currencyAmount = itemView.findViewById(R.id.currency_amount);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Currency currency= mList.get(getAdapterPosition());
                    Context context = view.getContext();
                    Intent intent = new Intent(context, EthereumConversionActivity.class);
                    intent.putExtra(BitcActivityConversion.EXTRA_POSITION, getAdapterPosition());
                    intent.putExtra("currency_rate", currency.getRate());
                    context.startActivity(intent);
                }
            });
        }
    }
}
