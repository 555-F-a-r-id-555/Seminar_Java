package lesson06_DZ2;


//Урок 6. Хранение и обработка данных ч3: множество коллекций Set
//   Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
//   Создать множество ноутбуков (ArrayList).
//   Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
//   Например, спросить у пользователя минимальный размер оперативной памяти или конкретный цвет.
//   Выводить только те ноутбуки, что соответствуют условию

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main03 {
    public static void main(String[] args) {


        Notebook AsusTUFGamingF15FX507ZI = new Notebook("15.6", "Intel_Core_i7_12700H",
                "NVIDIA_GeForce_RTX4070", "16GB_(2x8)_DDR4_3200MHz", "1_TB_M.2",
                "Active", "YES", "Black");

        Notebook MSIKatana15B13VFK = new Notebook("16", "Intel_Core_i7_13620H",
                "NVIDIA_GeForce_RTX_4060", "16GB_(2x8)_DDR5", "1_TB_SSD",
                "Active", "YES", "Grey");

        Notebook LenovoLegion716IAX7 = new Notebook("15.6", "Intel_Core_i7_12800HX",
                "NVIDIA_GeForce_RTX_3070_Ti", "16GB_(2x8)_DDR4_3200MHz", "1_TB_SDD",
                "Active", "YES", "White");

        Notebook OMENHPGaming15dh = new Notebook("15.6", "Intel_Core_i9_10885H",
                "NVIDIA_GeForce_RTX_2080", "16GB_DDR4_3200MHz", "1_TB+SSD_512_Gb",
                "Active", "YES", "Black");

        Notebook AsusTUFGamingF15FX507ZI5_3 = new Notebook("15.6", "Intel_Corei7_12700H",
                "NVIDIA_GeForce_RTX4070", "16GB_(2x8)_DDR4_3200MHz", "1_TB_M.2",
                "Active", "YES", "Black");

        Notebook AsusTUFFX505DT = new Notebook("15.6", "AMD_Ryzen_7_3750H",
                "NVIDIA_GeForce_GTX_1650", "16GB_DDR4_3200MHz", "512_GB_SDD",
                "Active", "YES", "Black");

        Notebook AsusTUFFX505DT_2 = new Notebook("15.6", "AMD_Ryzen_7_3750H",
                "NVIDIA_GeForce_GTX_1650", "16GB_DDR4_3200MHz", "512_GB_SDD",
                "Active", "YES", "Black");


        List<Notebook> notebooks = new ArrayList<>();
        Collections.addAll(notebooks,
                AsusTUFGamingF15FX507ZI,
                MSIKatana15B13VFK,
                LenovoLegion716IAX7,
                OMENHPGaming15dh,
                AsusTUFGamingF15FX507ZI5_3,
                AsusTUFFX505DT,
                AsusTUFFX505DT_2);



        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите команду: ");
        String input = scanner.nextLine();
        System.out.println(input);


    }
}



/*public class Notebook {
    String Screen;
    String CPU;
    String videoCard;
    String RAM;
    String storageDevice;
    String coolingSystem;
    String Backlight;
    String Color;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Notebook notebook = (Notebook) o;
        return Objects.equals(Screen, notebook.Screen) && Objects.equals(CPU, notebook.CPU) && Objects.equals(videoCard, notebook.videoCard) && Objects.equals(RAM, notebook.RAM) && Objects.equals(storageDevice, notebook.storageDevice) && Objects.equals(coolingSystem, notebook.coolingSystem) && Objects.equals(Backlight, notebook.Backlight) && Objects.equals(Color, notebook.Color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Screen, CPU, videoCard, RAM, storageDevice, coolingSystem, Backlight, Color);
    }

    public Notebook(String screen, String CPU, String videoCard,
                    String RAM, String storageDevice, String coolingSystem,
                    String backlight, String color) {
        this.Screen = screen;
        this.CPU = CPU;
        this.videoCard = videoCard;
        this.RAM = RAM;
        this.storageDevice = storageDevice;
        this.coolingSystem = coolingSystem;
        this.Backlight = backlight;
        this.Color = color;



    }*/


/*}*/