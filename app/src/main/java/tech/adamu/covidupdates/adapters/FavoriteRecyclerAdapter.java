package tech.adamu.covidupdates.adapters;


import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

import tech.adamu.covidupdates.R;
import tech.adamu.covidupdates.models.news.News;

public class FavoriteRecyclerAdapter extends RecyclerView.Adapter<FavoriteRecyclerAdapter.ViewHolder> {
    List<News> newsList;
    Context context;

    public FavoriteRecyclerAdapter(List<News> newsList, Context context) {
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
    public void onBindViewHolder(@NonNull ViewHolder holder, @SuppressLint("RecyclerView") int position) {
//        Picasso.get().load(newsList.get(position).getUrlToImage().getLogo()).into(holder.imageView);
        Picasso.get().load(newsList.get(position).getUrlToImage()).into(holder.imageView);
        holder.title.setText(newsList.get(position).getTitle());
        holder.pubdate.setText(newsList.get(position).getPubDate().trim());
        holder.content.setText(newsList.get(position).getContent());
        holder.url.setText(newsList.get(position).getLink());
        holder.reference.setText(newsList.get(position).getReference());
//        holder.cardview.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(context, VaccineNews.class);
//                intent.putExtra("Vaccine",newsList.get(position));
//                context.startActivity(intent);
//            }
//        });

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
        CardView cardview;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.newsimage);
            title= itemView.findViewById(R.id.country);
            pubdate= itemView.findViewById(R.id.total_tests);
            content = itemView.findViewById(R.id.serious_critical);
            url = itemView.findViewById(R.id.active_cases);
            reference = itemView.findViewById(R.id.total_cases);
            constraintLayout = itemView.findViewById(R.id.constraintLayout);
            cardview = itemView.findViewById(R.id.cardView);

        }
    }
}
