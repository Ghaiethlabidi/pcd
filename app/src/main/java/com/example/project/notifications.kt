package com.example.project

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button


class notifications : Fragment() {



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view= inflater.inflate(R.layout.fragment_notifications, container, false)
        val backbt: Button = view.findViewById(R.id.back)
        backbt.setOnClickListener {
            val fragment = settings()
            val transaction= fragmentManager?.beginTransaction()
            transaction?.replace(R.id.mainContainer,fragment)?.commit()
        }

        return view
    }


}