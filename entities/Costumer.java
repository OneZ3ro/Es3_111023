package entities;

import java.util.Random;

public class Costumer {
    private long id;
    private String name;
    private int tier;

    public Costumer(String name) {
        Random rndm = new Random();
        this.name = name;
        this.tier = 1;
        this.id = rndm.nextInt(3000, 4000);
    }

    @Override
    public String toString() {
        return "Costumer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", tier=" + tier +
                "}";
    }
}
