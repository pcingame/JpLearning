package com.example.jplearning.data.model

import com.google.firebase.database.IgnoreExtraProperties

@IgnoreExtraProperties
data class Katakana(
    val content: List<Content>,
    val name: String? = null
)