package com.curtesmalteser.kitsuexplorer.activity;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.curtesmalteser.kitsuexplorer.R;

import java.util.List;

/**
 * Created by anton on 23/12/2017.
 */

public class AnimeListAdapter extends RecyclerView.Adapter<AnimeListAdapter.ListItemViewHolder> {

    private List<AnimeViewModel> animeList;
    private Context context;

    public AnimeListAdapter(Context context, List<AnimeViewModel> list) {
        this.context = context;
        this.animeList = list;
    }


    @Override
    public ListItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view =
                LayoutInflater.from(parent.getContext()).inflate(R.layout.anime_row, parent, false);
        return new ListItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ListItemViewHolder holder, int position) {
        holder.textViewName.setText(animeList.get(position).getTitle());
        holder.textViewRating.setText(animeList.get(position).getRating());

        Glide.with(context)
                .load(animeList.get(position).getPosterUrl())
                .apply(RequestOptions.placeholderOf(R.drawable.ic_launcher_background))
                .into(holder.imageView);
        Log.d("AJDB", "onBindViewHolder: " + animeList.get(position).getPosterUrl());
    }

    @Override
    public int getItemCount() {
        return animeList.size();
    }

    public class ListItemViewHolder extends RecyclerView.ViewHolder {

        public ImageView imageView;
        public TextView textViewName;
        public TextView textViewRating;

        public ListItemViewHolder(View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.imageView);
            textViewName = itemView.findViewById(R.id.textViewName);
            textViewRating = itemView.findViewById(R.id.textViewRating);
        }
    }
}
