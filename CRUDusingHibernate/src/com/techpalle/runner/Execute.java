package com.techpalle.runner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.techpalle.model.Employee;

public class Execute {

	public static void main(String[] args) {
          SessionFactory sf = new Configuration().configure().buildSessionFactory();
          Session s = sf.openSession();
          
          Transaction t = s.beginTransaction();

			
			/*
			 * Employee e1 = new Employee("Sudeep",500000,"Java Developer"); Employee e2 =
			 * new Employee("Steve",400000,"Python developer"); Employee e3 = new
			 * Employee("Bill",600000,"Java developer"); Employee e4 = new
			 * Employee("andy",500000,"HR"); Employee e5 = new
			 * Employee("anil",450000,"tester");
			 * 
			 * s.save(e1); s.save(e2); s.save(e3); s.save(e4); s.save(e5);
			 */
			 
          
          //How to Read single row in hibernate
          
			
		/*	  Employee emp1 = s.get(Employee.class,1);
			  System.out.println(emp1.getEno());
			  System.out.println(emp1.getEname());
			  System.out.println(emp1.getEdesignation());
			  System.out.println(emp1.getEsalary());
			 System.out.println("-------------------");
			 
			 Employee emp2 = s.get(Employee.class,3);
			  System.out.println(emp2.getEno());
			  System.out.println(emp2.getEname());
			  System.out.println(emp2.getEdesignation());
			  System.out.println(emp2.getEsalary());  */
          
         /* Employee u1 = s.get(Employee.class,2);
          u1.setEname("steve rogers");
          u1.setEsalary(350000);
          s.update(u1);  */
          
          Employee d1 = s.get(Employee.class,3);
          s.delete(d1);
          
          
          t.commit();
          
          s.close();
          sf.close();
	}

}
