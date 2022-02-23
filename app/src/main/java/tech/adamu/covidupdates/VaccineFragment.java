package tech.adamu.covidupdates;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import tech.adamu.covidupdates.adapters.VaccineRecylerViewAdapter;
import tech.adamu.covidupdates.models.news.News;
import tech.adamu.covidupdates.models.news.VaccineSearchResponse;
import tech.adamu.covidupdates.network.CovidApi;
import tech.adamu.covidupdates.network.CovidClient;


public class VaccineFragment extends Fragment {
    @BindView(R.id.recyclerView) RecyclerView recyclerView;


    public VaccineFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_vaccine, container, false);
        ButterKnife.bind(this, view);

        CovidApi covidApi = CovidClient.getClient();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(), RecyclerView.VERTICAL, false);

        recyclerView.setLayoutManager(linearLayoutManager);

        Call<VaccineSearchResponse> call1 = covidApi.getNews("0");
        call1.enqueue(new Callback<VaccineSearchResponse>() {
            @Override
            public void onResponse(Call<VaccineSearchResponse> call, Response<VaccineSearchResponse> response) {
                if (response.isSuccessful()) {
                    List<News> responseList = response.body().getNews();

                    recyclerView.setAdapter(new VaccineRecylerViewAdapter(responseList, getContext()));
                    Toast.makeText(getContext(), "News is successful", Toast.LENGTH_SHORT).show();

                } else {
                    Toast.makeText(getContext(), "News are unsuccessful", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<VaccineSearchResponse> call, Throwable t) {
                Toast.makeText(getContext(), "News is failing", Toast.LENGTH_SHORT).show();

            }

        });
        return view;

    }
}