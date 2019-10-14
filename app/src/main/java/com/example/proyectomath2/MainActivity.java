package com.example.proyectomath2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        double maiz;

        double x;
        double y;

        //Ejercicio No.1
        //P (x) = x3 + x − 7; entre 1 y 2
        // [((Math.pow(x, 3) )+ x - 7)]
        // Con 1 = -5.0
        // Con 2 =  3.0
        // Raiz mas cernada a 0 es = [1.8] con un valor de [0.8320000000000007]

        /**
         * Ejercicio No.2
         * x3 − x2−5; entre 2 y 3
         * [((Math.pow(x, 3)) - (Math.pow(x, 2)) - 5)]
         * Con 2 = -1.0
         * Con 3 = 13.0
         * Raiz mas cernada a 0 es = [2.2] con un valor de [0.8080000000000025]
         */

        /**
         * Ejercicio No.3
         * P (x) = 2x4−4x2 + 1; entre 1 y 2
         * [((2 * (Math.pow(x, 4))) - (4 * (Math.pow(x, 2))) + 1)]
         * Con 1 = -1.0
         * Con 2 = 17.0
         * Raiz mas cernada a 0 es = [1.4] con un valor de [0.8431999999999995]
         */

        /**
         * Ejercicio No.4
         * P (x) = 2x4−4x2 + 1; entre −1 y 0
         * [((2 * (Math.pow(x, 4))) - (4 * (Math.pow(x, 2))) + 1)]
         * Con -1 : -1.0
         * Con  0 : 1.0
         * Raiz mas cernada a 0 es = [-1.4] con un valor de [0.8431999999999995]
         */

        /*x = -1;
        maiz = ((2 * (Math.pow(x, 4))) - (4 * (Math.pow(x, 2))) + 1);

        Log.d(TAG, "Raiz Val " + x + " :" + maiz);

        x = 0;
        maiz = ((2 * (Math.pow(x, 4))) - (4 * (Math.pow(x, 2))) + 1);
        Log.d(TAG, "Raiz Val " + x + " :" + maiz);*/

        x = 2;
        boolean salir = false;
        for (int i = -1; i <= x; i++) {
            for (int j = 1; j <= 9; j++) {
                maiz = ((Math.pow(Double.parseDouble(i + "." + j), 3)) + x - 7);
//                maiz = ((Math.pow(Double.parseDouble(i + "." + j), 3)) - (Math.pow(Double.parseDouble(i + "." + j), 2)) - 5);
//                maiz = (((2 * (Math.pow(Double.parseDouble(i + "." + j), 4))) - (4 * (Math.pow(Double.parseDouble(i + "." + j), 2))) + 1));
//                maiz = (((2 * (Math.pow(Double.parseDouble(i + "." + j), 4))) - (4 * (Math.pow(Double.parseDouble(i + "." + j), 2))) + 1));
                if (maiz > 0) {
                    salir = true;
                    Log.d(TAG, "Raiz mas cernada a 0 es = [" + i + "." + j + "] con un valor de [" + maiz + "]");
                    break;
                }
            }
            if (salir)
                break;
        }

       /* int value = 400;
        int[] array = { 10, 15, 20, 40, 50, 100, 120, 200, 400, 500, 600, 800 ,2222};
        int result = binarySearch(array, 0, array.length - 1, value);
        System.out.println(String.format("Result %d", array[result]));*/
    }

    private int verificar(int numero){
        return 0;
    }


    /*public int binarySearch(int[] array, int minLimit, int maxLimit, int value) {
        if (maxLimit >= 0 && array[minLimit] <= value && array[maxLimit] >= value) {
            int mid = getMidValue(minLimit, maxLimit);
            System.out.println(String.format("Límite inferior %d límite superior %d valor en el arreglo %d valor a buscar %d", minLimit, maxLimit, array[mid], value));
            if (array[mid] == value) {
                return mid;
            } else if (array[mid] < value){
                return binarySearch(array, mid + 1, maxLimit, value);
            }
            return binarySearch(array, minLimit, mid - 1, value);
        }
        return -1;
    }

    public int getMidValue(int minLimit, int maxLimit) {
        return (maxLimit + minLimit) / 2;
    }*/
}
