package org.kmutnb.testapp


import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        recyclerView?.layoutManager = LinearLayoutManager(this)
        val arrayProfile : ArrayList<ProfileModel> = arrayListOf()
//        ProfileModel()

        arrayProfile.add(ProfileModel(name="Name1", address = "address1"))
        arrayProfile.add(ProfileModel(name="Name2", address = "address1"))
        arrayProfile.add(ProfileModel(name="Name3", address = "address1"))
        arrayProfile.add(ProfileModel(name="Name4", address = "address1"))
        arrayProfile.add(ProfileModel(name="Name5", address = "address1"))
        arrayProfile.add(ProfileModel(name="Name6", address = "address1"))
        arrayProfile.add(ProfileModel(name="Name7", address = "address1"))
        arrayProfile.add(ProfileModel(name="Name8", address = "address1"))
        arrayProfile.add(ProfileModel(name="Name9", address = "address1"))
        arrayProfile.add(ProfileModel(name="Name10", address = "address1"))


//        val myAdapter = MyAdapter(foods,this)
//        recyclerView?.adapter = myAdapter


}













