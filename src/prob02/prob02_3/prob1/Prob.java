package prob02.prob02_3.prob1;

public class Prob {

    public static void main(String[] args) {

        Emp emp = new Emp();
        emp.setId("12345");
        emp.setName("홍길동");
        emp.setBaseSalary(50000);
        System.out.println( emp.toString() );
        System.out.println( "봉급 = " + emp.getSalary( 30 ) );

    }

}
