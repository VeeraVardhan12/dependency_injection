package com.example.dependency_injection;

public class AnotherStudent {
    private MathCheat cheat;
    public void setCheat(MathCheat cheat){
        this.cheat = cheat;
    }

    public void startCheating(){
        cheat.mathCheat();
    }
}