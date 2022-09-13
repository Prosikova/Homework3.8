public class Main {
    public static void main(String[] args) {
       int salaryM = 67760;
       int salaryD = 83690;
       int salaryK = 76230;
       double kSalaryIncrease = 1.1;
       double salaryMNew = salaryM * kSalaryIncrease;
       System.out.println("Маша теперь получает " + salaryMNew + " рублей");
       double salaryDNew = salaryD * kSalaryIncrease;
       System.out.println("Денис теперь получает " + salaryDNew + " рублей");
       double salaryKNew = salaryK * kSalaryIncrease;
       System.out.println("Кристины теперь получает " + salaryKNew + " рублей");

       int monthYear = 12;
       int salaryMYear = salaryM * monthYear;
       System.out.println("Годовой доход Марии со старой зарплатой " + salaryMYear + " руб.");
       double salaryMYearNew = salaryMNew * monthYear;
       System.out.println("Годовой доход Марии с новой зарплатой " + salaryMYearNew + " руб.");
       double incomeDifferenceM = salaryMYearNew - salaryMYear;
       System.out.println("Годовой доход Марии вырос на " + incomeDifferenceM + " рублей");

       int salaryDYear = salaryD * monthYear;
       System.out.println("Годовой доход Дениса со старой зарплатой " + salaryDYear + " руб.");
       double salaryDYearNew = salaryDNew * monthYear;
       System.out.println("Годовой доход Дениса с новой зарплатой " + salaryDYearNew + " руб.");
       double incomeDifferenceD = (salaryDYearNew + salaryDYear) % salaryDYear;
       System.out.println("Годовой доход Дениса вырос на " + incomeDifferenceD + " рублей");

       int salaryKYear = salaryK * monthYear;
       System.out.println("Годовой доход Кристины со старой зарплатой " + salaryKYear + " руб.");
       double salaryKYearNew = salaryKNew * monthYear;
       System.out.println("Годовой доход Кристины с новой зарплатой " + salaryKYearNew + " руб.");
       double incomeDifferenceK = (salaryKYearNew + salaryKYear) % salaryKYear;
       System.out.println("Годовой доход Кристины вырос на " + incomeDifferenceK + " рублей");






    }
}