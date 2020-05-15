package Summative_opdracht_2;

import java.util.List;

public class finiteStateMachine {

    public finiteStateMachine(){}

    public static void main(String[] args) {
        finiteStateMachine FSM = new finiteStateMachine();
        FSM.firstTest();
        FSM.secondTest();
    }

    public void firstTest(){
        // Eerste test
        System.out.println("\nEerste test");

        //Nodes creëren
        Node s0 = new Node("s0"), s1 = new Node("s1"), s2 = new Node("s2"), s3 = new Node("s3"), s4 = new Node("s4");
        s0.setVariables(List.of(s1, s2, s3), List.of('A', 'B', 'C'), null, null);
        s1.setVariables(List.of(s2, s4), List.of('C', 'B'), null, null);
        s2.setVariables(List.of(s0, s4, s1, s2), List.of('B', 'D', 'C', 'A'), null, null);
        s3.setVariables(List.of(s1, s3, s4), List.of('A', 'B', 'C'), null, null);
        s4.setVariables(List.of(s0), List.of('A', 'B', 'C'), null, List.of("Einde", "Nog een ander einde"));

        // FSM starten
        int index = 0;
        Node nextNode = s0;
        while (nextNode != null){
            nextNode = nextNode.getNextNodeCh("BDACCB", index);
            index += 1;
        }
    }

    public void secondTest(){
        // Tweede test
        System.out.println("\nTweede Test");

        // Nodes opbouwen
        Node s0 = new Node("s0"), s1 = new Node("s1"), s2 = new Node("s2"), s3 = new Node("s3"), s4 = new Node("s4");
        s0. setVariables(List.of(s1, s2, s3), null, List.of(0.3, 0.2, 0.5), null);
        s1.setVariables(List.of(s0, s4), null, List.of(0.4, 0.6), null);
        s2.setVariables(List.of(s1, s3, s4), null, List.of(0.4, 0.2, 0.4), null);
        s3.setVariables(List.of(s0), null, List.of(0.1, 0.3, 0.3, 0.3), List.of("Vijf", "Drie", "Een"));
        s4.setVariables(List.of(s1, s2, s3), null, List.of(0.3, 0.5, 0.2), null);

        // FSM starten
        Node nextNode = s0;
        while (nextNode != null) {
            nextNode = nextNode.nextState();
        }
    }
}
