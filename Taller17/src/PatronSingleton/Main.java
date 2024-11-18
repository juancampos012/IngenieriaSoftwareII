package PatronSingleton;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author juancamposbetancourth
 */
public class Main {
    public static void main(String[] args) {
        Settings settings = Settings.getInstance();
        
        System.out.println("Theme inicial: " + settings.getSetting("theme"));
        System.out.println("Language inicial: " + settings.getSetting("language"));
        
        settings.setSetting("theme", "dark");
        
        Settings otherSettings = Settings.getInstance();
        System.out.println("Theme después del cambio: " + otherSettings.getSetting("theme"));
    }
}