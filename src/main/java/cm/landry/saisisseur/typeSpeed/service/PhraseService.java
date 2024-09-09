package cm.landry.saisisseur.typeSpeed.service;

import java.util.List;
import java.util.Optional;

import cm.landry.saisisseur.typeSpeed.entity.Phrase;

public interface PhraseService {
    Phrase savePhrase(Phrase phrase);
    Optional<Phrase> getPhraseById(Long id);
    List<Phrase> getPhrasesByTestSessionId(Long testSessionId);
    List<Phrase> getAllPhrases();
    void deletePhrase(Long id);
}
