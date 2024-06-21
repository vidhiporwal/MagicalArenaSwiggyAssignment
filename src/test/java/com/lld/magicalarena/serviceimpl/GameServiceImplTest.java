package com.lld.magicalarena.serviceimpl;

import com.lld.magicalarena.entity.Player;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GameServiceImplTest {

    private GameServiceImpl gameService;

    @BeforeEach
    public void setUp() {
        gameService = new GameServiceImpl();
    }

    @Test
    public void testPlayGame_PlayerAWins() {
        Player playerA = new Player(50, 5, 10);
        Player playerB = new Player(100, 10, 5);

        String result = gameService.playGame(playerA, playerB);

        assertEquals("Player A wins!", result);
    }

    @Test
    public void testPlayGame_PlayerBWins() {
        Player playerA = new Player(100, 10, 5);
        Player playerB = new Player(50, 5, 10);

        String result = gameService.playGame(playerA, playerB);

        assertEquals("Player B wins!", result);
    }

    @Test
    public void testPlayGame_Draw() {
        Player playerA = new Player(50, 5, 10);
        Player playerB = new Player(50, 5, 10);

        String result = gameService.playGame(playerA, playerB);

        // In this case, as both players have the same health, Player B will win due to the first attack rule,
        // resulting in a draw.
        assertEquals("Player B wins!", result);
    }

    @Test
    public void testAttack() {
        Player attacker = new Player(50, 5, 10);
        Player defender = new Player(100, 10, 5);
        StringBuilder result = new StringBuilder();

        gameService.attack(attacker, defender, result);

        // Check if damage dealt is correctly calculated and defender's health is updated
        int expectedDamage = attacker.getAttack() * 10 - defender.getStrength() * 2;
        int expectedDefenderHealth = defender.getHealth() - Math.max(0, expectedDamage);

        String expectedResult = String.format("%s attacks %s: attack roll = %d, defense roll = %d, damage dealt = %d, defender health = %d\n",
                "Player A", "Player B", 10, 2, Math.max(0, expectedDamage), expectedDefenderHealth);

        assertEquals(expectedResult, result.toString());
        assertEquals(expectedDefenderHealth, defender.getHealth());
    }
}
