package com.lambton;

import java.util.Arrays;

public class StringsExample {
    public static void main(String[] args) {
//        char a = 'a';
//        int ch = a;
//        Float b = 100.0F;
////        System.out.println(b.intValue());
//
//        String s = "A";
//        System.out.println(s);
//
//        String s1 = "Hello";
//        String s8 = "Hello";
//        String s2 = "world";
//
//        String s5 = new String(s2);
//        String s6 = new String();
//        s6 = "world";
//
////        System.out.println(s5);
////        System.out.println(s5 == s2);
////        System.out.println(s1 == s8);
////
////        System.out.println(s5.equals(s2));
//
//        System.out.println(s1.charAt(4));
//        System.out.println(s1.codePointAt(4));
//        System.out.println(s1.compareTo("Hello"));
//        System.out.println(s1.concat(" world"));
//        System.out.println(s1.contains("ello"));
//        System.out.println(s1.contentEquals(new StringBuffer("Hell")));
//        System.out.println(s1.endsWith("lo"));
//        System.out.println(s1.getBytes());
//        System.out.println(s1.hashCode());
//        String s9 = "sda24asdas";
//        System.out.println(s9.indexOf(4));

          StringsExample ss = new StringsExample();

//          ss.pprint("Welcome to Toronto");
//
//        ss.pprint("Welcome");
        ss.pprint2("Welcome to Toronto");
    }

    public void pprint(String val){
        System.out.println("\n*******\n");
        int index_count = 0;
        for(int i=1;;i++){
            for(int j=1;j<=i;j++){
                System.out.print(val.charAt(index_count));
                index_count ++;
                if(index_count >= val.length()){
                    System.out.println("");
                    return;
                }

            }
            System.out.println("");
        }

    }

    public void pprint2(String val){
        System.out.println("\n*******\n");
        int index_count = 0;
        int row_counter = 1;

        while(index_count < val.length()){
            if(row_counter + index_count > val.length()){
                row_counter = row_counter + index_count - val.length();
            }
            System.out.println(val.substring(index_count,row_counter));
            index_count += row_counter;
            row_counter ++;
        }

    }



}
