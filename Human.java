public class Human {
    int yearOfBirth;
    String name;
    String town;
    String job;

    public Human(String name, String town, int yearOfBirth, String job) {
        if (yearOfBirth >= 0) {
            this.yearOfBirth = yearOfBirth;
            this.name = name;
            this.town = town;
            this.job = job;
        } else {
            this.yearOfBirth = 0;
            this.name = name;
            this.town = town;
            this.job = job;
        }
    }
    public Human(String town, int yearOfBirth, String job) {
        if (yearOfBirth >= 0) {
            this.yearOfBirth = yearOfBirth;
            name = "Default";
            this.town = town;
            this.job = job;
        } else {
            this.yearOfBirth = 0;
            name = "Default";
            this.town = town;
            this.job = job;
        }
    }
    public Human(String name, String town, int yearOfBirth) {
        if (yearOfBirth >= 0) {
            this.yearOfBirth = yearOfBirth;
            this.name = name;
            this.town = town;
            job = "Default";
        } else {
            this.yearOfBirth = 0;
            this.name = name;
            this.town = town;
            job = "Default";
        }
    }
    public Human(int yearOfBirth, String name, String job) {
        if (yearOfBirth >= 0) {
            this.yearOfBirth = yearOfBirth;
            this.name = name;
            town = "Default";
            this.job = job;
        } else {
            this.yearOfBirth = 0;
            this.name = name;
            town = "Default";
            this.job = job;
        }
    }
}