package com.loras.infra.checkout;


import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.amazonaws.services.cloudformation.model.Parameter;

import jakarta.servlet.http.HttpServletRequest;



@Controller
public class CheckOutController {
	@Autowired
	CheckOutService checkOutService;
	
	@RequestMapping(value = "/usr/v1/infra/checkout/checkOutForm")
	public String CheckOutForm(CheckOutDto checkOutDto,Model model, HttpServletRequest request) {
		checkOutDto.setMmSeq((String) request.getSession().getAttribute("sessSeqUsr"));
		model.addAttribute("list", checkOutService.selectListAd(checkOutDto));
		model.addAttribute("item", checkOutService.selectCheckout(checkOutDto));
		return "usr/v1/infra/checkout/checkOutForm";
	}
	@RequestMapping(value = "/usr/v1/infra/checkout/checkOutInst")
	public String checkOutInst(CheckOutDto checkOutDto) {
		System.out.println(checkOutDto.getPdSeq());
		System.out.println(checkOutDto.getMmSeq());
		System.out.println(checkOutDto.getAdSeq());
		checkOutService.insert(checkOutDto);
		return "redirect:/usr/v1/infra/order/OrderList";
	}
	
//	@RequestMapping("/usr/v1/infra/checkout/approve")
//	@ResponseBody
//	public String approve(@RequestParam("pg_token") String pgToken) {
//	    try {
//	        // 카카오페이 결제 승인 API URL
//	        URL url = new URL("https://open-api.kakaopay.com/online/v1/payment/approve");
//
//	        // HTTP 연결 설정
//	        HttpURLConnection connent = (HttpURLConnection) url.openConnection();
//	        connent.setRequestMethod("POST");
//	        connent.setRequestProperty("Authorization", "SECRET_KEY DEVFC8B253C305A758DB5C9194879E20D28687FF"); // 실제 액세스 토큰
//	        connent.setRequestProperty("Content-Type", "application/json");
//	        connent.setDoOutput(true);
//
//	        // JSON 형식의 요청 본문 작성
//	        String parameter = "{"
//	            + "\"cid\":\"TC0ONETIME\","
//	            + "\"tid\":\"T1234567890123456789\","
//	            + "\"partner_order_id\":\"order12345\","
//	            + "\"partner_user_id\":\"user12345\","
//	            + "\"pg_token\":\"" + pgToken + "\""
//	            + "}";
//
//	        // 요청 본문 전송
//	        try (OutputStream give = connent.getOutputStream()) {
//	            DataOutputStream datagive = new DataOutputStream(give);
//	            datagive.writeBytes(parameter);
//	            datagive.close();
//	        }
//
//	        int result = connent.getResponseCode();
//	        InputStream receive;
//	        if (result == 200) {
//	            receive = connent.getInputStream();  // 성공 응답
//	        } else {
//	            receive = connent.getErrorStream();  // 오류 응답
//	        }
//
//	        // 응답 처리
//	        try (InputStreamReader read = new InputStreamReader(receive);
//	             BufferedReader aaa = new BufferedReader(read)) {
//	            String response = aaa.readLine();  // 첫 번째 응답 라인 읽기
//	            System.out.println("Response: " + response);  // 응답 출력
//	            return response;  // 응답 반환
//	        }
//
//	    } catch (IOException e) {
//	        e.printStackTrace();
//	    }
//
//	    return "redirect:/usr/v1/infra/order/OrderList";  // 오류 발생 시 리다이렉트
//	}
	
	@RequestMapping("/usr/v1/infra/checkout/kakaopay")
	@ResponseBody
	public String kakaopay(CheckOutDto checkOutDto) {
	    try {
	        URL url = new URL("https://open-api.kakaopay.com/online/v1/payment/ready");
	        try {
	            HttpURLConnection connent = (HttpURLConnection) url.openConnection();
	            connent.setRequestMethod("POST");
	            connent.setRequestProperty("Authorization", "SECRET_KEY DEVFC8B253C305A758DB5C9194879E20D28687FF"); // 실제 액세스 토큰으로 변경
	            connent.setRequestProperty("Content-Type", "application/json");
	            connent.setDoOutput(true);

	            // JSON 형식의 요청 본문
	            String parameter = "{"
	            	    + "\"cid\":\"TC0ONETIME\","
	            	    + "\"partner_order_id\":\"partner_order_id\","
	            	    + "\"partner_user_id\":\"partner_user_id\","
	            	    + "\"item_name\":\"Choco Pie\","
	            	    + "\"quantity\":1,"
	            	    + "\"total_amount\":2200,"
	            	    + "\"vat_amount\":200,"
	            	    + "\"tax_free_amount\":200,"
	            	    + "\"approval_url\":\"http://localhost:8080/usr/v1/infra/order/orderList\","
	            	    + "\"fail_url\":\"https://example.com/fail\","
	            	    + "\"product_pdSeq\":\"" +  checkOutDto.getPdSeq()+ "\","
	                    + "\"member_mmSeq\":\"" + checkOutDto.getMmSeq() + "\","
	                    + "\"address_adSeq\":\"" + checkOutDto.getAdSeq() + "\","
	            	    + "\"cancel_url\":\"https://example.com/cancel\""
	            	    + "}";
	            		
	            		System.out.println("Request Parameter: " + parameter);

	            // 요청 본문 전송
	            try (OutputStream give = connent.getOutputStream()) {
	                DataOutputStream datagive = new DataOutputStream(give);
	                datagive.writeBytes(parameter);
	                datagive.close();
	            }

	            int result = connent.getResponseCode();
	            System.out.println(result);
	            InputStream receive;
	            if (result == 200) {
	                receive = connent.getInputStream();
	            } else {
	                receive = connent.getErrorStream();
	                System.err.println("Error Response Code: " + result); // 오류 코드 출력
	            }

	            // 응답 읽기
	            try (InputStreamReader read = new InputStreamReader(receive);
	                 BufferedReader aaa = new BufferedReader(read)) {
	            	checkOutService.insert(checkOutDto);
	                return aaa.readLine();
	            }

	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    } catch (MalformedURLException e) {
	        e.printStackTrace();
	    }

	    return "redirect:/usr/v1/infra/order/OrderList"; // 오류 발생 시 리다이렉트
	}


		
}

