package patterns.builder;

public class Main {
    public static void main(String[] args) {
        //Создаем билдер
        HouseBuilder houseBuilder = new HouseBuilder();
        /*Вместо создания объекта через конструктор - задаем параметры
        * в строителе и создаем объект согласно заданным параметрам*/
        House house = houseBuilder
                .setAddress("Salarian 9")
                .wallsCount(4)
                .createRoof(true)
                .wallsMaterial("Stone")
                .roofMaterial("Metal")
                .createSwimmingPool(true)
                .build();
        System.out.println(house);
    }
}
