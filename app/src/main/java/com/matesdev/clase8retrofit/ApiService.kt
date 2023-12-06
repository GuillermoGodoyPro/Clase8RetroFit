package com.matesdev.clase8retrofit

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Url

interface ApiService  {
    @GET
    fun getListaImagenes( @Url url: String) : Response<RazasResponse>
}