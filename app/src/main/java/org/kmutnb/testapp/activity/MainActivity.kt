package org.kmutnb.testapp.activity


import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import org.kmutnb.testapp.R
import org.kmutnb.testapp.fragment.ShopFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportFragmentManager.beginTransaction().replace(R.id.fragment, ShopFragment.newInstance()).commit()
    }
}









