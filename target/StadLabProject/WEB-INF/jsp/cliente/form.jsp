<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="index" tagdir="/WEB-INF/tags"%>
<index:templatePadrao title="Index">
	<jsp:attribute name="content">

	<div class="container">
		<form >
	  		<div class="form-group">
	    		<label for="exampleInputEmail1">Nome</label>
	    		<input type="text" class="form-control" id="inputNome" placeholder="Nome">
	  		</div>
	  		<div class="form-group">
	    		<label for="exampleInputEmail1">Email</label>
	    		<input type="email" class="form-control" id="inputEmail" placeholder="Email">
	  		</div>
	  		<div class="form-group">
	    		<label for="exampleInputEmail1">Cpf</label>
	    		<input type="text" class="form-control" id="inputCpf" placeholder="CPF">
	  		</div>
			<div class="form-group">
				<label for="exampleInputPassword1">Senha</label>
				<input type="password" class="form-control" id="inputSenha" placeholder="Senha">
			</div>
			<button type="submit" class="btn btn-default">Submit</button>
		</form>	
	</div>
	</jsp:attribute>
</index:templatePadrao>
