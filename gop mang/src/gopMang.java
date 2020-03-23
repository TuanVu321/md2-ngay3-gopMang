import java.util.Scanner;

public class gopMang {
    public static void main(String[] args) {
        int[] arr1 = new int[3];
        int[] arr2 = new int[3];
        int[] arr3 = new int[6];
        Scanner scanner = new Scanner(System.in);
        int i=0,j=0;
        while(i<arr1.length){
            System.out.println("Nhap so mang 1 thu "+(i+1));
            arr1[i]= scanner.nextInt();
            i++;
        }
        while(j<arr2.length){
            System.out.println("nhap so mang 2 thu "+(j+1));
            arr2[j] = scanner.nextInt();
            j++;
        }
        for(int n =0;n<arr1.length;n++){
            arr3[n]=arr1[n];
        }
        for(int m = 0; m<arr2.length;m++){
            arr3[m+arr1.length]=arr2[m];
        }
        for(int k = 0; k<arr3.length;k++){
            System.out.println(arr3[k]);
        }
    }

}
