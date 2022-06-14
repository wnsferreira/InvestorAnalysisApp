package com.example.investoranalysisapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProviders
import com.example.investoranalysisapplication.questionnaire.QuizActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

//    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        viewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)

        btn_Analyze_Id.setOnClickListener{

            val name = name_input_id.text.toString()
            name_input_id.setText("")
//            viewModel.name.value = name_input_id.text.toString()

            val nameIntent = Intent(this, QuizActivity::class.java)

            nameIntent.putExtra("name", name)
            startActivity(nameIntent)
        }

    }


}