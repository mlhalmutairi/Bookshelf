package com.example.bookshelf.data

import com.example.bookshelf.R
import com.example.bookshelf.model.Book

class Datasource {


    fun loadBooks() : List<Book> {
        return listOf(
            Book(R.string.text1),
            Book(R.string.text2),
            Book(R.string.text3),
            Book(R.string.text4),
            Book(R.string.text4),
            Book(R.string.text5),
            Book(R.string.text6),
            Book(R.string.text7),
            Book(R.string.text8)

        )
    }
}