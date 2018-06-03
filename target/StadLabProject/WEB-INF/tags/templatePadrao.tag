<%@ tag language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ attribute name="title" required="true" rtexprvalue="true"%>
<%@ attribute name="content" fragment="true"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>${title }</title>
	<link rel="stylesheet" href="<c:url value='/resources/css/bootstrap.min.css' />">
    <link rel="stylesheet" href="<c:url value='/resources/css/main.css' />">
</head>
<body>
	
	<div class='navbar navbar-static-top'>
      <div class='container' role='navigation'>
        <div class='navbar-header'>
          <a href='home.jsp' class='navbar-brand'>StadLabProject</a>

          <button type='button' class='navbar-toggle collapsed' data-toggle='collapse' data-target='.navbar-collapse'>
            <span class='sr-only'>Toggle navigation</span>
            <span class='icon-bar'></span>
            <span class='icon-bar'></span>
            <span class='icon-bar'></span>
          </button>
        </div>

        <ul class='nav navbar-nav navbar-right collapse navbar-collapse'>
          <li><a href='#'>Tickets</a></li>
          <li><a href='#'>Stations</a></li>
          <li class='dropdown'>
            <a href='/about' data-target='#' class='dropdown-toggle' data-toggle='dropdown'>About <span class='caret'></span></a>
            <ul class='dropdown-menu' role='menu'>
              <li><a href='#'>Our Story</a></li>
              <li><a href='#'>Contact Us</a></li>
              <li class='divider'></li>
              <li><a href='blog.html'>Blog</a></li>
              <li class='divider'></li>
              <li><a href='#'>Twitter</a></li>
              <li><a href='#'>Facebook</a></li>
            </ul>
          </li>
        </ul>
      </div>
    </div>


	<jsp:invoke fragment="content"></jsp:invoke>
	
		
	<div class='footer'>
      <div class='container'>
        <div class='row'>
          <div class='col-sm-4 col-xs-6'>
            <h4>Who We Are</h4>
            <p><i>Blasting Off With Bootstrap</i> is the fastest way to space. <a href='tickets.html'>Book your ticket today</a>!</p>
            <p><a href='about.html'>More About Us <i class='glyphicon glyphicon-arrow-right'></i></a></p>
          </div>

          <div class='col-sm-2 col-xs-6'>
            <h4>Links</h4>
            <ul class='list-unstyled'>
              <li><a href='#'>Home</a></li>
              <li><a href='#'>Tickets</a></li>
              <li><a href='#'>Stations</a></li>
            </ul>
          </div>

          <div class='clearfix visible-xs'></div>

          <div class='col-sm-2 col-xs-6'>
            <h4>Stay in Touch</h4>
            <ul class='list-unstyled'>
              <li><a href='#'>About</a></li>
              <li><a href='#'>Contact Us</a></li>
              <li><a href='blog.html'>Blog</a></li>
              <li><a href='#'>Twitter</a></li>
              <li><a href='#'>Facebook</a></li>
            </ul>
          </div>

          <div class='col-sm-4 col-xs-6'>
            <h4>Contact Us</h4>
            <ul class='list-unstyled'>
              <li><i class='glyphicon glyphicon-globe'></i> Orlando, FL</li>
              <li><i class='glyphicon glyphicon-phone'></i> 1-555-blast-off</li>
              <li class="break-word"><i class='glyphicon glyphicon-envelope'></i>
                <a href='mailto:blastingoff@codeschool.com'> blastingoff@codeschool.com</a>
              </li>
            </ul>

            <p>Blasting Off With Bootstrap &copy;2214.</p>
          </div>
        </div>
      </div>
    </div>


	<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
	<!-- Include all compiled plugins (below), or include individual files as needed -->
	<script src="<c:url value='/resources/js/bootstrap.min.js' />"></script>
</body>