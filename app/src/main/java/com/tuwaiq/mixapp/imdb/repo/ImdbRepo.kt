package com.tuwaiq.mixapp.imdb.repo

import com.tuwaiq.mixapp.imdb.api.ImdbApi
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class ImdbRepo {
   private val retrofit: Retrofit = Retrofit.Builder()
        .baseUrl("https://imdb-api.com/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val   imdbApi = retrofit.create(ImdbApi::class.java)

}