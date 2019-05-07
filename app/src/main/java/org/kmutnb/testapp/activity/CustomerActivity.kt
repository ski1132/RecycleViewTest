package org.kmutnb.testapp.activity

import android.os.Bundle
import android.support.v4.view.ViewPager
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.fragment_detail_customer.view.*
import org.kmutnb.testapp.R

private lateinit var viewPager: ViewPager
class CustomerActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_customer)

        viewPager.viewPagerUI


    }
}
