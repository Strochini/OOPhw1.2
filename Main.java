import transport.Car;
import transport.Car.Insurance;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Main {
    public static void main(String[] args) {
        Car lada = new Car("Lada", "Granta", 1.7, "Yellow", 2015,
                "Russia", "Manual", "Sedan", "e123xa777", 5,
                "Winter tires", new Insurance("22.12.2022", 25000.40, "123456789"));
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.0, "Black", 2020,
                "Germany", "Auto", "Sedan", "a765aa999", 5,
                "Summer tires", new Insurance("30.03.2020", 8500, "845321876"));
        Car bmw = new Car("BMW", "Z8", 3.0, "Black", 2021,
                "Germany", "Manual", "Coupe", "h456aa888", 2,
                "Winter tires", new Insurance("05.01.2019", 6250.50, "685215750"));
        Car kia = new Car("KIA", "Sportage 4th generation", 2.4, "Red", 2018,
                "South Korea", "Auto", "Universal", "x333xx333", 6,
                "Summer tires", new Insurance("17.12.2021", 7800.45, "952176258"));
        Car hyundai = new Car("Hyundai", "Avante", 1.6, "Orange", 2016,
                "South Korea", "Manual", "Sedan", "l987gh654", 5,
                "Winter tires", new Insurance("12.07.2022", 7800, "62478520"));

        hyundai.setRegNum("c026am178");

        System.out.println(lada + "Insurance info: " + "\n\n" + audi + "\n" + bmw + "\n" + kia +
                "\n" + hyundai);

        System.out.println(LocalDate.now());

        LocalDate today = LocalDate.now();
        String formattedDate = today.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));
        System.out.println(formattedDate);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate startDate = LocalDate.parse("28.01.2009", formatter);
        LocalDate endDate = LocalDate.parse("05.03.2013", formatter);
        Period period = Period.between(startDate, endDate);
        System.out.println(period.getYears());

       // System.out.println(hyundai.getInsuranceCost());

    }
}
