package cm.landry.saisisseur.typeSpeed.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cm.landry.saisisseur.typeSpeed.entity.Phrase;

@Repository
public interface PhraseRepository extends JpaRepository<Phrase, Long>{
    
}
