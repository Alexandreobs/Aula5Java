package br.digitalhouse.exercicios;

import java.util.ArrayList;
import java.util.List;

public class exercicio5 {
    public static void main(String[] args){

        List<Integer> numeros = new ArrayList<>();

        numeros.add(2);
        numeros.add(4);
        numeros.add(5);
        numeros.add(9);
        numeros.add(8);
        numeros.add(10);

        List<Integer> numerosPares = new ArrayList<>();

        for (int i =0; i < numeros.size(); i++){

            if (numeros.get(i) % 2 ==0){
                numerosPares.add(numeros.get(i));
            }
                }
                System.out.println(numerosPares);

    }
}
