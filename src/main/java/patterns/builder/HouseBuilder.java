package patterns.builder;

public class HouseBuilder implements BuildHouse {
    //Создаем экземпляр класса, который будем строить
    House house = new House();

    @Override
    public BuildHouse setAddress(String address) {
        house.address = address;
        return this;
    }

    @Override
    public BuildHouse wallsCount(int count) {
        house.walls = count;
        return this;
    }

    @Override
    public BuildHouse wallsMaterial(String material) {
        house.wallsMaterial = material;
        return this;
    }

    @Override
    public BuildHouse createRoof(boolean withRoof) {
        house.roof = withRoof;
        return this;
    }

    @Override
    public BuildHouse roofMaterial(String material) {
        house.roofMaterial = material;
        return this;
    }

    @Override
    public BuildHouse createSwimmingPool(boolean withPool) {
        house.swimmingPool = withPool;
        return this;
    }

    @Override
    public BuildHouse creteGarden(boolean withGarden) {
        house.garden = withGarden;
        return this;
    }

    @Override
    public BuildHouse createGym(boolean withGym) {
        house.gym = withGym;
        return this;
    }

    @Override
    public BuildHouse createGarage(boolean withGarage) {
        house.garage = withGarage;
        return this;
    }

    @Override
    public House build() {
        return house;
    }
}
