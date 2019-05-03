package org.kmutnb.testapp


import android.os.Bundle
import android.support.v7.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val testFragment = ShopFragment()
        supportFragmentManager.beginTransaction().add(R.id.fragment, testFragment).commit()


    }

}













