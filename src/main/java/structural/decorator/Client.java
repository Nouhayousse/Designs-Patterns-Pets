package structural.decorator;

public class Client {
   public static void main(String[] args) {
       Drink drink = new Espresso();
       drink = new MilkDecorator(drink);
       drink=new CaramelDecorator(drink);
       drink=new CaramelDecorator(drink);

       System.out.println(drink.description());
       System.out.println(drink.cost() + "MAD");


       Drink tea = new MilkDecorator(new Tea());
       System.out.println(tea.description()+" : "+ tea.cost()+" MAD ");


   }
}
