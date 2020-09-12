package ru.geekbrains.lessons;

public class Main {

    public static void main(String[] args) {
//        box box1 = new box("red", 5);
//        box box2 = new box("red", 5);
//
//
//        if (box1.equals(box2)) {
//            System.out.println("равны");
//        } else {
//            System.out.println("не равны");
//        }
//
//        System.out.println(box1.hashCode());
//        System.out.println(box2.hashCode());

//        int x;
//        Integer y = 128; //класс-обертка, т.е. это класс наследник то obj
//        Integer z = 128;
//
//        if (y.equals(z)) {
//            System.out.println("равны");
//        } else {
//            System.out.println("не равны");
//        }

//        String s1 = "java";
//        String s2 = "java";
//        String s3 = new String("java");
//
//        System.out.println(s1==s2);
//        System.out.println(s1==s3);

//        StringBuilder sb = new StringBuilder("asdf");
//
////        for (int i = 0; i < 1000000; i++) {
////            sb.append("1");
//
//        sb.append(111).append('a').append(2.134);
//        System.out.println(sb);
//
//        sb.insert(3, "ffff");
//        System.out.println(sb);
//
//        sb.replace(2, 6, "**");
//        System.out.println(sb);
//
//        sb.setLength(sb.length() - 3);
//        System.out.println(sb);
//
//        sb.delete(6,9);
//        System.out.println(sb);
//
//        sb.reverse();
//        System.out.println(sb);

        Cat[] cat = new Cat[3];
        cat[0] = new Cat("Barsik", 20, 20);
        cat[1] = new Cat("Murzik", 50, 100);
        cat[2] = new Cat("Barsik", 100, 200);
        Plate plate = new Plate(500);

        for (Cat i : cat) {
            if ((i.getHungry() - i.getAppetite()) >= 0) {
                i.eat(plate);
                System.out.println("Кот " + i.getName() + " съел " + i.getAppetite() + " корма.");
                System.out.println(i.isHungry());
            }
        }


    }


}


//        Cat cat = new Cat("Barsik", 20, 40);
//        Plate plate = new Plate(100);
//
//        cat.eat(plate);
//        System.out.println(plate);
//        cat.eat(plate);
//        System.out.println(plate);
//        cat.eat(plate);
//        System.out.println(plate);
//        cat.eat(plate);
//        System.out.println(plate);
//
//
//        plate.increaseFood(150);
//        System.out.println(plate);






