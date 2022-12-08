package com.example.jplearning.ui.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.jplearning.R
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var database: DatabaseReference

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        database = Firebase.database.reference

        database.child("Hiragana").child("content").child("0").child("romaji").get()
            .addOnSuccessListener {
                tvTest.text = it.value.toString()
            }.addOnFailureListener {
                tvTest.text = it.toString()
            }
    }
}