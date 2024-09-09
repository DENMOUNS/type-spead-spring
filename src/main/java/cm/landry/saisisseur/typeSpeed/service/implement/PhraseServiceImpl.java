package cm.landry.saisisseur.typeSpeed.service.implement;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cm.landry.saisisseur.typeSpeed.entity.Phrase;
import cm.landry.saisisseur.typeSpeed.repository.PhraseRepository;
import cm.landry.saisisseur.typeSpeed.service.PhraseService;

@Service
public class PhraseServiceImpl implements PhraseService{
    private final PhraseRepository phraseRepository;

    @Autowired
    public PhraseServiceImpl(PhraseRepository phraseRepository) {
        this.phraseRepository = phraseRepository;
    }

    @Override
    public Phrase savePhrase(Phrase phrase) {
        return phraseRepository.save(phrase);
    }

    @Override
    public Optional<Phrase> getPhraseById(Long id) {
        return phraseRepository.findById(id);
    }

    @Override
    public List<Phrase> getPhrasesByTestSessionId(Long testSessionId) {
        return phraseRepository.findAll(); // Modify based on your requirements
    }

    @Override
    public List<Phrase> getAllPhrases() {
        return phraseRepository.findAll();
    }

    @Override
    public void deletePhrase(Long id) {
        phraseRepository.deleteById(id);
    }
}
