package br.com.stadlab.service;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/controle")
public class TestService {

  @GET
  @Path("/ola")
  @Produces("text/plain;charset=utf-8")
  public String testaServico() {
    return "Olá, o serviço funciona";
  }

}