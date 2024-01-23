/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package leetcodeex1;

/**
 *
 * @author PAVILION
 */
public class LeetCodeEx1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String word1="abc";
        String word2="pqr";
        int longerWord;
        String mergeWord="";
        char letter1='a';
        char letter2='a';
        if(word1.length()>word2.length()){
            longerWord=word1.length();
        }else{
            longerWord=word2.length();
        }
        for (int i = 0; i < longerWord; i++) {
            if(word1.length()>i){
                letter1=word1.charAt(i);
            }
            if (word2.length() > i) {
                letter2=word2.charAt(i);
            }
            mergeWord=mergeWord+letter1+letter2;
        }
        System.out.println(mergeWord);
    }
}
