package Desafios.VerifiqueSeTodosOsNúmerosDaListaSãoPositivos;

import java.util.Arrays;
import java.util.List;

public class VerificarNumeroPositivo {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3, -5, -6, -8);

        numeros.stream().sorted().filter(n -> n > 0).forEach(System.out::println);
    }
}
