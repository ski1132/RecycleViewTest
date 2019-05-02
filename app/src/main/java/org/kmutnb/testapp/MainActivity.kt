package org.kmutnb.testapp


import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        recyclerView?.layoutManager = LinearLayoutManager(this)
        val arrayProfile: ArrayList<ProfileModel> = arrayListOf()
        arrayProfile.add(ProfileModel(name = "Name1", address = "address1"))
        arrayProfile.add(ProfileModel(name = "Name2", address = "address1"))
        arrayProfile.add(ProfileModel(name = "Name3", address = "address1"))
        arrayProfile.add(ProfileModel(name = "Name4", address = "address1"))
        arrayProfile.add(ProfileModel(name = "Name5", address = "address1"))
        arrayProfile.add(ProfileModel(name = "Name6", address = "address1"))
        arrayProfile.add(ProfileModel(name = "Name7", address = "address1"))
        arrayProfile.add(ProfileModel(name = "Name8", address = "address1"))
        arrayProfile.add(ProfileModel(name = "Name9", address = "address1"))
        arrayProfile.add(ProfileModel(name = "Name10", address = "address1"))
        //recyclerView.adapter = MyAdapter(arrayProfile, this)

        val arrayData: ArrayList<DataModel> = arrayListOf()
        arrayData.add(DataModel(ShopName = "ShopName1", address = "address1"))
        arrayData.add(DataModel(ShopName = "ShopName2", address = "address1"))
        arrayData.add(DataModel(ShopName = "ShopName3", address = "address1"))
        arrayData.add(DataModel(ShopName = "ShopName4", address = "address1"))
        arrayData.add(DataModel(ShopName = "ShopName5", address = "address1"))
        arrayData.add(DataModel(ShopName = "ShopName6", address = "address1"))
        arrayData.add(DataModel(ShopName = "ShopName7", address = "address1"))
        arrayData.add(DataModel(ShopName = "ShopName8", address = "address1"))
        arrayData.add(DataModel(ShopName = "ShopName9", address = "address1"))
        arrayData.add(DataModel(ShopName = "ShopName10", address = "address1"))
        recyclerView.adapter = MyAdapter(arrayData, this)
//        val myAdapter = MyAdapter(foods,this)
//        recyclerView?.adapter = myAdapter

    }
}













