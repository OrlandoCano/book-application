package com.hello.reactive.service

import com.hello.reactive.dao.BookRepository
import com.hello.reactive.model.Book
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

interface BookService{
    fun save(book: Mono<Book>) : Mono<Book>
    fun loadAll() : Flux<Book>
    fun load (id : String) : Mono<Book>
    fun deleta (id : String) : Mono<Void>
}


@Service
class BookServiceImpl : BookService{

    @Autowired

    lateinit var repository: BookRepository

    override fun save(book: Mono<Book>): Mono<Book> {
        return book.flatMap {b -> repository.save(b)}
    }

    override fun loadAll(): Flux<Book> {
        return repository.findAll()
    }

    override fun load(id: String): Mono<Book> {
        return repository.findById(id)
    }

    override fun deleta(id: String): Mono<Void> {
        return repository.deleteById(id)
    }

}