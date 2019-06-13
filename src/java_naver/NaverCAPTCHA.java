package java_naver;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Date;

public class NaverCAPTCHA {
	public class APIExamCaptchaNkey {
	    public static void main(String[] args) {
	        String clientId = "IY2RZH_jGXKhgttT5kSc";//애플리케이션 클라이언트 아이디값";
	        String clientSecret = "OcjHGSh2Cv";//애플리케이션 클라이언트 시크릿값";
	        try {
	            String code = "0"; // 키 발급시 0,  캡차 이미지 비교시 1로 세팅
	            String apiURL = "https://openapi.naver.com/v1/captcha/nkey?code=" + code;
	            URL url = new URL(apiURL);
	            HttpURLConnection con = (HttpURLConnection)url.openConnection();
	            con.setRequestMethod("GET");
	            con.setRequestProperty("X-Naver-Client-Id", clientId);
	            con.setRequestProperty("X-Naver-Client-Secret", clientSecret);
	            int responseCode = con.getResponseCode();
	            BufferedReader br;
	            if(responseCode==200) { // 정상 호출
	                br = new BufferedReader(new InputStreamReader(con.getInputStream()));
	            } else {  // 에러 발생
	                br = new BufferedReader(new InputStreamReader(con.getErrorStream()));
	            }
	            String inputLine;
	            StringBuffer response = new StringBuffer();
	            while ((inputLine = br.readLine()) != null) {
	                response.append(inputLine);
	            }
	            br.close();
	            System.out.println(response.toString());
	        } catch (Exception e) {
	            System.out.println(e);
	        }
	    }
	}
	
	
	
	
	//이미지
	 public static void main(String[] args) {
	        String clientId = "IY2RZH_jGXKhgttT5kSc";//애플리케이션 클라이언트 아이디값";
	        String clientSecret = "IY2RZH_jGXKhgttT5kSc";//애플리케이션 클라이언트 시크릿값";
	        try {
	            String key = "vP7btmHLluuKjuHb"; // https://openapi.naver.com/v1/captcha/nkey 호출로 받은 키값
	            String apiURL = "https://openapi.naver.com/v1/captcha/ncaptcha.bin?key=" + key;
	            URL url = new URL(apiURL);
	            HttpURLConnection con = (HttpURLConnection)url.openConnection();
	            con.setRequestMethod("GET");
	            con.setRequestProperty("X-Naver-Client-Id", clientId);
	            con.setRequestProperty("X-Naver-Client-Secret", clientSecret);
	            int responseCode = con.getResponseCode();
	            BufferedReader br;
	            if(responseCode==200) { // 정상 호출
	                InputStream is = con.getInputStream();
	                int read = 0;
	                //네트워크에서 데이터 받을때는 8190으로 설정하는게 꿀
	                byte[] bytes = new byte[8190];
	                // 랜덤한 이름으로 파일 생성
	                String tempname = String.valueOf(new Date().getTime());
	                File f = new File("c:\\down\\"+tempname+ ".jpg");
	                //필요없는 코드
	                //f.createNewFile();
	                FileOutputStream outputStream = new FileOutputStream(f);
	                while ((read =is.read(bytes)) != -1) {
	                    outputStream.write(bytes, 0, read);
	                }
	                is.close();
	                outputStream.close();
	                isSuccess
	            } else {  // 에러 발생
	                br = new BufferedReader(new InputStreamReader(con.getErrorStream()));
	                String inputLine;
	                StringBuffer response = new StringBuffer();
	                while ((inputLine = br.readLine()) != null) {
	                    response.append(inputLine);
	                }
	                br.close();
	                //System.out.println(response.toString());
	            }
	        } catch (Exception e) {
	            System.out.println(e);
	        }
	        return isSuccess
	    }
	 public String getResult(String key, String value){
	}
	//image
	public String getKey() {
		StringBuffer response = new StringBuffer();
		String clientId = "IY2RZH_jGXKhgttT5kSc";// 애플리케이션 클라이언트 아이디값";
		String clientSecret = "IY2RZH_jGXKhgttT5kSc";// 애플리케이션 클라이언트 시크릿값";
		try {
			String key = "vP7btmHLluuKjuHb"; // https://openapi.naver.com/v1/captcha/nkey
												// 호출로 받은 키값
			String apiURL = "https://openapi.naver.com/v1/captcha/ncaptcha.bin?key=" + key;
			URL url = new URL(apiURL);
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			con.setRequestMethod("GET");
			con.setRequestProperty("X-Naver-Client-Id", clientId);
			con.setRequestProperty("X-Naver-Client-Secret", clientSecret);
			int responseCode = con.getResponseCode();
			BufferedReader br;
			if (responseCode == 200) { // 정상 호출
				InputStream is = con.getInputStream();
				int read = 0;
				// 네트워크에서 데이터 받을때는 8190으로 설정하는게 꿀
				byte[] bytes = new byte[8190];
				// 랜덤한 이름으로 파일 생성
				String tempname = String.valueOf(new Date().getTime());
				File f = new File("c:\\down\\" + tempname + ".jpg");
				// 필요없는 코드
				// f.createNewFile();
				FileOutputStream outputStream = new FileOutputStream(f);
				while ((read = is.read(bytes)) != -1) {
					outputStream.write(bytes, 0, read);
				}
				is.close();
				outputStream.close();
			} else { // 에러 발생
				br = new BufferedReader(new InputStreamReader(con.getErrorStream()));
				String inputLine;
			
				while ((inputLine = br.readLine()) != null) {
					response.append(inputLine);
				}
				br.close();
				
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return response.toString();
	}
	public void createImage(String key){
		
	}
}
