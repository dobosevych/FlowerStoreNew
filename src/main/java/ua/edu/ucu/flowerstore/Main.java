package ua.edu.ucu.flowerstore;

public class Main {
    public static void main(String[] args) {
        Flower rose = new Flower(100, FlowerColor.RED, 100, FlowerType.ROSE);
        FlowerPack flowerPack = new FlowerPack(rose, 11);
        System.out.println(flowerPack.getPrice());
        rose.setPrice(80);
        System.out.println(flowerPack.getPrice());

    }
}