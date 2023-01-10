package com.solvd.building.Reflection;

import com.solvd.building.building.Runner;
import com.solvd.building.elements.Element;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.logging.Logger;

public class Reflection {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException {
        Logger logger = Logger.getLogger(Runner.class.getName());

        Class<?> buildingClass = Class.forName("main.java.com.solvd.building.building");

        Constructor[] constructors = buildingClass.getDeclaredConstructors();
        Constructor constructor = constructors[0];
        Element<T> element = (Element<T>) constructor.newInstance("wall", "roof", "floor", "room", "basement");
        for (Constructor c : constructors) {
            logger.info(String.valueOf(c));
        }

        Field[] fields = buildingClass.getDeclaredFields();
        Field capField = buildingClass.getDeclaredField("fastestBuildTime");
        capField.setAccessible(true);
        int cap = (int) capField.get(element);
        for (Field f :fields) {
            logger.info(String.valueOf(f));
        }

        Method[] methods = buildingClass.getDeclaredMethods();
        Method statusMethod = buildingClass.getDeclaredMethod("getFastestBuildTime");
        statusMethod.invoke(element);
        for (Method m : methods) {
            logger.info(String.valueOf(m));
        }
    }
}
