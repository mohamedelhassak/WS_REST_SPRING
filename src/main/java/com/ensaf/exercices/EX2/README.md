## EX2 : Calcul une approximation d'une PI=3.14....

##### Fonction 
 calcApproxPI
 
##### Input 
Seuil : Integer

##### Output
resultat : String

#### Annotaions :
* @Path("/calculApproxPI") : pour acceder au service
* @GET 
* @Produces(MediaType.APPLICATION_JSON) : la reponse en format JSON
* @Path("/{seuil}") 