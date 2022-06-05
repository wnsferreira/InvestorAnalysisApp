package com.example.investoranalysisapplication.questionnaire

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.investoranalysisapplication.R
import kotlinx.android.synthetic.main.fragment_q1_form.*
import kotlinx.android.synthetic.main.fragment_q3__form.*

class Q3_FormFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_q3__form, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setListeners()
    }

    private fun setListeners(){
        avancar_btn_q3.setOnClickListener{
            findNavController().navigate(R.id.q4_FormFragment)
        }
    }
}