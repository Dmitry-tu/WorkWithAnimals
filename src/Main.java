public class Main extends BaseClass {


    private static int say;

    public static void main(String[] args) {
        System.out.println("Привет кого принесли?");
        System.out.println("Цифра 1 -кот, цифра 2 -собака");
        say = Animals.sc.nextInt();


        if (say == 1) {
            System.out.println("У вас кот");
            cat1.name();
            Animals.sc.nextLine();
            cat1.years();
            System.out.println("Регистрация завершена");
            Animals.finish();
        }
        if (say == 2) {
            System.out.println("У вас собака");
            dog1.name();
            Animals.sc.nextLine();
            dog1.years();
            System.out.println("Регистрация завершена");
            Animals.finish();
            {
                if (say != 1 && say != 2) {
                    System.out.println("Извините но мы не знаем что это за зверь!!");
                }

            }

        }
    }
}


