package com.aca.week2.Homework01;

public class SentenceTest {

    public static void main(String[] args) {
        Sentence firstSentence = new Sentence();
        firstSentence.append("Hello");
        firstSentence.append("my");
        firstSentence.append("name");
        firstSentence.append("is");

        String str = firstSentence.getValue();
        System.out.print("getValue method returns a String: ");
        System.out.println(str);

        System.out.println("getWordsCount returns: " + firstSentence.getWordsCount());

        firstSentence.append("Elen");
        System.out.println("getValue returns a new String: " + firstSentence.getValue());

        firstSentence.append("Babayan");
    }
}
