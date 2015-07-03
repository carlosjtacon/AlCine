package server.model;

import java.util.Date;

import org.json.JSONObject;

public class Cache {
	private String url;
	private String r_location;
	private String r_lang;
	private String r_date;
	private String tid;
	private String fid;
	private Date cache_date;
	private JSONObject response;

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	public String getR_location() {
		return r_location;
	}

	public void setR_location(String r_location) {
		this.r_location = r_location;
	}
	public String getR_lang() {
		return r_lang;
	}

	public void setR_lang(String r_lang) {
		this.r_lang = r_lang;
	}
	public String getR_date() {
		return r_date;
	}

	public void setR_date(String r_date) {
		this.r_date = r_date;
	}

	public String getTid() {
		return tid;
	}

	public void setTid(String tid) {
		this.tid = tid;
	}

	public String getFid() {
		return fid;
	}

	public void setFid(String fid) {
		this.fid = fid;
	}

	public Date getCache_Date() {
		return cache_date;
	}

	public void setCache_Date(Date cache_date) {
		this.cache_date = cache_date;
	}

	public JSONObject getResponse() {
		return response;
	}
	
	public void setResponse(JSONObject response) {
		this.response = response;
	}

}