package model.onlineTable.controller;

import logging.Logger;
import model.onlineTable.service.OnlineTableService;

public class OnlineTableController {

    private OnlineTableService service;

    public OnlineTableController(String airportCode, String departureOrArrival) {
        this.service = new OnlineTableService(airportCode, departureOrArrival);
    }

    public void printAirportTable() {
        service.printAirportTable();
        Logger.info("OnlineTable: Printed airport table");
    }

}
