package BT_JavaBasic_ToanTu_IfElse;

public class QuanheLogic {
    int a = 30;
    int b = 45;
    int c = 40;
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
        QuanheLogic QH = new QuanheLogic();
        System.out.println("Toán tử &&: " + ((QH.a < QH.b) && (QH.b == QH.c)));
        System.out.println("Toán tử ||: " + ((QH.a > QH.b) || (QH.b > QH.c)));
        SoNguyen(200);
        SoNguyen(100);
        SoNguyen(50);
    }
}
