package com.example.jplearning.data.model

import com.google.firebase.database.IgnoreExtraProperties

@IgnoreExtraProperties
data class Hiragana(
    val content: List<Content>,
    val name: String? = null
)