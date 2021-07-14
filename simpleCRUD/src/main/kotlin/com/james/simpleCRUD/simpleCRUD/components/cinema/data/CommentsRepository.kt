package com.james.simpleCRUD.simpleCRUD.components.cinema.data

import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

interface CommentsRepository: JpaRepository<CommentsEntity, UUID> {
}