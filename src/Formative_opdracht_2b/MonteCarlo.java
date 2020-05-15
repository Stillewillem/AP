package Formative_opdracht_2b;

public class MonteCarlo {

    public MonteCarlo(){
    }

    public static void main(String[] args) {
        Node s0 = new Node("s0", 0.5), s1 = new Node("s1", 0.5),
                s2 = new Node("s2", 0.5), s3 = new Node("s3", 0.5),
                s4 = new Node("s4", 0.5), s5 = new Node("s5", 0.5),
                s6 = new Node("s6", 0.5);
        s0.setNextNodes(s1, s2);
        s1.setNextNodes(s3, s4);
        s2.setNextNodes(s5, s6);
        s3.setNextNodes(s1, null);
        s3.setSides("een", null);
        s6.setNextNodes(s2, null);
        s6.setSides("zes", null);
        s4.setSides("twee", "drie");
        s5.setSides("vier", "vijf");
        s0.getNextState();
    }
}
