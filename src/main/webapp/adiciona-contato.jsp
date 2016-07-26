<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>
	
	<c:import url="cabecalho.jsp"/>

	<h2>Gravar Contato</h2>
	<form action="adicionaContato">
		Nome:<input type="text" name="nome"/></br>
		Email:<input type="text" name="email"/></br>
		Endereço:<input type="text" name="endereco"/></br>
		Data de nascimento:<input type="text" name="dataNascimento"/></br>
		
		<input type="submit" value="Gravar"/>
	</form>
	
	<c:import url="rodape.jsp"/>
</body>
</html>