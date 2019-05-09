package org.kmutnb.testapp.fragment

import android.os.Bundle
import android.os.Parcelable
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import org.kmutnb.testapp.R

class DetailShopFragment : Fragment() {
    companion object {

        fun newInstance(dataModel: Parcelable): DetailShopFragment {
            val bundle = Bundle()
            bundle.putParcelable("KEY_DATA_MODEL", dataModel)
            val fragment = DetailShopFragment()
            fragment.arguments = bundle
            return fragment
        }
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_detail_shop, container, false)
    }

}
