package com.hoony.dagger2simpleexample3.chaper4

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.hoony.dagger2simpleexample3.R
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class Chapter4Activity : AppCompatActivity() {

    @Inject
    @field:Choose(Choose.Name.LOVE)
    lateinit var infoLove: Info

    @Inject
    @field:Choose(Choose.Name.HELLO)
    lateinit var infoHello: Info

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        DaggerMagicBox.create().poke(this)
        tvText.text = "${infoLove.text}\n\n${infoHello.text}"
    }
}