package org.kmutnb.testapp

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.item_shop.view.*
import android.support.v7.widget.RecyclerView.ViewHolder as ViewHolder1

class DetailAdapter  (val items: ArrayList<DataModel>, private val context: Context, private val positionData:Int) : RecyclerView.Adapter<ViewHolder1>()
{
    override fun onCreateViewHolder(viewGroup: ViewGroup, p1: Int): ViewHolder1 {
        val view = LayoutInflater.from(context).inflate(R.layout.fragment_detail, viewGroup, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(view: ViewHolder1, position: Int) {
        val viewHolder = view as ViewHolder
        viewHolder.bind(position)
    }
    inner class ViewHolder(private val view: View) : ViewHolder1(view) {

        fun bind(position: Int) {
            val nameText = view.nameText
            val addressText = view.addressText
            val nameImg = view.imageText
            val showImg = view.showImg
            nameText.text = items[positionData].shopName
            addressText.text = items[positionData].address
            nameImg.text = items[positionData].profileModel.name
            Glide.with(context).load(items[positionData].profileModel.src).into(showImg)

        }

    }
}