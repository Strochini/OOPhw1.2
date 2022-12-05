public class Car {
    String brand;
    String model;
    double engineVolume;
    String color;
    int productionYear;
    String productionCountry;

    public  Car(String brand, String model, double engineVolume, String color, int productionYear, String productionCountry) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.color = color;
        this.productionYear = productionYear;
        this.productionCountry = productionCountry;
    }
    public  Car(String model, double engineVolume, String color, int productionYear, String productionCountry) {
        brand = "brand";
        this.model = model;
        this.engineVolume = engineVolume;
        this.color = color;
        this.productionYear = productionYear;
        this.productionCountry = productionCountry;
    }
    public  Car(double engineVolume, String brand, String color, int productionYear, String productionCountry) {
        this.brand = brand;
        model = "model";
        this.engineVolume = engineVolume;
        this.color = color;
        this.productionYear = productionYear;
        this.productionCountry = productionCountry;
    }
    public  Car(String brand, String model, String color, int productionYear, String productionCountry) {
        this.brand = brand;
        this.model = model;
        engineVolume = 1.5;
        this.color = color;
        this.productionYear = productionYear;
        this.productionCountry = productionCountry;
    }
    public  Car(String brand, String model, double engineVolume, int productionYear, String productionCountry) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        color = "White";
        this.productionYear = productionYear;
        this.productionCountry = productionCountry;
    }

    public  Car(String brand, String model, double engineVolume, String color, String productionCountry) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.color = color;
        productionYear = 2000;
        this.productionCountry = productionCountry;
    }
    public  Car(String brand, String model, double engineVolume, String color, int productionYear) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.color = color;
        this.productionYear = productionYear;
        productionCountry = "Country";
    }

    @Override
    public String toString() {
        return "Brand: " + brand + "\n" + "Model: " + model + "\n" + "Engine: " + engineVolume + "\n" + "Color: " + color + "\n" + "Year: " + productionYear + "\n" + "Country: " + productionCountry + "\n";
    }
}
