package org.kmutnb.testapp

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_test.*


class TestFragment : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Get the custom view for this fragment layout

        return inflater.inflate(R.layout.fragment_test, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        activity?.also {
            var arrayData: ArrayList<DataModel>? = null
            recyclerView?.layoutManager = LinearLayoutManager(it)


            arrayData = arrayListOf()
            arrayData.add(DataModel(shopName = "dataName1", address = "address1",profileModel = ProfileModel(name = "name1", src = "https://i.ytimg.com/vi/hwhHyxN0MSk/maxresdefault.jpg" )))
            arrayData.add(DataModel(shopName = "dataName2", address = "src2",profileModel = ProfileModel(name = "name2", src = "https://www.honestdocs.co/system/blog_articles/main_hero_images/000/001/755/large/iStock-512202044_L.jpg" )))
            arrayData.add(DataModel(shopName = "dataName3", address = "address3",profileModel = ProfileModel(name = "name3", src = "https://www.petcitiz.info/wp-content/uploads/2017/11/01-1.jpg" )))
            arrayData.add(DataModel(shopName = "dataName4", address = "address4",profileModel = ProfileModel(name = "name4", src = "https://lifestyle.campus-star.com/app/uploads/2018/08/cat-world.jpg" )))
            arrayData.add(DataModel(shopName = "dataName5", address = "address5",profileModel = ProfileModel(name = "name5", src = "src5" )))
            arrayData.add(DataModel(shopName = "dataName6", address = "address6",profileModel = ProfileModel(name = "name6", src = "src6" )))
            arrayData.add(DataModel(shopName = "dataName7", address = "address7",profileModel = ProfileModel(name = "name7", src = "src7" )))
            arrayData.add(DataModel(shopName = "dataName8", address = "address8",profileModel = ProfileModel(name = "name8", src = "src8" )))
            arrayData.add(DataModel(shopName = "dataName9", address = "address9",profileModel = ProfileModel(name = "name9", src = "src9" )))
            arrayData.add(DataModel(shopName = "dataName10", address = "address10",profileModel = ProfileModel(name = "name10", src = "src10" )))
            recyclerView.adapter = MyAdapter(arrayData, it)
        }
    }
}

//    override fun onPause() {
//        super.onPause()
//    }
//
//    override fun onAttach(context: Context?) {
//        super.onAttach(context)
//    }
//
//    override fun onDestroy() {
//        super.onDestroy()
//    }
//
//    override fun onDetach() {
//        super.onDetach()
//    }
//
//    override fun onStart() {
//        super.onStart()
//    }
//
//    override fun onStop() {
//        super.onStop()
//    }

