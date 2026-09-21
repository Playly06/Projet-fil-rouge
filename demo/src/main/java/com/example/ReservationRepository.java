package com.example;

import java.util.Optional;

public class ReservationRepository {
    Private Map<Reservation> reservations=new HashMap<>();

    public Optional<Reservation>findById(String id){
        return reservations.stream.filter(r->r.getId.equals(id)).findFirst();
    }
     Reservation reservation=repository.findById(id).orElseThrow(()-> new ReservationIntrouvableException(id));
}
