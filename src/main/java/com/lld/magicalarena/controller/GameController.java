package com.lld.magicalarena.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lld.magicalarena.entity.Player;
import com.lld.magicalarena.service.GameService;

@RestController
public class GameController {
    @Autowired
    private GameService gameService;

    @GetMapping("/startGame")
    public String startGame(@RequestParam int healthA, @RequestParam int strengthA, @RequestParam int attackA,
                            @RequestParam int healthB, @RequestParam int strengthB, @RequestParam int attackB) {
        Player playerA = new Player(healthA, strengthA, attackA);
        Player playerB = new Player(healthB, strengthB, attackB);

        return gameService.playGame(playerA, playerB);
    }
}
