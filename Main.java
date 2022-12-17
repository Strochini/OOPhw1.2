import transport.Car;

public class Main {
    public static void main(String[] args) {
        Car lada = new Car("Lada", "Granta", 1.7, "Yellow", 2015,
                "Russia", "Manual", "Sedan", "e123xa777", 5, "Winter tires");
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.0, "Black", 2020,
                "Germany", "Auto", "Sedan", "a765aa999", 5, "Summer tires");
        Car bmw = new Car("BMW", "Z8", 3.0, "Black", 2021,
                "Germany", "Manual", "Coupe", "h456aa888", 2, "Winter tires");
        Car kia = new Car("KIA", "Sportage 4th generation", 2.4, "Red", 2018,
                "South Korea", "Auto", "Universal", "x333xx333", 6, "Summer tires");
        Car hyundai = new Car("Hyundai", "Avante", 1.6, "Orange", 2016,
                "South Korea", "Manual", "Sedan", "l987gh654", 5, "Winter tires");

        hyundai.setRegNum("c026am178");

        System.out.println(lada.toString() + "\n" + audi.toString() + "\n" + bmw.toString() + "\n" + kia.toString() +
                "\n" + hyundai.toString());
    }
}
