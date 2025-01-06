package org.example._060125_burgermenu.repo;

import org.example._060125_burgermenu.model.Menu;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MenuRepo extends MongoRepository<Menu, String> {
}
