package com.example.investoranalysisapplication

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class QuizViewModel: ViewModel() {
    val name = MutableLiveData<String>()
}