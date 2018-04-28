package com.example.habtish.recyclerview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class RecycleViewAdapter extends RecyclerView.Adapter<RecycleViewAdapter.MyviewHolder>{
    private Context mcontext;
    private List<Phones> mdata;

    public RecycleViewAdapter(Context mcontext, List<Phones> mdata) {
        this.mcontext = mcontext;
        this.mdata = mdata;
    }

    @NonNull
    @Override
    public MyviewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        LayoutInflater mInflater = LayoutInflater.from(mcontext);
        view = mInflater.inflate(R.layout.card_view,parent,false);
        return new MyviewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyviewHolder holder, int position) {
        holder.tv_book_title.setText(mdata.get(position).getTitle());
        holder.img_book_thumbnail.setImageResource(mdata.get(position).getThumbnail());

    }

    @Override
    public int getItemCount() {
        return mdata.size();
    }

    public static class MyviewHolder extends RecyclerView.ViewHolder{
        TextView tv_book_title;
        ImageView img_book_thumbnail;

        public MyviewHolder(View itemView) {
            super(itemView);
            tv_book_title = (TextView) itemView.findViewById(R.id.book_title);
            img_book_thumbnail = (ImageView) itemView.findViewById(R.id.booke_image_id);

        }
    }
}
