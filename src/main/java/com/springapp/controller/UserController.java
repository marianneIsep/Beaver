package com.springapp.controller;

import com.springapp.model.User;
import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserController {

	private static final Logger LOGGER = Logger.getLogger(UserController.class);

	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String tet(ModelMap model) {
		model.addAttribute("message", "user"); // Création d'un nouvel attribut message
		return "user"; // retourne le nom de la page "Avant le .jsp"
	}

	/**
	 *
	 * @param idClient
	 * @return
	 */
	@RequestMapping(value="/client", method = RequestMethod.GET)
	public @ResponseBody
	JSONObject getClient(@RequestParam(value = "id", required = false) Integer idClient) {

		String test = "bonjour";
		JSONObject jsonObject = new JSONObject();
		try {
			jsonObject.put("bonjour", 1);
		} catch (JSONException e) {
			LOGGER.debug(e.getMessage());
		}
		return jsonObject;
	}

	//@Autowired
	//private SessionFactory sessionFactory;

	@RequestMapping(value="/connection", method = RequestMethod.GET)
	public @ResponseBody User getUser() throws JSONException {
		User user = new User();
		//user = (User)sessionFactory.getCurrentSession().get(User.class, 1);

		user.setuPseudo("Colin");
		return user;
	}

}