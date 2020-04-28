package com.hello.reactive.dao

import com.hello.reactive.model.Book
import org.springframework.data.mongodb.repository.ReactiveMongoRepository
import org.springframework.stereotype.Repository

@Repository
interface BookRepository : ReactiveMongoRepository<Book, String> {
}