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
    private lateinit var commentModel: CommentModel
    companion object {

        fun newInstance(commentModel: CommentModel): DetailCustomerFragment {

            val fragment = DetailCustomerFragment()
            fragment.commentModel = commentModel
            return fragment
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.e("in Create View = ",commentModel.src)


        return inflater.inflate(R.layout.fragment_detail_customer, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Glide.with(activity).load(commentModel.src).into(showImg)
        cus_id.text = commentModel.name
    }

}
