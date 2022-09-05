package review;

public class LogicEasy {

    //1-2-3-4-5-6-7-8-9-10

    public static void main(String[] args) {
        int i = 0;
        while (i <= 100) {
            if (i%2==1){
                if (i == 99) {
                    System.out.print(i);
                    break;
                }
                System.out.print(i + "-");

            }i++;
        }
    }

}
