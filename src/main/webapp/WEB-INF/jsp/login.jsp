<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="index" tagdir="/WEB-INF/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<index:templatePadrao title="Index">
	<jsp:attribute name="content">

	<div class="container">
		${msg}
		<c:url value="/login" var="action"></c:url>
		<form:form action="${action}" method="post">
	  		<div class="form-group">
	    		<label for="exampleInputEmail1">Email</label>
	    		<input type="email" class="form-control" id="email" name="user" placeholder="Email">
	  		</div>
			<div class="form-group">
				<label for="exampleInputPassword1">Senha</label>
				<input type="password" class="form-control" id="senha" name="senha" placeholder="Senha">
			</div>
			<button type="submit" class="btn btn-default">Submit</button>
		</form:form>
	</div>
	</jsp:attribute>
</index:templatePadrao>
