package com.example.bookshelf.adpter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.bookshelf.R
import com.example.bookshelf.model.Book

class BookAdapter(private val context: Context,
                  private val dataset : List<Book>)
    : RecyclerView.Adapter<BookAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_book, parent, false)
        return ViewHolder(itemLayout)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = dataset[position]
        holder.bookTitle.text = context.resources.getString(item.bookTitle)
        holder.bookImage.setImageResource(item.bookImage)
    }

    override fun getItemCount() = dataset.size


    class ViewHolder(view : View) : RecyclerView.ViewHolder(view){

        val bookTitle : TextView = view.findViewById(R.id.item_book_title)
        val bookImage : ImageView = view.findViewById(R.id.item_book_img)

    }

}