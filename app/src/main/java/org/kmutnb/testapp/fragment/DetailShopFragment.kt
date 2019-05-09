package org.kmutnb.testapp.fragment

import android.os.Bundle
import android.os.Parcelable
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.fragment_detail_shop.*
import org.kmutnb.testapp.R
import org.kmutnb.testapp.model.CommentModel
import org.kmutnb.testapp.model.DataModel

class DetailShopFragment : Fragment() {
    private lateinit var dataModel: DataModel

    companion object {

        fun newInstance(dataModel: DataModel): DetailShopFragment {
            val fragment = DetailShopFragment()
            fragment.dataModel = dataModel
            return fragment
        }
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_detail_shop, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Glide.with(activity).load(dataModel.profileModel.src).into(showImg)
        data_id.text = dataModel.shopName
    }

}
