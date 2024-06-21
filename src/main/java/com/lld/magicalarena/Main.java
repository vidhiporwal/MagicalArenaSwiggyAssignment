package com.lld.magicalarena;

import com.lld.magicalarena.entity.Player;
import com.lld.magicalarena.service.GameService;
import com.lld.magicalarena.serviceimpl.GameServiceImpl;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter details for Player A");
        System.out.print("Enter health for Player A: ");
        int healthA = scanner.nextInt();
        System.out.print("Enter strength for Player A: ");
        int strengthA = scanner.nextInt();
        System.out.print("Enter attack for Player A: ");
        int attackA = scanner.nextInt();

        Player playerA = new Player(healthA, strengthA, attackA);

        System.out.println("\nEnter details for Player B");
        System.out.print("Enter health for Player B: ");
        int healthB = scanner.nextInt();
        System.out.print("Enter strength for Player B: ");
        int strengthB = scanner.nextInt();
        System.out.print("Enter attack for Player B: ");
        int attackB = scanner.nextInt();

        Player playerB = new Player(healthB, strengthB, attackB);

        GameService gameService = new GameServiceImpl();

        String gameResult = gameService.playGame(playerA, playerB);

        System.out.println("\nGame Result:");
        System.out.println(gameResult);

        scanner.close();
    }
}
