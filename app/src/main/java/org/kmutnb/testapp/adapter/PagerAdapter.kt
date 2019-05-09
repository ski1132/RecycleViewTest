package org.kmutnb.testapp.adapter

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import org.kmutnb.testapp.fragment.DetailCustomerFragment
import org.kmutnb.testapp.fragment.DetailShopFragment
import org.kmutnb.testapp.fragment.SettingFragment
import org.kmutnb.testapp.model.CommentModel
import org.kmutnb.testapp.model.DataModel

class PagerAdapter internal constructor(fm: FragmentManager, private val commentModel: CommentModel,private val dataModel: DataModel) : FragmentPagerAdapter(fm) {

    override fun getItem(position: Int): Fragment? {
        var fragment: Fragment? = null
        when (position) {
            0 ->{
                fragment = DetailCustomerFragment.newInstance(commentModel)

            }
            1 -> fragment = DetailShopFragment.newInstance(dataModel)
            2 -> fragment = SettingFragment()
        }
        return fragment
    }

    override fun getCount(): Int {
        return 3
    }

}