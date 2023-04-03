package br.com.evandro.languages.api.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.evandro.languages.api.Languages;

public interface LanguagesRepository extends MongoRepository<Languages, String> {
    
}
