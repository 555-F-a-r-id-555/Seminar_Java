package lesson06_DZ2;

import java.util.Objects;

public class Notebook {
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



    }
    public boolean hasCPU(String size) {
        return RAM.equals(size);
    }
    public boolean hasScreen(String size) {
        return RAM.equals(size);
    }
    public boolean hasVideo(String size) {
        return RAM.equals(size);
    }
    public boolean hasColor(String color) {
        return Color.equalsIgnoreCase(color);
    }
    public boolean hasRAMSize(String size) {
        return RAM.equals(size);
    }










}
