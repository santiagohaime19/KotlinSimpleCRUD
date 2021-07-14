package com.james.simpleCRUD.simpleCRUD.feature.cinema.interactor

import com.james.simpleCRUD.simpleCRUD.components.cinema.CinemaGateway
import com.james.simpleCRUD.simpleCRUD.components.cinema.data.CinemaEntity
import org.springframework.stereotype.Service

@Service
class AddOneMovieImpl(
    private val cinemaGateway: CinemaGateway
):AddOneMovie {
    override fun execute(cinemaEntity: CinemaEntity): CinemaEntity {
        return cinemaGateway.addOneMovie(cinemaEntity)
    }
}