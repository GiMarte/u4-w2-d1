package Ex1;

import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int[] arr = new int[5];
        for (int i = 0 ; i < arr.length; i++){
            int random = (int) Math.ceil(Math.random() * 10);
            arr[i] = random;
        }
        Scanner sc = new Scanner(System.in);
        int numero ;
        int posizione;

        while (true) {
        System.out.println(Arrays.toString(arr));
        System.out.print("Inserisci il numero che vuoi posizionare (inserisci 0 per terminare): ");
        try {
            numero = Integer.parseInt(sc.nextLine());
        }catch (NumberFormatException e) {
            System.out.println("Errore: devi inserire un numero intero!");
            continue;
        };
            if (numero == 0) {
                System.out.println("Programma terminato.");
                break;
            }
            System.out.print("In che posizione dell'array vuoi inserire il numero? (da 0 a 4): ");
        try {
            posizione = Integer.parseInt(sc.nextLine());
            arr[posizione] = numero;
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
            System.out.println("Errore: Posizione non valido oppure non e' un numero!");
        }
        }
    }
}

