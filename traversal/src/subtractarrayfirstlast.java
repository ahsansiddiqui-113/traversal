public class subtractarrayfirstlast {

    public static void subtract(){
    int[] num = {12,34,67,45,23,97};
    if (num.length >= 2) {
        //same as sum bs + ke jaga - laga diya
        int sum = num[0] - num[num.length - 1];
        System.out.println("Subtraction: " + sum);
    } else {
        System.out.println("error");
        }
    }
    public static void main(String[] args) {
        subtract();
    }
}
