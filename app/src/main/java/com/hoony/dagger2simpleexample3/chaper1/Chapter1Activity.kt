package com.hoony.dagger2simpleexample3.chaper1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hoony.dagger2simpleexample3.R
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class Chapter1Activity : AppCompatActivity() {

    @Inject
    lateinit var info: Info

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        DaggerMagicBox.create().poke(this)
        tvText.text = info.text
    }
}