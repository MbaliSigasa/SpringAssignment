<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form  method="post" action="convert" modelAttribute= "conversionMain">

    <h1>Length Converter</h1>

    <p>Type a value in the Feet field to convert the value to Meters:</p>

    <p>
        <label>from: </label>
 
        <form:select path="ConvFrom"  items="${listFrom}" /> 
    </p>
    <p> <span id="outputMeters"></span></p>

    <p>
        <label>to :</label>
       
         <form:select path="ConvTo" items="${listTo}" /> 
    </p>
    <p> <span id="outputCentimeters"></span></p>

    <p>
        <label> enter value: </label>
        <form:input path="userOutput"/>
    </p>
    <p> <span id="output Conversion"></span></p>



    <input type="submit" value="calculate"/>
    </form:form>
</body>
</html>