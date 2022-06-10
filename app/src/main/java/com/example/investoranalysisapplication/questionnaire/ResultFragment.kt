package com.example.investoranalysisapplication.questionnaire

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.lifecycle.ViewModelProviders.*
import com.example.investoranalysisapplication.MainActivityViewModel
import com.example.investoranalysisapplication.NAME_EXTRA
import com.example.investoranalysisapplication.R
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_result.*


class ResultFragment : Fragment() {

    private lateinit var mainActivityViewModel: MainActivityViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_result, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // Activity como referência do ViewModel para
        // compartilhamento da mesma instância
        activity?.let {act->
            mainActivityViewModel = ViewModelProviders.of(act)
                .get(mainActivityViewModel::class.java)
        }

        subscribe()

    }

    private fun subscribe(){
        mainActivityViewModel.name.observe(this, Observer {
            if(it != null && it.isNotBlank()){
                name_textView_id.visibility = View.VISIBLE
                name_textView_id.text = it
            } else {
                name_textView_id.visibility = View.GONE
            }
        })

    }


}
