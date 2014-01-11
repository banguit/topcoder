package ua.com.hystrix;

import java.util.ArrayList;
import java.util.List;

public class FoxAndWord {
    public int howManyPairs(String[] words) {
        int result = 0;
        List<String> pairs = new ArrayList<String>();

        for(int i = 0; i < words.length; i++) {
            String wordA = words[i];

            for(int j = i + 1; j < words.length; j++) {
                String wordB = words[j];
                if(!pairs.contains(wordA + " " + wordB)) {
                    if(wordA.length() == wordB.length()) {
                        for(int k = 0; k < wordA.length(); k++) {
                            String partOne = wordA.substring(0, k);
                            String partTwo = wordA.substring(k, wordA.length());

                            if((partTwo + partOne).equals(wordB)) {
                                pairs.add(wordA + " " + wordB);
                                result++;
                            }
                        }
                    }
                }
            }
        }
        return result;
    }
}
