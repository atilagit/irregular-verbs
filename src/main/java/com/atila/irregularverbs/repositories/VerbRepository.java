package com.atila.irregularverbs.repositories;

import com.atila.irregularverbs.entities.Verb;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VerbRepository extends JpaRepository<Verb, Long> {
}
