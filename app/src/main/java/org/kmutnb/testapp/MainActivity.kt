package org.kmutnb.testapp


import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction().replace(R.id.fragment, ShopFragment()).commit()
        //supportFragmentManager.beginTransaction().replace(R.id.detailFragment, DetailFragment()).commit()

    }

}













