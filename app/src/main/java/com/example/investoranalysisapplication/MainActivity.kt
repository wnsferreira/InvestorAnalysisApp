package com.example.investoranalysisapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.os.bundleOf
import androidx.fragment.app.add
import androidx.fragment.app.commit
import com.example.investoranalysisapplication.questionnaire.QuizActivity
import com.example.investoranalysisapplication.questionnaire.ResultFragment
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_q1_form.*
import kotlinx.android.synthetic.main.fragment_result.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_Analyze_Id.setOnClickListener{
           val name = name_input_id.text.toString()
           name_input_id.setText("")

            val nameIntent = Intent(this, QuizActivity::class.java)
            nameIntent.putExtra(NAME_EXTRA, name)
            startActivity(nameIntent)
        }

    }


}