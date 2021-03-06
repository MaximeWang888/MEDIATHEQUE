package config;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class SecurityConfig {

    public static final String ROLE_BIBLIOTHECAIRE = "BIBLIOTHECAIRE";
    public static final String ROLE_ABONNE = "ABONNE";

    // String: Role
    // List<String>: urlPatterns.
    private static final Map<String, List<String>> mapConfig = new HashMap<>();

    static {
        init();
    }

    private static void init() {

        // Configurez pour le rôle "BIBLIOTHECAIRE".
        List<String> urlPatterns1 = new ArrayList<>();

        urlPatterns1.add("/userInfo");
        urlPatterns1.add("/espace-bibliothecaire");

        mapConfig.put(ROLE_BIBLIOTHECAIRE, urlPatterns1);

        // Configurez pour le rôle "ABONNE".
        List<String> urlPatterns2 = new ArrayList<>();

        urlPatterns2.add("/userInfo");
        urlPatterns2.add("/espace-abonne");

        mapConfig.put(ROLE_ABONNE, urlPatterns2);
    }

    public static Set<String> getAllAppRoles() {
        return mapConfig.keySet();
    }

    public static List<String> getUrlPatternsForRole(String role) {
        return mapConfig.get(role);
    }

}
