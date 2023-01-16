package com.solvd.building.building;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

public class BuildingRentPrice {

    static Logger logger = Logger.getLogger(BuildingRentPrice.class.getName());
    private String name;
    private double price;

    public BuildingRentPrice(String name, double price) {
        this.name = name;
        this.price = price;

        List<BuildingRentPrice> rentals = Arrays.asList(
                new BuildingRentPrice("normal", 2000),
                new BuildingRentPrice("luxury", 3500),
                new BuildingRentPrice("penthouse", 5000)
        );

        double averagePrice = rentals.stream()
                .mapToDouble(BuildingRentPrice::getPrice)
                .average()
                .orElse(0);
        logger.info("The average rental price is: " + averagePrice);
    }

    public double getPrice() {
        return price;
    }

}
