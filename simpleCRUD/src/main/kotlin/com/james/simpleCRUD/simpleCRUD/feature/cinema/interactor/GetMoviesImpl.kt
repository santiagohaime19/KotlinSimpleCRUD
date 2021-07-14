package com.james.simpleCRUD.simpleCRUD.feature.cinema.interactor

import com.james.simpleCRUD.simpleCRUD.components.cinema.CinemaGateway
import com.james.simpleCRUD.simpleCRUD.components.cinema.data.CinemaEntity
import org.springframework.stereotype.Service

@Service
class GetMoviesImpl(
    private val cinemaGateway: CinemaGateway
): GetMovies {
    override fun execute(): List<CinemaEntity> {
        return cinemaGateway.getAllMovies()
    }

}