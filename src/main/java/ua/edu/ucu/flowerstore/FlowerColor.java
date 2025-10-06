package ua.edu.ucu.flowerstore;

public enum FlowerColor {
    RED("#FF0000"), GREEN("#008000"), WHITE("#FFFFFF");
    
    private String hexColor;

    FlowerColor(String hexColor) {
        this.hexColor = hexColor;
    }

    @Override
    public String toString() {
        return hexColor;
    }
}
