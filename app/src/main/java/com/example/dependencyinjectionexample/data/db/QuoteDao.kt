package com.example.dependencyinjectionexample.data.db

import androidx.lifecycle.LiveData
import com.example.dependencyinjectionexample.data.model.Quote

interface QuoteDao {
    fun addQuote(quote: Quote)
    fun getQuotes() : LiveData<List<Quote>>
}