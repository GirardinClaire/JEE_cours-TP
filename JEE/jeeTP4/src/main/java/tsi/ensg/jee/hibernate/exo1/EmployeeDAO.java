package tsi.ensg.jee.hibernate.exo1;

import jdk.jshell.spi.ExecutionControl;
import org.hibernate.QueryException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import java.awt.desktop.UserSessionEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class EmployeeDAO {

    private final SessionFactory sessionFactory = HibernateUtils.getSessionFactory();

    public long create(String firstName, String lastName, int salary) {
        Session session = sessionFactory.openSession();
        Employee employee = new Employee(firstName, lastName, salary);
        session.beginTransaction();
        long id = (long)  session.save(employee);
        session.getTransaction().commit();
        session.close();
        return id;
    }
    public boolean delete(long id) {
        try {
            Session session = sessionFactory.openSession();
            session.beginTransaction();
            Optional<Employee>  employee = this.get(id);
            session.delete(employee.get());
            session.getTransaction().commit();
            session.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

    }

    public boolean update(long id, int newSalary) {
        try {
            Session session = sessionFactory.openSession();
            session.beginTransaction();
            Optional<Employee>  employee = this.get(id);
            employee.get().setSalary(newSalary);
            session.merge(employee.get());
            session.getTransaction().commit();
            session.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean update(long id, boolean raise, int bonus, int minSalary) {
        try {
            Session session = sessionFactory.openSession();
            session.beginTransaction();
            Optional<Employee>  employee = this.get(id);
            if (raise) {
                employee.get().setSalary(employee.get().getSalary()*11/10);
            }
            int salary = employee.get().getSalary();
            if (salary < minSalary) {
                employee.get().setSalary(employee.get().getSalary() + bonus);
            }
            session.merge(employee.get());
            session.getTransaction().commit();
            session.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public Optional<Employee> get(long id) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        Employee employee = session.get(Employee.class, id);
        session.getTransaction().commit();
        session.close();
        return Optional.ofNullable(employee);
    }

    public List<Employee> getAll() {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        List<Employee> result = session.createQuery("from Employee", Employee.class).getResultList();
        session.getTransaction().commit();
        session.close();
        return result;
    }

    public List<Employee> getAllByFirstName(String firstName) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        Query<Employee> query = session.createQuery("FROM Employee e WHERE e.firstName = :Name", Employee.class);
        query.setParameter("Name", firstName);
        List<Employee> result = query.getResultList();
        session.getTransaction().commit();
        session.close();
        return result;
    }

}
