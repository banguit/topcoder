/*

Problem Statement
    
One day, Fox Ciel looked at the words "tokyo" and "kyoto" and noticed an unusual property: We can split "tokyo" into "to"+"kyo", and then swap those two parts to obtain "kyo"+"to" = "kyoto".  Formally, let S and T be two different strings. We call the pair (S,T) interesting if there are two non-empty strings A and B such that S = A+B and T = B+A. For example, according to this definition, if S="tokyo" and T="kyoto", then the pair (S,T) is interesting, because we can find A="to" and B="kyo".  You are given a String[] words. Return the number of interesting pairs we can find among the elements of words. Only count each pair once. E.g., ("tokyo","kyoto") and ("kyoto","tokyo") is the same interesting pair.
Definition
    
Class:
FoxAndWord
Method:
howManyPairs
Parameters:
String[]
Returns:
int
Method signature:
int howManyPairs(String[] words)
(be sure your method is public)
Limits
    
Time limit (s):
2.000
Memory limit (MB):
256
Constraints
-
words will contain between 2 and 50 elements, inclusive.
-
Each element of words will contain between 1 and 50 characters, inclusive.
-
Each character in each element of words will be a lowercase letter ('a'-'z').
-
All the elements in words will be pairwise distinct.
Examples
0)

    
{"tokyo", "kyoto"}
Returns: 1
As mentioned in the problem statement, ("tokyo", "kyoto") is an interesting pair.
1)

    
{"aaaaa", "bbbbb"}
Returns: 0
("aaaaa", "bbbbb") is not an interesting pair.
2)

    
{"ababab","bababa","aaabbb"}
Returns: 1
There is one interesting pair: ("ababab","bababa"). Note that for this interesting pair there is more than one way to choose the strings A and B.
3)

    
{"eel", "ele", "lee"}
Returns: 3

4)
    
{"aaa", "aab", "aba", "abb", "baa", "bab", "bba", "bbb"}
Returns: 6

5)
    
{"top","coder"}
Returns: 0
Different elements of words may have different lengths.

*/

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
