<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
	<style>
	body {
		background-color: #1e1782;
		color: white;
	}
	.links{
		background-color: white;
	}
	</style>
    <title>SWII5_Prova_2</title>
</head>
<body>
    <center>
        <h1>Prova 2</h1>
        <h2 class="links">
            <a href="list">Lista</a>
            &nbsp;&nbsp;&nbsp;
            <a href="newSalesman">Add Vendedor</a>
            &nbsp;&nbsp;&nbsp;
            <a href="newCustomer">Add Novo Cliente</a>
            &nbsp;&nbsp;&nbsp;
            <a href="newOrders">Add Novo Pedido</a>
             &nbsp;&nbsp;&nbsp;
            <a href="credits">Creditos</a>
        </h2> 
    </center>
    <div align="center">
        <form action="insertSalesman" method="post">
	        <table border="1" cellpadding="5">
	            <caption>
	                <h2>Add Novo Vendedor</h2>
	            </caption>          
	            <tr>
	            
	            	<th>Nome: </th>
	                <td>
	                    <input type="text" name="name" size="45" />
	                </td>
	            </tr>
	            <tr>
	                <th>Cidade: </th>
	                <td>
	                    <input type="text" name="city" size="45" />
	                </td>
	            </tr>
	            <tr>
	                <th>Comissão: </th>
	                <td>
	                    <input type="number" name="commission" size="5" />
	                </td>
	            </tr>
	            <tr>
	                <td colspan="2" align="center">
	                    <input type="submit" value="Save" />
	                </td>

	                </td>
	            </tr>
	        </table>
        </form>
    </div>   
</body>
</html>