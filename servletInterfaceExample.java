/*

    In Java , servlet is created using implementating Servlet interface. Example is shown below. 
    There are five methods in Servlet interface to override 
    
    1 . public void init(ServletConfig config) { }
    2 . public ServletConfig getServletConfig() { }
    3 . public void service(ServletRequest request,ServletResponse response) { }
    4 . public String getServletInfo() { }
    5 . public void destroy () { }
    
*/

import java.servlet.";

public class servletInterfaceExample implements Servlet{
  ServletConfig conf=null;
  
  public void init(ServletConfig conf){
    this.conf = conf;
  }
  
  public ServletConfig getServletConfig(){ return config }
  
  public void service(ServletRequest request,ServletResponse response){
    response.setContentType("text/html");
    
    PrintWriter writer = response.getWriter();
    
    writer.print("<h1>Name </h1>");
    writer.print("<br><p>Gangesh Kumar </p>");
    
  }
  
  public String getServletInfo() { return config; }
  
  public void destroy () { }
    
}
  
  
 
    
