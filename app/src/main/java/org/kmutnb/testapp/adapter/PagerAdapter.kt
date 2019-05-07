package org.kmutnb.testapp.adapter

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentStatePagerAdapter
import org.kmutnb.testapp.fragment.DetailCustomerFragment
import org.kmutnb.testapp.model.DataModel

class PagerAdapter(fragmentManager: FragmentManager) :
    FragmentStatePagerAdapter(fragmentManager) {

    // 2
    override fun getItem(position: Int): Fragment {
        return DetailCustomerFragment.newInstance(movies[position])
    }

    // 3
    override fun getCount(): Int {
        return movies.size
    }
}