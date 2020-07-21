package com.hoony.dagger2simpleexample3.list

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.hoony.dagger2simpleexample3.R
import com.hoony.dagger2simpleexample3.chaper1.Chapter1Activity
import com.hoony.dagger2simpleexample3.chaper2.Chapter2Activity
import com.hoony.dagger2simpleexample3.chaper3.Chapter3Activity
import kotlinx.android.synthetic.main.activity_list.*

class ListActivity : AppCompatActivity() {

    private val targetArray = arrayOf(
        TargetActivity(
            "1. Hello dagger!",
            Chapter1Activity::class.java
        ),
        TargetActivity(
            "2. Provides and Module",
            Chapter2Activity::class.java
        ),
        TargetActivity(
            "3. Qualifier",
            Chapter3Activity::class.java
        )
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)

        initRecyclerView()
    }

    private fun initRecyclerView() {
        rvList.apply {
            layoutManager =
                LinearLayoutManager(this@ListActivity, LinearLayoutManager.VERTICAL, false)
            addItemDecoration(
                DividerItemDecoration(
                    this@ListActivity,
                    DividerItemDecoration.VERTICAL
                )
            )
            adapter = Adapter(targetArray)
        }
    }
}

data class TargetActivity(
    val name: String,
    val targetClass: Class<*>
)