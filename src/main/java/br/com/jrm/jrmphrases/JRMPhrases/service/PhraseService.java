package br.com.jrm.jrmphrases.JRMPhrases.service;

import br.com.jrm.jrmphrases.JRMPhrases.dto.PhraseDTO;
import br.com.jrm.jrmphrases.JRMPhrases.models.Phrase;
import br.com.jrm.jrmphrases.JRMPhrases.repository.PhraseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PhraseService {
    @Autowired
    private PhraseRepository repository;

    public PhraseDTO getRandomPhraseS(){
        Phrase phrase = repository.findRandomPhrase();
        return new PhraseDTO(phrase.getTitle(), phrase.getPhrase(), phrase.getCaracter(), phrase.getPoster());
    }
}
