package br.com.jrm.jrmphrases.JRMPhrases.controller;

import br.com.jrm.jrmphrases.JRMPhrases.dto.PhraseDTO;
import br.com.jrm.jrmphrases.JRMPhrases.models.Phrase;
import br.com.jrm.jrmphrases.JRMPhrases.service.PhraseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PhraseController {
    @Autowired
    private PhraseService service;

    @GetMapping("/series/frases")
    public PhraseDTO getRandomPhrase(){
        return service.getRandomPhraseS();
    }
}
