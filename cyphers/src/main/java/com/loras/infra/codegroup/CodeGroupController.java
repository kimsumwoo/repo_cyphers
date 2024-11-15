package com.loras.infra.codegroup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.loras.common.config.util.UtilDateTime;

import jakarta.servlet.http.HttpSession;


@Controller
public class CodeGroupController {
	@Autowired
	CodeGroupService CodeGroupService;
	
	@RequestMapping(value ="/xdm/v1/infra/codegroup/codeGroupXdmList")
	public String codeGroupXdmList(Model model,@ModelAttribute("vo") CodeGroupVo vo, HttpSession httpSession )throws IOException {
		System.out.println("sessSeqXdm: " + httpSession.getAttribute("sessSeqXdm"));
		System.out.println("sessIdXdm: " + httpSession.getAttribute("sessIdXdm"));
		System.out.println("sessNameXdm: " + httpSession.getAttribute("sessNameXdm"));
//		/* 초기값 세팅이 없는 경우 사용 */
		vo.setShDateStart(vo.getShDateStart() == null || vo.getShDateStart() == "" ? null : UtilDateTime.add00TimeString(vo.getShDateStart()));
		vo.setShDateEnd(vo.getShDateEnd() == null || vo.getShDateEnd() == "" ? null : UtilDateTime.add59TimeString(vo.getShDateEnd()));
		vo.setParamsPaging(CodeGroupService.selectOneCount(vo));
		model.addAttribute("list", CodeGroupService.selectList(vo));
		
		StringBuilder urlBuilder = new StringBuilder("http://apis.data.go.kr/1471000/CovidDagnsRgntProdExprtStusService/getCovidDagnsRgntProdExprtStusInq"); /*URL*/
        urlBuilder.append("?" + URLEncoder.encode("serviceKey","UTF-8") + "=Fcl%2BQYV25M6XlodC1LWn82nL9aDH3q5C9pceCHGKfYBJ2dgBRH3QOtFbYVFQJ8VwocaTrAV%2FrxTDqKSAHQGu5Q%3D%3D"); /*Service Key*/
        urlBuilder.append("&" + URLEncoder.encode("pageNo","UTF-8") + "=" + URLEncoder.encode("1", "UTF-8")); /*페이지 번호*/
        urlBuilder.append("&" + URLEncoder.encode("numOfRows","UTF-8") + "=" + URLEncoder.encode("3", "UTF-8")); /*한 페이지 결과 수*/
        urlBuilder.append("&" + URLEncoder.encode("type","UTF-8") + "=" + URLEncoder.encode("json", "UTF-8")); /*응답데이터 형식(xml/json) default : xml*/
        urlBuilder.append("&" + URLEncoder.encode("YYYY","UTF-8") + "=" + URLEncoder.encode("", "UTF-8")); /*년도*/
        urlBuilder.append("&" + URLEncoder.encode("MM","UTF-8") + "=" + URLEncoder.encode("", "UTF-8")); /*실적월*/
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
		
		System.out.println("node.get(\"header\").get(\"resultCode\").asText(): " + node.get("header").get("resultCode").asText());
		System.out.println("node.get(\"header\").get(\"resultMsg\").asText(): " + node.get("header").get("resultMsg").asText());
		System.out.println("node.get(\"header\").get(\"resultMsg\").asText(): " + node.get("body").get("items").get(0).get("KIT_PROD_QTY").asText());
		
		
		StringBuilder urlBuilder2 = new StringBuilder("http://apis.data.go.kr/1471000/CovidDagnsRgntProdExprtStusService/getMmCovidDagnsRgntExprtStusInq"); /*URL*/
        urlBuilder2.append("?" + URLEncoder.encode("serviceKey","UTF-8") + "=Fcl%2BQYV25M6XlodC1LWn82nL9aDH3q5C9pceCHGKfYBJ2dgBRH3QOtFbYVFQJ8VwocaTrAV%2FrxTDqKSAHQGu5Q%3D%3D"); /*Service Key*/
        urlBuilder2.append("&" + URLEncoder.encode("pageNo","UTF-8") + "=" + URLEncoder.encode("1", "UTF-8")); /*페이지 번호*/
        urlBuilder2.append("&" + URLEncoder.encode("numOfRows","UTF-8") + "=" + URLEncoder.encode("3", "UTF-8")); /*한 페이지 결과 수*/
        urlBuilder2.append("&" + URLEncoder.encode("type","UTF-8") + "=" + URLEncoder.encode("json", "UTF-8")); /*응답데이터 형식(xml/json) default : xml*/
        urlBuilder2.append("&" + URLEncoder.encode("YYYY","UTF-8") + "=" + URLEncoder.encode("", "UTF-8")); /*년도*/
        urlBuilder2.append("&" + URLEncoder.encode("MM","UTF-8") + "=" + URLEncoder.encode("", "UTF-8")); /*실적월*/
        URL url2 = new URL(urlBuilder2.toString());
        HttpURLConnection conn2 = (HttpURLConnection) url2.openConnection();
        conn2.setRequestMethod("GET");
        conn2.setRequestProperty("Content-type", "application/json");
        System.out.println("Response code: " + conn2.getResponseCode());
        BufferedReader rd2;
        if(conn2.getResponseCode() >= 200 && conn2.getResponseCode() <= 300) {
            rd2 = new BufferedReader(new InputStreamReader(conn2.getInputStream()));
        } else {
            rd2 = new BufferedReader(new InputStreamReader(conn2.getErrorStream()));
        }
        StringBuilder sb2 = new StringBuilder();
        String line2;
        while ((line2 = rd2.readLine()) != null) {
            sb2.append(line2);
        }
        rd2.close();
        conn.disconnect();
        System.out.println(sb2.toString());
        
        ObjectMapper objectMapper2 = new ObjectMapper();
		JsonNode node2 = objectMapper2.readTree(sb2.toString());
		
		System.out.println("node.get(\"header\").get(\"resultCode\").asText(): " + node2.get("header").get("resultCode").asText());
		System.out.println("node.get(\"header\").get(\"resultMsg\").asText(): " + node2.get("header").get("resultMsg").asText());
		System.out.println("node.get(\"header\").get(\"resultMsg\").asText(): " + node2.get("body").get("items").get(0).get("KIT_EXPRT_QTY").asText());
		
		
		return "/xdm/v1/infra/codegroup/codeGroupXdmList";
	}
//	@RequestMapping(value ="/xdm/v1/infra/codegroup/codeGroupXdmForm")
//	public String codeGroupXdmForm(Model model) {
////		여기에서 함수를 호출해야 된다는
////		service 에 있는 함수를 호출
////		service.selectList();
//		List<CodeGroupDto> codeGroups = CodeGroupService.selectList();
//		
//		model.addAttribute("list", codeGroups);
//		
//		
////		for(CodeGroupDto codeGroupDto:codeGroups) {
////			System.out.println(codeGroupDto.getSeq() + "/" + codeGroupDto.getCgName());
////		}
////		System.out.println(codeGroups.size());
//		return "/xdm/v1/infra/codegroup/codeGroupXdmForm";
//	}
	@RequestMapping(value ="/xdm/v1/infra/codegroup/codeGroupXdmForm")
	public String codeGroupXdmForm() {

		return "/xdm/v1/infra/codegroup/codeGroupXdmForm";
	}
								
