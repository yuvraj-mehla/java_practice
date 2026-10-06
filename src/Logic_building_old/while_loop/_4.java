package Logic_building_old.while_loop;

public class _4 {
    public static void main(String[] args) {
        System.out.println("odd number between 1 and 100");
        int n = 1;
        while(n <= 100){
            if(n % 2 != 0){
                System.out.println(n);
            }
            n++;
        }

    }
}
