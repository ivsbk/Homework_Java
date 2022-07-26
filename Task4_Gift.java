import java.util.Scanner;

public class Task4_Gift {
    public static void main(String[]args){
        int totalWeight, orangeWeight, appleWeight, pearWeight;
        int weightWOOranges, weightWOApples;
        int orangeNumberMax, appleNumberMax;
        int count = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите общий вес подарка:");
        totalWeight = sc.nextInt();

        System.out.println("Введите вес апельсина:");
        orangeWeight = sc.nextInt();

        System.out.println("Введите вес яблока:");
        appleWeight = sc.nextInt();

        System.out.println("Введите вес груши:");
        pearWeight = sc.nextInt();

        orangeNumberMax = totalWeight / orangeWeight;
        appleNumberMax = totalWeight / appleWeight;


            for (int i = 0; i <= orangeNumberMax; i++) {
                weightWOOranges = totalWeight - orangeWeight * i;
                    if (weightWOOranges > 0) {
                        for (int j = 0; j <= appleNumberMax; j++) {
                            weightWOApples = weightWOOranges - appleWeight * j;
                            if (weightWOApples != 0) {
                                if (weightWOApples % pearWeight == 0 && weightWOApples >= 0) count++;
                            } else{
                                count++;
                            }
                        }
                        } else {
                        count++;
                    }

            }
        System.out.println("Есть " + count + " вариантов составить подарки из таких фруктов");
    }


}


