package Formatieve_opdracht_2a;

public class node2 {

    public node2(String input, int times){
        System.out.println("S2");

        if (times < input.length()) {
            char ch = input.charAt(times);

            if (ch == 'B') {
                new node3(input, (times + 1));
            } else {
                toString();
            }
        }

        else{
            System.out.println("Klaar");
            System.exit(0);
        }
    }

    @Override
    public String toString() {
        System.out.println("er is iets misgegaan");
        System.exit(0);
        return null;
    }
}
