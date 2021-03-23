package com.procast.shift.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.procast.shift.dto.LoginDto;
import com.procast.shift.dto.LoginForm;
import com.procast.shift.service.LoginService;

@Controller
public class LoginController {

	@Autowired
	LoginService loginService;

	@ModelAttribute
	LoginForm setUpForm() {
		return new LoginForm();
	}

	@RequestMapping(value = {"/","/login"}, method = RequestMethod.GET)
	public String welcom(Model model) {
		return "login";
	}

    @RequestMapping(value = "/menu", method = RequestMethod.POST)
    String login(Model model, @Validated @ModelAttribute("loginForm") LoginForm form, BindingResult result) throws Exception {

    	// バリデーションのえらーの処理はここに書くよー
    	if (result.hasErrors()) {
    	      model.addAttribute("validationError", "不正な値が入力されました。");

    	      return "login";
    	}

    	//TODO ここで、管理者と一般ユーザーの振り分けを行う?
    	// そもそも管理者のcheckいらない疑惑？
    	// いや、スタッフは固定のメニューにする？

    	LoginDto loginDto = loginService.findStaffInfo(form.getStaffCode(), form.getPassCode());

    	// checkのためにセット
    	model.addAttribute("staffCode", loginDto.getUserInfo().getStaffCode());
    	model.addAttribute("passCode", loginDto.getUserInfo().getPassCode());
    	model.addAttribute("ownerFlg", loginDto.getUserInfo().getOwnerFlg());
        model.addAttribute("staffName", loginDto.getUserInfo().getStaffName());

        // 機能のリストをセット
        model.addAttribute("featureList", loginDto.getFeatureList());

        return "menu";
    }


}
