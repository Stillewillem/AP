package Formatieve_opdracht_2a;

public class node0 {

    public node0(String input, int times){
        System.out.println("S0");

        if (times < input.length()) {

            char ch = input.charAt(times);

            if (ch == 'A') {
                new node2(input, (times + 1));
            }
            if (ch == 'B') {
                new node1(input, (times + 1));
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
