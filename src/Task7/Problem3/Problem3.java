package Task7.Problem3;

import java.util.ArrayList;
import java.util.Collections;

    public class Problem3 {
        public static void main(String[] args) {
            ArrayList<EmployeeDetails> emp=new ArrayList<EmployeeDetails>();
            emp.add(new EmployeeDetails(101,40000));
            emp.add(new EmployeeDetails(103,45000));
            emp.add(new EmployeeDetails(105,30000));
            emp.add(new EmployeeDetails(107,65000));
            emp.add(new EmployeeDetails(104,45000));

            Employee E=new Employee();

            Collections.sort(emp,E);

            for(EmployeeDetails ep:emp){
                System.out.println(ep.getId() + " "+ep.getSalary() );
            }

        }
    }

