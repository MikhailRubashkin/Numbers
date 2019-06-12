
//Напишите программу, заносящую в массив первые 100 натуральных чисел, делящихся на 13 или на 17, и печатающую его.

public class Numbers {


    public static void main(String[] args) {

        int i;
        int n[] = new int[100];
        for (i = 0; i < n.length; i++) {
            n[i] = i;
        }
        int j = 0;
        for (i = 0; j < 100; i++) {
            if (i % 13 == 0 || i % 17 == 0) {
                n[j] = i;
                j++;
            }
        }
        for (i = 0; i < n.length; i++) {
                System.out.print(" " + n[i]);
            }
        }
    }


















































