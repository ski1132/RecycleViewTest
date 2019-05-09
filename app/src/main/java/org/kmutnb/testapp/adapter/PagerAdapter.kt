package org.kmutnb.testapp.adapter

import android.os.Parcelable
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import org.kmutnb.testapp.fragment.DetailCustomerFragment
import org.kmutnb.testapp.fragment.DetailShopFragment
import org.kmutnb.testapp.fragment.SettingFragment

class PagerAdapter internal constructor(fm: FragmentManager) : FragmentPagerAdapter(fm) {

    override fun getItem(position: Int): Fragment? {
        var fragment: Fragment? = null
        when (position) {
            0 -> fragment = DetailCustomerFragment()
//            1 -> fragment = DetailShopFragment()
//            2 -> fragment = SettingFragment()
        }
        return fragment
    }

    override fun getCount(): Int {
        return 3
    }

}