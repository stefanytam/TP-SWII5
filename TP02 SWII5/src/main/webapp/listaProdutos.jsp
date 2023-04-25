<%@ page language="java" contentType="text/html; charset=ISO-8859-1"	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List, produto.Produto" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<c:if test="${not empty produto}">
         Produto cadastrado com sucesso! <br>
</c:if>

Lista de Produtos: <br />

 <ul>

      <c:forEach items="${produto}" var="produto">
 
           <li>
               ${produto.id} - ${ produto.nome } - ${ produto.unidadeCompra } - ${ produto.descricao } - ${ produto.qtdPrevistoMes } - ${ produto.precoMaxComprado }
               <a href="MostraProduto?id=${produto.id }">Editar </a>
               <a href="RemoveProduto?id=${produto.id }"> Remover</a>
          </li>
     </c:forEach>
 </ul>
<br><br><a href="formNovoProduto.jsp">Cadastrar novo produto.</a><br><br>
</body>
</html>