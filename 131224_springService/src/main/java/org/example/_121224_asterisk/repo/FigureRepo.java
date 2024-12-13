package org.example._121224_asterisk.repo;

import org.example._121224_asterisk.model.Figure;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FigureRepo extends MongoRepository<Figure, String> {



}
