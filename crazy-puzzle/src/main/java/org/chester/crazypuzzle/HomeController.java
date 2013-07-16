package org.chester.crazypuzzle;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Resource
	private HOFService hofService;
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		model.addAttribute("scores", hofService.getScores());
		
		return "home";
	}
	
	@RequestMapping(value = "/score", method = RequestMethod.GET)
	public String score(@RequestParam("name") String name, Model model) {
	  for (String e: hofService.getScores())
	    if (e.contains(name))
	      model.addAttribute("eachscore", e);
	  model.addAttribute("name", name);
	  return "showscore";
	}
	
	 @RequestMapping(value = "/save", method = RequestMethod.GET)
	 public String score(@RequestParam("moves") int moves, Model model) {
	   logger.info("Solved in {} moves!", moves);
	   return "noview";
	 }
}
