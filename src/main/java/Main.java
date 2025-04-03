import ru.netology.services.RecreationService ;

public class Main {
    public static void main(String[] args) {
        int recreationMonth = 0;
        int income = 10_000;
        int expense =3_000;
        int threshold =20_000;
        RecreationService service = new RecreationService();
        System.out.println(service.calcRecreation(recreationMonth, income, expense, threshold));



//      RecreationService service = new RecreationService();
//      System.out.println(service.calcRecreation(income, expense, threshold));




    }
}