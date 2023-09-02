package edu.pizza;

import edu.pizza.base.Pizza;
import edu.pizza.base.Topping;
import edu.pizza.especialidades.PizzaItaliana;
import edu.pizza.interfaces.PizzaBase;

public class Main {
    public static void main(String[] args) {
//        // Ejercicio 1
//        Pizza pizza = new Pizza("Pizza Margherita", 10.99);
//        pizza.addTopping(new Topping("Tomato"));
//        pizza.addTopping(new Topping("Mozzarella"));
//        pizza.addTopping(new Topping("Basil"));
//        pizza.prepare();

        // Ejercicio 2
        PizzaItaliana pit1 = new PizzaItaliana("Italiana 1", "Cheddar");
        pit1.addTopping(new Topping("Pepperoni", 20.0));
        pit1.addTopping(new Topping("Cebolla", 5.0));
        pit1.addTopping(new Topping("Champiñiones", 25.0));
        pit1.prepare();
        System.out.println("Salsa de la pizza: " + pit1.getSalsa());
        System.out.println("Precio de la pizza: Q" + pit1.getPrice());

//        // Ejercicio 3
//        PizzaBase PB1 = new PizzaBase("Pizza Base 1", 10.50);
//        PB1.prepare();
    }
}