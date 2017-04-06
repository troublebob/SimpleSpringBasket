package basket.controllers;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import basket.model.Product;
import basket.facade.ProductHelper;

@Controller
@SessionAttributes({"basket"})
public class IndexController {

	@Resource
	basket.facade.ProductHelper p;
	
	@RequestMapping("/")
	public String getIndex(Model model, HttpSession session){
		if(!model.containsAttribute("basket")){
			model.addAttribute("basket",new basket.model.Basket());
		}
		
		List<Product> productList = ProductHelper.allProducts;
		model.addAttribute("productList",productList);
		return "index";
	}
}
