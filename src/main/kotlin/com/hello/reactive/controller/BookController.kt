package com.hello.reactive.controller

import com.hello.reactive.model.Book
import com.hello.reactive.service.BookService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import reactor.core.publisher.Mono

@RestController
@RequestMapping("/v1/api/books")
@CrossOrigin("http://localhost:3000")
class BookController {

    @Autowired
    private lateinit var service : BookService

    @PostMapping
    fun create(@RequestBody book : Book) = service.save(Mono.just(book))

    @PutMapping
    fun update(@RequestBody book : Book) = service.save(Mono.just(book))

    @GetMapping
    fun loadAll() = service.loadAll()

    @GetMapping("/{id}")
    fun load(@PathVariable id: String) = service.load(id)

    @DeleteMapping("/{id}")
    fun delete(@PathVariable id : String) = service.deleta(id)
}