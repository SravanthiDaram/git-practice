package OOPS_13th_Jan_2024.Modifiers.criminals;

import OOPS_13th_Jan_2024.Modifiers.police.cop;

public class thief {
    public static void main(String[] args) {
        cop c= new cop(10);
        System.out.println(c.gun);
        //c.canIShoot(); it's a private only cop can shoot

    }
}
