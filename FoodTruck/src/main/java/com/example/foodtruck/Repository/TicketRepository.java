package com.example.foodtruck.Repository;

import com.example.foodtruck.Model.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface   TicketRepository extends JpaRepository<Ticket,Integer> {
    Ticket findTicketById(Integer id);
    List<Ticket> countById(Integer id);
}
