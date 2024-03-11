package com.insert.bumawiki.domain.docs.domain.version_docs

import com.insert.bumawiki.domain.basetime.BaseTime
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.IdClass
import jakarta.persistence.ManyToOne
import jakarta.validation.constraints.NotNull
import java.io.Serializable

@Entity
@IdClass(VersionDocsPk::class)
class VersionDocs(
    docsId: Long,
    version: Long,
    contents: String,
    authorId: Long
): BaseTime() {
    @Id
    val docsId: Long = docsId

    @Id
    val version: Long = version

    @Column(columnDefinition = "TEXT")
    @NotNull
    val contents: String = contents

    val authorId: Long = authorId
}

data class VersionDocsPk(
    val docsId: Long,
    val version: Long
): Serializable