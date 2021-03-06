package server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import server.model.FilmCache;
import server.service.FilmCacheService;

import com.google.gson.Gson;

@RestController
public class FilmCacheController {

	@Autowired
	private FilmCacheService filmCacheService;

	@RequestMapping(value = "/films/{fid}", method = RequestMethod.GET)
	public @ResponseBody String getFilm(
			@PathVariable(value = "fid") String fid,
			@RequestParam(value = "location") String location,
			@RequestParam(value = "lang", defaultValue = "es") String lang) {

		Gson gson = new Gson();
		FilmCache film = filmCacheService.getFilmByFid(location, fid, lang);
		return gson.toJson(film);
	}
}