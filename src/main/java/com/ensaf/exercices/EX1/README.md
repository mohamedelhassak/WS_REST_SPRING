## EX 1 : gestion des etudiants

#### Etudiant
definie par :
* Id
* Nom
* Prenom
* Note 1
* Note 2
#### EtudiantsRepo
* implementation de  JPA

#### EtudiantService
contient 4 methodes :
*  getEtudiants : List
*  ajouterEtudiant : Etudiant
*  getNote : double
*  getValidants (note > 12) : List
*  getMajorants (note > 16) : List
