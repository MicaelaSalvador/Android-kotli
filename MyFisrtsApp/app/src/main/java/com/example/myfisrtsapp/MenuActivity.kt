package com.example.myfisrtsapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.myfisrtsapp.firstapp.FisrtAppActivity
import com.example.myfisrtsapp.imccalculator.ImcCalculatorActivity
import com.example.myfisrtsapp.settings.SettingsActivity
import com.example.myfisrtsapp.superheroapp.SuperHeroListActivity
import com.example.myfisrtsapp.todoapp.TodoActivity

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val btnSaludApp = findViewById<Button>(R.id.btnSaludApp)
        val btnImccApp = findViewById<Button>(R.id.btnIMCApp)
        val btnTODO = findViewById<Button>(R.id.btnTODO)
        val btnSuperhero = findViewById<Button>(R.id.btnSuperhero)
        val btnSettings = findViewById<Button>(R.id.btnSettings)

        btnSaludApp.setOnClickListener { navigateToSaludAp() }
        btnImccApp.setOnClickListener { navigateToImcApp() }
        btnTODO.setOnClickListener { navigateToTodoApp() }
        btnSuperhero.setOnClickListener { navigateToSuperhero() }
        btnSettings.setOnClickListener { navigateToSettings() }
    }

    private fun navigateToSettings() {
      val intent = Intent(this,SettingsActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToTodoApp() {
        val intent = Intent(this, TodoActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToImcApp() {
        val intent = Intent(this, ImcCalculatorActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToSaludAp() {
        val intent = Intent(this, FisrtAppActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToSuperhero() {
        val intent = Intent(this, SuperHeroListActivity::class.java)
        startActivity(intent)
    }

}