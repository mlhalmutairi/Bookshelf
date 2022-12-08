package com.example.bookshelf.data

import com.example.bookshelf.R
import com.example.bookshelf.model.Book

class Datasource {


    fun loadBooks() : List<Book> {
        return listOf(
            Book(R.string.text1,R.drawable.image1),
            Book(R.string.text2,R.drawable.image2),
            Book(R.string.text3,R.drawable.image3),
            Book(R.string.text4,R.drawable.image4),
            Book(R.string.text5,R.drawable.image5),
            Book(R.string.text6,R.drawable.image6),
            Book(R.string.text7,R.drawable.image7),
            Book(R.string.text8,R.drawable.image8)

        )
    }
}