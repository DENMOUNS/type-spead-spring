package cm.landry.saisisseur.typeSpeed.service.implement;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cm.landry.saisisseur.typeSpeed.entity.TypedPhrase;
import cm.landry.saisisseur.typeSpeed.repository.TypedPhraseRepository;
import cm.landry.saisisseur.typeSpeed.service.TypedPhraseService;

@Service
public class TypedPhraseServiceImpl implements TypedPhraseService {

    @Autowired
    private TypedPhraseRepository typedPhraseRepository;

    @Override
    public TypedPhrase saveTypedPhrase(TypedPhrase typedPhrase) {
        // Ajoutez ici des validations ou des transformations si nécessaire
        return typedPhraseRepository.save(typedPhrase);
    }

    @Override
    public Optional<TypedPhrase> getTypedPhraseById(Long id) {
        return typedPhraseRepository.findById(id);
    }

    @Override
    public List<TypedPhrase> getAllTypedPhrases() {
        return typedPhraseRepository.findAll();
    }

    @Override
    public void deleteTypedPhrase(Long id) {
        typedPhraseRepository.deleteById(id);
    }
}
