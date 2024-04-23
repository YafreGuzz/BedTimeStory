package com.pluralsight;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class BedtimeStories
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        boolean tryIt = true;
        while (tryIt)
        {
            try
            {
                System.out.println("Please choose one story: ");
                System.out.println("1. Goldilocks");
                System.out.println("2. Hansel And Gretel");
                System.out.println("3. Mary Had A Little Lamb");
                System.out.println("4. Exit");
                System.out.print("Choice: ");

                int decision = scanner.nextInt();

                switch (decision)
                {
                    case 1:
                        FileInputStream gold = new FileInputStream("src/main/resources/DataFiles/goldilocks.txt");
                        Scanner goldi = new Scanner(gold);
                        String input;

                        int i = 1;
                        while (goldi.hasNextLine())
                        {
                            input = goldi.nextLine();
                            System.out.println(i++ + ". " + input);
                        }
                        break;

                    case 2:
                        FileInputStream fis = new FileInputStream("src/main/resources/DataFiles/hansel_and_gretel.txt");
                        Scanner keyboard = new Scanner(fis);
                        String input2;

                        int q = 1;
                        while (keyboard.hasNextLine())
                        {
                            input2 = keyboard.nextLine();
                            System.out.println(q++ + ". "+ input2);
                        }
                        break;

                    case 3:
                        FileInputStream mary = new FileInputStream("src/main/resources/DataFiles/mary_had_a_little_lamb.txt");
                        Scanner mouse = new Scanner(mary);
                        String input3;

                        int w = 1;
                        while (mouse.hasNextLine())
                        {
                            input3 = mouse.nextLine();
                            System.out.println(w++ + ". "+ input3);
                        }
                        break;
                    case 4:
                        System.exit(0);
                }
            }

            catch (IOException e)
            {
                e.printStackTrace();
            }

            System.out.println("Would you like to read another story? (yes/no):");
            String response = scanner.next().toLowerCase();

            if (!response.equals("yes"))
            {
                tryIt = false;
            }
        }

    }
}
