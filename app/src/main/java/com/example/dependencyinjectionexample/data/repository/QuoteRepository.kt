package com.example.dependencyinjectionexample.data.repository

import androidx.lifecycle.LiveData
import com.example.dependencyinjectionexample.data.model.Quote

interface QuoteRepository {
    fun addQuote(quote: Quote)
    fun getQuotes() : LiveData<List<Quote>>
}