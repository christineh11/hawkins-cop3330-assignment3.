package ex46;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

class HistogramItemTest {
   public HashMap<String, Integer> map;

    public void HistogramItem(HashMap<String, Integer> map) {


        this.map = map;

    }
    @Test
    void print() {

        String keys[] = new String[map.size()];

        Integer counter[] = new Integer[map.size()];

        int k=0;

        // iterate map

        for (Map.Entry<String, Integer> entry : map.entrySet()) {

            keys[k] = entry.getKey();

            counter[k++] = entry.getValue();

        }

        // declare another arrays of String and Integer to Store values

        int tcounter[] = new int[map.size()];

        String tkeys[] = new String[map.size()];

        // duplicate values arrays to tempvalues

        for(int i=0;i<counter.length;i++) {

            tcounter[i] = counter[i];

        }


        // word with most iterations on top

        Arrays.sort(counter, Collections.reverseOrder());


        // sort keys array according to values array and store in tempkeys

        for(int i=0; i<map.size();i++) {

            int value = counter[i];

            for(int j=0; j<tcounter.length;j++) {

                if(value == tcounter[j]) {

                    tkeys[i] = keys[j];

                    break;

                }

            }

        }

        System.out.println();

        // print histogram

        for(int i=0;i<map.size();i++) {

            int value = map.get(tkeys[i]);


            System.out.print(tkeys[i]+" : \t");

            // marks * for each time word is iterated in file
            for(int j=0; j<value; j++) {

                System.out.print("*");

            }

            System.out.println();

        }


    }


}