package com.example.jplearning.data.model

import com.google.firebase.database.IgnoreExtraProperties

@IgnoreExtraProperties
data class JPAlphabet(
    val hiragana: Hiragana,
    val hiraganaCombinations: HiraganaCombinations,
    val katakana: Katakana,
    val katakanaCombinations: KatakanaCombinations
)