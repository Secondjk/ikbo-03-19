package ru.mirea.practices.pr16;

public final class Drink implements Item {
    private final int price;
    private final String name, description;

    public Drink(String name, String description, int price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Drink{" +
                "price=" + price +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
