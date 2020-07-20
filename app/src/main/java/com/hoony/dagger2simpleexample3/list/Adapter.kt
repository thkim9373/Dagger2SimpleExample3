package com.hoony.dagger2simpleexample3.list

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.hoony.dagger2simpleexample3.R
import kotlinx.android.synthetic.main.item_chapter_list.view.*

class Adapter(private val targetArray: Array<TargetActivity>) : RecyclerView.Adapter<ItemHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemHolder =
        ItemHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_chapter_list,
                parent,
                false
            )
        )


    override fun getItemCount(): Int = targetArray.size

    override fun onBindViewHolder(holder: ItemHolder, position: Int) {
        holder.setText(targetArray[position].name)
        holder.setOnClickListener(targetArray[position].targetClass)
    }
}

class ItemHolder(private val view: View) : RecyclerView.ViewHolder(view) {
    fun setText(text: String) {
        view.tvItem.text = text
    }

    fun setOnClickListener(targetActivity: Class<*>) {
        view.tvItem.setOnClickListener {
            if (adapterPosition != RecyclerView.NO_POSITION) {
                view.context.startActivity(
                    Intent(
                        view.context,
                        targetActivity
                    )
                )
            }
        }
    }
}