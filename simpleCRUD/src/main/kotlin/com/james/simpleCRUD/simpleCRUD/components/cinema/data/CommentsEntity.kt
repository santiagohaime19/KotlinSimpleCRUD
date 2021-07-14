package com.james.simpleCRUD.simpleCRUD.components.cinema.data

import java.time.LocalDateTime
import java.util.*
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table


@Entity
@Table(name = "Cinema_Movies_Comments")
data class CommentsEntity(

    @Id
    val commentId: UUID = UUID.randomUUID(),

    @Column
    val name: String,

    @Column(unique = true)
    val email: String,

    @Column
    val comment: String,

    @Column
    val createdAt: LocalDateTime? = LocalDateTime.now()

)
