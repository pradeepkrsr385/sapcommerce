<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="template" tagdir="/WEB-INF/tags/responsive/template" %>
<%@ page import="java.Lang.*" %>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>


<template:page pageTitle="${pageTitle}">
    Data Inside Template !!! this is updated !
    <h1>This is first heading on SAP   </h1>
    <p> this is first para on SAP </p>
    <b>here the url path name entered is = ${name}</b>
</template:page>




