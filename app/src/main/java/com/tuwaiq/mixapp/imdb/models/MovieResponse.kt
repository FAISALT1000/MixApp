package com.tuwaiq.mixapp.imdb.models

import com.google.gson.annotations.SerializedName

class MovieResponse {
    @SerializedName("item")
    lateinit var movies:List<Movie>
}