package patterns.builder;

public class House {
    String address;
    int walls;
    String wallsMaterial;
    boolean roof;
    String roofMaterial;
    boolean swimmingPool;
    boolean garden;
    boolean gym;
    boolean garage;

    /*Конструктор оставляем по умолчанию, вместо множества конструкторов или огромного конструктора
    создаем интерфейс BuildHouse и класс HouseBuilder имплементирующий этот интерфейс*/

    @Override
    public String toString() {
        return "House{" +
                "address='" + address + '\'' +
                ", walls=" + walls +
                ", wallsMaterial='" + wallsMaterial + '\'' +
                ", roof=" + roof +
                ", roofMaterial='" + roofMaterial + '\'' +
                ", swimmingPool=" + swimmingPool +
                ", garden=" + garden +
                ", gym=" + gym +
                ", garage=" + garage +
                '}';
    }
}