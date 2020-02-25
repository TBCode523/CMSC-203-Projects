package _solution;

import javax.swing.*;
import java.util.Random;
import java.util.Scanner;

public class Birthday {

    public static void main(String[] args) {
        // write your code here
        boolean a = false;
        int age;
        String name;
        String toyChoice;
        String input;


        name = JOptionPane.showInputDialog(null, "What is the name of your child?");


        age = Integer.parseInt(JOptionPane.showInputDialog(null, "How old is the child?"));

        toyChoice = JOptionPane.showInputDialog(null, "What kind of toy do you want(blocks, plushie, book)?");

        Toy toy = new Toy(toyChoice, age);
        if (toy.ageOK() == false) {

            String str;
            str = JOptionPane.showInputDialog("The age seems inappropriate for the toy, do you want to change it(Y/N)?");

            while (str.equalsIgnoreCase("y")) {
                name = JOptionPane.showInputDialog(null, "What is the name of your child?");
                age = Integer.parseInt(JOptionPane.showInputDialog(null, "How old is the child?"));
                toy.setAge(age);
                toyChoice = JOptionPane.showInputDialog(null, "What kind of toy do you want(blocks, plushie, book)?");

                toy.setToy(toyChoice);
                str = JOptionPane.showInputDialog(null, "Would you like to change your order again(Y/N)?");

            }
        }
        JOptionPane.showMessageDialog(null, "This is your order for " + name + " at age " + toy.getAge() + ": " + toy.getToy() + " for $" + toy.getCost());
        input = JOptionPane.showInputDialog(null, "Would you like to add a card or balloon(Y/N)?");

        if (input.equalsIgnoreCase("y")) {
            input = JOptionPane.showInputDialog(null, "Card or Balloon(C/B)?");


            switch (input.toUpperCase()) {
                case "C":
                    toy.addCard("yes");
                    break;
                case "B":
                    toy.addBalloon("yes");
                    break;
                default:
                    break;
            }

        }
        int random = (int)(Math.random() * 100000 +1);
        JOptionPane.showMessageDialog(null, "This is your final order: \n Order #:" + random + "\n Name and Product: " +
       name + toy.toString()  );

        JOptionPane.showMessageDialog(null, "Thank you for using Talal Breks Toy Shop! \n");

    }
}
