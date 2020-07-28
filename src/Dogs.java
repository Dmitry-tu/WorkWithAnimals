public class Dogs implements Animals {

    @Override
    public void name() {
        System.out.println("как зовут?");
        sc.nextLine();

    }

    @Override
    public void years() {
        System.out.println("Ну и сколько ж нам годиков ?");
        sc.nextLine();


    }

}
