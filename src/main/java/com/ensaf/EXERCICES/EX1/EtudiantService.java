package com.ensaf.EXERCICES.EX1;

import org.springframework.beans.factory.annotation.Autowired;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;
@Path("/etudiants")
public class EtudiantService {
    @Autowired
    private EtudiantsRepo etudiantsRepo;

    @Path("/")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Etudiant> getEtudiants(){

        return etudiantsRepo.findAll();
    }


    @Path("/ajouter")
    @POST
    @Consumes("application/json")
    public Etudiant ajouterEtudiant(Etudiant e){
        return etudiantsRepo.save(e);
    }


    @Path("/getNote/{name}")
    @GET
    @Produces("application/json")
    public double getNote(@PathParam(value = "name") String name){

        double note=0;
        Etudiant etud = etudiantsRepo.findByNom(name);
        note = (etud.getNote1()+etud.getNote2())/2;
        return note;
    }


    @Path("/getValidants")
    @GET
    @Produces("application/json")
    public List<Etudiant> getEtudiantsValidants(){

        List<Etudiant> etudiantsVal = new ArrayList<>();

        etudiantsRepo.findAll().forEach(e->{
            double note=0;
            note = (e.getNote1()+e.getNote2())/2;
            if (note>12){
                etudiantsVal.add(e);
            }
        });

        return etudiantsVal;
    }




    @Path("/getMajorants")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Etudiant> getMajorants(){

        List<Etudiant> etudiantsMaj = new ArrayList<>();

        etudiantsRepo.findAll().forEach(e->{
            double note=0;
            note = (e.getNote1()+e.getNote2())/2;
            if (note > 16){
                etudiantsMaj.add(e);
            }
        });

        return etudiantsMaj;
    }

}
