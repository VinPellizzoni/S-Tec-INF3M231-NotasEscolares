package Projeto01;

import java.util.Scanner;

public class CalcIMC {
    public static void main(String[] args) {
        float peso = 0, altura = 0, imc = 0;
        Scanner ler = new Scanner(System.in);
        System.out.println("Calculadora de IMC");
        System.out.println("Digite a altura: ");
        altura = ler.nextFloat();
        System.out.println("Digite o peso: ");
        peso = ler.nextFloat();
        imc = calcIMC(altura, peso);
        String resultado = "";
        if (imc < 16) {
            resultado = "Magreza grave";

        } else if (imc < 16.9) {
            resultado = "Magreza moderada";

        } else if (imc < 18.5) {
            resultado = "Magreza leve";

        } else if (imc < 24.9) {
            resultado = "Peso ideal";

        } else if (imc < 29.9) {
            resultado = "Sobrepeso";

        } else if (imc < 34.9) {
            resultado = "Obesidade grau 1";

        } else if (imc < 39.9) {
            resultado = "Obesidade grau 2";

        } else {
            resultado = "Obesidade grau 3";
        }
        System.out.println("Seu IMC é: " + imc + " e o resultado é: " + resultado);
    }
    /**
     * Função calcIMC calcula o IMC de um indivíduo
     * Recebe os seguintes parâmetros:
     * @param altura
     * @param peso
     * @return
     */
    public static float calcIMC(float altura, float peso){
        return (float) peso / (altura * altura);
    }

}
