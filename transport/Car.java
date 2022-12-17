package transport;

import java.time.LocalDate;

public class Car {
    LocalDate date = LocalDate.now();
    private final String brand;
    private final String model;
    private double engineVolume;
    private String color;
    private final int productionYear;
    private final String productionCountry;
    private String transmission;
    private final String bodyType;
    private String regNum;
    private int numOfSeats;
    private String tires;
    private final String defaultStringParam = "Unknown";
    private final int defaultYearParam = 2000;
    private final int defaultSeatParam = 5;
    private final double defaultEngineParam = 1.6;

    public Car(String brand, String model, double engineVolume, String color, int productionYear,
               String productionCountry, String transmission, String bodyType, String regNum, int numOfSeats,
               String tires) {
        if (brand == null || brand.isBlank()) {
            this.brand = defaultStringParam;
        } else {
            this.brand = brand;
        }
        if (model == null || model.isBlank()) {
            this.model = defaultStringParam;
        } else {
            this.model = model;
        }
        if (engineVolume <= 0) {
            this.engineVolume = defaultEngineParam;
        } else {
            this.engineVolume = engineVolume;
        }
        if (color == null || color.isBlank()) {
            this.color = defaultStringParam;
        } else {
            this.color = color;
        }
        if (productionYear <= 0) {
            this.productionYear = defaultYearParam;
        } else {
            this.productionYear = productionYear;
        }
        if (productionCountry == null || productionCountry.isBlank()) {
            this.productionCountry = defaultStringParam;
        } else {
            this.productionCountry = productionCountry;
        }
        if (transmission == null || transmission.isBlank()) {
            this.transmission = defaultStringParam;
        } else {
            this.transmission = transmission;
        }
        if (bodyType == null || bodyType.isBlank()) {
            this.bodyType = defaultStringParam;
        } else {
            this.bodyType = bodyType;
        }
        if ((regNum != null || !regNum.isBlank()) &&
                regNum.length() == 9 &&
                Character.isDigit(regNum.charAt(1)) &&
                Character.isDigit(regNum.charAt(2)) &&
                Character.isDigit(regNum.charAt(3)) &&
                Character.isDigit(regNum.charAt(6)) &&
                Character.isDigit(regNum.charAt(7)) &&
                Character.isDigit(regNum.charAt(8)) &&
                Character.isAlphabetic(regNum.charAt(0)) &&
                Character.isAlphabetic(regNum.charAt(4)) &&
                Character.isAlphabetic(regNum.charAt(5))) {
            this.regNum = regNum;
        } else {
            this.regNum = "Incorrect registration number!";
        }
        if (numOfSeats <= 0) {
            this.numOfSeats = defaultSeatParam;
        } else {
            this.numOfSeats = numOfSeats;
        }
        if (tires == null || tires.isBlank()) {
            this.tires = defaultStringParam;
        } else {
            this.tires = tires;
        }
    }

    public String tiersSeason(String tires) {
        LocalDate date = LocalDate.now();
        String summerTires = "Summer tires";
        String winterTires = "Winter tires";
        if (date.getMonthValue() >= 4 && date.getMonthValue() <= 11 && tires.equalsIgnoreCase(summerTires)) {
            this.tires = tires;
        } else if (date.getMonthValue() >= 4 && date.getMonthValue() <= 11 && tires.equalsIgnoreCase(winterTires)) {
            this.tires = tires +  ". Your tires need to be replaced with summer tires!";
        } else if (date.getMonthValue() > 4 && tires.equalsIgnoreCase(winterTires)) {
            this.tires = tires;
        } else if (date.getMonthValue() > 4 && tires.equalsIgnoreCase(summerTires)) {
            this.tires = tires + ". Your tires need to be replaced with winter tires!";
        }
        return this.tires;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public String getBodyType() {
        return bodyType;
    }

    public int getNumOfSeats() {
        return numOfSeats;
    }

    public void setNumOfSeats() {
        if (numOfSeats <= 0) {
            this.numOfSeats = defaultSeatParam;
        } else {
            this.numOfSeats = numOfSeats;
        }
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        if (engineVolume <= 0) {
            this.engineVolume = defaultEngineParam;
        } else {
            this.engineVolume = engineVolume;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color == null || color.isBlank()) {
            this.color = defaultStringParam;
        } else {
            this.color = color;
        }
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        if (transmission == null || transmission.isBlank()) {
            this.transmission = defaultStringParam;
        } else {
            this.transmission = transmission;
        }
    }

    public String getRegNum() {
        return regNum;
    }

    public void setRegNum(String regNum) {
        if (regNum != null && !regNum.isBlank() &&
                regNum.length() == 9 &&
                Character.isDigit(regNum.charAt(1)) &&
                Character.isDigit(regNum.charAt(2)) &&
                Character.isDigit(regNum.charAt(3)) &&
                Character.isDigit(regNum.charAt(6)) &&
                Character.isDigit(regNum.charAt(7)) &&
                Character.isDigit(regNum.charAt(8)) &&
                Character.isAlphabetic(regNum.charAt(0)) &&
                Character.isAlphabetic(regNum.charAt(4)) &&
                Character.isAlphabetic(regNum.charAt(5))) {
            this.regNum = regNum;
        } else {
            this.regNum = "Incorrect registration number!";
        }
    }

    public String getTires() {
        return tires;
    }

    public void setTires(String tires) {/*

        if (tires.equals(summerTiers)) {
            this.tires = tires + " Your tires need to be replaced with winter tires!";
        } else {*/
            this.tires = tires;
        }
   // }

    @Override
    public String toString() {
        return "Brand: " + brand + "\n" + "Model: " + model + "\n" + "Engine: " + engineVolume + "\n" + "Color: "
                + color + "\n" + "Year: " + productionYear + "\n" + "Country: " + productionCountry + "\n" +
                "Transmission: " + transmission + "\n" + "Body type: " + bodyType + "\n" + "Reg Num: " + regNum +
                "\n" + "Number of seats: " + numOfSeats + "\n" + "Tiers: " + tiersSeason(tires) + "\n";
    }
}
