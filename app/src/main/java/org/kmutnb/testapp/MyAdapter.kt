package org.kmutnb.testapp

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.support.v7.widget.RecyclerView.ViewHolder
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import org.kmutnb.testapp.R.layout.*

class MyAdapter(val items: Array<String>,  val context: Context) : RecyclerView.Adapter<ViewHolder>()
{
    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(p0: ViewHolder, p1: Int) {
        //p0?.getNameTxt?.text = items.get(p1)
    }

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(this.context).inflate(model, p0, false))
    }

}