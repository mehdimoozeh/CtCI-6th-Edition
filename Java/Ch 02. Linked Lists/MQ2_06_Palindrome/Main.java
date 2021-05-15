package MQ2_06_Palindrome;

import Library.LinkedList;

public class Main {
    public static void main(String args[]) {
        LinkedList sample = new LinkedList();

        sample.insert(sample, "0");
        sample.insert(sample, "1");
        sample.insert(sample, "2");
        sample.insert(sample, "1");
        sample.insert(sample, "0");

        System.out.println(sample.isPalindrome(sample));

        boolean isPalindrome = sample.isPalindrome_RunnerTechnique(sample);
        System.out.println(isPalindrome);
    }
}
