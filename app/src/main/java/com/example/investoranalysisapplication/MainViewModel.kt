package com.example.investoranalysisapplication

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {

    var name = MutableLiveData<String>().apply { value = "" }
}