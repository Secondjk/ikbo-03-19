package ru.mirea.labs.lab16;

import java.util.Arrays;

public class TableOrdersManager implements OrdersManager {
    Order[] orders = new Order[10];

    @Override
    public int itemsQuantity(String itemName) {
        int count = 0;
        for (Order order : orders)
            count += order.itemQuantity(itemName);
        return count;
    }

    @Override
    public int itemsQuantity(MenuItem item) {
        return itemsQuantity(item.getName());
    }

    @Override
    public Order[] getOrders() {
        return orders;
    }

    @Override
    public int ordersCostSummary() {
        return Arrays.stream(getOrders())
                .mapToInt(Order::costTotal)
                .sum();
    }

    @Override
    public int ordersQuantity() {
        return orders.length;
    }

    public void add(Order order, int tableNumber) {
        orders[tableNumber] = order;
    }

    public void addItem(MenuItem item, int tableNumber) {}

    public int freeTableNumber() {
        return 0;
    }

    public int[] freeTableNumbers() {
        return new int[0];
    }

    public Order getOrder(int tableNumber) {
        return orders[tableNumber];
    }

    void remove(int tableNumber) {}

    int remove(Order order) {
        return 0;
    }

    int removeAll(Order order) {
        return 0;
    }
}