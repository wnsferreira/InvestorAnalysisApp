package com.example.investoranalysisapplication

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel: ViewModel() {

    // caso sejam nulos, string vazia como valor padrão
    var name = MutableLiveData<String>().apply { value = "" }
}