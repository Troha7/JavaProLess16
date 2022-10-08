package ua.hillelit.lms.coffee.order;

import java.util.Objects;

public class Order implements Comparable<Order> {

  private final Integer num;
  private final String name;

  public Order(Integer num, String name) {
    this.num = num;
    this.name = name;
  }

  @Override
  public String toString() {
    return num + " | " + name + "\n";
  }

  public Integer getNum() {
    return num;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    Order order = (Order) o;

    return Objects.equals(num, order.num);
  }

  @Override
  public int hashCode() {
    int result = num != null ? num.hashCode() : 0;
    result = 31 * result + (name != null ? name.hashCode() : 0);
    return result;
  }

  @Override
  public int compareTo(Order o) {
    return this.num - o.num;
  }
}
