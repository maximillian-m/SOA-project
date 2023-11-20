package com.maximillian.airplanemaintenance.service;

import com.maximillian.airplanetickets.AirportTicketSale;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class PlaneService {
    public AirportTicketSale getAirportTicket(){
        return new AirportTicketSale(UUID.randomUUID().toString(), 55.5, true);
    }
}
