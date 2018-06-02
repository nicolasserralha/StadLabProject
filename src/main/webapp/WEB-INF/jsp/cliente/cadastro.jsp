<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="index" tagdir="/WEB-INF/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core"%>
<index:templatePadrao title="Index">
	<jsp:attribute name="content">

	<div class="container">
		${msg }
		<c:url value=""></c:url> //criar a url por aqui
		<form action="/StadLabProject/cadastro" method="post">
	  		<div class="form-group">
	    		<label for="exampleInputEmail1">Nome</label>
	    		<input type="text" class="form-control" id="nome" name="nome" placeholder="Nome">
	  		</div>
	  		<div class="form-group">
	    		<label for="exampleInputEmail1">Email</label>
	    		<input type="email" class="form-control" id="email" name="email" placeholder="Email">
	  		</div>
	  		<div class="form-group">
	    		<label for="exampleInputEmail1">Celular</label>
	    		<input type="text" class="form-control" id="celular" name="celular" placeholder="Celular">
	  		</div>
	  		<div class="form-group">
	    		<label for="exampleInputEmail1">Cpf</label>
	    		<input type="text" class="form-control" id="cpf" name="cpf" placeholder="CPF">
	  		</div>
			<div class="form-group">
				<label for="exampleInputPassword1">Senha</label>
				<input type="password" class="form-control" id="senha" name="senha" placeholder="Senha">
			</div>
			<button type="submit" class="btn btn-default">Submit</button>
		</form>	
	</div>
	</jsp:attribute>
</index:templatePadrao>
