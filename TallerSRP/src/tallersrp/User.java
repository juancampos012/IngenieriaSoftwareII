/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallersrp;

/**
 *
 * @author juancamposbetancourth
 */
public class User {
    private String name;
    private String email;
    private String password;
    private double salary;

    public User(String name, double salary, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.salary = salary;
    }

    public String getInformation() {
        return "Nombre: " + name + "\nEmail: " + email + "\nSalario: " + salary;
    }
}
