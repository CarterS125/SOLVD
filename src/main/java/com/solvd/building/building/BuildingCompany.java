package com.solvd.building.building;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class BuildingCompany {
    static Logger logger = Logger.getLogger(BuildingCompany.class.getName());
    private String companyName;
    private int yearsOfEXP;
    private int price;
    private int avgTimeline;
    private int numOfWorkers;

    public BuildingCompany(String companyName, int yearsOfEXP, int price, int avgTimeline, int numOfWorkers) {
        this.companyName = companyName;
        this.yearsOfEXP = yearsOfEXP;
        this.price = price;
        this.avgTimeline = avgTimeline;
        this.numOfWorkers = numOfWorkers;

        List<BuildingCompany> companies = Arrays.asList(
                new BuildingCompany("ABC Co.", 10, 50000, 12, 50),
                new BuildingCompany("DEF Co.", 5, 40000, 18, 30),
                new BuildingCompany("GHI Co.", 15, 60000, 8, 70),
                new BuildingCompany("JKL Co.", 8, 45000, 15, 40)

        );

        List<BuildingCompany> filteredCompanies = companies.stream()
                .filter(c -> c.getYearsOfEXP() >= 10 && c.getAvgTimeline() <= 12)
                .sorted((c1, c2) -> Integer.compare(c1.getPrice(), c2.getPrice()))
                .collect(Collectors.toList());
        logger.info("Filtered companies sorted by price: " + filteredCompanies);
    }

    public int getYearsOfEXP() {
        return yearsOfEXP;
    }

    public int getPrice() {
        return price;
    }

    public int getAvgTimeline() {
        return avgTimeline;
    }

    public int getNumOfWorkers() {
        return numOfWorkers;
    }
}
