package com.mycompany.helloworld.test1;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;


public class ProductTag extends SimpleTagSupport {
    private Product product;

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public void doTag() throws JspException, IOException {
        JspWriter w = getJspContext().getOut();
        w.println("<div class=\"product\">");
        w.println("<img src=\"" + "/resources/images/" + product.getPrice() + ".png\"  + height=\"20\" width=\"20\" />");
        w.println("<span class=\"productname\">" + product.getName() + "</span>,");
        w.println("<span class=\"price\">$" + product.getPrice() + "</span></div>");
    }
}
