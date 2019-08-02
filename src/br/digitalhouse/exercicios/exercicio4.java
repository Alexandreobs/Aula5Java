package br.digitalhouse.exercicios;

import java.util.ArrayList;
import java.util.List;

public class exercicio4 {
    public static void main(String[] args){

        List<Integer> numeros = new ArrayList<>();

        numeros.add(3);
        numeros.add(4);
        numeros.add(5);
        numeros.add(6);
        numeros.add(7);
        numeros.add(8);
        numeros.add(9);

        int soma = 0;
        for(int i = 0; i < numeros.size(); i++) {

            soma = soma + numeros.get(i);
        }
        System.out.println("a soma dos elementos é " + soma);
    }
}
