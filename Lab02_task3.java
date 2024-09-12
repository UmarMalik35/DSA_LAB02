/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author umar
 */
public class Lab02_task3 {
public static int maxWords(String[] sentences) {
        int maxWords = 0; 

        
        for (String sentence : sentences) { 
            String[] words = sentence.split(" "); 
            maxWords = Math.max(maxWords, words.length);
        }

        return maxWords; 
    }
    public static void main(String[] args) {
        
        String[] sentences = {
            "alice and bob love leetcode", 
            "i think so too", 
            "this is great thanks very much"
        };

        
        int result = maxWords(sentences); 

        
        System.out.println("The maximum number of words in a single sentence is: " + result);  // Output: 6
    }

        
}
