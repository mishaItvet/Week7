package ge.itvet.enums;

public class Vehicle {
    private String brand;
    private EngineType engine;
    private BodyType type;

    public Vehicle(String brand,EngineType engine, BodyType type){
        this.brand = brand;
        this.engine = engine;
        this.type = type;
    }
    public String getBrand(){
        return brand;
    }

    public EngineType getEngine() {
        return engine;
    }

    public BodyType getBody() {
        return type;
    }

    @Override
    public String toString(){
        return "Vehicle { brand = '" + brand + "' , type = " + type + ", " +
                " engine = " + engine + " }";
    }
}
