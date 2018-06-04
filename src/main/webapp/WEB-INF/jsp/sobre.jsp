<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="index" tagdir="/WEB-INF/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<c:if test="${nomeUsuario != null}">
	<index:templateLogado title="Index">
		<jsp:attribute name="content">
	
		<h1>${nomeUsuario }</h1>
		SOBRE NÓS
	
		</jsp:attribute>
	</index:templateLogado>
</c:if>

<c:if test="${nomeUsuario == null}">
	<index:templatePadrao title="Index">
		<jsp:attribute name="content">
	
		<h1>${nomeUsuario }</h1>
		SOBRE NÓS
	
		</jsp:attribute>
	</index:templatePadrao>
</c:if>
