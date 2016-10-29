package Chapter8;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by JobQ on 10/28/2016.
 */
public class Huffman {
    public static void main(String[] args) {
        String s = "SUSIE SAYS IT IS EASYh";
        System.out.println(countFreq(s));


    }
    /**
     * to calculate the frequency of the letter in a sentence
     *
     * @author JobQ
     * */
    public static Map<Character,Integer> countFreq(String string){



        Map<Character,Integer> results = new HashMap<Character,Integer>();
        for (int i = 0; i < string.length(); i++) {
            Character temp = string.charAt(i);
            Integer count;
//            System.out.println(temp);
            if (results.containsKey(temp)){
                count=results.get(temp);
                count++;
                results.replace(temp,count);
            }
            else
                results.put(temp,1);

        }

        return results;
    }
}
