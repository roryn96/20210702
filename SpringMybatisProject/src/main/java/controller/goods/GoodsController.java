package controller.goods;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import command.GoodsCommand;
import service.goods.GoodsDeleteService;
import service.goods.GoodsDetailService;
import service.goods.GoodsListService;
import service.goods.GoodsNumberService;
import service.goods.GoodsUpdateService;
import service.goods.GoodsWriteService;
import validator.GoodsCommandValidator;

@Controller
@RequestMapping("goods") // 고정값으로 사용
public class GoodsController {
	@Autowired
	GoodsNumberService goodsNumberService;
	@Autowired
	GoodsWriteService goodsWriteService;
	@Autowired
	GoodsDetailService goodsDetailService;
	@Autowired
	GoodsUpdateService goodsUpdateService;
	@Autowired
	GoodsDeleteService goodsDeleteService;
	@RequestMapping("goodsDel")
	public String goodsDel(
			@RequestParam(value="prodNum")String prodNum, HttpSession session) {
		goodsDeleteService.goodsDel(prodNum, session); 
		// 여기 있는 goodsDel은 service에 있는 메소드를 불러서 사용하겠다는 뜻. 
		// 함부로 내가 원하는 형태로 바꾸면 안된다. 
		return "redirect:goodsList";
	}
	@RequestMapping("goodsUpdate")
	public String goodsUpdate(GoodsCommand goodsCommand, Errors errors, HttpSession session) {
		new GoodsCommandValidator().validate(goodsCommand, errors);
		if(errors.hasErrors()) {
			return "goods/goodsModify";
		}
		goodsUpdateService.goodsUpdate(goodsCommand, session);
		return "redirect/goods/goodsList";
	}
	@RequestMapping("prodModify")
	public String prodModify(
			@RequestParam(value="prodNum") String prodNum,
			Model model) {
		goodsDetailService.goodsDetail(prodNum, model);
		return "goods/goodsModify";
	}
	@RequestMapping("prodDetail")
	public String prodDetail(
			@RequestParam (value="prodNum") String prodNum,
			Model model) {
		goodsDetailService.goodsDetail(prodNum, model);
		return "goods/goodsDetail";
	}
	@RequestMapping(value="goodsJoin")
	public String goodsJoin(GoodsCommand goodsCommand, Errors errors,
			HttpSession session) {
		new GoodsCommandValidator().validate(goodsCommand, errors);
		if(errors.hasErrors()) {
			return "goods/goodsJoin";
		}
		goodsWriteService.goodsInsert(goodsCommand, session);
		return "redirect : goodsList";
	}
	@RequestMapping("goodsRegist")
	public String goodsRegist(Model model) {
		goodsNumberService.goodsNum(model);
		return "goods/goodsJoin";
	}
	@Autowired
	GoodsListService goodsListService;
	@RequestMapping("goodsList")
	public String list(Model model) {
		goodsListService.goodsList(model);
		return "goods/goodsList";
	}
}
