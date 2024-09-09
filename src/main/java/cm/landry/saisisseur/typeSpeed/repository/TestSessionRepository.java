package cm.landry.saisisseur.typeSpeed.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cm.landry.saisisseur.typeSpeed.entity.TestSession;

@Repository
public interface TestSessionRepository extends JpaRepository<TestSession, Long>{
    List<TestSession> findByUserId(Long userId);
}
