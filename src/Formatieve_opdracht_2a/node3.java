package Formatieve_opdracht_2a;

public class node3 {

    public node3(String input, int times){
        System.out.println("S3");

        if (times < input.length()) {
            char ch = input.charAt(times);

            if (ch == 'A') {
                new node3(input, (times + 1));
            }
            if (ch == 'B') {
                new node0(input, (times + 1));
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
