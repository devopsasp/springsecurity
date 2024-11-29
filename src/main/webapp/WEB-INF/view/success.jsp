<%@page import="com.model.Item"%>

<%

Item item=(Item)request.getAttribute("item");
out.println(item.getItemName()+" has been added successfully");
%>