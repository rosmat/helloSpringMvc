package com.mycompany.helloworld.web;

import com.mycompany.helloworld.test1.Product;
import com.mycompany.helloworld.test1.Service;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class ProductController {

    @RequestMapping(value = "/products", method = RequestMethod.GET)
    public ModelAndView products(@RequestParam(value = "n", required = true) String n) {
        ModelAndView model = new ModelAndView();
        model.setViewName("layouts/products");
        List<Product> products = Service.getProducts(Integer.parseInt(n));
        model.addObject("products", products);
        return model;

    }

}
