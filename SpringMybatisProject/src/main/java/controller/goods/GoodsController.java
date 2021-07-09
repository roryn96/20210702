package controller.goods;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import command.GoodsCommand;
import service.goods.GoodsListService;
import service.goods.GoodsNumberService;
import service.goods.GoodsWriteService;
import validator.GoodsCommandValidator;

@Controller
@RequestMapping("goods") // 고정값으로 사용
public class GoodsController {
	@Autowired
	GoodsNumberService goodsNumberService;
	@Autowired
	GoodsWriteService goodsWriteService;
	@RequestMapping(value="goodsJoin", method=RequestMethod.POST)
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
