public class Main {
    public static void main(String[] args) {
        Car lada = new Car("Lada ", "Granta ", 1.7, " Yellow ", 2015, " Russia");
        Car audi = new Car("Audi ", "A8 50 L TDI quattro ", 3.0, " Black ", 2020, " Germany");
        Car bmw = new Car("BMW ", "Z8 ", 3.0, " Black ", 2021, " Germany");
        Car kia = new Car("Kia ", "Sportage 4th generation ", 2.4, " Red ", 2018, " South Korea");
        Car hyundai = new Car("Hyundai ", "Avante ", 1.6, " Orange ", 2016, " South Korea");

        System.out.println(lada.toString() + "\n" + audi.toString() + "\n" + bmw.toString() + "\n" + kia.toString() + "\n" + hyundai.toString() +  "\n");
    }
}
