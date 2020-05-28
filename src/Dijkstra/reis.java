package Dijkstra;

import java.util.List;
import java.util.PriorityQueue;

public class reis{

    PriorityQueue<comparable.Node> pq;

    public reis(){
        this.pq = new PriorityQueue<>();
    }

    public void dijkstra(comparable.Node begin, comparable.Node end){
        pq.add(begin);
        comparable.Node node = pq.peek();

        while (node != end) {
            assert node != null;
            for (comparable.Node sNode: node.nextNode) {
                if (sNode.cost != 0){
                    if (sNode.cost > (node.weight.get(node.nextNode.indexOf(sNode)) + node.cost)) {
                        pq.remove(sNode);
                        sNode.node = node;
                        sNode.cost = node.weight.get(node.nextNode.indexOf(sNode)) + node.cost;
                        pq.add(sNode);
                    }
                }
                else {
                    sNode.node = node;
                    sNode.cost = node.weight.get(node.nextNode.indexOf(sNode)) + node.cost;
                    pq.add(sNode);
                }
            }
            pq.remove(node);
            node = pq.peek();
        }

        System.out.println(node.cost + node.node.name);
    }

    public static void main(String[] args) {
        // Graph opzetten
        comparable.Node nodeA = new comparable.Node("A"), nodeB = new comparable.Node("B"), nodeC = new comparable.Node("C"),
                nodeD = new comparable.Node("D"), nodeE = new comparable.Node("E"), nodeF = new comparable.Node("F");
        nodeA.setVariables(List.of(nodeB, nodeC), List.of(10, 15));
        nodeB.setVariables(List.of(nodeE, nodeD), List.of(15, 12));
        nodeC.setVariables(List.of(nodeF), List.of(10));
        nodeD.setVariables(List.of(nodeE, nodeF), List.of(1, 2));
        nodeE.setVariables(List.of(nodeF), List.of(5));

        // Dijkstra starten
        reis reis = new reis();
        reis.dijkstra(nodeA, nodeF);
    }
}