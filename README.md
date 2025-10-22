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

### 2- Configurer l'unité de persistance dans le ficher application.properties 
#### La configuration de la base de données a été effectuée dans le fichier *application.properties*.  
#### Dans un premier temps, nous avons utilisé **H2 Database**, une base de données en mémoire intégrée à Spring Boot, idéale pour les tests et le développement.

### Configuration initiale (H2 Database)
#### server.port=8085
#### spring.datasource.url=jdbc:h2:mem:products-db
#### spring.h2.console.enabled=true

#### - *Console H2* accessible depuis `http://localhost:8085/h2-console`
<img width="959" height="470" alt="db" src="https://github.com/user-attachments/assets/3561d8d5-30b3-4dd2-865e-7126e03751c0" />

#### - *Résultats d’exécution* affichant les produits enregistrés dans la console

### 3- Créer l'interface JPA Repository basée sur Spring data
#### L’application utilise *Spring Data JPA* pour gérer la communication avec la base de données. Au lieu d’écrire manuellement du code SQL, nous avons créé une interface appelée *ProductRepository* qui permet à Spring Boot de générer automatiquement toutes les opérations nécessaires (ajout, suppression, mise à jour, recherche…).

<img width="959" height="461" alt="image" src="https://github.com/user-attachments/assets/7fad4484-4588-4db0-bfe8-fdeb0de36941" />

<img width="959" height="322" alt="dbaffiche" src="https://github.com/user-attachments/assets/19c9cd30-9068-40ca-a5f5-629531e8a6bb" />

### 4- Tester quelques opérations de gestion des produits
#### Une fois l’interface *ProductRepository* créée, nous pouvons tester plusieurs opérations de gestion de produits.  
#### Spring Boot permet de le faire directement depuis la classe principale *StudentsAppApplication.java*.
#### Dans cette partie, nous avons testé plusieurs opérations de gestion des produits, telles que l’ajout, la consultation, la recherche, la mise à jour et la suppression.
#### Pour la recherche, nous avons utilisé deux méthodes principales :
#### findById, findByName et findAll, qui permettent de retrouver un produit à partir de son identifiant ou de son nom.
#### searchByPrice, une méthode personnalisée permettant de rechercher les produits selon leur prix.

<img width="958" height="484" alt="date H2" src="https://github.com/user-attachments/assets/c2c11f7d-d8f2-49c9-8ea6-27ab06bc3a2a" />

<img width="958" height="464" alt="test" src="https://github.com/user-attachments/assets/4ce44148-e3d9-4fed-a6c3-4cf67b6537c5" />

<img width="959" height="467" alt="image" src="https://github.com/user-attachments/assets/45c79297-98fc-43c6-aba7-f3de9108d3d0" />















