package org.kmutnb.testapp.activity

import android.os.Bundle
import android.support.v4.view.ViewPager
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_customer.*
import org.kmutnb.testapp.R
import org.kmutnb.testapp.adapter.PagerAdapter
import org.kmutnb.testapp.fragment.DetailCustomerFragment
import org.kmutnb.testapp.fragment.DetailShopFragment
import org.kmutnb.testapp.fragment.SettingFragment


class CustomerActivity : AppCompatActivity() {
    val TAG1 = "CUSTOMER"
    val TAG2 = "DETAILSHOP"
    val TAG3 = "LOGOUT"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(org.kmutnb.testapp.R.layout.activity_customer)


        viewPagerUI.adapter =  PagerAdapter(supportFragmentManager)

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

