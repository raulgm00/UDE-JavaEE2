<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>Insert title here</title>
</head>
<body>

	<h1>Login.jsp</h1>
	
	<form method="post" action="?accion=iniciarSesion">
		<table>
			<tr> 
				<td>Nombre de usuario: </td>
				<td> <input type="text" name="usuario" /> </td>
			</tr>
			<tr> 
				<td>Contraseña: </td>
				<td> <input type="password" name="contrasena" /> </td>
			</tr>
			<tr> 
				<td> </td>
				<td> <input type="submit" value="Iniciar Sesión" /> </td>
			</tr>
		</table>
	</form>
	<a href="?accion=inicio">Regresar</a>
	

</body>
</html>