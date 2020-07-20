package com.hoony.dagger2simpleexample3.chaper2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.hoony.dagger2simpleexample3.R
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class Chapter2Activity : AppCompatActivity() {

    @Inject
    lateinit var info: Info

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        DaggerMagicBox.create().poke(this)
        tvText.text = info.text
    }
}