package daily.challenges.day7;

import java.util.Scanner;

public class Challenge007JavaStaticInitializerBlock {
    static int B, H;
    static boolean flag;
    static {
        Scanner sc = new Scanner(System.in);
        B = sc.nextInt();
        H = sc.nextInt();
        if ((B >= -100 && B <= 100) && (H >= -100 && H <= 100))
            flag = !(B <= 0 || H <= 0);
        if (!flag) {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }

    }
    public static void main(String[] args) {
        if(flag){
            int area=B*H;
            System.out.print(area);
        }
    }
}
