package prob02.prob02_3.prob1;

public class Emp {
    private int id;
    private String name;
    private double baseSalary;

    public int getId() {
        return id;
    }

    public void setId(String id) {
        this.id = Integer.parseInt(id);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public double getSalary(double bonus) {
        return baseSalary + baseSalary * bonus;
    }

    public String toString() {
        return name + "(" + id + ") 사원의 기본급은 " + (int)baseSalary + "원 입니다.";
    }
}
