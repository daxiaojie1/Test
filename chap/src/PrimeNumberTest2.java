public class PrimeNumberTest2 {
    public static void main(String[] args) {

        //为了测试代码的性能 哪种写法好 所以可以通过时间来反应 获取系统当前的时间
        long startTime = System.currentTimeMillis();

        int count = 0; //记录质数的个数

        boolean isPrime = true;

        for (int i = 2; i <= 100000; i++) {  //遍历100000以内的自然数

            //判断i是否为质数
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false; //一旦除尽了就改成false 因为有约数的数不是质数
                    break;//没必要了 没必要再往后除了 有一次约数之后就已经不是质数了 此优化能缩小时间 提高性能
                }
            }
            if (isPrime) {
                count++;
            }

            //重置isPrime 比如2 3 都没进入第一个if循环 但4的时候 进入了第一个if 所以isPrime变成了false，以后5的时候也是false，就不对了，所以要重置isPrime
            isPrime = true;
        }

        ////获取系统当前的时间
        long endTime = System.currentTimeMillis();

        System.out.println("质数的个数是：" + count);
        System.out.println("花费的时间为：" + (endTime - startTime) + "ms");
    }
}
