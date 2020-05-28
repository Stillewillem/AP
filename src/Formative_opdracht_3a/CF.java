package Formative_opdracht_3a;

import java.util.ArrayList;
import java.util.Random;

public class CF {

    public static void main(String[] args) {
        CF cf1 = new CF();
        ArrayList<Character> randomlist = cf1.getRandomList(9);
        System.out.println(randomlist);
        ArrayList<Character> sortedlist = cf1.getSortedList(randomlist);
        System.out.println(sortedlist);
    }

    public ArrayList<Character> getRandomList(int lenList){
        ArrayList<Character> ch = new ArrayList<>();
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        for (int i = 0; i <= lenList; i = i + 1){
            Random rand = new Random();
            ch.add(alphabet.charAt((rand.nextInt(alphabet.length()))));
        }
        return ch;
    }

    public ArrayList<Character> getSortedList(ArrayList<Character> randomList){
        int n = randomList.size();
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (randomList.get(j) > randomList.get(j + 1))
                {
                    Character temp = randomList.get(j);
                    randomList.set(j, randomList.get(j + 1));
                    randomList.set(j + 1, temp);
                }
        return randomList;
    }
}
