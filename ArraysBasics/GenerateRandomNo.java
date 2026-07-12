import java.util.concurrent.ThreadLocalRandom;

public class GenerateRandomNo {
    public static void main(String[] args) {
        int num=(int)(Math.random()*100);
        System.out.println(num);

         int nums = ThreadLocalRandom.current().nextInt(10, 51); // 10 to 50
        System.out.println(nums);

        if(num==nums){
            System.out.println("Got it");
        }
    }
    
}
