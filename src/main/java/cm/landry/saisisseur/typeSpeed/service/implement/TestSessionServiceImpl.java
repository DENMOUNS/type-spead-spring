package cm.landry.saisisseur.typeSpeed.service.implement;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cm.landry.saisisseur.typeSpeed.entity.TestSession;
import cm.landry.saisisseur.typeSpeed.repository.TestSessionRepository;
import cm.landry.saisisseur.typeSpeed.service.TestSessionService;

@Service
public class TestSessionServiceImpl implements TestSessionService{
    private final TestSessionRepository testSessionRepository;

    @Autowired
    public TestSessionServiceImpl(TestSessionRepository testSessionRepository) {
        this.testSessionRepository = testSessionRepository;
    }

    @Override
    public TestSession saveTestSession(TestSession testSession) {
        return testSessionRepository.save(testSession);
    }

    @Override
    public Optional<TestSession> getTestSessionById(Long id) {
        return testSessionRepository.findById(id);
    }

    @Override
    public List<TestSession> getTestSessionsByUserId(Long userId) {
        return testSessionRepository.findByUserId(userId);
    }

    @Override
    public List<TestSession> getAllTestSessions() {
        return testSessionRepository.findAll();
    }

    @Override
    public void deleteTestSession(Long id) {
        testSessionRepository.deleteById(id);
    }
}
