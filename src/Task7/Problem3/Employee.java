package Task7.Problem3;

import java.util.Comparator;

    public class Employee implements Comparator<EmployeeDetails> {


        public int compare(EmployeeDetails e1, EmployeeDetails e2) {
            if (e1.getSalary()==e2.getSalary()){

                return (e1.getId()-e2.getId());
            }
            else
                return  (e1.getSalary() - e2.getSalary());


        }
    }

