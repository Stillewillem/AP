package Summative_opdracht_2;

import java.util.List;

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

    public void NextNodeCh(String input, int index){
        System.out.println(node);

        if (index == input.length()) {
            System.exit(0);
        }
        if (endNode != null){
            int pos = characters.indexOf(input.charAt(index));
            if (nextNodes.size() > pos){
                nextNodes.get(pos).NextNodeCh(input, index + 1);
            }
            else {
                System.out.println(endNode.get(pos));
                System.exit(0);
            }
        }
        if (characters.contains(input.charAt(index))){
            int pos = characters.indexOf(input.charAt(index));
            nextNodes.get(pos).NextNodeCh(input, index + 1);
        }
    }
}
