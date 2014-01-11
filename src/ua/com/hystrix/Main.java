package ua.com.hystrix;

public class Main {

    public static void main(String[] args) {
        FoxAndWord foxAndWord = new FoxAndWord();
        System.out.println(foxAndWord.howManyPairs(new String[] {"aaa", "aab", "aba", "abb", "baa", "bab", "bba", "bbb"}));
    }
}
