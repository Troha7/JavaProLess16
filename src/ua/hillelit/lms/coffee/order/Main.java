package ua.hillelit.lms.coffee.order;

public class Main {

  public static void main(String[] args) {

    CoffeeOrderBoard orderBoard = new CoffeeOrderBoard();
    orderBoard.add(new Order(34, "John Snow"));
    orderBoard.add(new Order(33, "Obi-van"));
    orderBoard.add(new Order(14, "Alen"));
    orderBoard.add(new Order(27, "Yoda"));
    orderBoard.add(new Order(19, "Darth Vader"));

    orderBoard.deliver();

    orderBoard.deliver(34);

    orderBoard.draw();

  }

}
