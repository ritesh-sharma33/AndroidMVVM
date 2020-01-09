package com.example.dependencyinjectionexample.data.repository

import androidx.lifecycle.LiveData
import com.example.dependencyinjectionexample.data.db.QuoteDao
import com.example.dependencyinjectionexample.data.model.Quote

class QuoteRepositoryImpl(private val quoteDao: QuoteDao)
    : QuoteRepository{
    override fun addQuote(quote: Quote) {
        quoteDao.addQuote(quote)
    }

    override fun getQuotes() = quoteDao.getQuotes()
}