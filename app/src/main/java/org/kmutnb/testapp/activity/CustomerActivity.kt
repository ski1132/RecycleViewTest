package org.kmutnb.testapp.activity

import android.os.Bundle
import android.os.Parcelable
import android.support.v7.app.AppCompatActivity
import android.util.Log
import kotlinx.android.synthetic.main.activity_customer.*
import org.kmutnb.testapp.R
import org.kmutnb.testapp.adapter.PagerAdapter
import org.kmutnb.testapp.fragment.DetailCustomerFragment
import org.kmutnb.testapp.fragment.DetailShopFragment


class CustomerActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(org.kmutnb.testapp.R.layout.activity_customer)




        val dataModel = intent.getParcelableExtra<Parcelable>("KEY_DATA_MODEL")
        Log.e("data Model ==== ",dataModel.toString())
        val commentModel = intent.getParcelableExtra<Parcelable>("KEY_DATA_COMMENT")
        Log.e("comment Model ==== ",commentModel.toString())
        viewPagerUI.adapter =  PagerAdapter(supportFragmentManager )



//        btView.setOnNavigationItemSelectedListener {
//            val adapter = PagerAdapter(supportFragmentManager)
//            viewPagerUI.adapter = adapter
//            when (it.itemId) {
//                R.id.ng_person -> {
//                    supportFragmentManager.beginTransaction()
//                        .replace(R.id.fragment_container, DetailCustomerFragment())
//                        .commit()
//                    true
//                }
//                R.id.ng_detail -> {
//                    supportFragmentManager.beginTransaction()
//                        .replace(R.id.fragment_container, DetailShopFragment())
//                        .commit()
//                    true
//                }
//                R.id.ng_logout -> {
//                    supportFragmentManager.beginTransaction()
//                        .replace(R.id.fragment_container, SettingFragment())
//                        .commit()
//                    true
//                }
//                else -> false
//            }
//        }
    }

}

