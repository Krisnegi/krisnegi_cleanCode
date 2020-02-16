package com.CleanCode2;

public class House {
    String materialStandard;
    float totalAreaOfHouse;

    public House(String materialStandard, float totalAreaOfHouse) {
        this.materialStandard = materialStandard;
        this.totalAreaOfHouse = totalAreaOfHouse;
    }

    public int constructionCostPerSquareFeet()
    {
        switch(materialStandard)
        {
            case "standard":
                return 1200;
            case "above standard":
                return 1500;
            case "high standard":
                return 1800;
            case "high standard and fully automated":
                return 2500;
            default:
                return -1;
        }
    }
    public float estimateHouseConstructionCost()
    {
        return constructionCostPerSquareFeet()*totalAreaOfHouse;
    }
}
