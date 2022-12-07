package com.example.jplearning.domain.model

import com.google.firebase.database.IgnoreExtraProperties

@IgnoreExtraProperties
data class KatakanaCombinations(
    val content: List<Content>,
    val name: String? = null
)