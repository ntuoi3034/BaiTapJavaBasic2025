package bt_javabasic3;

public class QuanheLogic {
    static int a = 30;
    static int b = 45;
    static int c = 40;
    public static void SoNguyen(int n){
        int number = 100;
        if(n == number){
            System.out.println(n + " = 100");
        }else if(n < number){
            System.out.println(n + " < 100");
        }else{
            System.out.println(n + " > 100");
        }
    }
    public static void main(String[] args) {
        System.out.println("Toán tử &&: " + ((a < b) && (b == c)));
        System.out.println("Toán tử ||: " + ((a > b) || (b > c)));
        SoNguyen(200);
        SoNguyen(100);
        SoNguyen(50);
    }
}
