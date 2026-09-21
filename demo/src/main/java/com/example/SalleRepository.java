package com.example;
import java.util.Optional;

import main.java.com.example;

public class SalleRepository {
    Private Map<Salle> salles=new HashMap<>();

    public Optional<Reservation>findById(String id){
        return salles.stream.filter(r->r.getId.equals(id)).findFirst();
    }
    Salle salle=repository.findById(id).orElseThrow(()-> new SalleIntrouvableException(id));
}
