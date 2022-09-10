package com.skm.property.enums;

public enum PropertySubType {
    LAND_FARM(PropertyType.LAND, "Farm Land", "Agricultural"),
    LAND_PLOT(PropertyType.LAND, "Plot","Residential"),
    HOME_HOUSE(PropertyType.LAND, "House","Residential"),
    HOME_CONDO(PropertyType.LAND, "Condo","Residential"),
    HOME_TOWN_HOME(PropertyType.LAND, "Town Home","Residential"),
    HOME_MULTI_FAMILY(PropertyType.LAND, "Multi Family","Residential"),
    HOME_APARTMENT(PropertyType.LAND, "Apartment","Residential"),
    HOME_Manufactured(PropertyType.LAND, "Manufactured","Residential");

    PropertySubType(PropertyType land, String plot, String residential) {
    }
}
