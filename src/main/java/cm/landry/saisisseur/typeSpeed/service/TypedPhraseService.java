package cm.landry.saisisseur.typeSpeed.service;

import java.util.List;
import java.util.Optional;

import cm.landry.saisisseur.typeSpeed.entity.TypedPhrase;

public interface TypedPhraseService {
    TypedPhrase saveTypedPhrase(TypedPhrase typedPhrase);
    Optional<TypedPhrase> getTypedPhraseById(Long id);
    List<TypedPhrase> getAllTypedPhrases();
    void deleteTypedPhrase(Long id);
}
