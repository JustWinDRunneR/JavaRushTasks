package com.javarush.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Проверка на упорядоченность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(br.readLine());
        }
        String str = list.get(0);

        for (int i = 1; i < list.size(); i++) {
            if (str.length() > list.get(i).length()) {
                System.out.println(i);
                break;
            } else {
                str = list.get(i);
            }
        }
    }
}
