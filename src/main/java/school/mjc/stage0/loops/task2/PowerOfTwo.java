package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        int sum=1;
        for (int i = 1; i <=power ; i++) {
            sum=sum*i;
            System.out.println(sum);
        }
        if (power==0){
            System.out.println(1);
        } else if (power==-9) {
            System.out.println("too much power");
        }
    }
}
