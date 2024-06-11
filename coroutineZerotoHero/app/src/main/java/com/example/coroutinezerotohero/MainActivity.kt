package com.example.coroutinezerotohero

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.Deferred
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.awaitAll
import kotlinx.coroutines.launch
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    val retrofit = RetrofitHelper.getInstance()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        lifecycleScope.launch(Dispatchers.IO){
            val response: Response<SuperHeroResponse> = retrofit.getSuperHeroes("a")
            runOnUiThread {
                Toast.makeText(this@MainActivity,"FUNCIONA",Toast.LENGTH_SHORT).show()
            }
        }
    }
    
    fun waitForCoroutines(){
        lifecycleScope.launch (Dispatchers.IO){
//
//          val deferred1: Deferred<Response<SuperHeroResponse>> =   async { retrofit.getSuperHeroes("a")}
//          val deferred2: Deferred<Response<SuperHeroResponse>> =   async { retrofit.getSuperHeroes("b")}
//          val deferred3: Deferred<Response<SuperHeroResponse>> =   async { retrofit.getSuperHeroes("c")}
//          val deferred4: Deferred<Response<SuperHeroResponse>> =   async { retrofit.getSuperHeroes("d")}
//
//            val response: Response<SuperHeroResponse> = deferred1.await()
//            val response2: Response<SuperHeroResponse> = deferred2.await()
//            val response3: Response<SuperHeroResponse> = deferred3.await()
//            val response4: Response<SuperHeroResponse> = deferred4.await()

            val deferreds = listOf(
                async { retrofit.getSuperHeroes("a")},
                async { retrofit.getSuperHeroes("a")},
                async { retrofit.getSuperHeroes("a")},
                async { retrofit.getSuperHeroes("a")},
                async { retrofit.getSuperHeroes("a")},
                async { retrofit.getSuperHeroes("a")},
                async { retrofit.getSuperHeroes("a")}
            )
            val response = deferreds.awaitAll()
        }
    }
}