package com.learning.springex.springexample.controller;

import com.learning.springex.springexample.beans.Product;
import com.learning.springex.springexample.util.LoggerUtil;
import com.learning.springex.springexample.repository.ProductRepository;
import org.apache.juli.logging.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.concurrent.Callable;

@Controller
public class SearchController {

    @Autowired
    private ProductRepository productRepository;
    private final Log log = LoggerUtil.getLogger();


    @GetMapping("/search")
    public Callable<String> search(@RequestParam("search") String search, Model model, HttpServletRequest request) {
        log.info("searching....");
        log.info("search criteria " + search);
        log.info("Async call being sent out on " + Thread.currentThread().getName());

        return () -> {
            log.info("Async call returned on " + Thread.currentThread().getName());
            List<Product> products = productRepository.searchByName(search);
            model.addAttribute("products", products);
            return "search";
        };

    }
}

