# Compte rendu de l'Activité pratique N°2 - ORM, JPA Hibernate Spring Data

# Une application Spring Boot pour gérer les produits.
### L’application a pour objectif de faciliter la gestion des produits dans une entreprise. Elle permet d’ajouter, modifier, supprimer et consulter les étudiants enregistrés.  
### Grâce à une interface intuitive et une base de données intégrée *H2*, les opérations de gestion sont rapides et accessibles. Par la suite, la connexion a été migrée vers une base de données *MySQL*, afin d’assurer une meilleure persistance et une gestion plus réaliste des données.

# Fonctionnalités principales
#### - Ajouter un nouvel étudiant  
#### - Modifier les informations d’un étudiant  
#### - Supprimer un étudiant  
#### - Afficher la liste complète des étudiants  
#### - Utiliser une base de données **H2** locale pour les tests  
#### - Migrer de **H2 Database** vers **MySQL** pour la persistance réelle des données

# Résultats de l’exécution :
### 1- Entité JPA : Product
#### La classe *Product* est annotée avec `@Entity`, ce qui permet à *Spring Data JPA* de la relier automatiquement à une table de la base de données (H2 ou MySQL selon la configuration).
#### Dans cette application, nous avons créé une entité *JPA* nommée `Product` afin de représenter les produits gérés par le système.

<img width="959" height="427" alt="image" src="https://github.com/user-attachments/assets/126a4b14-1fa3-4e8e-be96-fe5166a63959" />

### 2- Configuration de l’unité de persistance
#### La configuration de la base de données a été effectuée dans le fichier *application.properties*.  
#### Dans un premier temps, nous avons utilisé **H2 Database**, une base de données en mémoire intégrée à Spring Boot, idéale pour les tests et le développement.

### Configuration initiale (H2 Database)
#### server.port=8085
#### spring.datasource.url=jdbc:h2:mem:products-db
#### spring.h2.console.enabled=true

<img width="959" height="470" alt="db" src="https://github.com/user-attachments/assets/3561d8d5-30b3-4dd2-865e-7126e03751c0" />







