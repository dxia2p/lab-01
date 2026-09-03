package com.example.petshop

class Angry(date: String) : Mood(date) {
    override fun getMood(): String {
        return "Angry"
    }
}