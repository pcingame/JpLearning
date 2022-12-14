package com.example.jplearning.data.model

import com.google.firebase.database.IgnoreExtraProperties

@IgnoreExtraProperties
data class Content(
    val examples: List<Example>,
    val japanese: String? = null,
    val romaji: String? = null
)