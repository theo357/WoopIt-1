<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>

<c:set var="url" value="${ pageContext.request.requestURI }" />
    <!-- Fixed navbar -->
	    <div id="navigation" class="navbar navbar-default navbar-fixed-top ">
	      <div class="container">
	        <div class="navbar-header">
	          <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
	            <span class="icon-bar"></span>
	            <span class="icon-bar"></span>
	            <span class="icon-bar"></span>
	          </button>
	          <a class="navbar-brand" href="<c:url value='/' />"><b>WoopIt</b></a>
	        </div>
	        <div class="navbar-collapse collapse">
	          <ul class="nav navbar-nav">
	            <li <c:if test="${url=='/WoopIt/WEB-INF/views/home.jsp'}">class="active"</c:if>><a href="<c:url value='/home' />" class="smothscroll">Home</a></li>
	            <li <c:if test="${url=='/WoopIt/WEB-INF/views/howto.jsp'}">class="active"</c:if>><a href="<c:url value='/howto' />" class="smothScroll">How it works</a></li>
	            <li <c:if test="${url=='/WoopIt/WEB-INF/views/support.jsp'}">class="active"</c:if>><a href="<c:url value='/support' />" class="smothScroll">Support</a></li>
	          </ul>
	          
	        <!-- SHOW USER MENU IF LOGGED IN -->
			<sec:authorize access="hasRole('USER')" >
	    	<ul class="nav navbar-nav navbar-right">
		        <li><a href="#">Messages</a></li>
		        <li class="dropdown">
		          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">User <span class="caret"></span></a>
		          <ul class="dropdown-menu">
		            <li><a href="#"><span class="glyphicon glyphicon-heart" aria-hidden="true"></span>&nbsp;&nbsp;Friend list</a></li>
		            <li><a href="#"><span class="glyphicon glyphicon-home" aria-hidden="true"></span>&nbsp;&nbsp;Profile</a></li>
		            <li><a href="#"><span class="glyphicon glyphicon-envelope" aria-hidden="true"></span>&nbsp;&nbsp;History</a></li>
		            <li><a href="#"><span class="glyphicon glyphicon-cog" aria-hidden="true"></span>&nbsp;&nbsp;Settings</a></li>
		            <li role="separator" class="divider"></li>
		            <li><a href="<c:url value='/user/logout' />"><span class="glyphicon glyphicon-off" aria-hidden="true"></span>&nbsp;&nbsp;Logout</a></li>
		          </ul>
		        </li>
		      </ul>
			</sec:authorize>
			
			<!-- SHOW GUEST MENU IF NOT LOGGED IN -->
			<sec:authorize access="isAnonymous()" >
	    	<ul class="nav navbar-nav navbar-right">
	    		<li><a href="<c:url value='/user/login' />">Sign In</a></li>
		        <li><a href="<c:url value='/user/register' />">Register</a></li>
		    </ul>
			</sec:authorize>
			
	        </div><!--/.nav-collapse -->
	      </div>
	    </div>