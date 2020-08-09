package com.hoony.dagger2simpleexample3.chaper5

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.hoony.dagger2simpleexample3.R
import kotlinx.android.synthetic.main.activity_main.tvText
import kotlinx.android.synthetic.main.activity_scope.*

class Chapter5Activity : AppCompatActivity() {

    private lateinit var magicBox: MagicBox

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scope)
        magicBox = DaggerMagicBox.create()

        btCreate.setOnClickListener {
            val storage = Storage()
            magicBox.poke(storage)
            tvText.text = "Unique ${storage.uniqueMagic}\n" +
                    "Normal ${storage.normalMagic}"
        }
    }
}