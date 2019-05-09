package org.kmutnb.testapp.activity

import android.os.Bundle
import android.support.v4.view.ViewPager
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.MenuItem
import kotlinx.android.synthetic.main.activity_customer.*
import org.kmutnb.testapp.R
import org.kmutnb.testapp.adapter.PagerAdapter
import org.kmutnb.testapp.model.CommentModel
import org.kmutnb.testapp.model.DataModel


class CustomerActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(org.kmutnb.testapp.R.layout.activity_customer)

        val dataModel = intent.getParcelableExtra<DataModel>("KEY_DATA_MODEL")
        Log.e("data Model ==== ",dataModel.toString())
        val commentModel = intent.getParcelableExtra<CommentModel>("KEY_DATA_COMMENT")
        Log.e("comment Model ==== ",commentModel.toString())


        btView.setOnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.ng_person -> {
                    viewPagerUI.currentItem = 0
                    true
                }
                R.id.ng_detail -> {
                    viewPagerUI.currentItem = 1
                    true
                }
                R.id.ng_logout -> {
                    viewPagerUI.currentItem = 2
                    true
                }
                else -> false
            }
        }

        viewPagerUI.addOnPageChangeListener(object :  ViewPager.OnPageChangeListener{
            override fun onPageScrollStateChanged(p0: Int) {
            }

            override fun onPageScrolled(p0: Int, p1: Float, p2: Int) {
            }

            override fun onPageSelected(position: Int) {
                Log.e(" ------ position ----",position.toString())
                when(position) {
                    0 ->
                        btView.selectedItemId = R.id.ng_person
                    1 ->
                        btView.selectedItemId = R.id.ng_detail
                    2 ->
                        btView.selectedItemId = R.id.ng_logout
                }
            }

        })

        val adapter = PagerAdapter(supportFragmentManager,commentModel ,dataModel)
        viewPagerUI.adapter = adapter    }

}

