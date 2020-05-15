package Formative_opdracht_2b;

import java.util.Random;

public class Node {

    String node;
    Node nextNode1;
    Node nextNode2;
    double probability;
    String side1;
    String side2;


    public Node(String node, double probability){
        this.node = node;
        this.probability = probability;
    }

    public void setNextNodes(Node nextNode1, Node nextNode2){
        this.nextNode1 = nextNode1;
        this.nextNode2 = nextNode2;
    }

    public void setSides(String side1, String side2){
        this.side1 = side1;
        this.side2 = side2;
    }

    public void getNextState(){
        Random rand = new Random();
        double random = rand.nextDouble();

        if (nextNode1 != null){
            getNextNode(random);
        }

        if (side1 != null){
            getSide(random);
        }

        if (side2 == null || nextNode2 == null){
            getNextNodeSide(random);
        }
    }

    public void getNextNodeSide(double random){
        if (random < probability){
            nextNode1.getNextState();
        }
        if (random >= probability){
            System.out.println(side1);
        }
    }

    public void getNextNode(double random){
        if (random < probability){
            nextNode1.getNextState();
        }
        if (random >= probability){
            nextNode2.getNextState();
        }
    }

    public void getSide(double random){

        if (random < probability){
            System.out.println(side1);
            System.exit(0);
        }
        if (random >= probability){
            System.out.println(side2);
            System.exit(0);
        }
    }
}
