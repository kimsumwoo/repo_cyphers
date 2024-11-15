package com.loras.infra.index;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

@Controller
public class IndexController {
	@Autowired
	public IndexService indexService;
	
	@RequestMapping(value = "/usr/v1/infra/index/indexUsr")
	public String indexUsr(Model model) throws IOException {
		model.addAttribute("mostlist", indexService.productMostList());
		model.addAttribute("newlist", indexService.productNewList());
		model.addAttribute("rvlist", indexService.reviewSelectList());
		
		StringBuilder urlBuilder = new StringBuilder("http://apis.data.go.kr/1360000/VilageFcstInfoService_2.0/getUltraSrtNcst"); /*URL*/
        urlBuilder.append("?" + URLEncoder.encode("ServiceKey","UTF-8") + "=Fcl%2BQYV25M6XlodC1LWn82nL9aDH3q5C9pceCHGKfYBJ2dgBRH3QOtFbYVFQJ8VwocaTrAV%2FrxTDqKSAHQGu5Q%3D%3D"); /*Service Key*/
        urlBuilder.append("&" + URLEncoder.encode("pageNo","UTF-8") + "=" + URLEncoder.encode("1", "UTF-8")); /*페이지 번호*/
        urlBuilder.append("&" + URLEncoder.encode("numOfRows","UTF-8") + "=" + URLEncoder.encode("1000", "UTF-8")); /*한 페이지 결과 수*/
        urlBuilder.append("&" + URLEncoder.encode("dataType","UTF-8") + "=" + URLEncoder.encode("json", "UTF-8")); /*응답데이터 형식(xml/json) default : xml*/
        urlBuilder.append("&" + URLEncoder.encode("base_date","UTF-8") + "=" + URLEncoder.encode("20241108", "UTF-8")); /*년도*/
        urlBuilder.append("&" + URLEncoder.encode("base_time","UTF-8") + "=" + URLEncoder.encode("0900", "UTF-8")); /*실적월*/
        urlBuilder.append("&" + URLEncoder.encode("nx","UTF-8") + "=" + URLEncoder.encode("55", "UTF-8"));
        urlBuilder.append("&" + URLEncoder.encode("ny","UTF-8") + "=" + URLEncoder.encode("127", "UTF-8"));
        
        URL url = new URL(urlBuilder.toString());
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        conn.setRequestProperty("Content-type", "application/json");
        System.out.println("Response code: " + conn.getResponseCode());
        BufferedReader rd;
        if(conn.getResponseCode() >= 200 && conn.getResponseCode() <= 300) {
            rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        } else {
            rd = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
        }
        StringBuilder sb = new StringBuilder();
        String line;
        while ((line = rd.readLine()) != null) {
            sb.append(line);
        }
        rd.close();
        conn.disconnect();
        System.out.println(sb.toString());
        
        ObjectMapper objectMapper = new ObjectMapper();
		JsonNode node = objectMapper.readTree(sb.toString());
		
		System.out.println("node.get(\"header\").get(\"resultCode\").asText(): " + node.path("response").path("header").path("resultCode").asText("Unknown"));
		System.out.println("node.get(\"header\").get(\"resultMsg\").asText(): " + node.path("response").path("header").path("resultMsg").asText());
		System.out.println("node.get(\"body\").get(\"dataType\").asText(): " + node.path("response").path("body").path("dataType").asText());
		System.out.println("node.get(\"body\").get(\"numOfRows\").asText(): " + node.path("response").path("body").path("numOfRows").asText());
		return "/usr/v1/infra/index/indexUsr";
	}

}
