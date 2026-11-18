package mypackage;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
//        for(int i=0;i<10;i++){
//            System.out.println(i);
//
//        }
//    }
//}
//        for (int i = 0; i <= 50; i++) {
//            if (i % 2 == 0) {
//                System.out.println(i);
//            }
//        }
//    }
//}
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a:");
        int a = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(a + "*" + i + "=" +a * i);
        }
    }
}
