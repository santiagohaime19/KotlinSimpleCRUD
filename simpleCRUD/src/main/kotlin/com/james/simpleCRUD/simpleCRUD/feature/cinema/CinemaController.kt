package com.james.simpleCRUD.simpleCRUD.feature.cinema

import com.james.simpleCRUD.simpleCRUD.components.cinema.data.CinemaEntity
import com.james.simpleCRUD.simpleCRUD.feature.cinema.interactor.AddOneMovie
import com.james.simpleCRUD.simpleCRUD.feature.cinema.interactor.GetMovies
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("cinema")
class CinemaController(
    private val getMovies: GetMovies,
    private val addOneMovie: AddOneMovie
) {

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    fun getMovies(): List<CinemaEntity>{
        return getMovies.execute()
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun addOneMovie(@RequestBody cinemaEntity: CinemaEntity): CinemaEntity{
        return addOneMovie.execute(cinemaEntity)
    }
}