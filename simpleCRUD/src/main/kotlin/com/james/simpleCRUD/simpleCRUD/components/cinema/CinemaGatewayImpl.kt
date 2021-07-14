package com.james.simpleCRUD.simpleCRUD.components.cinema

import com.james.simpleCRUD.simpleCRUD.components.cinema.data.CinemaEntity
import com.james.simpleCRUD.simpleCRUD.components.cinema.data.CinemaEntityRepository
import com.james.simpleCRUD.simpleCRUD.components.cinema.data.CommentsEntity
import org.springframework.stereotype.Service
import java.util.*

@Service
class CinemaGatewayImpl(
    private val cinemaEntityRepository: CinemaEntityRepository
) :CinemaGateway {

    override fun getAllMovies(): List<CinemaEntity> {
        return cinemaEntityRepository.findAll()
    }

    override fun getOneMovie(id: UUID): Optional<CinemaEntity> {
        return cinemaEntityRepository.findById(id)
    }


    override fun addOneMovie(cinemaEntity: CinemaEntity): CinemaEntity {
        return cinemaEntityRepository.save(cinemaEntity)
    }

    override fun addCommentInMovie(commentId: UUID, commentsEntity: CommentsEntity): CommentsEntity {
        val movie:Optional<CinemaEntity> = getOneMovie(id)
        val comments = movie.map { it.comments }
        comments

    }
}