package cm.landry.saisisseur.typeSpeed.service;

import java.util.List;
import java.util.Optional;

import cm.landry.saisisseur.typeSpeed.entity.TestSession;

public interface TestSessionService {
    TestSession saveTestSession(TestSession testSession);
    Optional<TestSession> getTestSessionById(Long id);
    List<TestSession> getTestSessionsByUserId(Long userId);
    List<TestSession> getAllTestSessions();
    void deleteTestSession(Long id);
}
