package com.example.jplearning.domain.model

import com.google.firebase.database.IgnoreExtraProperties

@IgnoreExtraProperties
data class Example(
    val japanese: String? = null,
    val meaning: String? = null,
    val romaji: String? = null
)