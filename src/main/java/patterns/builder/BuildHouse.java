package patterns.builder;

public interface BuildHouse {
    BuildHouse setAddress(String address);
    BuildHouse wallsCount(int count);
    BuildHouse wallsMaterial(String material);
    BuildHouse createRoof(boolean withRoof);
    BuildHouse roofMaterial(String material);
    BuildHouse createSwimmingPool(boolean withPool);
    BuildHouse creteGarden(boolean withGarden);
    BuildHouse createGym(boolean withGym);
    BuildHouse createGarage(boolean withGarage);
    House build();
}