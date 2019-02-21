package com.company;

import java.util.ArrayList;
import java.util.List;

public class Player implements ISaveable {

    private String mName;
    private int mHealth;
    private String mWeapon;
    private int mSpeed;
    private int mLivesRemaining;

    public Player(String name, String weapon) {
        this.mName = name;
        this.mWeapon = weapon;
        this.mSpeed = 100;
        this.mLivesRemaining = 3;
        this.mHealth = 100;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public int getmHealth() {
        return mHealth;
    }

    public void setmHealth(int mHealth) {
        this.mHealth = mHealth;
    }

    public String getmWeapon() {
        return mWeapon;
    }

    public void setmWeapon(String mWeapon) {
        this.mWeapon = mWeapon;
    }

    public int getmSpeed() {
        return mSpeed;
    }

    public void setmSpeed(int mSpeed) {
        this.mSpeed = mSpeed;
    }

    public int getmLivesRemaining() {
        return mLivesRemaining;
    }

    public void setmLivesRemaining(int mLivesRemaining) {
        this.mLivesRemaining = mLivesRemaining;
    }

    @Override
    public String toString() {
        return "Player " + mName + " carries a " + mWeapon + " and has a speed of " + mSpeed + ".\n"
                + mName + " has " + mHealth + " health and " + mLivesRemaining + " lives remaining.";
    }

    @Override
    public List<String> save() {
        List<String> newList = new ArrayList<>();
        newList.add(0, mName);
        newList.add(1, String.valueOf(mHealth));
        newList.add(2, mWeapon);
        newList.add(3, String.valueOf(mSpeed));
        newList.add(4, String.valueOf(mLivesRemaining));
        return newList;
    }

    @Override
    public void read(List<String> values) {
        if(values != null && values.size() == 5){
            mName = values.get(0);
            mHealth = Integer.parseInt(values.get(1));
            mWeapon = values.get(2);
            mSpeed = Integer.parseInt(values.get(3));
            mLivesRemaining = Integer.parseInt(values.get(4));
        }else{
            System.out.println("Error! Please enter all 5 items");
        }

    }
}
