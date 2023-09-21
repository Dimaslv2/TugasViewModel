package com.example.android.unscramble.ui.game

import android.util.Log

class GameViewModel : ViewModel() {

    private var _score = 0
    val score: Int
    get() = _score
    private var currentWordCount = 0
    private var _currentScrambledWord = "test"
    val currentScrambledWord: String
        get() = _currentScrambledWord

    init {
        Log.d("GameFragment", "GameViewModel created!")
    }

    override fun onCleared() {
        super.onCleared()
        Log.d("GameFragment", "GameViewModel destroyed!")
    }

}