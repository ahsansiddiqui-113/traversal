public class sumArrayFirstLast {
    public static void sum(){
         int[] num = {12,11,45,67,33,78 };
//yeh if ke statement check kr rhi hy ke yr element ke andr 2 elements kam az kam hony chahiyn taake wo first r lat ko add kr sky
        if (num.length >= 2) {
            //btaya tha na ke last element ko index -1 diya jata hy 
            int sum = num[0] + num[num.length - 1];
            System.out.println("Sum is: " + sum);
        } else {
            System.out.println("error");
        }
    }
    public static void main(String[] args) {
     sum();  
    }
}
