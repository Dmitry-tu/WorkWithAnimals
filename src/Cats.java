public class Cats implements Animals {

    @Override
    public void name() {
        System.out.println("Имя?");
        sc.nextLine();

    }

    @Override
    public void years() {
        System.out.println("Сколько лет?");
        sc.nextLine();
    }

}
