package com.james.simpleCRUD.simpleCRUD.components.cinema

import com.james.simpleCRUD.simpleCRUD.components.cinema.data.CinemaEntity
import com.james.simpleCRUD.simpleCRUD.components.cinema.data.CommentsEntity
import java.util.*

interface CinemaGateway {

    fun getAllMovies(): List<CinemaEntity>

    fun getOneMovie(id: UUID): Optional<CinemaEntity>

    fun addOneMovie(cinemaEntity: CinemaEntity): CinemaEntity

    fun addCommentInMovie(id: UUID, commentsEntity: CommentsEntity): CommentsEntity
}