package server.service.impl;

import java.util.Date;

import org.springframework.stereotype.Service;

import server.mappers.FilmCacheMapper;
import server.model.FilmCache;
import server.service.FilmCacheService;
import server.utils.DateUtils;
import server.utils.JsonBuilder;

import com.google.gson.JsonObject;

@Service
public class FilmCacheServiceImpl implements FilmCacheService {

	public FilmCache getFilmByFid(String fid, String lang) {
		
		FilmCache film = FilmCacheMapper.getFilm(fid, lang);
		
		if (film == null) {
			
			JsonObject response = JsonBuilder.getFilmCacheJSONResponse(fid, lang);
			film = FilmCacheMapper.insertFilm(fid, lang, new Date(), response);
			
		} else if (DateUtils.isFilmCacheValid(film.getCache_date())) {
			
			JsonObject response = JsonBuilder.getFilmCacheJSONResponse(fid, lang);
			film = FilmCacheMapper.updateFilm(fid, lang, new Date(), response);
			
		}
		
		return film;
	}
}