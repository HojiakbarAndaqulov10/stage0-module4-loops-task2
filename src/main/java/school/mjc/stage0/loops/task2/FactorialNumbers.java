package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public  void printFactorialRow(int printToInclusive) {
        int sum=1;
        for (int i = 1; i <= printToInclusive; i++) {
            sum=sum*i;
            System.out.println(sum);
        }
        if (printToInclusive==0){
            System.out.println(1);
        }
    }

    public static void main(String[] args) {

    }
}
