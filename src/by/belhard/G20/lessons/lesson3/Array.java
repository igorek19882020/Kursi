package by.belhard.G20.lessons.lesson3;

public class Array {
    public static void main(String[] args) {

       String [] strAr = {"djsf" ,"f233 ",  "dfq32561","t231","dopo9","k643" };
       String result = "";

       for (String s :strAr) {
           if (s.length()<=3)
               result+=s;       }
        System.out.println(result);




        //--------------------------------------------
        /*int[][] mt = new int[8][8];
        for (int i = 2; i <= 9; i++) {
            for (int j = 2; j <= 9; j++) {
                mt[i - 2][j - 2] = i * j;
            }
        }
        for (int [] inArr : mt) {
            for (int i : inArr) {
                System.out.println(i + " ");
            }
                System.out.println();
            }
        System.out.println();


-------------------------------------------------

        /*   int[] ar2 = new int[30];
        int[] ar3 = new int[4];
        int [][] ar = new int[3][3];
        ar [0] = new int[3];
        ar[1] = new int[]{4,5};
        ar[2] = new int[1];


     /*   for (int i = 0; i < ar.length; i++) {
            ar[i] = i;
            System.out.print("  " + ar[i]);
        }

        //   String [] stringArray = {"one", "two","three","four","five"};


   /* for (String  s: stringArray) {
if ("three".equals(s))
    continue;
        System.out.println(s);
    }*/

        }
    }
