public class DoWhileTest1 {
    public static void main(String[] args) {

        //遍历1-100的偶数
        int i = 1;
        int count = 0; //记录偶数的个数
        int sum = 0; //记录偶数的和

        do{
            if(i % 2 == 0){
                System.out.println(i);
                count++;
                sum += i;
            }

            i++;

        }while(i <= 100);

        System.out.println("偶数的个数为" + count);
        System.out.println("偶数的总和为" + sum);
    }
}
