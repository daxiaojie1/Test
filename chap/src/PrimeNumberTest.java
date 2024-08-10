public class PrimeNumberTest {
    public static void main(String[] args) {
        /*
        for (int i = 2; i < 100; i++) { //遍历100以内的自然数
            int number = 0; //记录除尽 i的约数的个数
            //判断i是否为质数
            for (int j = 2; j < i; j++) {

                if (i % j == 0) {
                    count++;
                }
            }

            if (count == 0) {
                System.out.println(i); //这时i就是质数
            }
            */

        int count = 0; //记录质数的个数
        boolean isPrime = true;
        for (int i = 2; i <= 100; i++) {  //遍历100以内的自然数

            //判断i是否为质数
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false; //一旦除尽了就改成false 因为有约数的数不是质数
                }
            }
            if (isPrime) {
                System.out.println(i); //这时i就是质数
                count++;
            }

            //重置isPrime 比如2 3 都没进入第一个if循环 但4的时候 进入了第一个if 所以isPrime变成了false，以后5的时候也是false，就不对了，所以要重置isPrime
            isPrime = true;
        }
        System.out.println("质数的个数是：" + count);
    }
}
