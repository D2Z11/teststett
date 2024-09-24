public class Main {
    public static void main(String[] args) {
        ChatBot debbie = new ChatBot("chatgpt", 42);
        debbie.greeting("John");
        System.out.println(debbie.addNumbers(2, 4, 3));
        System.out.println(debbie.convertFeetToMeters(12));
        debbie.weather();
        debbie.favoriteNumber(3);
        System.out.println(debbie.goodbye());
        System.out.println(debbie.tellMe());
        System.out.println("The fruit of the day is: " + debbie.oneFruit());
        System.out.println("Pi to the random power is: " + debbie.piPower());
        debbie.power();
    }
}
