package br.digitalhouseExercicioEmSalaAula5;

import java.util.ArrayList;
import java.util.List;

public class Exercicio1 {
    public static void main(String[] args) {

        //EXERCÍCIO 1

        Integer umNumeroA = 17;
        Double umNumeroB = 0.9;
        String umaCadeiaDetexto = "Aqui tem um texto";

        System.out.println(umaCadeiaDetexto);
        System.out.println(umNumeroA + umNumeroB);
        System.out.println(umNumeroA - umNumeroB);

        System.out.println("Hello World!");

        //EXERCÍCIO 2

        Integer umNumeroInteiroA = 10;
        Integer umNumeroInteiroB = 20;
        boolean resultado = (umNumeroInteiroA < umNumeroInteiroB);

        if (umNumeroA < umNumeroB) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        //OUTRA FORMA DE RESOLVER O EXERCICIO 2

        System.out.println(umNumeroInteiroA > umNumeroInteiroB);


        System.out.println(resultado);

        //EXERCÍCIO 3

        /*int numero = 11;

        if (numero > 10 && (numero % 2 = 0)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }*/

        List<Integer> numeros = new ArrayList<>();
        numeros.add(umNumeroInteiroA);
        numeros.add(umNumeroInteiroB);
        numeros.add(umNumeroA);
        numeros.add(50);

       /* System.out.println(numeros);*/

 /*       int soma = 0;

        for (int i = 0; i < numeros.size(); i++) {

            soma = soma + numeros.get(i);
        }
        System.out.println("A soma dos elementos é " + soma);*/


        int somatoria = 0;

      /*  for (int i = 0; i < numeros.size(); i++) {
            if (numeros.size() % 2 == 0) ;
            somatoria = somatoria + numeros.get(i);

        }
        System.out.println(somatoria);*/

      List<Integer> numerosPares = new ArrayList<>();


        for (int i = 0; i < numeros.size(); i++) {
            if (numeros.get(i)%2==0){
                numerosPares.add(numeros.get(i));
            }
        }
        System.out.println("A lista de numeros Pares é " +numerosPares);


        for (int i = 0; i < numeros.size(); i++) {
            if (numeros.get(i) % 2 == 0) ;
            somatoria = somatoria + numeros.get(i);

        }
        System.out.println(somatoria);

    }}
/*


        int Array [] =  {2,5,8,9,7,14,23};
        int  par;
        int impar;
        for (int i = 1; i<=100; i++) {
            if (Par(i)) {
                System.out.println(i + soma);
            }
        }
    }
    public static boolean Par(int numero) {
        return ;
    }*/




