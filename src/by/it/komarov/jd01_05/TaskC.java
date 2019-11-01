package by.it.komarov.jd01_05;

public class TaskC {
    public static void main(String[] args) {
        double[] arrayA = new double[30];


        setArrayA(arrayA);
        getArray(arrayA);
        getArray(setArrayB(arrayA));

    }

    private static void setArrayA(double[] arrayA){
        int indexA = -1;
        for (double x = 5.33; x <= 9.0 ; x += 0.15) {
            indexA++;
            arrayA[indexA] = Math.pow((x * x) + 4.5, 1.0 / 3.0);
        }
    }

    private static double[] setArrayB(double[] arrayA){
        double[] arraySecond = new double[30];
        int indexArray = 0;
        for (int i = 0; i < arrayA.length; i++) {
            if (arrayA[i] > 3.5){
                arraySecond[indexArray++] = arrayA[i];
            }
        }
        return arraySecond;
    }

    private static void getArray(double[] array){
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                System.out.printf("Array[%2d]=%3.6f ", i, array[i]);
                if (i % 5 == 0) {
                    System.out.println();
                }
            }
        }
        System.out.println();
    }
}
