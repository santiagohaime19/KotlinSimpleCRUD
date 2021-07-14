package com.james.simpleCRUD.simpleCRUD.feature.cinema.interactor

import com.james.simpleCRUD.simpleCRUD.components.cinema.data.CinemaEntity

interface GetMovies {
    fun execute(): List<CinemaEntity>
}