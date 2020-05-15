package Summative_opdracht_2;

import java.util.List;
import java.util.Random;

public class Node {

    String node;
    List<Node> nextNodes;
    List<Character> characters;
    List<Double> probability;
    List<String> endNode;

    public Node(String node){
        this.node = node;
    }

    public void setVariables(List<Node> nextNodes, List<Character> characters, List<Double> probability, List<String> endNode){
        this.nextNodes = nextNodes;
        this.characters = characters;
        this.probability = probability;
        this.endNode = endNode;
    }

    public Node getNextNodeCh(String input, int index){
        System.out.println(node);

        if (index == input.length()) {
            System.out.println("The end");
            return null;
        }
        if (endNode != null){
            int pos = characters.indexOf(input.charAt(index));
            if (nextNodes.size() > pos){
                return nextNodes.get(pos);
            }
            else {
                System.out.println(endNode.get(pos - 1));
                return null;
            }
        }
        if (characters.contains(input.charAt(index))){
            int pos = characters.indexOf(input.charAt(index));
            return nextNodes.get(pos);
        }
        return null;
    }

    public Node nextState(){
        System.out.println(node);

        Random rand = new Random();
        double random = rand.nextDouble();

        if (endNode != null) {
            double prob = 0;
            for (double i : probability) {
                prob += i;
                if (random <= prob) {
                    int pos = probability.indexOf(i);
                    if (nextNodes.size() > pos) {
                        return nextNodes.get(pos);
                    } else {
                        System.out.println(endNode.get(pos - 1));
                        return null;
                    }
                }
            }
        }

        if (endNode == null){
            double prob = 0;
            for (double i : probability){
                prob += i;
                if (random <= prob){
                    int pos = probability.indexOf(i);
                    return nextNodes.get(pos);
                }
            }
        }
        return null;
    }
}
