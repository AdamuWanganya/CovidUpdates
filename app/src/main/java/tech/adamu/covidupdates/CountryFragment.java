package tech.adamu.covidupdates;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import tech.adamu.covidupdates.adapters.CountryRecyclerViewAdapter;
import tech.adamu.covidupdates.models.data.CountrySearchResponse;
import tech.adamu.covidupdates.network.CovidApi;
import tech.adamu.covidupdates.network.CovidClient;


public class CountryFragment extends Fragment {

    CovidClient countryClient;

    @BindView(R.id.recyclerView) RecyclerView recyclerView;

    public CountryFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_country, container, false);
        ButterKnife.bind(this, view);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(),RecyclerView.VERTICAL,false);
        recyclerView.setLayoutManager(linearLayoutManager);

        CovidApi covidApi = CovidClient.getClient();
        Call<List<CountrySearchResponse>> call = covidApi.getData();

//        Toast.makeText(getContext(), "Country open", Toast.LENGTH_SHORT).show();

        call.enqueue(new Callback<List<CountrySearchResponse>>() {
            @Override
            public void onResponse(Call<List<CountrySearchResponse>> call, Response<List<CountrySearchResponse>> response) {

                if (response.isSuccessful()) {
                    List<CountrySearchResponse> allData = response.body();
                    Log.e("MyResponse",response.raw().toString());
                    Toast.makeText(getContext(), "Country open", Toast.LENGTH_SHORT).show();

                    recyclerView.setAdapter(new CountryRecyclerViewAdapter(allData,getContext()));
//                    Toast.makeText(getContext(), "Successful", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(getContext(), "Data not successful", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<List<CountrySearchResponse>> call, Throwable t) {
                Log.e("Error",t.getMessage());
                Toast.makeText(getContext(), "Country fail" + t.getMessage(), Toast.LENGTH_LONG).show();


            }
        });
        return view;
    }
}