package com.hello.reactive.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.util.Date

@Document("books_kt")
data class Book (
        @Id var id: String?,
        var isbn: String,
        var name: String,
        var author: String,
        var releaseDate: Date =  Date(),
        var editorial: String
)