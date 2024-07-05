package br.com.jrm.jrmphrases.JRMPhrases.repository;

import br.com.jrm.jrmphrases.JRMPhrases.models.Phrase;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;

public interface PhraseRepository extends JpaRepository<Phrase, Long> {
    @Query("SELECT f FROM Phrase f order by function('RANDOM') LIMIT 1")
    Phrase findRandomPhrase();
}