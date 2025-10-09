package BT_JavaBasic2;

public class Calculator {
    public static int SoNguyen(int a, int b){
        return a + b;
    }
    public static float SoThuc(float c, float d){
        return c + d;
    }
    public static void main(String[] args) {
        int SumSoNguyen = SoNguyen(7,6);
        System.out.println("SumSoNguyen:" + SumSoNguyen);
        float SumSoThuc = SoThuc(1.32F, 1.72F);
        System.out.println("SumSoThuc:" + SumSoThuc);
    }
}
