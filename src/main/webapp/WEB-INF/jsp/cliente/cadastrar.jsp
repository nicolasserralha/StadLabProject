<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="index" tagdir="/WEB-INF/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<index:templatePadrao title="Index">
	<jsp:attribute name="content">

	<div class="container">
		
		<c:if test="${sucesso == 1}" var="res" scope="request">
			${msg }
		<c:url value="/login" var="login"></c:url>
		<a class="btn btn-default" href="${login}" role="button">Login</a>
			
		</c:if>
				
		<c:if test="${sucesso != 1}" var="res" scope="request">
			<c:url value="/cliente/cadastrar" var="action"></c:url>
			<form:form action="${action}" method="post" commandName="cliente">
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
			</form:form>
		</c:if>
	</div>
	</jsp:attribute>
</index:templatePadrao>
