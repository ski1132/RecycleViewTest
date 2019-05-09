package org.kmutnb.testapp.fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import kotlinx.android.synthetic.main.fragment_shop.*
import org.kmutnb.testapp.adapter.MyAdapter
import org.kmutnb.testapp.interfaces.OnClickItem
import org.kmutnb.testapp.R
import org.kmutnb.testapp.model.DataModel
import org.kmutnb.testapp.model.ProfileModel


class ShopFragment : Fragment(), OnClickItem {

    companion object {
        fun newInstance(): ShopFragment {
            val fragment = ShopFragment()
            return fragment
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Get the custom view for this fragment layout

        return inflater.inflate(R.layout.fragment_shop, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        activity?.also {
            var arrayData: ArrayList<DataModel>? = null

            recyclerView?.layoutManager = LinearLayoutManager(it)

            arrayData = arrayListOf()
            arrayData.add(
                DataModel(
                    shopName = "dataName1",
                    address = "address1",
                    profileModel = ProfileModel(
                        name = "name1",
                        src = "https://th-live-01.slatic.net/original/df885ae3300c28af1debb7e1321737d7.jpg"
                    )
                )
            )
            arrayData.add(
                DataModel(
                    shopName = "dataName2",
                    address = "src2",
                    profileModel = ProfileModel(
                        name = "name2",
                        src = "https://www.cataccessories.biz/wp-content/uploads/2017/08/2-1245-50656551-a26936ecd8ba4ccf26d10d44bbe043d4-zoom.jpg"
                    )
                )
            )
            arrayData.add(
                DataModel(
                    shopName = "dataName3",
                    address = "address3",
                    profileModel = ProfileModel(
                        name = "name3",
                        src = "https://www.cataccessories.biz/wp-content/uploads/2017/07/Rolling-Scratch0.jpg"
                    )
                )
            )
            arrayData.add(
                DataModel(
                    shopName = "dataName4",
                    address = "address4",
                    profileModel = ProfileModel(
                        name = "name4",
                        src = "https://odditymall.com/includes/content/upload/whack-a-mouse-cat-toy-4460.jpg"
                    )
                )
            )
            arrayData.add(
                DataModel(
                    shopName = "dataName5",
                    address = "address5",
                    profileModel = ProfileModel(
                        name = "name5",
                        src = "https://ae01.alicdn.com/kf/HTB1VX87SpXXXXc4XXXXq6xXFXXXi/-.jpg_640x640.jpg"
                    )
                )
            )
            arrayData.add(
                DataModel(
                    shopName = "dataName6",
                    address = "address6",
                    profileModel = ProfileModel(
                        name = "name6",
                        src = "https://3.3qdc.com/p-dit/2015/03/09/p-dit_cat-13_0.out.jpg"
                    )
                )
            )
            recyclerView.adapter = MyAdapter(arrayData, it, this)
        }
    }

    override fun onClickItem(view: View, dataModel: DataModel) {
        Toast.makeText(context, "show DataName ${dataModel.shopName}", Toast.LENGTH_SHORT).show()
        activity?.also {
            it.supportFragmentManager.beginTransaction().replace(R.id.fragment, DetailFragment.newInstance(dataModel))
                .addToBackStack(null).commit()
        }
    }
}


