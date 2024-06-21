package com.lld.magicalarena.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
public class Player {

	private int health;
    private int strength;
    private int attack;
    
    public boolean isAlive() {
        return health > 0;
    }
}
