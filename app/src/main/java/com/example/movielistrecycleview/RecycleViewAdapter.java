package com.example.movielistrecycleview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

public class RecycleViewAdapter extends RecyclerView.Adapter<RecycleViewAdapter.MyViewHolder> {

    List<Movie> movieList;
    Context context;

    public RecycleViewAdapter(List<Movie> movieList, Context context) {
        this.movieList = movieList;
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.one_line_movie, parent, false);
        MyViewHolder holder = new MyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.tv_movieName.setText(movieList.get(position).getName());
        holder.tv_whoRecommended.setText(movieList.get(position).getWhoRecommended());
        holder.tv_awfulRating.setText(String.valueOf(movieList.get(position).getAwfulRating()));
        Glide.with(this.context).load(movieList.get(position).getImageURL()).into(holder.iv_moviePicture);

    }

    @Override
    public int getItemCount() {
        return movieList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView iv_moviePicture;
        TextView tv_movieName;
        TextView tv_whoRecommended;
        TextView tv_awfulRating;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            iv_moviePicture = itemView.findViewById(R.id.iv_moviePicture);
            tv_movieName = itemView.findViewById(R.id.tv_movieName);
            tv_whoRecommended = itemView.findViewById(R.id.tv_whoRecommended);
            tv_awfulRating = itemView.findViewById(R.id.tv_awfulRating);
        }
    }
}
