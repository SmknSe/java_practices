package practice12_15.n3;

public class Shirt {
    String id;
    String model;
    String size;
    String color;

    public Shirt() {
    }

    public Shirt(String id, String model, String size, String color) {
        this.id = id;
        this.model = model;
        this.size = size;
        this.color = color;
    }

    public static Shirt fromStr(String s){
        String[] tmp = s.split(",");
        Shirt shirt = new Shirt();
        shirt.id = tmp[0];
        shirt.model=tmp[1];
        shirt.color=tmp[2];
        shirt.size=tmp[3];
        return shirt;
    }

    @Override
    public String toString() {
        return "id='" + id + '\n' +
                "model='" + model + '\n' +
                "size='" + size + '\n' +
                "color='" + color;
    }
}
