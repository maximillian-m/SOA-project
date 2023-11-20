package com.maximillian.airplanetickets;

public class AirportTicketSale {

    private String airportTickets;
    private double ticketPrice;
    private boolean isAvailable;
    public AirportTicketSale(String airportTickets, double ticketPrice, boolean isAvailable) {
        this.airportTickets = airportTickets;
        this.ticketPrice = ticketPrice;
        this.isAvailable = isAvailable;
    }

    public void setAirportTickets(String airportTickets) {
        this.airportTickets = airportTickets;
    }

    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}
