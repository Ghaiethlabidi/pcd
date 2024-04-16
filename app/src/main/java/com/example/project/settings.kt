package com.example.project

import android.app.AlertDialog
import android.app.Dialog
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast


class settings : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view= inflater.inflate(R.layout.fragment_settings, container, false)
        val notbt: Button= view.findViewById(R.id.notif)
        notbt.setOnClickListener {
            val fragment = notifications()
            val transaction= fragmentManager?.beginTransaction()
            transaction?.replace(R.id.mainContainer,fragment)?.commit()
        }
        val devbt: Button= view.findViewById(R.id.device)
        devbt.setOnClickListener {
            val fragment = device()
            val transaction= fragmentManager?.beginTransaction()
            transaction?.replace(R.id.mainContainer,fragment)?.commit()
        }
        val probt: Button= view.findViewById(R.id.profil)
        probt.setOnClickListener {
            val fragment = profile()
            val transaction= fragmentManager?.beginTransaction()
            transaction?.replace(R.id.mainContainer,fragment)?.commit()
        }
        val repbt: Button= view.findViewById(R.id.report)
        repbt.setOnClickListener {
            val fragment = report()
            val transaction= fragmentManager?.beginTransaction()
            transaction?.replace(R.id.mainContainer,fragment)?.commit()
        }
        val infbt: Button= view.findViewById(R.id.info)
        infbt.setOnClickListener {
            val fragment = info()
            val transaction= fragmentManager?.beginTransaction()
            transaction?.replace(R.id.mainContainer,fragment)?.commit()
        }
        val fedbt: Button= view.findViewById(R.id.feedback)
        fedbt.setOnClickListener {
            val fragment = feedback()
            val transaction= fragmentManager?.beginTransaction()
            transaction?.replace(R.id.mainContainer,fragment)?.commit()
        }
        val suppbt: Button= view.findViewById(R.id.contact)
        suppbt.setOnClickListener {
            val fragment = support()
            val transaction= fragmentManager?.beginTransaction()
            transaction?.replace(R.id.mainContainer,fragment)?.commit()
        }
        val outbt: Button= view.findViewById(R.id.out)
         outbt.setOnClickListener {
             val eBuilder= AlertDialog.Builder(context)
             eBuilder.setTitle("Exit")
             eBuilder.setMessage("ARE YOU SURE YOU WANT TO EXIT ?")
             eBuilder.setPositiveButton("Yes"){
                 Dialog,which ->
                 

             }
             eBuilder.setNegativeButton("NO"){
                 Dialog,which ->
                 Toast.makeText(context,"You want to exit press again this button ",Toast.LENGTH_SHORT).show()

             }
             val createBuild = eBuilder.create()
             createBuild.show()


         }


        return view
    }


}