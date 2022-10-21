package MBC;

public class Main {

    public static void main(String[] args) {

        Fan fan1 = new Fan(2, Direction.FORWARD);

        System.out.println("INITIAL STATE :: ");
        System.out.println(fan1);

        System.out.println("-------------");

        System.out.println(fan1.pullCord1());
        System.out.println(fan1);

        System.out.println(fan1.pullCord1());
        System.out.println(fan1);

        System.out.println(fan1.pullCord2());
        System.out.println(fan1);

        System.out.println(fan1.pullCord1());
        System.out.println(fan1);

    }

}
