package lesson04;


import java.util.ArrayList;
import java.util.List;

public class Test01 {

    public static void main(String[] args) {
        List<List<Integer>> table = new ArrayList<>();

        List<Integer> row = new ArrayList<>();


        for (int i = 0; i < 3; i++) {
            row.clear();
            for (int j = 1; j < 8; j++) {
                row.add(j);
            }
            table.add(row);
        }

        System.out.println(table);
    }
}

