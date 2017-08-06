package com.meryemalay;

public class Utilities  {

    // Returns a char array containing every nth char. When
    // sourceArray.length < n, returns sourceArray
    public char[] everyNthChar(char[] sourceArray, int n){

        if(sourceArray == null || sourceArray.length < n){
            return sourceArray;
        }

        int returnedLenght = sourceArray.length / n;
        char[] result = new char[returnedLenght];
        int index = 0;

        for (int i = 0; i < sourceArray.length; i++) {
            result[index++] = sourceArray[i];
        }

        return result;
    }


    // Removes pairs of teh same character that are next
    // to each other, by removing on an accurrenced of the character.
    // "ABBCDEEF" -> "ABCDEF"
    // "ABCBDEEF" -> "ABCBDEF" (the two B's aren't next to each other, so they)
    public String removePairs(String source){

        // If length is less than 2, there won't be any pairs
        if(source.length() <2){
            return source;
        }

        StringBuilder sb = new StringBuilder();
        char[] strings = source.toCharArray();

        for (int i = 0; i < strings.length -1 ; i++) {
            if(strings[i] != strings[i+1]){
                sb.append(strings[i]);
            }
        }

        // Add the final character, which is always safe
        sb.append(strings[strings.length-1]);

        return sb.toString();
    }

    // perform a conversion based on some internal
    // business rule.
    public int converter(int a, int b){
        return (a/b) + (a*30) -2;
    }

    public String nullIfOddLength(String source){
        if(source.length() % 2 ==0){
            return source;
        }
        return null;
    }
}
