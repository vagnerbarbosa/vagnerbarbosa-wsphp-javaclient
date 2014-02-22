<%@ page contentType="text/html" language="java"%>
<jsp:useBean id="ClientApp" class="br.edu.ifpb.clientjava.ClientApp"/>
<%
String numero = ClientApp.check("1");
out.println("O número verificado é: " + numero);
%>