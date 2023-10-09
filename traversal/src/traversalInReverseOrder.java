public class traversalInReverseOrder {
    public static void reverseOrder(){
        int[] num = {90,34,12,45,5};
        System.out.println("Array in reverse order:"); 
//yeh dekho hm agye jany k liye ++ krty hyn to reverse ke liye -- 
//r as btaya hoa ke last se jana to last waly ka index -1 hota hy 
        for (int i = num.length - 1; i >= 0; i--) {
            System.out.print(num[i] + " ");
        }
    }
    public static void main(String[] args) {
        reverseOrder();
    }
}