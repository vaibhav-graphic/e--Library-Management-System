/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.0.27
 * Generated at: 2024-02-07 08:31:15 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;
import java.util.List;

public final class ViewDataInfoStudent_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/MessageFineTableStudent.jsp", Long.valueOf(1707294629464L));
    _jspx_dependants.put("/FineMeassage.jsp", Long.valueOf(1707294667148L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("jakarta.servlet");
    _jspx_imports_packages.add("jakarta.servlet.http");
    _jspx_imports_packages.add("jakarta.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.util.List");
  }

  private volatile jakarta.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public jakarta.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final jakarta.servlet.http.HttpServletRequest request, final jakarta.servlet.http.HttpServletResponse response)
      throws java.io.IOException, jakarta.servlet.ServletException {

    if (!jakarta.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final jakarta.servlet.jsp.PageContext pageContext;
    jakarta.servlet.http.HttpSession session = null;
    final jakarta.servlet.ServletContext application;
    final jakarta.servlet.ServletConfig config;
    jakarta.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    jakarta.servlet.jsp.JspWriter _jspx_out = null;
    jakarta.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("<title>Fine Details Page</title>\r\n");
      out.write("<link\r\n");
      out.write("	href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css\"\r\n");
      out.write("	rel=\"stylesheet\"\r\n");
      out.write("	integrity=\"sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65\"\r\n");
      out.write("	crossorigin=\"anonymous\">\r\n");
      out.write("<link href=\"indexStyle.css\" rel=\"stylesheet\">\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("	<div class=\"container-fluid\">\r\n");
      out.write("		<div class=\"container\">\r\n");
      out.write("			<div class=\"row\">\r\n");
      out.write("				<h1>e-Library Management System</h1>\r\n");
      out.write("			</div>\r\n");
      out.write("\r\n");
      out.write("			<div class=\"container text-center\" id=\"container3Part2\">\r\n");
      out.write("				<div class=\"row justify-content-around\">\r\n");
      out.write("					<div class=\"col-2\">\r\n");
      out.write("						<a class=\"btn btn-primary\" id=\"mainBookPage\"\r\n");
      out.write("							href=\"StudentDashBoard.jsp\" role=\"button\">\r\n");
      out.write("							<h6>Fine Details</h6>\r\n");
      out.write("						</a>\r\n");
      out.write("					</div>\r\n");
      out.write("					<div class=\"col-2\">\r\n");
      out.write("						<a class=\"btn btn-primary\" id=\"mainBookPage\" href=\"ViewDataInfoStudent.jsp\"\r\n");
      out.write("							role=\"button\">\r\n");
      out.write("							<h6>View Data info</h6>\r\n");
      out.write("						</a>\r\n");
      out.write("					</div>\r\n");
      out.write("					<div class=\"col-2\">\r\n");
      out.write("						<a class=\"btn btn-primary\" id=\"mainBookPage\"\r\n");
      out.write("							href=\"StudentReturn.jsp\" role=\"button\">\r\n");
      out.write("							<h6>Return Book</h6>\r\n");
      out.write("						</a>\r\n");
      out.write("					</div>\r\n");
      out.write("					<div class=\"col-2\">\r\n");
      out.write("						<a class=\"btn btn-primary\" id=\"mainBookPage\" href=\"PlaceOrder.jsp\"\r\n");
      out.write("							role=\"button\">\r\n");
      out.write("							<h6>Place Order</h6>\r\n");
      out.write("						</a>\r\n");
      out.write("					</div>\r\n");
      out.write("					<div class=\"col-2\">\r\n");
      out.write("						<a class=\"btn btn-primary\" id=\"mainBookPage\"\r\n");
      out.write("							href=\"StudentLogOut.jsp\" role=\"button\">\r\n");
      out.write("							<h6>Logout</h6>\r\n");
      out.write("						</a>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("\r\n");
      out.write("			<div class=\"cotainer\" id=\"container3Part2\">\r\n");
      out.write("				<div class=\"row justify-content-evenly\">\r\n");
      out.write("					<div class=\"col\">\r\n");
      out.write("						<form action=\"Student_fine\" method=\"get\">\r\n");
      out.write("							<div class=\"row mb-3\">\r\n");
      out.write("								<label for=\"Student\" class=\"col-sm-2 col-form-label\"> Student Id\r\n");
      out.write("									</label>\r\n");
      out.write("								<div class=\"col-sm-10\">\r\n");
      out.write("									<input type=\"text\" class=\"form-control\" id=\"bookName\"\r\n");
      out.write("										name=\"studentid\" required>\r\n");
      out.write("								</div>\r\n");
      out.write("							</div>\r\n");
      out.write("							<button type=\"submit\" class=\"btn btn-primary\">Search</button>\r\n");
      out.write("						</form>\r\n");
      out.write("						");
      out.write('\r');
      out.write('\n');

List list = (List) session.getAttribute("fineCollection");
if (list != null) {

      out.write("\r\n");
      out.write("\r\n");
      out.write("<form action=\"Student_fine\" method=\"post\">\r\n");
      out.write("	<table class=\"table table-striped table-hover\">\r\n");
      out.write("		<thead>\r\n");
      out.write("			<tr class=\"table-dark\">\r\n");
      out.write("				<th scope=\"col\">Issue Date</th>\r\n");
      out.write("				<th scope=\"col\">Return Date</th>\r\n");
      out.write("			</tr>\r\n");
      out.write("		</thead>\r\n");
      out.write("		<tbody>\r\n");
      out.write("			<tr class=\"table-dark\">\r\n");
      out.write("				<td>");
      out.print(list.get(0));
      out.write("</td>\r\n");
      out.write("				<td>");
      out.print(list.get(1));
      out.write("</td>\r\n");
      out.write("				<input type=\"hidden\" name=\"issue_date\" value=\"");
      out.print(list.get(0));
      out.write("\">\r\n");
      out.write("				<input type=\"hidden\" name=\"return_date\" value=\"");
      out.print(list.get(1));
      out.write("\">\r\n");
      out.write("			</tr>\r\n");
      out.write("		</tbody>\r\n");
      out.write("	</table>\r\n");
      out.write("	<button type=\"submit\" class=\"btn btn-primary\">Calculate Fine</button>\r\n");
      out.write("</form>\r\n");
      out.write("\r\n");

session.removeAttribute("fineCollection");
} else {
System.out.println("null hai bhai");
}

      out.write("\r\n");
      out.write("						");

	Double fine = (Double) session.getAttribute("fine");
	if(fine != null){

      out.write("\r\n");
      out.write("	<div class=\"container\">\r\n");
      out.write("    <div class=\"row\">\r\n");
      out.write("        <div class=\"col-sm-6 offset-sm-3\">\r\n");
      out.write("            <div class=\"card\">\r\n");
      out.write("                <div class=\"card-header\">\r\n");
      out.write("                    Fine Calculation\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"card-body\">\r\n");
      out.write("                    <!-- Fine calculation result -->\r\n");
      out.write("                    <p>Total Fine: ");
      out.print( fine );
      out.write("</p>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");

	session.removeAttribute("fine");
	}

      out.write("\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof jakarta.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
