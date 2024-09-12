/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author umar
 */
public class Lab02_task4 {
    

    public int mostWordsFound(String[] sentences) {
        int maxWords = 0;
        
        for (String sentence : sentences) {
            String[] words = sentence.split(" ");
            int wordCount = words.length;
            maxWords = Math.max(maxWords, wordCount);
        }
        return maxWords;
    }
    public static void main(String[] args) {
        String[] sentences = {
            "I Love My Mom",
            "java is very logistic Language",
            "Coding is passion"
        };
        
        Lab02_task4 solution = new Lab02_task4();
        int result = solution.mostWordsFound(sentences);
        System.out.println(result); 
    
}
}
