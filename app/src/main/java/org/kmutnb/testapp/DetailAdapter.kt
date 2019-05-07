package org.kmutnb.testapp

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.item_comment.view.*
import kotlinx.android.synthetic.main.item_shop.view.*
import android.support.v7.widget.RecyclerView.ViewHolder as ViewHolder1

class DetailAdapter  (val items: ArrayList<CommentModel>, private val context: Context) : RecyclerView.Adapter<ViewHolder1>()
{
    override fun onCreateViewHolder(viewGroup: ViewGroup, p1: Int): ViewHolder1 {
        val view = LayoutInflater.from(context).inflate(R.layout.item_comment, viewGroup, false)
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
            val commentText = view.commentText
            val userImg = view.userImg
            val rating = view.ratingBar
            rating.numStars = items[position].rating;
            commentText.text = items[position].comment
            Glide.with(context).load(items[position].src).into(userImg)

        }

    }
}