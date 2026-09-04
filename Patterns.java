import java.util.Scanner;
public class Patterns {
    public static void main(String[] args) {
        Scanner GG = new Scanner(System.in);
        int[] sales = new int[5];
        for(int i = 0; i<5; i++){
            System.out.printf("What is the amount of sales(integer) for store number %d today?%n", i+1);
                sales[i] = GG.nextInt()/100;
        }
        System.out.println("%nSALES BAR CHART");
        System.out.println("(Each * = $100)");
        for(int i = 0; i<5; i++){
            System.out.printf("Store %d: ", i+1);
            for(int x = 0; x<sales[i]; x++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
    
}
