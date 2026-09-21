package com.example;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import main.java.com.example.Salle;
public class SalleRepository {
    private final Map<String, Salle> salles = new HashMap<>();

    public Optional<Salle> findById(String id) {
        return Optional.ofNullable(salles.get(id));
    }
}
