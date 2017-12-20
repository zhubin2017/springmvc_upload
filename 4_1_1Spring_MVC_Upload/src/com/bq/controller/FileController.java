package com.bq.controller;


import java.io.File;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;


@Controller  //标识该类是个可以处理请求的bean
public class FileController {
	private Logger logger = Logger.getLogger(FileController.class);
	
	@RequestMapping("/toUpload.do")
	public String toUpdate(){
		return "upload";  //逻辑视图名
	}
	
	@RequestMapping("/doUpload.do")  
	public ModelAndView doUpload(MultipartFile mf,HttpServletRequest request) throws Exception{
		String fname = mf.getOriginalFilename();  //获取文件名
		logger.info("文件名："+fname);
		//对文件名进行处理（随机生成新文件名）
		String hname = FilenameUtils.getExtension(fname); //获取后缀名
		String saveName = System.currentTimeMillis()+"."+hname; //生成随机文件名
		//制定物理存储位置
		String path = request.getServletContext().getRealPath("upload");
		logger.info("存储路径："+path);
		logger.info("生成的文件名:"+saveName);
		File file = new File(path+"/"+saveName); //实现上传		
		logger.info("file:"+file);
		FileUtils.copyInputStreamToFile(mf.getInputStream(), file);
		//mf.transferTo(file);
		return new ModelAndView("index");
	}
	
}
