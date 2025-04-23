package com.example.retrofit

import retrofit2.Response
import retrofit2.http.GET

interface QuotesAPI {

    @GET("qotd")
    suspend fun getQuotes(): Response<QuoteList>
}