package ru.netology.services;

public class RecreationService {

    public int calcRecreation(int recreationMonth, int income, int expense, int threshold) {
        int count = 0;
        int balance = 0;
        for (int month = 1; month <= 12; month++) {
            if (balance >= threshold) {
                count++;
                balance = (balance - expense) / 3 ;
            } else {
                balance = balance + income - expense;
            }
        }
        return recreationMonth = count;
    }
}

