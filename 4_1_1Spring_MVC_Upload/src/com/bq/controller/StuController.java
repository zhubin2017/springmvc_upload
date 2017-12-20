package com.bq.controller;

import java.util.List;

import javax.validation.Valid;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bq.entity.Stu;

@Controller   //标识该类是个可以处理请求的bean
public class StuController {
	private Logger logger = Logger.getLogger(StuController.class);
	
	@RequestMapping("/toReg.do")
	public String toReg(){
		return "reg";  //逻辑视图名
	}
	
	//BindingResult返回接收页面传过来的错误信息
	//使用@Valid注解进行数据验证
	@RequestMapping("/reg.do")  
	public ModelAndView reg(@Valid Stu stu,BindingResult br){
		ModelAndView mv = new ModelAndView();
		if(br.hasErrors()){
			List<FieldError> errs=br.getFieldErrors();
			for (FieldError fe : errs) {
				logger.debug("field:"+fe.getField()+":"+fe.getDefaultMessage());
			}
			mv.addObject("stu", stu);
			mv.addObject("msg", "您输入的信息有误！");
			mv.setViewName("reg");
			return mv;
		}else{
			mv.addObject("stu", stu);
			mv.setViewName("index");
			return mv;
		}
	}
	
	@RequestMapping("/toSpringReg.do")
	public String toStringReg(@ModelAttribute(value="stu")Stu stu){
		return "springReg";  //逻辑视图名
	}
	
	@RequestMapping("/springReg.do")  //BindingResult返回接收页面传过来的错误信息
	public ModelAndView stringReg(@Valid Stu stu,BindingResult br){
		ModelAndView mv = new ModelAndView();
		if(br.hasErrors()){
			List<FieldError> errs=br.getFieldErrors();
			for (FieldError fe : errs) {
				logger.debug("field:"+fe.getField()+":"+fe.getDefaultMessage());
			}
			mv.addObject("stu", stu);
			mv.addObject("msg", "您输入的信息有误！");
			mv.setViewName("reg");
			return mv;
		}else{
			mv.addObject("stu", stu);
			mv.setViewName("index");
			return mv;
		}
	}
}
