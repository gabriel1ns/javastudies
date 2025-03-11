package arrays;

import java.util.Arrays;
import java.util.Random;

public class LotteryTicket {

    private static final int LENGTH = 6; //declaring of a constant -> cant be changed because its final
    private static final int MAX_TICKET_NUMBER = 69;

    public static void main(String[] args) {

        int ticket[] = generateNumbers();
        printTicket(ticket);
    }

    public static int[] generateNumbers(){
        int[] ticket = new int[LENGTH];
        Random random = new Random();

        for(int i = 0; i < LENGTH ; i++){
            int randomNumber;
            do{
               randomNumber = random.nextInt(1, MAX_TICKET_NUMBER);
            }while(search(ticket, randomNumber));
            ticket[i] = randomNumber;
        }
        return ticket;
    }

    public static boolean search(int[] array, int numberToSearch){
        for(int value : array){
            if(value == numberToSearch){
                return true;
            }
        } return false;
    }

    public static void printTicket(int[] array){
        Arrays.sort(array);
        for(int value: array){
            System.out.print(value + "|");
        }
    }
}
