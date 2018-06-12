<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="index" tagdir="/WEB-INF/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<index:templatePadrao title="Index">
	<jsp:attribute name="content">

	<div class="container">
	
		<c:url value="/estabelecimento/cadastrar" var="action"></c:url>
		<form:form action="${action}" method="post">
		<label for="selectTipo">
			<select id="selectTipo" class="selectpicker" name="tipoEstabelecimento">
				<option value="vazio" selected="selected">Escolha</option>
				<option value="Comercial" >Comercial</option>
				<option value="Residencial">Residencial</option>
			</select>
		</label>
		
	  		<div class="form-group">
	    		<label for="endereco">Endereço</label>
	    		<input type="text" class="form-control" id="endereco" name="endereco" placeholder="Endereço">
	  		</div>
	  		
	  		<div class="form-group">
	    		<label for="bairro">Bairro</label>
	    		<input type="text" class="form-control" id="bairro" name="bairro" placeholder="Bairro">
	  		</div>
	  		
	  		<div class="form-group">
	    		<label for="cidade">Cidade</label>
	    		<input type="text" class="form-control" id="cidade" name="cidade" placeholder="Cidade">
	  		</div>
	  		
	  		<div class="form-group">
	    		<label for="cep">Cep</label>
	    		<input type="text" class="form-control" id="cep" name="cep" placeholder="Cep">
	  		</div>
	  		
	  		<div class="form-group">
	    		<label for="uf">UF</label>
	    		<input type="text" class="form-control" id="uf" name="uf" placeholder="UF">
	  		</div>
	  		
	  		<div class="form-group">
	    		<label for="complemento">Complemento</label>
	    		<input type="text" class="form-control" id="complemento" name="complemento" placeholder="Complemento">
	  		</div>

			<button type="submit" class="btn btn-default">Submit</button>
		</form:form>
		
	</div>
	</jsp:attribute>
</index:templatePadrao>
