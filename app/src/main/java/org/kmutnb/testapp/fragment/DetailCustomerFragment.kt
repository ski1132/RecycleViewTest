package org.kmutnb.testapp.fragment

import android.os.Bundle
import android.os.Parcelable
import android.support.v4.app.Fragment
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.fragment_detail_customer.*
import org.kmutnb.testapp.R
import org.kmutnb.testapp.model.CommentModel

class DetailCustomerFragment : Fragment() {
    private lateinit var commentModel: Parcelable
    companion object {

        fun newInstance(commentModel: Parcelable): DetailCustomerFragment {

            val bundle = Bundle()
            bundle.putParcelable("KEY_comment_MODEL", commentModel)
            val fragment = DetailCustomerFragment()
            fragment.arguments = bundle
            Log.e("in New = ",fragment.arguments.toString())
            return fragment
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        if(arguments != null)
        {
            val commentModel = arguments?.getParcelable<CommentModel>("KEY_comment_MODEL")
            Log.d("Showwww", commentModel.toString())
            Glide.with(context).load(commentModel?.src).into(showImg)
            cus_id.text = commentModel?.name
        }


        return inflater.inflate(R.layout.fragment_detail_customer, container, false)
    }

}
