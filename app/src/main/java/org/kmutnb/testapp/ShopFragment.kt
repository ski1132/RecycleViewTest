package org.kmutnb.testapp

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import kotlinx.android.synthetic.main.fragment_shop.*


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
                        src = "https://i.ytimg.com/vi/hwhHyxN0MSk/maxresdefault.jpg"
                    )
                )
            )
            arrayData.add(
                DataModel(
                    shopName = "dataName2",
                    address = "src2",
                    profileModel = ProfileModel(
                        name = "name2",
                        src = "https://www.honestdocs.co/system/blog_articles/main_hero_images/000/001/755/large/iStock-512202044_L.jpg"
                    )
                )
            )
            arrayData.add(
                DataModel(
                    shopName = "dataName3",
                    address = "address3",
                    profileModel = ProfileModel(
                        name = "name3",
                        src = "https://www.petcitiz.info/wp-content/uploads/2017/11/01-1.jpg"
                    )
                )
            )
            arrayData.add(
                DataModel(
                    shopName = "dataName4",
                    address = "address4",
                    profileModel = ProfileModel(
                        name = "name4",
                        src = "https://lifestyle.campus-star.com/app/uploads/2018/08/cat-world.jpg"
                    )
                )
            )
            arrayData.add(
                DataModel(
                    shopName = "dataName5",
                    address = "address5",
                    profileModel = ProfileModel(
                        name = "name5",
                        src = "https://f.ptcdn.info/323/013/000/1387033442-695968img1-o.jpg"
                    )
                )
            )
            arrayData.add(
                DataModel(
                    shopName = "dataName6",
                    address = "address6",
                    profileModel = ProfileModel(
                        name = "name6",
                        src = "http://www.yespetshop.com/private_folder/kitten-1.jpg"
                    )
                )
            )
            arrayData.add(
                DataModel(
                    shopName = "dataName7",
                    address = "address7",
                    profileModel = ProfileModel(
                        name = "name7",
                        src = "http://www.thaiticketmajor.com/bus/imgUpload/newsLarge5756_750.jpg"
                    )
                )
            )
            arrayData.add(
                DataModel(
                    shopName = "dataName8",
                    address = "address8",
                    profileModel = ProfileModel(
                        name = "name8",
                        src = "https://dog-vs-cat.com/wp-content/uploads/2018/01/130476_0_620.jpg"
                    )
                )
            )
            arrayData.add(
                DataModel(
                    shopName = "dataName9",
                    address = "address9",
                    profileModel = ProfileModel(
                        name = "name9",
                        src = "https://thematter.co/wp-content/uploads/2016/07/maxresdefault-2.jpg"
                    )
                )
            )
            arrayData.add(
                DataModel(
                    shopName = "dataName10",
                    address = "address10",
                    profileModel = ProfileModel(
                        name = "name10",
                        src = "https://www.girlsallaround.com/wp-content/uploads/2014/08/107371.jpg"
                    )
                )
            )
            recyclerView.adapter = MyAdapter(arrayData, it, this)
        }
    }

    override fun onClickItem(view: View, dataModel: DataModel) {
        Toast.makeText(context, "show DataName ${dataModel.shopName}", Toast.LENGTH_SHORT).show()
        activity?.also {
            it.supportFragmentManager.beginTransaction().replace(R.id.fragment, DetailFragment.newInstance(dataModel)).commit()
        }
    }
}


