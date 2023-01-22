/*

    In Java , GenericServlet is the advanced technique to create servlet , basically it is created from Servlet interface but the key difference is that , the user doesn't need to override all the methods of Servlet interface. 
    Here you need to override the service method according to you 
    
*/

public class GenericServletExample extends GenericServlet{
    public void service(ServletRequest request,ServletResponse response){
        response.setContentType("text/html");
        
        PrintWriter write = response.getWriter();
        
        write.print("<h1> Name </h1>");
        write.print("<br><p>Gangesh Kumar </p>");
        
    }
    
}
        
