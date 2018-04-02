package com.word.gen.ctl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.word.gen.json.WordGenResponse;
import com.word.gen.service.WordGenService;

@RestController
@RequestMapping(value = "/wordgen/api")
public class WordGenController {

	@Autowired
	private WordGenService wordGenService;

	/**
	 * this will be called by localhost:8080//wordgen/api/fizzbuzz?val=15
	 * 
	 * @param val
	 * @return
	 * @throws JsonProcessingException
	 */
	@RequestMapping(value = "/fizzbuzz", method = RequestMethod.GET)
	public @ResponseBody WordGenResponse findWordGenPayLoad(@RequestParam("val") int val)
			throws JsonProcessingException {
		WordGenResponse payLoad = new WordGenResponse();
		payLoad.setContent(wordGenService.findBizzBuzz(val));
		return payLoad;
	}

}
