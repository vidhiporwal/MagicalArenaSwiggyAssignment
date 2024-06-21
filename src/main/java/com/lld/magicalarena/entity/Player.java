package com.lld.magicalarena.entity;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
public class Player {

	private int health;
    private int strength;
    private int attack;
    
    public boolean isAlive() {
        return health > 0;
    }
}
