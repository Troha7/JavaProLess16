package ua.hillelit.lms.coffee.order;

public class Main {

  public static void main(String[] args) {

    CoffeeOrderBoard.add(new Order(34, "John Snow"));
    CoffeeOrderBoard.add(new Order(33, "Obi-van"));
    CoffeeOrderBoard.add(new Order(14, "Alen"));
    CoffeeOrderBoard.add(new Order(27, "Yoda"));
    CoffeeOrderBoard.add(new Order(19, "Darth Vader"));

    CoffeeOrderBoard.deliver();

    CoffeeOrderBoard.deliver(34);

    CoffeeOrderBoard.draw();

  }

}
