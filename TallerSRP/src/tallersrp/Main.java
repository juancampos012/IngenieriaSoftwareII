/*
 * La clase Usuario tiene más de una responsabilidad, lo que viola el Principio de Responsabilidad Única. Debería estar enfocada únicamente en 
 * gestionar la información relacionada con el usuario, pero además incluye funcionalidades para enviar correos electrónicos, validar contraseñas 
 * y calcular salarios, lo que son responsabilidades distintas.
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

    public static void main(String[] args) {
        // Inicializa el escáner para leer entradas del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Crea instancias de las clases responsables de validar contraseñas, enviar emails y calcular salarios
        PasswordValidator passwordValidator = new PasswordValidator();
        EmailService emailService = new EmailService();
        SalaryCalculator salaryCalculator = new SalaryCalculator();
        
        // Lista para almacenar los usuarios creados
        LinkedList<User> users = new LinkedList<>();

        // Bucle principal del programa
        while (true) {      
            try {
                // Muestra el menú principal y solicita una opción al usuario
                System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
                System.out.println("¿Qué desea hacer?: \n 1. Crear usuario\n 2. Ver datos\n 3. Enviar email\n 4. Salir");
                int option = scanner.nextInt();

                // Opciones del menú
                if (option == 1) {
                    // Llamada al método para crear un usuario
                    createUser(scanner, passwordValidator, salaryCalculator, users);
                } else if (option == 2) {
                    // Llamada al método para mostrar los datos de los usuarios
                    viewUsers(users);
                } else if (option == 3) {
                    // Llamada al método para enviar un correo electrónico
                    sendEmail(scanner, emailService);
                } else if (option == 4) {
                    // Sale del programa
                    return;
                }
            } catch (InputMismatchException e) {
                // Captura la excepción en caso de que el usuario no ingrese un número
                System.err.println("Ingresa un número.");
                scanner.next(); // Limpia la entrada inválida
            }
        }
    }

    // Método para crear un usuario
    private static void createUser(Scanner scanner, PasswordValidator passwordValidator, 
                                    SalaryCalculator salaryCalculator, LinkedList<User> users) {
        // Solicita información al usuario
        System.out.println("Ingresa tu nombre: ");
        String name = scanner.next();
        System.out.println("Ingresa tu salario: ");
        double salary = scanner.nextDouble();
        System.out.println("Ingresa tu correo: ");
        String email = scanner.next();
        System.out.println("Ingresa una contraseña: ");
        String password = scanner.next();
        System.out.println("Repite la contraseña: ");
        String passwordV = scanner.next();

        // Valida que las contraseñas coincidan
        if (!passwordValidator.validate(password, passwordV)) {
            System.err.println("Las contraseñas no coinciden.");
        } else {
            // Calcula el salario y crea el nuevo usuario
            salary = salaryCalculator.calculateSalary(salary);
            User user = new User(name, salary, email, password);
            users.add(user); // Añade el usuario a la lista
            System.out.println("¡Usuario creado con éxito!");
        }
    }

    // Método para mostrar los datos de los usuarios
    private static void viewUsers(LinkedList<User> users) {
        for (User user : users) {
            // Muestra la información de cada usuario en la lista
            System.out.println(user.getInformation());
        }
    }

    // Método para enviar un correo electrónico
    private static void sendEmail(Scanner scanner, EmailService emailService) {
        // Solicita la dirección del destinatario y el mensaje
        System.out.println("Correo destinatario: ");
        String addressee = scanner.next();
        System.out.println("Mensaje: ");
        String message = scanner.next();
        
        // Envía el correo usando el servicio de email
        emailService.sendEmail(addressee, message);
        System.out.println("Correo enviado correctamente a " + addressee);
    }
}
