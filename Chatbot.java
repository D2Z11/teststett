import java.io.*;
import java.util.Random;
import java.util.List;
import java.util.ArrayList;

public class ChatBot {
    // instance variables
    private String name;
    private int number;

    // constructor
    public ChatBot(String chatBotName, int faveNum) {
        name = chatBotName;
        number = faveNum;
    }

    // void method that prints a greeting
    public void greeting(String yourName) {
        System.out.println("Hello, " + yourName + " my name is " + name); // name is an instance variable
        System.out.println("and I am a chat bot! How are you today?");
    }

    // void method that prints the weather
    public void weather() {
        System.out.println("I actually don't know much about the weather! Ha ha!");
        System.out.println("But I know it's warm and dry inside a computer! Ha ha!");
    }

    // method that converts feet to meters and returns the meters
    public double convertFeetToMeters(int numFeet) {
        final double METERS_PER_FOOT = 0.3048;
        return METERS_PER_FOOT * numFeet;
    }

    // void method that prints information about favorite numbers
    public void favoriteNumber(int yourNumber) {
        int distance = yourNumber - number; // number is an instance variable
        System.out.println("My favorite number is " + number);
        System.out.println("That is " + distance + " away from your number!");
    }

    // method that adds and returns the sum of three numbers
    public int addNumbers(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    // method that returns a goodbye message -- note that this method does not print
    // a string, but
    // rather RETURNS a string
    public String goodbye() {
        return "It was nice talking with you! Have a great day! Sincerely, " + name;
    }

    public void destroyTheWorld() {
        System.out.println("Goodbye World!");
    }

    public int explainTheMeaningOfLife(){
        return (int) (Math.PI * Math.random() * 5);
    }

    public String tellMe() {
        String sum = "";
        for (int i = 0; i < 20; i++) {
            sum += Character.toString((char) (Math.floor(Math.random() * 121)));
        }
        return sum;
    }
    
    public String oneFruit() {
        List<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("cherry");
        fruits.add("pear");
        fruits.add("mango");
        fruits.add("pineapple");
        fruits.add("watermelon");
        fruits.add("strawberry");
        Random random = new Random();
        String randomFruit = fruits.get(random.nextInt(fruits.size()));
        return randomFruit;
    }
    public double piPower() {
        public int power = Math.floor(Math.random() * 10);
        return (double) Math.pow(Math.Pi(), power);
    }
    public void power() {
    System.out.println("The Pi was going to the " + power + " power.");
    }
}
