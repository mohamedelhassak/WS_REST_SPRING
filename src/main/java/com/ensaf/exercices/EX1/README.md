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

#### EtudiantService [@Path("/etudiants")]
contient 4 methodes :
*  getEtudiants :   List @Path("/")
*  ajouterEtudiant : Etudiant @Path("/ajouter")
*  getNote : double @Path("/getNote/{name}")
*  getValidants (note > 12) : List @Path("/getValidants")
*  getMajorants (note > 16) : List @Path("/getMajorants")
