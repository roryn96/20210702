package controller.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import command.MemberCommand;
import service.main.LoginService;
import validator.MemberCommandValidator;

@Controller
@RequestMapping("register")
public class MemberController {
	@RequestMapping("agree")
	public String agree() {
		return "member/agree";
	}
	@RequestMapping(value="memRegist", method = RequestMethod.POST)
	public String memRegist(
			@RequestParam(value="agree", defaultValue = "false")
			Boolean agree) {
		if(!agree) return "member/agree";
		return "member/memberForm";
	}
	@Autowired
	LoginService loginService;
	@RequestMapping(value="memJoin", method = RequestMethod.POST)
	public String memJoin(MemberCommand memberCommand, Errors errors,
			Model model) {
		new MemberCommandValidator().validate(memberCommand, errors);
		if(errors.hasErrors()) {
			return "member/memberForm";
		}
		
		return "redirect:/";
	}
}
