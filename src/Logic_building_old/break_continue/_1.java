package Logic_building_old.break_continue;

public class _1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 17 == 0) {
                break;              // exit the loop immediately
            }
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
