package BT_JavaBasic_For_Array;

public class ForArray {

    public static void main(String[] args) {
        int count = 0;
        System.out.println("Vòng lặp FOR để in ra các số chẵn từ 0 đến 50: ");
        for(int i = 0;  i <=50; i ++){
            if(i%2==0){
                count++;
                System.out.print(i + " ");
            }
        }
        //System.out.println("\nTổng số phần tử chẵn: " + count);
        // Khởi tạo mảng để lưu các số chẵn
        int[] sochan = new int[count];

        //Gán nạp các số chẵn vào mảng
        int index = 0;
        for(int i = 0; i<=50; i++){
            if(i%2==0){
                sochan[index] = i;
                index++;
            }
        }
        // Duyệt mảng để in ra kết quả
        System.out.println("\ncác phần tử trong mảng: " + count);
        for(int i = 0; i < sochan.length; i++){
            System.out.print(sochan[i] + " ");
        }
    }
}
