package tech.adamu.covidupdates.adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;
import java.util.zip.Inflater;

import tech.adamu.covidupdates.R;
import tech.adamu.covidupdates.models.CovidDataAfricaResponse;

public class CovidRecyclerViewAdapter extends RecyclerView.Adapter<CovidRecyclerViewAdapter.ViewHolder> {
    List<CovidDataAfricaResponse> dataList;
    Context context;

    public CovidRecyclerViewAdapter(List<CovidDataAfricaResponse> dataList, Context context) {
        this.dataList = dataList;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.covid_strip_view,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.countryName.setText(dataList.get(position).getCountry());
        holder.countryStatistics.setText(dataList.get(position).getNewCases());
       
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }

   class ViewHolder extends RecyclerView.ViewHolder {

        TextView countryName;
        TextView countryStatistics;
        ConstraintLayout constraintLayout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            countryName = itemView.findViewById(R.id.country);
            countryStatistics = itemView.findViewById(R.id.statistics);
            constraintLayout = itemView.findViewById(R.id.constraintLayout);

        }
    }
}
