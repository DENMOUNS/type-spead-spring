package cm.landry.saisisseur.typeSpeed.repository;

import cm.landry.saisisseur.typeSpeed.entity.TypedPhrase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TypedPhraseRepository extends JpaRepository<TypedPhrase, Long> {
}
