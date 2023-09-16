package Island;

import Animals.Animals;
import Fabric.FabricMethod;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Island {

    public Location[][] locations;

    Scanner sc = new Scanner(System.in);

    public void input() {
        System.out.println("Введите размер карты по оси Х (от 10 до 50): ");

        int scX = sc.nextInt();

        System.out.println("Введите размер карты по оси Y (от 20 до 100): ");
        int scY = sc.nextInt();

        if (scX < 10 || scX > 50 || scY < 20 || scY > 100) {
            System.out.println("Введен не допустимый размер карты");
        } else {
            int[][] island = new int[scX][scY];
            System.out.println("Размер карты: " + scX + "на" + scY + " создан.");

        }
        sc.close();
        
        Random random = new Random();
        for (int i = 0; i < scX*scY; i++) {
            int x = random.nextInt(scX);
            int y = random.nextInt(scY);
            FabricMethod fabricMethod = new FabricMethod();

            List<FabricMethod> animals = new ArrayList<>();
            animals.add(fabricMethod.run());
//                    new Lion("Лев " + i, 0); // Здесь нужно создать конкретные классы животных
            locations[scX][scY].getAnimals();
                
            }

        }
    }




