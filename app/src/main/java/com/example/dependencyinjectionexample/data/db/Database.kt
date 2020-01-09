package com.example.dependencyinjectionexample.data.db

import com.example.dependencyinjectionexample.data.model.Quote

interface Database {
    val quoteDao: QuoteDao
}