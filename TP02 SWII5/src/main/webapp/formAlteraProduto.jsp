<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<c:url value="/AlteraProduto" var="linkServletNovoProduto"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

  <form action="${linkServletNovoProduto }" method="post">
		<input type="hidden" name="id" value="${produto.id}">
		Nome: <input type="text" name="nome" value="${produto.nome }" />
		Descricao: <input type="text" name="descricao" value="${produto.descricao }" />
		Unidade compradas: <input type="number" name="unidadeCompra" value="${produto.unidadeCompra }" />
		Quantidade prevista mes: <input type='number' step='0.01' placeholder='0.00' name="qtdPrevistoMes" value="${produto.qtdPrevistoMes }" />
		Preco maximo comprado: <input type='number' step='0.01' placeholder='0.00' name="precoMaxComprado" value="${produto.precoMaxComprado }" />
		<input type="hidden" name="id" value="${produto.id }">
		<input type="submit"/>
		
	</form>    

</body>
</html>