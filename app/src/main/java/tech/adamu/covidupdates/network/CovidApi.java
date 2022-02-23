package tech.adamu.covidupdates.network;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import tech.adamu.covidupdates.models.data.CovidDataAfricaResponse;
import tech.adamu.covidupdates.models.news.VaccineSearchResponse;

public interface CovidApi {
    @GET("npm-covid-data/africa")
    Call<List<CovidDataAfricaResponse>> getData();

    @GET("news/get-coronavirus-news/0")
    Call<VaccineSearchResponse> getNews(@Query("0") String page);

}

