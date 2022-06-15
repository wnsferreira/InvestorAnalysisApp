package com.example.investoranalysisapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_result.*

class ResultActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        var name = intent.getStringExtra("name")
        name_TextView.text = name

        var profile = intent.getStringExtra("profile")
        profile_textview_id.text = profile

    }

}