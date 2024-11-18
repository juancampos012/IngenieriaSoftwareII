/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatronSingleton;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author juancamposbetancourth
 */
public class Settings {
    private static Settings instance;
    
    private Map<String, String> configuraciones;
    
    private Settings() {
        configuraciones = new HashMap<>();
        configuraciones.put("theme", "light");
        configuraciones.put("language", "en");
    }
    
    public static Settings getInstance() {
        if (instance == null) {
            synchronized (Settings.class) {
                if (instance == null) {
                    instance = new Settings();
                }
            }
        }
        return instance;
    }
    
    public String getSetting(String key) {
        return configuraciones.get(key);
    }
    
    public void setSetting(String key, String value) {
        configuraciones.put(key, value);
    }
}
