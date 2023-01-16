package com.solvd.building.building;

import com.solvd.building.LambdaInterfaces.ValidBuilderList;
import com.solvd.building.LambdaInterfaces.ValidElement;
import com.solvd.building.LambdaInterfaces.ValidMaterialList;
import com.solvd.building.buildingtools.BuildingTool;
import com.solvd.building.elements.Element;
import com.solvd.building.exceptions.*;

import java.util.*;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Runner {

    static Logger logger = Logger.getLogger(Runner.class.getName());

    public static <T> void main(String[] args, Iterable<? extends Element<T>> elementList) throws InvalidBuildingStaffSelection, InvalidBuilderSelection, InvalidElementSelection, InvalidToolSelection, InvalidMaterialChoice {

        Building building = new Building("Palisades Apartments");

        String material = "concrete";
        String builder = "concrete guy";
        String element = "floor";
        String tool = "concrete pump";

        ArrayList<String> ValidMaterialList = building.getValidMaterialList();
        if (!ValidMaterialList.contains(material)) {
            String message = material + " is not a valid selection for materials";
            throw new InvalidBuildingStaffSelection(message);
        }

        ArrayList<String> ValidBuilderList = building.getValidBuilderList();
        if (!ValidBuilderList.contains(builder)) {
            String message = builder + "is not a valid selection for builders";
            throw new InvalidBuilderSelection(message);
        }

        ArrayList<String> ValidElementList = building.getValidElementList();
        if (!ValidElementList.contains(element)) {
            String message = element + "is not a valid selection for elements";
            throw new InvalidElementSelection(message);
        }

        ArrayList<String> ValidToolList = building.getValidTooList();
        if (!ValidToolList.contains(tool)) {
            String message = tool + "is not a valid selection for tools";
            throw new InvalidToolSelection(message);
        }

        Element<T> Element = initializeElement();
        Building b = new Building(material, builder, element, tool);
        Logger.getLogger(b.toString());

        LinkedList<Building> BuildingInProduction = new LinkedList<Building>();
        BuildingInProduction.add(b);

        HashMap<String, Building> approvedElements = Building.getApprovedElements;
        Building b1 = approvedElements.get("wall");
        Building b2 = approvedElements.get("floor");
        Building b3 = approvedElements.get("room");
        Building b4 = approvedElements.get("roof");
        Building b5 = approvedElements.get("basement");
        BuildingInProduction.add(b1);
        BuildingInProduction.add(b2);
        BuildingInProduction.add(b3);
        BuildingInProduction.add(b4);
        BuildingInProduction.add(b5);
        Building b6 = approvedElements.get("floor");
        BuildingInProduction.add(b6);
        Building b7 = approvedElements.get("wall");
        BuildingInProduction.add(b7);
        Building b8 = approvedElements.get("room");
        BuildingInProduction.add(b8);
        Building b9 = approvedElements.get("roof");
        BuildingInProduction.add(b9);
        Building b10 = approvedElements.get("basement");
        BuildingInProduction.add(b10);

        Building currentNode = BuildingInProduction.getFirst();
        while (currentNode.data != null) {
            try {
                for (Element<T> el : elementList) {
                    el.processBuilding(currentNode.data, element);
                    el.printElement(element);
                }
                Logger.getLogger("***********END OF PROCESS FOR THE BUILDING************");
            } catch (BuildingMaterialNotFoundException e) {
                Logger.getLogger(e.getMessage());
            } catch (BuilderNotAvailableException e) {
                Logger.getLogger(e.getMessage());
            }
            currentNode = currentNode.next;
        }
    }


    static <T> Element<T> initializeElement() {

        ArrayList<Element<T>> element = new ArrayList<>();

        Element<T> Element = new Element<T>("wall");
        element.add(Element);

        Element = new Element<T>("floor");
        element.add(Element);

        Element = new Element<T>("room");
        element.add(Element);

        Element = new Element<T>("roof");
        element.add(Element);

        Element = new Element<T>("roof");
        element.add(Element);
        Logger.getLogger("Starting Building: " + element.toString());

        return Element;
    };

        ValidMaterialList<ValidMaterialList> validMaterialList = (List<ValidMaterialList> materials) -> {
            materials.forEach(project -> {
                logger.info("material name: " + materials);
            });
        };

        ValidElement<Element> element = (List<Element> Element) -> {
            Element.forEach(project -> {
                logger.info("element name: " + Element);
            });
        };

        ValidBuilderList<ValidBuilderList> validBuilderList = (List<ValidBuilderList> builders) -> {
            builders.forEach(project -> {
                logger.info("builders: " + builders);
            });
        };

}