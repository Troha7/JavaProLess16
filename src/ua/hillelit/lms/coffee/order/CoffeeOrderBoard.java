package ua.hillelit.lms.coffee.order;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CoffeeOrderBoard {

  private static final List<Order> orderList = new ArrayList<>();

  public static void add(Order order) {
    if (orderList.contains(order) || order.getNum() == null) {
      throw new IllegalArgumentException("Invalid input Order num!");
    }
    try {
      orderList.add(order);
    } catch (IllegalArgumentException e) {
      e.printStackTrace();
    }
    Collections.sort(orderList);
  }

  public static void deliver() {
    orderList.remove(0);
  }

  public static void deliver(Integer num) {
    for (Order order : orderList) {
      if (order.getNum().equals(num)) {
        orderList.remove(order);
        break;
      }
    }
  }

  public static void draw() {
    String title = "Num | Name\n";
    StringBuilder orderValues = new StringBuilder();

    for (Order order : orderList) {
      orderValues.append(order);
    }

    System.out.println(title + orderValues);
  }

}
