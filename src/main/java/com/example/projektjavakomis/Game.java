package com.example.projektjavakomis;


import lombok.NoArgsConstructor;

import java.util.Scanner;
@NoArgsConstructor
public class Game {



    public void startGame()
    {


        Scanner scanner = new Scanner(System.in);
        System.out.print("Witaj w grze Autokomis!");
        System.out.print("\nTwoim celem gry, jest podwojenie twojej gotówki.\n");
        System.out.println("Stan twojej gotówki wynosi: 100 000$");
        System.out.print("\nZaczynajmy!\n");


        System.out.println("\nPodaj imię gracza: \n");
        String nameOfPlayer = scanner.nextLine();
        System.out.println("Witaj "+ nameOfPlayer);
        Player player = new Player("" +nameOfPlayer, 100000.0);
        while (player.getCash() < 200000.0)
        {
            player.getUserOptions();

        }





    }

}
