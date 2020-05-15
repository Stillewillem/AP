package Formatieve_opdracht_2a;

public class FSM {

    static Node nextNode;
    static int times;
    static String input;

    public static void main(String[] args) {
        Node s0 = new Node("s0"), s1 = new Node("s1"), s2 = new Node("s2"), s3 = new Node("s3");
        s0.setNextNodes(s2, s1);
        s1.setNextNodes(s1, s2);
        s2.setNextNodes(null, s3);
        s3.setNextNodes(s3 ,s0);
        times = 0;
        input = "BAAB";
        nextNode = s0;
        while (times <= input.length()){
            nextNode = nextNode.getNextNode(input, times);
            times = times + 1;
        }
    }
}