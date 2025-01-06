package org.example._060125_burgermenu.service;

import java.util.UUID;

public class IdService {
    public String generateId(){
        return UUID.randomUUID().toString();
    }
}
