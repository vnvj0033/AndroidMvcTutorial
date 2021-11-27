package com.example.mvctutorial.designpattern._14facade_pattern.system;

public class HelpSystem01 {

    public HelpSystem01() {
        System.out.println("call constructor : " + getClass().getSimpleName());
    }

    void process(){
        System.out.println("call process : " + getClass().getSimpleName());
    }
}