package org.kmutnb.testapp


import android.os.Bundle
import android.support.v7.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    var arrayData: ArrayList<DataModel>? = null
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val testFragment = TestFragment()
        getSupportFragmentManager().beginTransaction().add(R.id.fragment, testFragment).commit()


    }

    override fun onStart() {
        super.onStart()
    }


    override fun onPause() {
        super.onPause()
    }

    override fun onStop() {
        super.onStop()
    }

    override fun onDestroy() {
        super.onDestroy()
    }

    override fun onRestart() {
        super.onRestart()
    }
}













