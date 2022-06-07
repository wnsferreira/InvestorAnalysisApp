package com.example.investoranalysisapplication.questionnaire

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.example.investoranalysisapplication.R
import kotlinx.android.synthetic.main.fragment_q9__form.*

class Q9FormFragment : Fragment() {

    var radioGroup: RadioGroup? = null
    lateinit var radioButton: RadioButton
    private lateinit var button: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_q9__form, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setListeners()
    }

    private fun setListeners(){

        radioGroup = view?.findViewById(R.id.radioGroup9)
        button = view?.findViewById(R.id.result_btn_q9)!!

        button.setOnClickListener{
            val selectedOption: Int = radioGroup!!.checkedRadioButtonId
            radioButton = view?.findViewById(selectedOption)!!
            Toast.makeText(context, radioButton.text, Toast.LENGTH_SHORT).show()

            findNavController().navigate(R.id.resultFragment)
        }
    }

}