package org.kmutnb.testapp.activity

import android.os.Bundle
import android.support.v4.view.ViewPager
import android.support.v7.app.AppCompatActivity
import org.kmutnb.testapp.R
import org.kmutnb.testapp.adapter.PagerAdapter

class CustomerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_customer)

        val viewPager = findViewById<ViewPager>(R.id.viewPagerUI)
        if (viewPager != null) {
            val adapter = PagerAdapter(supportFragmentManager)
            viewPager.adapter = adapter
        }
    }
}
