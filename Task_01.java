/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author umar
 */
public class Task_01 {
    public static int[] contArray(int nums[]){
        int len = nums.length;
        int arr[] = new int [len*2];
        for(int i=0; i<len; i++){
        arr[i] = nums[i];
        arr[i+len] = nums[i];
          
        }
        return arr;
    
    }

    public static void main(String[] args) {
     
        int [] input = {1,2,3,4,5};
        int [] res = contArray(input);
        for(int i=0; i<res.length; i++){
        System.out.print(res[i]+" ");
        }
    }
}
