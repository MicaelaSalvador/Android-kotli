package com.example.examplefragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.os.bundleOf
import androidx.fragment.app.add
import androidx.fragment.app.commit
import com.example.examplefragments.FirstFragment.Companion.ADDRESS_BUNDLE
import com.example.examplefragments.FirstFragment.Companion.NAME_BUNDLE


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if(savedInstanceState == null){
            val bundle = bundleOf(
                NAME_BUNDLE to "Aristidev",
                ADDRESS_BUNDLE to "Mi casa"
            )

            supportFragmentManager.commit {
                setReorderingAllowed(true)
                add<FirstFragment>(R.id.fragmentContainer, args = bundle)
            }

        }
    }
}