package cm.landry.saisisseur.typeSpeed.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cm.landry.saisisseur.typeSpeed.entity.Phrase;
import cm.landry.saisisseur.typeSpeed.service.PhraseService;

@RestController
@RequestMapping("/phrases")@CrossOrigin(origins = "http://localhost:3000")  
public class PhraseController {
    private final PhraseService phraseService;

    @Autowired
    public PhraseController(PhraseService phraseService) {
        this.phraseService = phraseService;
    }

    @PostMapping
    public Phrase createPhrase(@RequestBody Phrase phrase) {
        return phraseService.savePhrase(phrase);
    }

    @GetMapping("/{id}")
    public Optional<Phrase> getPhraseById(@PathVariable Long id) {
        return phraseService.getPhraseById(id);
    }

    @GetMapping("/test-session/{testSessionId}")
    public List<Phrase> getPhrasesByTestSessionId(@PathVariable Long testSessionId) {
        return phraseService.getPhrasesByTestSessionId(testSessionId);
    }

    @GetMapping
    public List<Phrase> getAllPhrases() {
        return phraseService.getAllPhrases();
    }

    @DeleteMapping("/{id}")
    public void deletePhrase(@PathVariable Long id) {
        phraseService.deletePhrase(id);
    }
}
