package cn.sz.gl.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="a")
public class MyControl {
	
	@RequestMapping(value="b",method=RequestMethod.GET)
	public String show(){
		System.out.println("÷¥––¡À....");
		return "show";
	}

}
