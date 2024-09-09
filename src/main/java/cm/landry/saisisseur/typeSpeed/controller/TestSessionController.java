package cm.landry.saisisseur.typeSpeed.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cm.landry.saisisseur.typeSpeed.entity.TestSession;
import cm.landry.saisisseur.typeSpeed.service.TestSessionService;

@RestController
@RequestMapping("/test-sessions")
public class TestSessionController {
    private final TestSessionService testSessionService;

    @Autowired
    public TestSessionController(TestSessionService testSessionService) {
        this.testSessionService = testSessionService;
    }

    @PostMapping
    public TestSession createTestSession(@RequestBody TestSession testSession) {
        return testSessionService.saveTestSession(testSession);
    }

    @GetMapping("/{id}")
    public Optional<TestSession> getTestSessionById(@PathVariable Long id) {
        return testSessionService.getTestSessionById(id);
    }

    @GetMapping("/user/{userId}")
    public List<TestSession> getTestSessionsByUserId(@PathVariable Long userId) {
        return testSessionService.getTestSessionsByUserId(userId);
    }

    @GetMapping
    public List<TestSession> getAllTestSessions() {
        return testSessionService.getAllTestSessions();
    }

    @DeleteMapping("/{id}")
    public void deleteTestSession(@PathVariable Long id) {
        testSessionService.deleteTestSession(id);
    }
}
