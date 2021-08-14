package com.aca.week6.Class11;

import java.util.Objects;

public final class Order<T> implements Comparable<T> {

    // int price
    // string to

    // Order[10] - find biggest order

    private final Integer price;
    private final String recipient;

    public Order(final Integer price, final String recipient) {
        this.price = price;
        this.recipient = recipient;
    }

    public Integer getPrice() {
        return price;
    }

    public String getRecipient() {
        return recipient;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof Order))
            return false;
        Order order = (Order) o;

        return Objects.equals(getPrice(), order.getPrice())
                && Objects.equals(getRecipient(), order.getRecipient());

    }


    @Override
    public int hashCode() {
        return Objects.hash(price, recipient);
    }

    public Order findBiggestOrder(Order orders[]) {
        Integer max = Integer.MIN_VALUE;
        int index = -1;
        for(int i = 0; i < orders.length; i++) {
            if(orders[i].getPrice() > max) {
                max = orders[i].getPrice();
                index = i;
            }
        }
        return orders[index];
    }
    // o1 o2
    // returns boolean
    // compares o1 with o2

    @Override
    public int compareTo(T o)  {

//        if(!(o instanceof Order)) {
//            throw new OrderCastException("Order's compareTo method should be compared with an instance of Order");
//        }

        Order order = (Order) o;

        int res = getPrice().compareTo(order.getPrice());
        if(res == 0) {
            return getRecipient().compareTo(order.getRecipient());
        }

        return res;
    }

    @Override
    public String toString() {
        return "Order{" +
                "price=" + price +
                ", recipient='" + recipient + '\'' +
                '}';
    }

    // if consistent with equals=>same
    public static void main(String[] args) {
        String s1 = "abcd";
        String s2 = "bcde";

        System.out.println(s1.compareTo(s2));
    }
}
