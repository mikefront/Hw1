public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("Задание1");
        {
        }
        var dog = 8.0;
        System.out.println("dog-" + dog);
        {
        }
        var cat = 3.6;
        System.out.println("cat-" + cat);
        {
        }
        var paper = 763789;
        System.out.println("paper-" + paper);
    }
    public static void task2() {
        System.out.println("Задание2");
        {
        }
        var dog = 8.0;
        dog = dog + 4.0;
        System.out.println("dog-" + dog);
        {
        }
        var cat = 3.6;
        cat = cat + 4.0;
        System.out.println("cat-" + cat);
        {
        }
        var paper = 763789;
        paper = paper + 4;
        System.out.println("paper-" + paper);
    }
    public static void task3() {
        System.out.println("Задание3");
        {
        }
        var dog = 8.0;
        dog = dog - 3.5;
        System.out.println("dog-" + dog);
        {
        }
        var cat = 3.6;
        cat = cat - 1.6;
        System.out.println("cat-" + cat);
        {
        }
        var paper = 763789;
        paper = paper - 7639;
        System.out.println("paper-" + paper);
    }
    public static void task4() {
        var friend = 19;
        System.out.println("friend-" + friend);
        {
        }
        var friend1 = 19;
        friend1 = friend1 * 2;
        System.out.println("friend-" + friend1);
        {
        }
        var friend2 = 38.0;
        friend2 = friend2 / 7.0;
        System.out.println("friend" + friend2);
    }
}
