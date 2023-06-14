package lesson03;




//Задание №2.1
//        📌 Заполнить список названиями планет Солнечной
//        системы в произвольном порядке с повторениями.
//        📌 Вывести название каждой планеты и количество его
//        повторений в списке.
//        Задание состоит из двух блоков
//        Задание №2.2 (если выполнено первое задание)
//        📌 Пройти по списку из предыдущего задания и удалить
//        повторяющиеся элементы.

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main02 {
    public static void main(String[] args) {
//        Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями. V
//        Вывести название каждой планеты и количество его повторений в списке.

        List<String> planets = List.of("Mercury", "Venus", "Earth", "Jupiter", "Saturn", "Neptune", "Uranus", "Pluton");
        List<String> planetList = createRandom(planets, 10);
//        System.out.println(planetList);
        countPlanets(planetList);
    }
    public static List<String> createRandom(List<String> planets, int len){
        List<String> newList = new ArrayList<String>();
        Random rnd = new Random();
        for (int i = 0; i < len; i++) {
            newList.add(planets.get(rnd.nextInt(0,8)));
        }
        return newList;
    }
    public static void countPlanets(List<String> planets){
        List<String> newList = new ArrayList<String>();
        newList.add(planets.get(0));
        boolean flag = true;
        for (int i = 0; i < planets.size(); i++) {
            for (int j = 0; j < newList.size(); j++) {
                if(newList.get(j).equals(planets.get(i))){
                    flag = false;
                }
            }
            if(flag) { newList.add(planets.get(i)); }
            flag = true;
        }
        System.out.println(planets);
        System.out.println(newList);
        for (int i = 0; i < newList.size(); i++) {
            String temp = newList.get(i);
            int count = 0;
            for (int j = 0; j < planets.size(); j++) {
                if(temp.equals(planets.get(j))){
                    count++;
                }
            }
            System.out.println(temp + " : " + count);
        }
    }
}