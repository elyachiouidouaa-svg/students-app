# Compte rendu de l'Activité pratique N°2 - ORM, JPA Hibernate Spring Data

# Une application Spring Boot pour gérer les produits.
### L’application a pour objectif de faciliter la gestion des produits dans une entreprise. Elle permet d’ajouter, modifier, supprimer et consulter les étudiants enregistrés.  
### Grâce à une interface intuitive et une base de données intégrée *H2*, les opérations de gestion sont rapides et accessibles. Par la suite, la connexion a été migrée vers une base de données *MySQL*, afin d’assurer une meilleure persistance et une gestion plus réaliste des données.
## Partie 1 
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
<img width="959" height="322" alt="dbaffiche" src="https://github.com/user-attachments/assets/19c9cd30-9068-40ca-a5f5-629531e8a6bb" />

### 3- Créer l'interface JPA Repository basée sur Spring data
#### L’application utilise *Spring Data JPA* pour gérer la communication avec la base de données. Au lieu d’écrire manuellement du code SQL, nous avons créé une interface appelée *ProductRepository* qui permet à Spring Boot de générer automatiquement toutes les opérations nécessaires (ajout, suppression, mise à jour, recherche…).

<img width="959" height="461" alt="image" src="https://github.com/user-attachments/assets/7fad4484-4588-4db0-bfe8-fdeb0de36941" />

### 4- Tester quelques opérations de gestion des produits
#### Une fois l’interface *ProductRepository* créée, nous pouvons tester plusieurs opérations de gestion de produits.  
#### Spring Boot permet de le faire directement depuis la classe principale *StudentsAppApplication.java*.
#### Dans cette partie, nous avons testé plusieurs opérations de gestion des produits, telles que l’ajout, la consultation, la recherche.
#### Pour la recherche, nous avons utilisé deux méthodes principales :
#### findById, findByName et findAll, qui permettent de retrouver un produit à partir de son identifiant ou de son nom.
#### searchByPrice, une méthode personnalisée permettant de rechercher les produits selon leur prix.

<img width="958" height="484" alt="date H2" src="https://github.com/user-attachments/assets/c2c11f7d-d8f2-49c9-8ea6-27ab06bc3a2a" />

<img width="959" height="467" alt="image" src="https://github.com/user-attachments/assets/45c79297-98fc-43c6-aba7-f3de9108d3d0" />

### 5-Migrer de H2 Database vers MySQL
#### Dans cette partie, nous avons effectué la migration de la base de données H2 vers MySQL.
#### L’objectif de cette étape est de passer d’une base de données en mémoire (utilisée principalement pour les tests) à une base de données réelle et persistante. Pour cela, nous avons modifié la configuration du fichier application.properties afin de remplacer les paramètres de connexion H2 par ceux de MySQL (URL, nom d’utilisateur, mot de passe et nom de la base).
#### Cette migration permet de conserver les données de manière permanente et de rendre l’application plus proche d’un environnement de production.

#### Nous avons ajouté le code de configuration correspondant dans le fichier application.properties, puis nous avons vérifié le résultat sur phpMyAdmin afin de confirmer que la connexion avec la base de données MySQL a bien été établie et que les tables ont été créées correctement.

<img width="959" height="422" alt="image" src="https://github.com/user-attachments/assets/cdcf8b93-410d-4fe1-8de0-48d9f7556008" />

<img width="959" height="492" alt="image" src="https://github.com/user-attachments/assets/fb37671e-605f-4415-b0e1-328af0e88d61" />

## Partie 2
























