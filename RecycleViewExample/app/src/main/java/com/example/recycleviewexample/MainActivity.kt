package com.example.recycleviewexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recycleviewexample.adapter.SuperHeroAdapter
import com.example.recycleviewexample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initRecyclerView()
    }

    private fun initRecyclerView() {
        val manager= LinearLayoutManager(this)
        binding.recyclerSuperhero.layoutManager = manager
        binding.recyclerSuperhero.adapter = SuperHeroAdapter(SuperHeroProvider.superHeroList)
            { superhero -> onItemSelected(superhero) }
    }

    private fun onItemSelected(superHero: SuperHero) {
        Toast.makeText(this,superHero.superhero,Toast.LENGTH_SHORT).show()
    }
}