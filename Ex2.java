import java.util.HashMap;

public class Ex2 {

    public static void main(String[] args) {
        // Création de la liste de notes
        HashMap<String, Integer> map = new HashMap<>();

        // Ajout des notes
        map.put("Alice", 85);
        map.put("Bob", 92);
        map.put("Charlie", 78);
        map.put("David", 90);
        map.put("Eve", 88);

        // Affichage des notes
        afficher(map);

        // Mise à jour de la note
        map.put("Charlie", 82);

        // Affichage des notes
        afficher(map);

        // Rechercher une note
        System.out.println(getNote(map, "Charlie"));
        System.out.println(getNote(map, "Frank"));

        // Calculer la moyenne des notes
        System.out.println("Moyenne des notes : " + calculerMoyenne(map));
    }

    /**
     * Affiche les notes
     *
     * @param map
     */
    public static void afficher(HashMap<String, Integer> map) {
        System.out.println("Liste des notes :");
        for (String key : map.keySet()) {
            System.out.println(key + " : " + map.get(key));
        }
        System.out.println();
    }

    /**
     * Rechercher une note
     *
     * @param map
     * @param nom
     * @return
     */
    public static String getNote(HashMap<String, Integer> map, String nom) {
        if (map.containsKey(nom)) {
            return nom + " : " + map.get(nom) + "\n";
        } else {
            return "L'étudiant " + nom + " n'existe pas." + "\n";
        }
    }

    /**
     * Calculer la moyenne des notes
     *
     * @param map
     * @return
     */
    public static double calculerMoyenne(HashMap<String, Integer> map) {
        if (map.isEmpty()) {
            return 0.0;
        }
        int total = 0;
        for (int note : map.values()) {
            total += note;
        }
        return (double) total / map.size();
    }
}