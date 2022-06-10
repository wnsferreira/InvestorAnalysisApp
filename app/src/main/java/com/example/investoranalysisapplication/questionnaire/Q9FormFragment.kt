package com.example.investoranalysisapplication.questionnaire

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.fragment.findNavController
import com.example.investoranalysisapplication.MainActivityViewModel
import com.example.investoranalysisapplication.NAME_EXTRA
import com.example.investoranalysisapplication.R
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_q9__form.*
import kotlinx.android.synthetic.main.fragment_result.*

class Q9FormFragment : Fragment() {

    var radioGroup: RadioGroup? = null
    lateinit var radioButton: RadioButton
    private lateinit var button: Button

    private lateinit var mainActivityViewModel: MainActivityViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_q9__form, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        activity?.let {act->
            mainActivityViewModel = ViewModelProviders.of(act)
                .get(mainActivityViewModel::class.java)
        }
        setListeners()
    }

    private fun setListeners(){

        
        radioGroup = view?.findViewById(R.id.radioGroup9)
        button = view?.findViewById(R.id.result_btn_q9)!!

        button.setOnClickListener{
            val selectedOption: Int = radioGroup!!.checkedRadioButtonId
            radioButton = view?.findViewById(selectedOption)!!
            Toast.makeText(context, radioButton.text, Toast.LENGTH_SHORT).show()

            mainActivityViewModel.name.value = name_input_id.text.toString()

//            val name = mainActivityViewModel.name.value ?: ""
//            val quizIntent = Intent(activity, QuizActivity::class.java)
//            quizIntent.putExtra(NAME_EXTRA, name)
//            startActivity(quizIntent)

            findNavController().navigate(R.id.resultFragment)
        }
    }

}