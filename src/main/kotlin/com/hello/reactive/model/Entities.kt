package com.hello.reactive.model

import org.springframework.data.annotation.Id
import java.util.Date


data class Book (
        @Id var id: String?,
        var isbn: String,
        var name: String,
        var author: String,
        var releaseDate: Date =  Date(),
        var editorial: String
)