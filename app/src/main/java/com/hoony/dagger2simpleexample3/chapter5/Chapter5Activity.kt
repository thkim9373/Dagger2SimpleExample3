package com.hoony.dagger2simpleexample3.chapter5

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.hoony.dagger2simpleexample3.R
import kotlinx.android.synthetic.main.activity_main.tvText
import kotlinx.android.synthetic.main.activity_scope.*

class Chapter5Activity : AppCompatActivity() {

    private lateinit var mainBox: SingletonBox
    private lateinit var magicBox: MagicBox

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scope)
        mainBox = DaggerSingletonBox.create()
        magicBox = mainBox.getMagicBox()

        btCreate.setOnClickListener {
            val storage = Storage()
            magicBox.poke(storage)
            // then print all the member created in the Storage
            // to show if they are new or existing
            tvText.text = "Singleton ${storage.singletonOne}\n" +
                    "Unique ${storage.uniqueMagic}\n" +
                    "Normal ${storage.normalMagic}"

        }
    }
}