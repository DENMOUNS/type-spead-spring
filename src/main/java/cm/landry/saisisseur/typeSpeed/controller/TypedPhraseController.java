package cm.landry.saisisseur.typeSpeed.controller;

import cm.landry.saisisseur.typeSpeed.entity.TypedPhrase;
import cm.landry.saisisseur.typeSpeed.service.TypedPhraseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/typed-phrases")
public class TypedPhraseController {

    private final TypedPhraseService typedPhraseService;

    @Autowired
    public TypedPhraseController(TypedPhraseService typedPhraseService) {
        this.typedPhraseService = typedPhraseService;
    }

    @PostMapping
    public ResponseEntity<TypedPhrase> createTypedPhrase(@RequestBody TypedPhrase typedPhrase) {
        try {
            TypedPhrase savedPhrase = typedPhraseService.saveTypedPhrase(typedPhrase);
            return ResponseEntity.ok(savedPhrase);
        } catch (Exception e) {
            // Log and handle the exception
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

}
