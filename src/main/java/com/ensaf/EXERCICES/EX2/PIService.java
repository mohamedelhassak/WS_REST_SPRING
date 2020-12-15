package com.ensaf.EXERCICES.EX2;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/calculApproxPI")
public class PIService {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{seuil}")
    public String calcApproxPI(@PathParam("seuil") int s) {
        double somme=0;
        for (int i=0; i<s; i++)
            somme = somme + Math.pow(-1, i)/(2*i+1);

        return "le resultat est : "+somme;

    }

}
