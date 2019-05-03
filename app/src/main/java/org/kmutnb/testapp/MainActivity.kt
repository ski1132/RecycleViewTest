package org.kmutnb.testapp


import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var arrayData: ArrayList<DataModel>? = null
    var profileModel: ProfileModel? = null
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
        profileModel?.also {
            Log.d("Test", it.name)
        }
        arrayData = arrayListOf()
        arrayData?.add(DataModel(shopName = "shopName1", address = "address1"))
        arrayData?.add(DataModel(shopName = "shopName2", address = "address1"))
        arrayData?.add(DataModel(shopName = "shopName3", address = "address1"))
        arrayData?.add(DataModel(shopName = "shopName4", address = "address1"))
        arrayData?.add(DataModel(shopName = "shopName5", address = "address1"))
        arrayData?.add(DataModel(shopName = "shopName6", address = "address1"))
        arrayData?.add(DataModel(shopName = "shopName7", address = "address1"))
        arrayData?.add(DataModel(shopName = "shopName8", address = "address1"))
        arrayData?.add(DataModel(shopName = "shopName9", address = "address1"))
        arrayData?.add(DataModel(shopName = "shopName10", address = "address1"))
        arrayData?.also {  recyclerView.adapter = MyAdapter(it, this) }

    }
}













