package com.example.dependencyinjectionexample.ui.quotes

import androidx.lifecycle.ViewModel
import com.example.dependencyinjectionexample.data.model.Quote
import com.example.dependencyinjectionexample.data.repository.QuoteRepository

class QuotesViewModel(private val quoteRepository: QuoteRepository)
    : ViewModel() {

    fun addQuote(quote: Quote) = quoteRepository.addQuote(quote)

    fun getQuotes() = quoteRepository.getQuotes()
}