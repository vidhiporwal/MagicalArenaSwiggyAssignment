package com.lld.magicalarena.serviceimpl;

import org.springframework.stereotype.Service;

import com.lld.magicalarena.entity.Player;
import com.lld.magicalarena.service.GameService;
import com.lld.magicalarena.util.DiceRoller;

@Service
public class GameServiceImpl implements GameService {
	@Override
    public String playGame(Player playerA, Player playerB) {
        StringBuilder result = new StringBuilder();
        while (playerA.isAlive() && playerB.isAlive()) {
        	// it determines which player attacks based on their current health
            if (playerA.getHealth() <= playerB.getHealth()) {
                attack(playerA, playerB, result);
            } else {
                attack(playerB, playerA, result);
            }
        }
        //appending the final result 
        if (playerA.isAlive()) {
            result.append("Player A wins!");
        } else {
            result.append("Player B wins!");
        }
        return result.toString();
    }

    void attack(Player attacker, Player defender, StringBuilder result) {
    	// rolling the  dice to determine attack and defense values
        int attackRoll = DiceRoller.rollDie();
        int defenseRoll = DiceRoller.rollDie();
        // Calculate the damage done by the attacker and defended by the defender
        int attackDamage = attacker.getAttack() * attackRoll;
        int defenseValue = defender.getStrength() * defenseRoll;
        int damageDealt = Math.max(0, attackDamage - defenseValue);

     // Reducing the defender's health based on the damage
        defender.setHealth(defender.getHealth() - damageDealt);

        result.append(String.format("%s attacks %s: attack roll = %d, defense roll = %d, damage dealt = %d, defender health = %d\n",
                attacker == defender ? "Player A" : "Player B",
                defender == attacker ? "Player A" : "Player B",
                attackRoll, defenseRoll, damageDealt, defender.getHealth()));
    }
}
