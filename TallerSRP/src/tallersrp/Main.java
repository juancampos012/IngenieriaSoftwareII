/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallersrp;

import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author juancamposbetancourth
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scanner = new Scanner (System.in);
        PasswordValidator passwordvalidator = new PasswordValidator();
        EmailService emailService = new EmailService();
        SalaryCalculator salaryCalculator = new SalaryCalculator();
        LinkedList<User> users = new LinkedList<>();
        
        while (true) {      
            try {
                System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
                System.out.println("Que desea hacer?: \n 1. Crear usuario\n 2. Ver datos\n 3. Enviar email\n 4. Salir");
                int option = scanner.nextInt();
                if(option == 1){
                    System.out.println("Ingesa tu nombre: ");
                    String name = scanner.next();
                    System.out.println("Ingresa tu salario: ");
                    double salary = scanner.nextDouble();
                    System.out.println("Ingesa tu correo: ");
                    String email = scanner.next();
                    System.out.println("Ingesa una contraseña: ");
                    String password = scanner.next();
                    System.out.println("Repite la contraseña: ");
                    String passwordV = scanner.next();
                    if(passwordvalidator.validate(password, passwordV) == false){
                        System.err.println("Las contraseñas no coinciden. ");
                    }else{
                        salary = salaryCalculator.calculateSalary(salary);
                        User user = new User(name, salary, email, password);
                        users.add(user);
                        System.out.println("Usuario creado con exito!");
                    }
                }else if(option == 2){
                    for(User user : users){
                        System.out.println(user.getInformation());
                    }
                }else if(option == 3){
                    System.out.println("Correo destinatario: ");
                    String addressee = scanner.next();
                    System.out.println("Mensaje: ");
                    String message = scanner.next();
                    System.out.println("Correo enviado correctamente a "+emailService.sendEmail(addressee, message));
                }else if(option == 4){
                    return;
                }
            } catch (InputMismatchException e) {
                System.err.println("Ingresa un numero.");
                scanner.next();
            }
        }
        
    }
    
}
