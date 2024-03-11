package com.insert.bumawiki.domain.user

import jakarta.persistence.Entity
import jakarta.persistence.Id

/*
 //TODO 더미 엔티티 입니다
*/
@Entity
class User {
    @Id
    val id: Long = 0L

    val name: String = ""
}