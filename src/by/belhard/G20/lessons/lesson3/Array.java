package by.belhard.G20.lessons.lesson3;

public class Array {
    public static void main(String[] args) {
        //int [] ar1 = {2,3,67,56,55};
        int []  ar2 = new int[30];
        int []  ar3 = new int [4];


        for (int i = 0;i<ar2.length;i++) {
            ar2[i] =i*2;
       // System.out.print("  "+ ar2[i]);
    }

        String [] stringArray = {"one", "two","three","four","five"};





    for (String  s: stringArray) {
if ("three".equals(s))
    continue;
        System.out.println(s);
    }



    }



}
