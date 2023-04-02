package br.com.evandro.languages.api.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.evandro.languages.api.Languages;

@RestController
public class LanguageController {
    private List<Languages> languages = List.of(
        new Languages("Java","https://raw.githubusercontent.com/abrahamcalf/programming-languages-logos/master/src/java/java_256x256.png",1),
        new Languages("PHP","https://raw.githubusercontent.com/abrahamcalf/programming-languages-logos/master/src/php/php_256x256.png",10));

    @GetMapping(value = "/languages")
    public List<Languages> GetLanguages() {
        return languages;
    }
}
