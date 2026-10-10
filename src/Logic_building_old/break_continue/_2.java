package Logic_building_old.break_continue;

public class _2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0) {
                continue;           // skip the rest of this iteration
            }
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
