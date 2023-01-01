package com.solvd.building.building;

import com.solvd.building.LambdaInterfaces.IBuilderList;
import com.solvd.building.LambdaInterfaces.IElement;
import com.solvd.building.LambdaInterfaces.IValidMaterialList;
import com.solvd.building.buildingstaff.*;
import com.solvd.building.elements.*;
import com.solvd.building.exceptions.InvalidBuilderSelection;
import com.solvd.building.exceptions.InvalidElementSelection;
import com.solvd.building.exceptions.InvalidMaterialChoice;
import com.solvd.building.exceptions.InvalidToolSelection;
import com.solvd.building.materials.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Logger;

public class Building {
    Logger logger = Logger.getLogger(Building.class.getName());
    public static ArrayList<Element> getBuilderList;
    public static HashMap<String, Building> getApprovedElements;
    public Building data;
    public Building next;
    private String name;
    private ArrayList<Builder> builders;
    private HashMap<String, Element> approvedElement;

    public Building(String name) throws InvalidMaterialChoice, InvalidToolSelection, InvalidElementSelection, InvalidBuilderSelection {
        this.name = name;
        this.builders = initializeBuilder();
        this.approvedElement = initializeApprovedElements();
    }

    public Building(String material, String builder, String element, String tool) {}

    public ArrayList<Builder> initializeBuilder() {
        ArrayList<Builder> builderList = new ArrayList<Builder>();

        CabinetGuy cabinetGuy = new CabinetGuy();
        builderList.add(cabinetGuy);

        ConcreteGuy concreteGuy = new ConcreteGuy();
        builderList.add(concreteGuy);

        DryWaller dryWaller = new DryWaller();
        builderList.add(dryWaller);

        Electrician electrician = new Electrician();
        builderList.add(electrician);

        Landscaper landscaper = new Landscaper();
        builderList.add(landscaper);

        Painter painter = new Painter();
        builderList.add(painter);

        Plumber plumber = new Plumber();
        builderList.add(plumber);

        TrimGuy trimGuy = new TrimGuy();
        builderList.add(trimGuy);
        IBuilderList IbuilderList = (builder) -> logger.info("These are all the builders required to make the building");
        return builderList;
    }

    public HashMap<String, Element> initializeApprovedElements() throws InvalidElementSelection, InvalidMaterialChoice, InvalidBuilderSelection, InvalidToolSelection {
        HashMap<String, Element> approvedElements = new HashMap<>();
        approvedElements.put("wall", new Wall(4,"front side", new Wood(), new Paint(), new Drywall()));
        approvedElements.put("floor", new Floor("modern", 10, 10, new Concrete(), new Drywall(), new Paint(), new Wiring()));
        approvedElements.put("roof", new Roof(new Wood(), new Metal(), "very strong", "ocean view", 25));
        approvedElements.put("room", new Room("modern", "ocean side", 5, 2500, "ocean view"));
        approvedElements.put("basement", new Basement(200, new Concrete(), 20, 2500000, 4, "very strong"));
        IElement Ielement = (element) -> logger.info("these are all the required elements to make sure that the building is built correctly ");
        return approvedElements;

    }

    public ArrayList<String> getValidMaterialList(){
        ArrayList<String> validMaterialList = new ArrayList<String>();
        validMaterialList.add("cabinets");
        validMaterialList.add("concrete");
        validMaterialList.add("drywall");
        validMaterialList.add("glass");
        validMaterialList.add("grass and plant");
        validMaterialList.add("metal");
        validMaterialList.add("paint");
        validMaterialList.add("piping");
        validMaterialList.add("tile");
        validMaterialList.add("trim");
        validMaterialList.add("wiring");
        validMaterialList.add("wood");
        IValidMaterialList IvalidMaterialList = (materials) -> logger.info("these are all the needed materials");
        return validMaterialList;
    }

    public ArrayList<String> getValidBuilderList(){
        ArrayList<String> validBuilderList = new ArrayList<String>();
        validBuilderList.add("cabinet guy");
        validBuilderList.add("concrete guy");
        validBuilderList.add("dry waller");
        validBuilderList.add("electrician");
        validBuilderList.add("landscaper");
        validBuilderList.add("painter");
        validBuilderList.add("plumber");
        validBuilderList.add("trim guy");
        validBuilderList.stream().forEach(validBuilderList1 -> validBuilderList.add(validBuilderList1));
        return validBuilderList;
    }

    public ArrayList<String> getValidTooList(){
        ArrayList<String> validToolList = new ArrayList<String>();
        validToolList.add("bulldozer");
        validToolList.add("cabinet Drill");
        validToolList.add("concrete pump");
        validToolList.add("crane");
        validToolList.add("drywall drill");
        validToolList.add("excavator");
        validToolList.add("general tools");
        validToolList.add("paint brush/ paint roller");
        validToolList.add("pipe cutter");
        validToolList.add("planting tool");
        validToolList.add("trim nail gun");
        validToolList.add("wire cutter");
        validToolList.stream().forEach(validTooList -> validToolList.add(validTooList));
        return validToolList;
    }

    public ArrayList<String> getValidElementList(){
        ArrayList<String> validElementList = new ArrayList<String>();
            validElementList.add("wall");
            validElementList.add("floor");
            validElementList.add("room");
            validElementList.add("roof");
            validElementList.add("basement");
            validElementList.stream().forEach(validElementList1 -> validElementList.add(validElementList1));

        return validElementList;
    }
}
