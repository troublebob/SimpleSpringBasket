package basket.controllers;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import basket.facade.ProductHelper;
import basket.model.Basket;

@Controller
@SessionAttributes({"basket"})
public class BasketController {
	@Resource
	ProductHelper p;
	
	@RequestMapping(value="add/{productTitle}", method=RequestMethod.GET)
	public ModelAndView addProductToBasket(@ModelAttribute("basket") Basket basket, @PathVariable("productTitle")String item){
		basket.addProduct(ProductHelper.getProduct(item));
		return new ModelAndView("redirect:/");
	}
	
	@RequestMapping(value="remove/{productTitle}", method=RequestMethod.GET)
	public ModelAndView removeProductFromBasket(@ModelAttribute("basket") Basket basket, @PathVariable("productTitle")String item){
		int i = basket.findProduct(ProductHelper.getProduct(item));
		basket.removeProduct(i);
		return new ModelAndView("redirect:/basket");
	}
	
	@RequestMapping(value="basket", method=RequestMethod.GET)
	public String gotoBasketPage(@ModelAttribute("basket") Basket basket, Model model){
		model.addAttribute("basketList",basket.getBasket());
		model.addAttribute("totalPrice",basket.getTotalPrice());
		return "basket";
	}
	
	@RequestMapping(value="orderplaced", method=RequestMethod.GET)
	public String gotoOrderPlaced(@ModelAttribute("basket") Basket basket, Model model){
		System.out.println("Triggered orderplaced controller");
		model.addAttribute("basketList",basket.getBasket());
		model.addAttribute("totalPrice",basket.getTotalPrice());
		return "orderplaced";
	}	
}