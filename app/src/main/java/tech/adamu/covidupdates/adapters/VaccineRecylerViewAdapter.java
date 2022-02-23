package tech.adamu.covidupdates.adapters;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

import retrofit2.Response;
import tech.adamu.covidupdates.R;
import tech.adamu.covidupdates.models.news.News;

public class VaccineRecylerViewAdapter extends RecyclerView.Adapter<VaccineRecylerViewAdapter.ViewHolder> {
    List<News> newsList;
    Context context;

    public VaccineRecylerViewAdapter(List<News> newsList, Context context) {
        this.newsList = newsList;
        this.context = context;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.news_strip_view,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
//        Picasso.get().load(newsList.get(position).getUrlToImage().getLogo()).into(holder.imageView);
        Picasso.get().load(newsList.get(position).getUrlToImage()).into(holder.imageView);
        holder.title.setText(newsList.get(position).getTitle());
        holder.pubdate.setText(newsList.get(position).getPubDate().trim());
        holder.content.setText(newsList.get(position).getContent());
       holder.url.setText(newsList.get(position).getLink());
       holder.reference.setText(newsList.get(position).getReference());

    }

    @Override
    public int getItemCount() {
        return newsList.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView title;
        TextView content;
        TextView pubdate;
        TextView url;
        TextView reference;
        ConstraintLayout constraintLayout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.newsimage);
            title= itemView.findViewById(R.id.title);
            pubdate= itemView.findViewById(R.id.pubdate);
            content = itemView.findViewById(R.id.content);
            url = itemView.findViewById(R.id.url);
            reference = itemView.findViewById(R.id.reference);
            constraintLayout = itemView.findViewById(R.id.constraintLayout);

        }
    }
}
