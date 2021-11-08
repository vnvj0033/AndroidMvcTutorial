package com.example.mvctutorial.designpattern._01strategy_weapon;

public class Knife implements Weapon {

    /**
     * 내구성, 공격력, 특수 능력 등
     */

    public int doAttack() {
        System.out.println("칼 공격");
        return 0;
    }

}