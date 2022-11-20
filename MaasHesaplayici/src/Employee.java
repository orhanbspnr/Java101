public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    double tax() {
        if (this.salary > 1000) {
            return this.salary * 0.03;
        }
        return 0.0;
    }

    double bonus() {
        int extraHours = this.workHours - 40;
        if (extraHours > 0) {
            return 30 * extraHours;
        } else {
            return 0.0;
        }
    }

    double raiseSalary() {
        int workYear = 2021 - this.hireYear;
        if (workYear < 10) {
            return this.salary * 0.05;
        } else if ((workYear > 9) && (workYear < 20)) {
            return this.salary * 0.10;
        } else
            return this.salary * 0.15;
    }

    void toString(Employee emp) {
        System.out.println("===================");
        System.out.println("Adı : " + emp.name);
        System.out.println("Maaşı : " + emp.salary);
        System.out.println("Çalışma Saati : " + emp.workHours);
        System.out.println("Başlangıç Yılı : " + emp.hireYear);
        System.out.println("Vergi : " + emp.tax());
        System.out.println("Bonus : " + emp.bonus());
        System.out.println("Maaş Artışı : " + emp.raiseSalary());
        System.out.println("Vergi ve Bonuslar ile birlikte maaş : " + (emp.salary - emp.tax() + emp.bonus()));
        System.out.println("Toplama Maaş : " + (emp.salary + emp.raiseSalary()));


    }


}

