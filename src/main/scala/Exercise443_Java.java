package com.melifaro;

public class Exercise443_Java {

    public static int compress(char[] chars) {

        int index = 0;
        int counter = 1;
        for (int i = 1; i < chars.length+1; i++) {
            if ((i < chars.length)&&(chars[i] == chars[i-1])) {
                counter++;
            } else {
                chars[index] = chars[i-1];
                index++;
                if (counter > 1) {
                    for (char c : Integer.toString(counter).toCharArray()) {
                        chars[index] = c;
                        index += 1;
                    }
                }
                counter = 1;
            }
        }

        return index;
    }

    public static void main(String[] args) {
        char[] chars = new char[] { 'a', 'a', 'a', 'b', 'b', 'c', 'c', 'c', 'c', 'c', 'c' };
//        char[] chars = new char[] { 'a', 'b', 'b', 'c', 'c', 'c', 'c', 'c', 'c' };
//        char[] chars = new char[] { 'a', 'b', 'c' };
//        char[] chars = new char[] { 'a'};
        int count = compress(chars);
        System.out.println(chars);
        System.out.println(count);
    }
}
