# BankManager – Gestionnaire de Comptes Bancaires

Ce projet Java simule une structure simple de gestion de comptes bancaires à l’aide de l’héritage en programmation orientée objet (POO). Il illustre la création de différents types de comptes avec des comportements spécifiques.


## Structure du projet

- **`BankAccount`** : classe mère contenant les attributs communs :
    - `account` (numéro ou nom de compte)
    - `balance` (solde)

- **`CheckingAccount`** *(compte courant)* :
    - Hérite de `BankAccount`
    - Ajoute un attribut `limit` (découvert autorisé)

- **`SavingsAccount`** *(compte épargne)* :
    - Hérite de `BankAccount`
    - Ajoute un attribut `interestRate` (taux d’intérêt)

- **`COD`** *(Certificat de dépôt)* :
    - Hérite de `BankAccount`
    - Ajoute un attribut `duration` (durée du placement)


## Exécution

- Le fichier `Main.java` instancie différents types de comptes :
    - Création de comptes avec leurs données spécifiques
    - Affichage des détails de chaque compte
- Le projet fonctionne en **console Java**


## Objectifs

- Comprendre les **concepts d’héritage** et de **polymorphisme**
- Savoir structurer un projet Java orienté objet
- Manipuler des objets dérivés et leurs attributs propres
- Travailler avec une hiérarchie de classes


## Exemple de sortie

```text
Compte : 001 - Solde : 150000.0
Type : Compte Courant - Découvert autorisé : 50000.0

Compte : 002 - Solde : 200000.0
Type : Compte Épargne - Taux d'intérêt : 3.5%

Compte : 003 - Solde : 1000000.0
Type : COD - Durée : 12 mois
