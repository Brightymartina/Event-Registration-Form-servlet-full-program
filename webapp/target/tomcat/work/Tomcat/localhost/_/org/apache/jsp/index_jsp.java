/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2017-07-24 06:01:23 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\r\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\r\n");
      out.write("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\r\n");
      out.write("  \r\n");
      out.write("    <style>\r\n");
      out.write("        table{\r\n");
      out.write("            padding: 10px;\r\n");
      out.write("            border-spacing:15px;\r\n");
      out.write("            border-style:solid;\r\n");
      out.write("            border-color: black;\r\n");
      out.write("        }\r\n");
      out.write("        h1\r\n");
      out.write("        {\r\n");
      out.write("            font: bold;\r\n");
      out.write("            color:black;\r\n");
      out.write("        }\r\n");
      out.write("       body {\r\n");
      out.write("    \r\n");
      out.write("    background-color: darkgray;\r\n");
      out.write("   \r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("        \r\n");
      out.write("        </style>\r\n");
      out.write("        <script>\r\n");
      out.write("            function validate()\r\n");
      out.write("            {\r\n");
      out.write("                var email=document.myform.email.value;\r\n");
      out.write("                var atposition=email.indexOf(\"@\");\r\n");
      out.write("                var dotposition=email.indexOf(\".\");\r\n");
      out.write("                if (atposition<1 || dotposition<atposition+5|| dotposition+2>=x.length)\r\n");
      out.write("                {\r\n");
      out.write("                    alert(\"please enter valid email\");\r\n");
      out.write("                }\r\n");
      out.write("                return false;\r\n");
      out.write("            }\r\n");
      out.write("            </script>\r\n");
      out.write("\r\n");
      out.write("<body  >\r\n");
      out.write("    <br><br>\r\n");
      out.write("<center><h1>EVENT DETAILS</h1>\r\n");
      out.write("<form  name=\"myform\"method=\"POST\" action=\"mainservlet\">\r\n");
      out.write(" <table color=\"cornflowerblue\">\r\n");
      out.write("      <tr>\r\n");
      out.write("     <td>  StudentID :</td>\r\n");
      out.write("     <td><input type=\"text\" name=\"studentid\"></td>\r\n");
      out.write("     </tr>\r\n");
      out.write("     <tr>\r\n");
      out.write("     <td>  FirstName :</td>\r\n");
      out.write("     <td><input type=\"text\" name=\"fname\"></td>\r\n");
      out.write("     </tr>\r\n");
      out.write("     <tr>\r\n");
      out.write("         <td> LastName:</td>\r\n");
      out.write("   <td><input type=\"text\" name=\"lname\"></td>\r\n");
      out.write("   </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("         <td> Email :</td>\r\n");
      out.write("   <td><input type=\"text\" name=\"email\"></td>\r\n");
      out.write("   </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("         <td> Date:</td>\r\n");
      out.write("   <td><input type=\"Date\" name=\"date\"></td>\r\n");
      out.write("   </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("         <td> Time :</td>\r\n");
      out.write("   <td><input type=\"Time\" name=\"time\"></td>\r\n");
      out.write("   </tr>\r\n");
      out.write("   <tr>\r\n");
      out.write("         <td> Topic:</td>\r\n");
      out.write("   <td><input type=\"text\" name=\"topic\"></td>\r\n");
      out.write("   </tr>\r\n");
      out.write("   <tr>\r\n");
      out.write("         <td> Location:</td>\r\n");
      out.write("   <td><input type=\"text\" name=\"location\"></td>\r\n");
      out.write("   </tr>\r\n");
      out.write("   </table>\r\n");
      out.write("<br>\r\n");
      out.write("<br>\r\n");
      out.write("    <center>\r\n");
      out.write("                <input type=\"submit\" name=\"HelloWorld\" value=\"Submit\" > &nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("      \r\n");
      out.write("                <input type=\"submit\" name=\"update\" value=\"Update\" >&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("                <input type=\"submit\" name=\"Delete\" value=\"Delete\"> &nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("                \r\n");
      out.write("     \r\n");
      out.write("       </center>\r\n");
      out.write("       <center><a href=\"Viewdetails\">View Event Details</a> \r\n");
      out.write("        \r\n");
      out.write(" </form>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!--<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <title>admin page\r\n");
      out.write("        </title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("<center><b><h1></h1></b></center>\r\n");
      out.write("<form action=\"mainservlet\" method=\"post\">\r\n");
      out.write("<fieldset>\r\n");
      out.write("    <label>USERNAME:</label> \r\n");
      out.write("    <label><input type=\"text\" name=\"username\"></label><br>\r\n");
      out.write("    <label>PASSWORD:</label> \r\n");
      out.write("    <label><input type=\"password\" name=\"password\"></label><br>\r\n");
      out.write("    <label><input type=\"submit\" name=\"Submit\" value=\"login\">\r\n");
      out.write("    </label>\r\n");
      out.write("</fieldset> \r\n");
      out.write("</form>\r\n");
      out.write(" </body>\r\n");
      out.write("</html>-->\r\n");
      out.write("<!--<html>\r\n");
      out.write("    <head>\r\n");
      out.write("    </head><body>\r\n");
      out.write("        <form action=\"main\" method=\"post\">\r\n");
      out.write("        <fieldset>\r\n");
      out.write("    <label>USERNAME:</label> \r\n");
      out.write("    <label><input type=\"text\" name=\"email\"></label><br>\r\n");
      out.write("    \r\n");
      out.write("    <label><input type=\"submit\" name=\"Submit\" value=\"login\"></label>\r\n");
      out.write("        </fieldset>\r\n");
      out.write("        </form>\r\n");
      out.write("        </body>\r\n");
      out.write("</html>-->");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
