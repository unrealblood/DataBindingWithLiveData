package com.strength.databindingwithlivedata.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.strength.databindingwithlivedata.data.Quote

class MainViewModel : ViewModel() {
    val quoteLiveData = MutableLiveData<Quote>(Quote("What you give is what you get.", "Shubham Singh"))

    fun updateQuote() {
        quoteLiveData.value!!.quoteText = "You will see it, when you believe it."
        quoteLiveData.value!!.quoteAuthor = "Shubham Saran"
    }
}