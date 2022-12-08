package com.example.bookshelf

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.bookshelf.adpter.BookAdapter
import com.example.bookshelf.data.Datasource

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)




        val datset = Datasource().loadBooks()
        val recyclerView = findViewById<RecyclerView>(R.id.rv_book)
        val adapter = BookAdapter(this, datset)
        recyclerView.adapter = adapter
        val layoutManager = GridLayoutManager(this, 2)
        recyclerView.layoutManager = layoutManager
        recyclerView.setHasFixedSize(true)

    }
}