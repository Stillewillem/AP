package Summative_opdracht_2;

import java.util.List;

public class finiteStateMachine {

    public static void main(String[] args) {
        // Eerste test
        Node s0 = new Node("s0"), s1 = new Node("s1"), s2 = new Node("s2"), s3 = new Node("s3"), s4 = new Node("s4");
        s0.setVariables(List.of(s1, s2, s3), List.of('A', 'B', 'C'), null, null);
        s1.setVariables(List.of(s2, s4), List.of('C', 'B'), null, null);
        s2.setVariables(List.of(s0, s4, s1, s2), List.of('B', 'D', 'C', 'A'), null, null);
        s3.setVariables(List.of(s1, s3, s4), List.of('A', 'B', 'C'), null, null);
        s4.setVariables(List.of(s0), List.of('A', 'B'), null, List.of("Einde"));
        s0.NextNodeCh("BDACCB", 0);

    }
}
