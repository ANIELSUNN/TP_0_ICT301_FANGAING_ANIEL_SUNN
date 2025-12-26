# TP 0 - Principes de Conception Logicielle (SOLID)

**Nom :** FANGAING  
**Prénoms :** ANIEL SUNN  
**Matricule :** 23U2228 
**Cours :** ICT301 - Génie Logiciel

---

## 1. Introduction
Ce projet présente une série d'exemples pratiques illustrant l'application des principes **SOLID** et les concepts de **Cohésion** et **Couplage**. L'objectif est de transformer un code rigide et fragile en une architecture flexible et maintenable.

---

## 2. Principes SOLID : Avant vs Après

### SRP (Single Responsibility Principle)
- **Problème :** Une classe `Book` gérait simultanément les données, l'affichage, la sauvegarde en base de données et la logique d'emprunt.
- **Solution :** Découpage en quatre classes distinctes : `BookSRP` (données), `BookPrinter` (affichage), `BookSaver` (persistance) et `BookBusinessLogic` (métier).

### OCP (Open/Closed Principle)
- **Problème :** Le `AreaCalculator` utilisait `instanceof` pour vérifier les types (Rectangle, Circle). Ajouter une nouvelle forme imposait de modifier le code existant.
- **Solution :** Création d'une interface `Shape`. Le calculateur dépend maintenant de l'abstraction, permettant d'ajouter de nouvelles formes sans modifier la logique de calcul.

### LSP (Liskov Substitution Principle)
- **Problème :** Faire hériter `Square` de `Rectangle` forçait des comportements incohérents (modifier la largeur modifiait la hauteur), provoquant des résultats de calcul d'aire inattendus.
- **Solution :** Suppression de l'héritage direct. `Rectangle` et `Square` implémentent désormais une interface commune `Shape`, garantissant que chaque objet se comporte correctement selon sa nature.

### ISP (Interface Segregation Principle)
- **Problème :** Une interface `Worker` unique forçait les robots (`RobotWorker`) à implémenter une méthode `eat()`, ce qui n'est pas pertinent pour eux.
- **Solution :** Séparation en deux interfaces spécifiques : `Workable` et `Eatable`. Le robot n'implémente que `Workable`.

### DIP (Dependency Inversion Principle)
- **Problème :** La classe `OrderProcessor` créait elle-même une instance de `MySQLDatabase` (couplage fort), rendant impossible le changement de base de données sans modifier le processeur.
- **Solution :** `OrderProcessor` dépend désormais d'une interface `Database`. L'implémentation concrète (MySQL ou MongoDB) est injectée par le constructeur.

---

## 3. Analyse Cohésion et Couplage
En parcourant le code de l'application de paiement, nous avons observé :
- **Faible Cohésion / Fort Couplage :** Le `PaymentProcessor` initial gérait tous les détails des types de paiement par des blocs `if/else`.
- **Haute Cohésion / Faible Couplage :** Après refactoring, chaque moyen de paiement (`CreditCardPayment`, etc.) possède sa propre classe. Le `PaymentProcessor2` ne dépend plus des détails mais d'une interface `PaymentMethod`.



---

## 4. Instructions pour l'exécution
Chaque principe est organisé dans un dossier spécifique :
- `SRP/` : Responsibility unique
- `OCP/` : Extension sans modification
- `LSP/` : Substituabilité des sous-classes
- `ISP/` : Ségrégation des interfaces
- `DIP/` : Inversion des dépendances