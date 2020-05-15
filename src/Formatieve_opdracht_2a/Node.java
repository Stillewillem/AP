package Formatieve_opdracht_2a;

public class Node {

    String node;
    Node nextNode1;
    Node nextNode2;

    public Node(String node){
        this.node = node;
    }

    public void setNextNodes(Node nextNode1, Node nextNode2) {
        this.nextNode1 = nextNode1;
        this.nextNode2 = nextNode2;
    }

    public Node getNextNode(String input, int times){
        System.out.println(node);

        if (times == input.length()) {
            System.exit(0);
        }
        if (input.charAt(times) == 'A'){
            return nextNode1;
        }
        if (input.charAt(times) == 'B'){
            return nextNode2;
        }
        return null;
    }

    @Override
    public String toString() {
        return "Er is iets mis gegaan";
    }
}
