package org.kmutnb.testapp

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.support.v7.widget.RecyclerView.ViewHolder
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import kotlinx.android.synthetic.main.item_profile.view.*

class MyAdapter(val items: ArrayList<DataModel>, val context: Context) : RecyclerView.Adapter<ViewHolder>()
{
    override fun onBindViewHolder(p0: RecyclerView.ViewHolder, p1: Int) {
        val viewHolder = p0 as ViewHolder
        viewHolder.bind(p1)
    }

    override fun getItemCount(): Int {
        return items.size
    }
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): RecyclerView.ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.item_profile, p0, false))
    }

     inner class ViewHolder (val view: View) : RecyclerView.ViewHolder(view) {
       fun bind(position:Int){
           val nameText = view.nameText
           val addressText = view.addressText

           nameText.text = items[position].ShopName
           addressText.text = items[position].address

       }
    }
}
