package com.example.retrofit

data class QuoteList(
    val count: Int,
    val lastItemIndex: Int,
    val page: Int,
    val result: List<Result>,
    val totalCount: Int,
    val totalPages: Int
)
