
package leetcodeex1;

public class LeetCodeEx1 {

    public static void main(String[] args) {
        String word1="ab";
        String word2="pqrs";
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
                mergeWord=mergeWord+letter1;
            }
            if (word2.length() > i) {
                letter2=word2.charAt(i);
                mergeWord=mergeWord+letter2;
            }
        }
        System.out.println(mergeWord);
    }
}
