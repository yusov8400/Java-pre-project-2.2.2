package main.config.controller.model;

public class Car {
    private String model;
    private int serial;
    private int horsePower;

    public Car() {
    }

    public Car(String model, int serial, int horsePower) {
        this.model = model;
        this.serial = serial;
        this.horsePower = horsePower;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSerial() {
        return serial;
    }

    public void setSerial(int serial) {
        this.serial = serial;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(String date) {
        this.horsePower = horsePower;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", serial='" + serial + '\'' +
                ", date=" + horsePower +
                '}';
    }
}
