package tech.adamu.covidupdates.network;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import tech.adamu.covidupdates.models.CovidDataAfricaResponse;

public interface CovidApi {
    @GET("npm-covid-data/africa")
    Call<CovidDataAfricaResponse> getData();
}
