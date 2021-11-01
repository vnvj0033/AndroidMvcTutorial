package com.example.mvctutorial.designpattern._01strategy

fun main() {
    val character = GameCharacter()

    character.run {
        setWeapon(Knife())
        attact()
    }

    character.run {
        setWeapon(Ax())
        attact()
    }

    character.run {
        setWeapon(Sword())
        attact()
    }
}