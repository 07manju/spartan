package mock;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;



@org.springframework.stereotype.Controller
public class Controller {
	
	@Autowired
	Dao dao;
	@Autowired
	Dto dto;
	
	@RequestMapping("/sign")
	public ModelAndView create() {
		ModelAndView andView = new ModelAndView("signup.jsp");
		andView.addObject("data", dto);
		return andView;
	}

	@ResponseBody
	@RequestMapping("/insert")
	public String savethedata(Dto dto) {
		dao.insert(dto);
		return "data inserted successfully";
	}
	
	
	@RequestMapping("/fetch")
	public ModelAndView fetch() {
		ModelAndView andView = new ModelAndView("fetch.jsp");
		andView.addObject("fetchdata1", dto);
		return andView;
	}

	@RequestMapping("/fetch1")
	public ModelAndView fetchdataa(String email) {
		Dto fetch = dao.fetch(email);
		ModelAndView andView = new ModelAndView("fetchdetails.jsp");
		andView.addObject("fetchdata2", fetch);
		return andView;
	}

}
