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
        <table border="1" cellpadding="5">
            <caption><h2>Lista de Vendedores</h2></caption>
            <tr>
                <th>ID</th>
                <th>Nome</th>
                <th>Cidade</th>
                <th>Comissão</th>
            </tr>
            <c:forEach var="salesman" items="${listSalesman}">
                <tr>
                    <td><c:out value="${salesman.salesman_id}" /></td>
                    <td><c:out value="${salesman.name}" /></td>
                    <td><c:out value="${salesman.city}" /></td>
                    <td><c:out value="${salesman.commission}" /></td>
                </tr>
            </c:forEach>
        </table>
        
        <table border="1" cellpadding="5">
            <caption><h2>Lista de Clientes</h2></caption>
            <tr>
                <th>ID</th>
                <th>Nome</th>
                <th>Cidade</th>
                <th>Grade</th>
            </tr>
            <c:forEach var="customer" items="${listCustomer}">
                <tr>
                    <td><c:out value="${customer.customer_id}" /></td>
                    <td><c:out value="${customer.cust_name}" /></td>
                    <td><c:out value="${customer.city}" /></td>
                    <td><c:out value="${customer.grade}" /></td>
                </tr>
            </c:forEach>
        </table>
        
        <table border="1" cellpadding="5">
            <caption><h2>Lista de Pedidos</h2></caption>
            <tr>
            	<th>Número</th>
                <th>Valor de Compra</th>
                <th>Data</th>
                <th>Cliente</th>
                <th>Vendedor</th>
            </tr>
            <c:forEach var="orders" items="${listOrders}">
                <tr>
                    <td><c:out value="${orders.ord_no}" /></td>
                    <td><c:out value="${orders.purch_amt}" /></td>
                    <td><c:out value="${orders.ord_date}" /></td>
                    <td><c:out value="${orders.customer_id}" /></td>
                    <td><c:out value="${orders.salesman_id}" /></td>
                </tr>
            </c:forEach>
        </table>
    </div>   
    
</body>
</html>