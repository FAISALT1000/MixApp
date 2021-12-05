package com.tuwaiq.mixapp.imdb.api

import com.tuwaiq.mixapp.imdb.models.Movie
import com.tuwaiq.mixapp.imdb.models.MovieResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ImdbApi {

    @GET("en/API/Top250Movies/k_uue2ahfh")
    fun top250Movies(): Call<MovieResponse>



}