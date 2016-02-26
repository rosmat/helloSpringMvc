<%@ tag body-content="empty" %>
<%@ attribute name="product" required="true" rtexprvalue="true" type="com.mycompany.helloworld.test1.Product" %>
<div class="product">
    <img src="${product.name}.jpg" />
    <span class="productname">${product.name}</span>, <span class="price">$${product.price}</span>
</div>