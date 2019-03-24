package com.example.projet;

import retrofit2.Call;
import retrofit2.http.GET;

public interface RestF1Api {

    @GET("pokemon")
    Call<RestF1Response> getListF1();
}
