package practice12_15.n2;

public class Main {
    public static void main(String[] args) {
        Adress address = new Adress();

        address.separate("COUNTRY, REGION, CITY, STREET, HOUSE, BUILDING, APARTMENT");
        System.out.println(address);

        address.separate("COUNTRY, REGION: CITY, STREET. HOUSE- BUILDING/ APARTMENT");
        System.out.println(address);
    }
}
