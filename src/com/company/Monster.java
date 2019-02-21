package com.company;

import java.util.ArrayList;
import java.util.List;

public class Monster implements ISaveable {

    private String mName;
    private int mHealth;
    private String mWeapon;
    private int mSpeed;

    public Monster(String mName, int mSpeed) {
        this.mName = mName;
        this.mHealth = 100;
        this.mWeapon = "Club";
        this.mSpeed = mSpeed;
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

    @Override
    public List<String> save() {
        List<String> newList = new ArrayList<>();
        newList.add(0, mName);
        newList.add(1, String.valueOf(mHealth));
        newList.add(2, mWeapon);
        newList.add(3, String.valueOf(mSpeed));
        return newList;
    }

    @Override
    public void read(List<String> values) {
        if(values != null && values.size() == 4){
            mName = values.get(0);
            mHealth = Integer.parseInt(values.get(1));
            mWeapon = values.get(2);
            mSpeed = Integer.parseInt(values.get(3));
        }else {
            System.out.println("Error! Please enter all 4 items.");
        }


    }

    @Override
    public String toString() {
        return "Monster named " + mName + " carries a " + mWeapon + " and has a speed of " + mSpeed + ".\n" +
                mName + " has " + mHealth + " health remaining.";
    }
}
