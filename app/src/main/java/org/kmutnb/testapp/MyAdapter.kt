package org.kmutnb.testapp

import android.content.ContentValues.TAG
import android.content.Context
import android.support.v7.widget.RecyclerView
import android.support.v7.widget.RecyclerView.ViewHolder
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.item_profile.view.*

class MyAdapter(val items: ArrayList<DataModel>, private val context: Context) : RecyclerView.Adapter<ViewHolder>() {
    override fun onBindViewHolder(view: RecyclerView.ViewHolder, position: Int) {
        val viewHolder = view as ViewHolder
        viewHolder.bind(position)

    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, position: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_profile, viewGroup, false)
        return ViewHolder(view)
    }

    inner class ViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        var onClick = View.OnClickListener(){view ->
            Log.d(TAG,"clicked")
        }
        fun bind(position: Int) {
            val nameText = view.nameText
            val addressText = view.addressText
            val nameImg = view.imageText
            val showImg = view.showImg
            nameText.text = items[position].shopName
            addressText.text = items[position].address
            nameImg.text = items[position].profileModel.name
            Glide.with(context).load(items[position].profileModel.src).into(showImg)
        }
    }
}
