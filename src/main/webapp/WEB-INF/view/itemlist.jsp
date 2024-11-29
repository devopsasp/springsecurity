<%@page import="com.model.Item,java.util.List" %>

<h1>List of Items</h1>


<%

List<Item> itemlist=(List)request.getAttribute("itemlist");

	out.println("<ul>");
		for(Item item:itemlist)
	 { 
		out.println("<li>");
		out.println(item.getItemName()+","+item.getPrice());
		out.println("</li>");
	 }
out.println("</ul>");
	 
%>