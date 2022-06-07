package com.example.investoranalysisapplication.questionnaire

import android.content.ContentValues.TAG
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import com.example.investoranalysisapplication.QuizViewModel
import com.example.investoranalysisapplication.R
import kotlinx.android.synthetic.main.activity_main.*


class ResultFragment : Fragment() {

    private lateinit var quizViewModel: QuizViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_result, container, false)


        subscribe()
    }

    private fun subscribe(){
        quizViewModel.name.observe(this, Observer {
            if( it != null && it.isNotBlank()){
                name_input_id.visibility = View.VISIBLE
            } else{
                name_input_id.visibility = View.GONE
            }
        })
    }


}
