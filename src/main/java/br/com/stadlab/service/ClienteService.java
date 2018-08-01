package br.com.stadlab.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/cliente")
public class ClienteService {

  @GET
  @Path("/ola")
  @Produces("text/plain")
  public String testaServico() {
    return "Olá, o serviço funciona";
  }
  
}