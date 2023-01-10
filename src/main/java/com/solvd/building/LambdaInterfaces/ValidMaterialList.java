package com.solvd.building.LambdaInterfaces;

import java.util.List;

@FunctionalInterface
public interface ValidMaterialList<T> {
void materials(List<T> validMaterialList);

}
