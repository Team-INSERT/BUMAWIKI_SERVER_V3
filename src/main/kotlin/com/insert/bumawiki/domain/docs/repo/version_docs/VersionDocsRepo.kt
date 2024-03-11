package com.insert.bumawiki.domain.docs.repo.version_docs

import com.insert.bumawiki.domain.docs.domain.version_docs.VersionDocs
import com.insert.bumawiki.domain.docs.domain.version_docs.VersionDocsPk
import org.springframework.data.jpa.repository.JpaRepository

interface VersionDocsRepo: JpaRepository<VersionDocs, VersionDocsPk> {
}