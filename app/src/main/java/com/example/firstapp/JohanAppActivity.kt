package com.example.firstapp

import android.os.Bundle
import android.widget.LinearLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.firstapp.adapter.SuperHeroAdapter
import com.example.firstapp.adapter.SuperHeroAdapter2

class JohanAppActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_johan_app)
        initRecyclerView()
        initRecyclerView2()

    }

    private fun initRecyclerView(){
        val recyclerView=findViewById<RecyclerView>(R.id.recyclerSuperHero)
        recyclerView.layoutManager=LinearLayoutManager(this, RecyclerView.HORIZONTAL,false)
        recyclerView.adapter=SuperHeroAdapter(SuperHeroProvider.superheroList)

    }
    private fun initRecyclerView2(){
        val recyclerView2=findViewById<RecyclerView>(R.id.recyclerSuperHero2)
        recyclerView2.layoutManager=LinearLayoutManager(this)
        recyclerView2.adapter= SuperHeroAdapter2(SuperHeroProvider.superheroList)

    }
}