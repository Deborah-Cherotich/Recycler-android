package com.akirachix.recyclarview

import android.os.Bundle
import android.view.inputmethod.InputBinding
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.akirachix.recyclarview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var  binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
      binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val names = listOf("Anne","Bernice","Carol","Debz","Elizabeth",
            "Faith", "Gladys","Helen","Wise","Jaycob","Zeddie","Bonny",
            "Calto","Jose","Trevor","Debbie","Milly","Jamila","Brian",
            "Jacky","Jane","Njunge","Maggy","Hosea","Anita","Edward",
            "Faith", "Gladys","Helen","Wise","Jaycob","Zeddie","Bonny",
            "Calto","Jose","Trevor","Debbie","Milly","Jamila","Brian",
            "Jacky","Jane","Njunge","Maggy","Hosea","Anita","Edward")


binding.rvNames.layoutManager = LinearLayoutManager(this)
        val namesAdapter = NamesRecyclerViewAdapter(names)
        binding.rvNames.adapter = namesAdapter



    }
}