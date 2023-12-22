package tsi.ensg.jee.hibernate.exo1;


import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Main {
    public static void main(String[] args) {

        EmployeeDAO employeeDAO = new EmployeeDAO();

        // Création de 5 employees
        long idBoby = employeeDAO.create("Boby", "Lapointe", 500);
        long idBoris = employeeDAO.create("Boris", "Vian", 600);
        long idBoris2 = employeeDAO.create("Boris", "Vianet", 80);
        long idLisa = employeeDAO.create("Lisa", "Simpson", 100);
        long idMarge = employeeDAO.create("Marge", "Simpson", 1000);
        long idHomer = employeeDAO.create("Homer", "Simpson", 450);

        // Affichage de tous les employees de la BDD
        System.out.println("Contenu de la BDD avant modification : ");
        for ( Employee employee : employeeDAO.getAll() ) {
            System.out.println(employee.toString());
        }
        // Suppression de Lisa Simpson
        employeeDAO.delete(idLisa);

        // Augmentation du salaire de Homer
        employeeDAO.update(idHomer, 550);

        // Affichage de tous les employees de la BDD
        System.out.println("\nContenu de la BDD après modification : ");
        for ( Employee employee : employeeDAO.getAll() ) {
            System.out.println(employee.toString());
        }

        // Ajout de 100€ à ts les employees qui gagnent moins de 600€
        for ( Employee employee : employeeDAO.getAll() ) {
            employeeDAO.update(employee.getId(), false, 100, 600);
        }

        // Affichage de tous les employees de la BDD
        System.out.println("\nContenu de la BDD après augmentation du min salariale : ");
        for ( Employee employee : employeeDAO.getAll() ) {
            System.out.println(employee.toString());
        }

        // Affichage de tous les employees de la BDD ayant pour prénom "Boris"
        System.out.println("\nAffichage de tous les employees de la BDD ayant pour prénom \"Boris\": ");
        String firstName = "Boris";
        for ( Employee employee : employeeDAO.getAllByFirstName(firstName) ) {
            System.out.println(employee.toString());
        }



    }

}