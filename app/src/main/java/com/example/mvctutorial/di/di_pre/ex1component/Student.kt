package com.example.mvctutorial.di.di_pre.ex1component

import javax.inject.Inject

class Student {
    @Inject
    lateinit var name: String
    @Inject
    lateinit var address: String
}
