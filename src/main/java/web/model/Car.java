package web.model;

public class Car {
    String model;
    int series;
    int enginePower;

    public Car(String model, int series, int enginePower) {
        this.model = model;
        this.series = series;
        this.enginePower = enginePower;
    }

    public String getModel() {
        return model;
    }

    public int getSeries() {
        return series;
    }

    public int getEnginePower() {
        return enginePower;
    }

}
