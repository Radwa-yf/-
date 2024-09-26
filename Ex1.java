import java.util.HashMap;

public class Ex1 {
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
}
