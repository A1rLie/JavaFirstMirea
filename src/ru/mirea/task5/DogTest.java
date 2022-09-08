package ru.mirea.task5;

public class DogTest {

    public static void main(String[] args) {
        Korgi korgi = new Korgi("Tomas Shelbi", "black", 0.5, 0.9);
        korgi.Bark();

        SibaInu sibaInu = new SibaInu("Jon Travolta", "yellow", 0.7, 0.8);
        sibaInu.Bark();
    }
}
