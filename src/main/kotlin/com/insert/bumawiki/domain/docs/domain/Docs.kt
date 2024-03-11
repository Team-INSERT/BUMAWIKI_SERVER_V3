package com.insert.bumawiki.domain.docs.domain

import com.insert.bumawiki.domain.basetime.BaseTime
import jakarta.persistence.*

@Entity
@Table(name = "docs", indexes = [Index(name = "idx_title", columnList = "title", unique = true)])
class Docs(
    title: String
): BaseTime() {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id:Long = 0L

    @Column(nullable = false, unique = true)
    var title:String = title
        private set

    val enroll = this.createdAt?.year ?: Int.MAX_VALUE

    val nowVersion: Long = 1L

}