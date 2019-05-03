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
            arrayData.add(DataModel(shopName = "shopName1", address = "address1"))
            arrayData.add(DataModel(shopName = "shopName2", address = "address1"))
            arrayData.add(DataModel(shopName = "shopName3", address = "address1"))
            arrayData.add(DataModel(shopName = "shopName4", address = "address1"))
            arrayData.add(DataModel(shopName = "shopName5", address = "address1"))
            arrayData.add(DataModel(shopName = "shopName6", address = "address1"))
            arrayData.add(DataModel(shopName = "shopName7", address = "address1"))
            arrayData.add(DataModel(shopName = "shopName8", address = "address1"))
            arrayData.add(DataModel(shopName = "shopName9", address = "address1"))
            arrayData.add(DataModel(shopName = "shopName10", address = "address1"))
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

