/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author umar
 */
public class Lab02_task6 {
    
    public int countPrimes(int n) {
        if (n <= 2) {
            return 0; 
        }
        
        boolean[] isPrime = new boolean[n];
        for (int i = 2; i < n; i++) {
            isPrime[i] = true;}
        
        
        for (int p = 2; p * p < n; p++) {
            if (isPrime[p]) {
               
                for (int multiple = p * p; multiple < n; multiple += p) {
                    isPrime[multiple] = false;
                }
            }
        }
           int primeCount = 0;
        for (int i = 2; i < n; i++) {
            if (isPrime[i]) {
                primeCount++;
            }
        }
        return primeCount;
    }
    public static void main(String[] args) {
        Lab02_task6 solution = new Lab02_task6();
        int n = 10;
        
        int result = solution.countPrimes(n);
        System.out.println("Number of primes less than " + n + ": " + result); 
    }

}
