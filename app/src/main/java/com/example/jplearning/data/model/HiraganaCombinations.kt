package com.example.jplearning.data.model

import com.google.firebase.database.IgnoreExtraProperties

@IgnoreExtraProperties
data class HiraganaCombinations(
    val content: List<Content>,
    val name: String? = null
)