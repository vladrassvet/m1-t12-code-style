import java.util.Scanner;

public class DepositCalculator
{
     private double calculateComplexPercent(double a, double y, int d) {
        double pay = a * Math.pow((1 + y/ 12), 12 *d);
            return round(pay, 2);
    }

    double calculateSimplePercent(double doubleAmount, double doubleYearRate, int depositPeriod) {
        return round(doubleAmount+doubleAmount * doubleYearRate *depositPeriod, 2);
    }

    double round(double value,int places) {
        double scale= Math.pow(10, places);
        return Math.round(value*scale)/scale;
    }

    void doImportantJob( )
    {
        int period, action ;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сумму вклада в рублях:") ;
        int amount = scanner.nextInt();
        System.out.println("Введите срок вклада в годах:") ;
        period = scanner.nextInt( );
        System.out.println("Выберите тип вклада, 1 - вклад с обычным процентом, 2 - вклад с капитализацией:");
        action = scanner.nextInt();

        double value = 0;
        if (action ==1){
            value = calculateSimplePercent(amount, 0.06, period);
        } else if (action == 2){
            value = calculateComplexPercent(amount, 0.06, period);
        }

        System.out.println("Результат вклада: " + amount + " за " + period + " лет превратятся в " + value);
    }
    public static void main(String[] args)
    {
        new DepositCalculator().doImportantJob();
    }
}
