public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    Employee(String name,double salary ,int workHours, int hireYear){
        this.name=name;
        this.salary=salary;
        this.workHours=workHours;
        this.hireYear=hireYear;
    }

    double tax(){
        if(this.salary>1000){
            double tax = this.salary * 0.03;
            return tax;
        }
        else{
            return 0.0;
        }
    }

    double bonus(){
        if(this.workHours>40){
            int bonus = 30*(this.workHours-40);
            return bonus;
        }
        else{
            return 0.0;
        }
    }

    double raiseSalary(){ // yıl = 2021
        int diff; //difference
        diff=2021-this.hireYear;
        if(diff<10){
            return (this.salary * 0.05);
        }
        else if(diff>9 && diff<20){
            return (this.salary * 0.10);
        }
        else{
            return (this.salary * 0.15);
        }
    }

    void toMyString(){

    double salaryWithTaxBonus;
        salaryWithTaxBonus = this.salary-tax()+bonus();
        double salarySum;
        salarySum = this.salary+bonus()+raiseSalary()-tax();


        System.out.println("Adı : "+this.name);
        System.out.println("Çalışma Saati : "+ this.workHours);
        System.out.println("Başlangıç Yılı : "+this.hireYear);
        System.out.println("Vergi : "+tax());
        System.out.println("Bonus : "+bonus());
        System.out.println("Maaş Artışı : "+ (bonus()-tax()+raiseSalary()));
        System.out.println("Vergi ve Bonuslar ile birlikte maaş : "+salaryWithTaxBonus);
        System.out.println("Toplam maaş : "+ salarySum);


    }


}
