package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        //напишите тут ваш код
        String[] str = s.split("\\b");

        for (int i = 0; i < str.length; i++) {
            str[i] = str[i].substring(0, 1).toUpperCase() + "" + str[i].substring(1);
            System.out.print(str[i] + " ");
        }
    }
}
