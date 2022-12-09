package patterns.creational.builderpattern.test;

import patterns.creational.builderpattern.builder.ConcreteHouseBuilder;
import patterns.creational.builderpattern.builder.HouseBuilder;
import patterns.creational.builderpattern.builder.PrefabricatedHouseBuilder;
import patterns.creational.builderpattern.director.ConstructionEngineer;
import patterns.creational.builderpattern.product.House;

public class ConstructionEngineerTest {

    public static void main(String[] args) throws Exception {
        ConstructionEngineerTest engineer = new ConstructionEngineerTest();
        engineer.testConstructHouse();
    }

    public void testConstructHouse() throws Exception {
        HouseBuilder concreteHouseBuilder = new ConcreteHouseBuilder();
        ConstructionEngineer engineerA = new ConstructionEngineer(concreteHouseBuilder);
        House houseA = engineerA.constructHouse();
        System.out.println("House is: "+houseA);
        PrefabricatedHouseBuilder prefabricatedHouseBuilder = new PrefabricatedHouseBuilder();
        ConstructionEngineer engineerB = new ConstructionEngineer(prefabricatedHouseBuilder);
        House houseB = engineerB.constructHouse();
        System.out.println("House is: "+houseB);
    }
}
