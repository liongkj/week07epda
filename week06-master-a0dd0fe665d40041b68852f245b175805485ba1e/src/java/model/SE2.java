/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 *
 * @author tp034196
 */
public class SE2 implements Serializable{

    private String name;
    private char gender;
    private int password;
    private double balance;

    public SE2(String name, char gender, int password, double balance) {
        this.name = name;
        this.gender = gender;
        this.password = password;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    public int getPassword() {
        return password;
    }

    public double getBalance() {
        return balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double x) {
        balance += x;
    }

    public void withdraw(double x) {
        balance -= x;
    }

    public void update(int x) {
        password = x;
    }

}
