package com.insert.bumawiki.domain.docs.repo

import com.insert.bumawiki.domain.docs.domain.Docs
import org.springframework.data.jpa.repository.JpaRepository

interface DocsRepo: JpaRepository<Docs, Long> {
}