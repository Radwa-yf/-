# HashMap_DS

## Structure du dossier

```
HashMap_DS
│   README.md
│   .gitignore
│   src
│   │   Ex3
│   │   │   Main.java
│   │   │   HashMap.java
│   Ex1.java
│   Ex2.java

```

## Exercice 1

1. Création d’une HashMap :
   Créez une HashMap nommée notesEtudiants qui associe le nom d'un étudiant (clé : String) à
   sa note finale sur 100 (valeur : Integer). Remplissez la HashMap avec les données suivantes :

````
   - Alice : 85
   - Bob : 92
   - Charlie : 78
   - David : 90
   - Eve : 88
````

2. Afficher les données :
   Écrivez une méthode pour afficher toutes les paires clé-valeur (nom de l'étudiant et sa note)
   de la HashMap.

3. Mise à jour des données :
   Charlie a amélioré sa performance et a obtenu une note de 82. Metez à jour sa note dans la
   HashMap.

4. Supprimer un étudiant :
   L'étudiant "David" a quitté le cours. Supprimez ses données de la HashMap.
   Vous créerez un programme avec une fonction main et les méthodes que vous jugerez
   nécessaires.

## Exercice 2

1. Rechercher une note :
   Écrivez une méthode getNote(String nom) qui prend le nom d’un étudiant et renvoie sa note
   si l'étudiant existe dans la HashMap. Sinon, la méthode doit indiquer que l'étudiant n'existe
   pas.
2. Calculer la moyenne des notes :
   Écrivez une méthode qui parcourt la HashMap et calcule la moyenne des notes des étudiants
   présents.

## Exercice 3

1. Création de la classe Matiere :
   Créez une classe Matiere avec les atributs suivants :
   ````
      - nom (de type String) : le nom de la matière.
      - note (de type Integer) : la note obtenue dans cette matière.
   ````

   La classe doit avoir :

    ````
      - Un constructeur pour initialiser ces atributs.
      - Des méthodes getters pour accéder à ces atributs.
      - Une méthode toString() pour afficher les informations d'une matière sous la forme Nom : Note
   ````
2. Création de la HashMap :
   Créez une HashMap nommée etudiantsMatieres qui associe chaque étudiant (clé : String) à
   une liste de matières (valeur : ArrayList<Matiere>). Remplissez la HashMap avec les données
   suivantes :

    ````
   - Alice :
       - MathémaƟques : 85
       - Histoire : 90
       - InformaƟque : 95
   - Bob :
       - MathémaƟques : 92
       - Histoire : 85
       - InformaƟque : 88
   - Charlie :
       - MathémaƟques : 78
       - Histoire : 80
       - InformaƟque : 82
    ````

3. Afficher les résultats d'un étudiant :
   Écrivez une méthode resuEtudiant(String nom) qui prend le nom d’un étudiant et affiche
   toutes les matières avec les notes obtenues pour cet étudiant. Si l’étudiant n’existe pas,
   affichez un message indiquant que l’étudiant n'a pas été trouvé.
4. Ajouter une nouvelle matière à un étudiant :
   Écrivez une méthode ajouterMatiere(String nomEtudiant, Matiere matiere) qui permet
   d'ajouter une nouvelle matière avec sa note pour un étudiant existant. Par exemple, ajouter
   la matière "Physique" avec une note de 89 pour Alice.

5. Mise à jour d'une note :
   Créez une méthode majNote(String nomEtudiant, Matiere mat, int note) qui met à jour la
   note d’un étudiant dans une matière spécifique. Par exemple, si Bob a amélioré sa note en
   Histoire et a obtenu 90, mettez à jour cette note.
6. Calculer la moyenne générale d’un étudiant :
   Écrivez une méthode calculMoyenneGenerale(String nom) qui calcule et retourne la
   moyenne de toutes les matières d’un étudiant. La méthode doit prendre en entrée le nom de
   l’étudiant.
7. Rechercher l'étudiant avec la meilleure moyenne générale :
   Écrivez une méthode trouverMeilleur() qui parcourt la HashMap et retourne le nom de
   l’étudiant ayant la meilleure moyenne générale.

## Bonus : Filtrage des étudiants par matière et par note

1. Écrire une méthode getSuperieurAEn(Matiere m, int note) pour rechercher les étudiants
   ayant une note supérieure à une valeur donnée dans une matière spécifique
   Par exemple, afficher tous les étudiants ayant une note supérieure à 85 en "Informatique".



