package com.example.investoranalysisapplication.questionnaire

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import com.example.investoranalysisapplication.R
import com.example.investoranalysisapplication.ResultActivity
import kotlinx.android.synthetic.main.activity_quiz.*

class QuizActivity : AppCompatActivity() {

    private var investorProfile = ""
    private val list = mutableListOf<Int>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz)

        var name = intent.getStringExtra("name")
        name_textView_Frag_id.text = name

        submit_btn.setOnClickListener{

            val nameIntent = Intent(this, ResultActivity::class.java)

            nameIntent.putExtra("name", name)
            nameIntent.putExtra("profile", investorProfile)

            startActivity(nameIntent)
        }

    }

    fun onRadioButtonClicked(view: View) {

        if (view is RadioButton) {

            val checked = view.isChecked

            when (view.getId()) {
                R.id.radioButton_q1_a ->
                    if (checked) {
                        list += 0
                    }
                R.id.radioButton_q1_b ->
                    if (checked) {
                        list += 2
                    }
                R.id.radioButton_q1_c ->
                    if (checked) {
                        list += 3
                    }
                R.id.radioButton_q1_d ->
                    if (checked) {
                        list += 4
                    }

//                Questao 02
                R.id.radioButton_q2_a ->
                    if (checked) {
                        list += 0
                    }
                R.id.radioButton_q2_b ->
                    if (checked) {
                        list += 2
                    }
                R.id.radioButton_q2_c ->
                    if (checked) {
                        list += 4
                    }
                R.id.radioButton_q2_d ->
                    if (checked) {
                        list += 5
                    }

//                Questao 03
                R.id.radioButton_q3_a ->
                    if (checked) {
                        list += 0
                    }
                R.id.radioButton_q3_b ->
                    if (checked) {
                        list += 1
                    }
                R.id.radioButton_q3_c ->
                    if (checked) {
                        list += 2
                    }
                R.id.radioButton_q3_d ->
                    if (checked) {
                        list += 4
                    }

//                Questao 04
                R.id.radioButton_q4_a ->
                    if (checked) {
                        list += 0
                    }
                R.id.radioButton_q4_b ->
                    if (checked) {
                        list += 2
                    }
                R.id.radioButton_q4_c ->
                    if (checked) {
                        list += 4
                    }

//              Questao 05
                R.id.radioButton_q5_a ->
                    if (checked) {
                        list += 0
                    }
                R.id.radioButton_q5_b ->
                    if (checked) {
                        list += 2
                    }
                R.id.radioButton_q5_c ->
                    if (checked) {
                        list += 4
                    }

//              Questao 06
                R.id.radioButton_q6_a ->
                    if (checked) {
                        list += 0
                    }
                R.id.radioButton_q6_b ->
                    if (checked) {
                        list += 2
                    }
                R.id.radioButton_q6_c ->
                    if (checked) {
                        list += 3
                    }
                R.id.radioButton_q6_d ->
                    if (checked) {
                        list += 4
                    }

//              Questao 07
                R.id.radioButton_q7_a ->
                    if (checked) {
                        list += 0
                    }
                R.id.radioButton_q7_b ->
                    if (checked) {
                        list += 2
                    }
                R.id.radioButton_q7_c ->
                    if (checked) {
                        list += 3
                    }
                R.id.radioButton_q7_d ->
                    if (checked) {
                        list += 4
                    }

//              Questao 08
                R.id.radioButton_q8_a ->
                    if (checked) {
                        list += 0
                    }
                R.id.radioButton_q8_b ->
                    if (checked) {
                        list += 1
                    }
                R.id.radioButton_q8_c ->
                    if (checked) {
                        list += 2
                    }
                R.id.radioButton_q8_d ->
                    if (checked) {
                        list += 4
                    }

//              Questao 09
                R.id.radioButton_q9_a ->
                    if (checked) {
                        list += 0
                    }
                R.id.radioButton_q9_b ->
                    if (checked) {
                        list += 1
                    }
                R.id.radioButton_q9_c ->
                    if (checked) {
                        list += 2
                    }
                R.id.radioButton_q9_d ->
                    if (checked) {
                        list += 4
                    }
                R.id.radioButton_q9_d ->
                    if (checked) {
                        list += 5
                    }
            }
        }

        defineInvestorProfile()
    }

    private fun defineInvestorProfile(){
        val sum = list.sum()
        println(list)
        println("Soma: $sum")

        if (sum <= 14){
            investorProfile = "CONSERVADOR"
        }
        if (sum >=15 && sum <=35){
            investorProfile = "MODERADO"
        }
        if (sum > 35){
            investorProfile = "ARROJADO"
        }
    }

}