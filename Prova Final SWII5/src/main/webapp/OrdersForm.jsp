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
        <form action="insertOrders" method="post">
	        <table border="1" cellpadding="5">
	            <caption>
	                <h2>Add Novo Pedido</h2>
	            </caption>          
	            <tr>
	            	<th>Valor de Compra: </th>
	                <td>
	                    <input type="number" name="purch_amt" size="45" />
	                </td>
	            </tr>
	            <tr>
	                <th>Data: </th>
	                <td>
	                    <input type="date" name="ord_date" size="45" />
	                </td>
	            </tr>
	            <tr>
	                <th>Cliente Id: </th>
	                <td>
	                    <input type="number" name="customer_id" size="5" />
	                </td>
	            </tr>
	            <tr>
	                <th>Vendedor Id: </th>
	                <td>
	                    <input type="number" name="salesman_id" size="5" />
	                </td>
	            </tr>
	            <tr>
	                <td colspan="2" align="center">
	                    <input type="submit" value="Save" />
	                </td>
	            </tr>
	        </table>
        </form>
    </div>   
</body>
</html>