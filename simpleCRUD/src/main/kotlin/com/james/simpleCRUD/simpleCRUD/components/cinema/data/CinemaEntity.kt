package com.james.simpleCRUD.simpleCRUD.components.cinema.data

import java.util.*
import javax.persistence.*

@Entity
@Table(name= "Cinema_Movies")
data class CinemaEntity(
    @Id
    val id: UUID = UUID.randomUUID(),

    @Column(nullable = true, unique = true)
    val movieName: String?,

    @Column(nullable = true)
    val excerpt: String?,

    @Column
    val rating: Int,

    @Column
    @ElementCollection(targetClass = CommentsEntity::class)
    val comments: List<CommentsEntity>?,

)


