package practice12_15.n2;

public class Adress {
    String country;
    String region;
    String city;
    String street;
    String house;
    String building;
    String apartment;

    public void separate(String s){
        String[] arr = s.split("(, )|(: )|(; )|(. )|(- )");
        country = arr[0];
        region = arr[1];
        city = arr[2];
        street = arr[3];
        house = arr[4];
        building = arr[5];
        apartment = arr[6];
    }

    @Override
    public String toString() {
        return "Adress{" +
                "country='" + country + '\'' +
                ", region='" + region + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", house='" + house + '\'' +
                ", building='" + building + '\'' +
                ", apartment='" + apartment + '\'' +
                '}';
    }
}