	@RequestMapping(value ="/xdm/v1/infra/codegroup/codeGroupXdmInst")
	public String codeGroupXdmInst(CodeGroupDto codeGroupDto) throws Exception {
		
		CodeGroupService.insert(codeGroupDto);
		
		return "redirect:/xdm/v1/infra/codegroup/codeGroupXdmList";
	}
	
	@RequestMapping(value ="/xdm/v1/infra/codegroup/codeGroupXdmMfom")
	public String codeGroupXdmMfom(CodeGroupDto codeGroupDto, Model model) {
		model.addAttribute("item", CodeGroupService.selectOne(codeGroupDto));
		return "/xdm/v1/infra/codegroup/codeGroupXdmMfom";
	}
	
	@RequestMapping(value ="/xdm/v1/infra/codegroup/codeGroupXdmUpdt")
	public String codeGroupXdmUpdt(CodeGroupDto codeGroupDto) throws Exception {
		CodeGroupService.update(codeGroupDto);
		return "redirect:/xdm/v1/infra/codegroup/codeGroupXdmList";
	}
	
	@RequestMapping(value = "/xdm/v1/infra/codegroup/codeGroupXdmUete")
	public String codeGroupXdmuete(CodeGroupDto codeGroupDto) {
		CodeGroupService.uelete(codeGroupDto);
		
		return "redirect:/xdm/v1/infra/codegroup/codeGroupXdmList";
	}
	
	@RequestMapping(value = "/xdm/v1/infra/codegroup/codegroupXdmDete")
	public String codegroupXdmDete(CodeGroupDto codeGroupDto) {
		CodeGroupService.delete(codeGroupDto);
		return "redirect:/xdm/v1/infra/codegroup/codeGroupXdmList";
	}
	
	
	
		
	
	
	


}
