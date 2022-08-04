package boot.camp.boot_study;

import net.minidev.json.JSONArray;
import net.minidev.json.JSONObject;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;


public class JsonTest {

    public static void main(String[] args) {

    //JSON 데이터 만들기 

    JSONObject jsonob = new JSONObject();
    JSONArray jsonarr = new JSONArray();

    for(int i=1;i<3;i++) {

        JSONObject data = new JSONObject();

        data.put("이름", "임찬솔_"+i);
        data.put("나이",20+i);
        data.put("주소", "동성로 "+i+"길");
        jsonarr.add(data);

    }

    jsonob.put("사람들", jsonarr);

    System.out.println(jsonob);


    //JSON 데이터 HTTP POST 전송하기 

    try
    {

        String host_url = "https://webhook.site/3de7e1ff-5a7f-46aa-bed6-fe2e5a8e5d10";
        HttpURLConnection conn = null;

        URL url = new URL(host_url);
        conn = (HttpURLConnection)url.openConnection();

        conn.setRequestMethod("POST");//POST GET
        conn.setRequestProperty("Content-Type", "application/json");

        //POST방식으로 스트링을 통한 JSON 전송
        conn.setDoOutput(true);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(conn.getOutputStream()));

        bw.write(jsonob.toString());
        bw.flush();
        bw.close();

        //서버에서 보낸 응답 데이터 수신 받기
        BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        String returnMsg = in.readLine();
        System.out.println("응답메시지 : " + returnMsg );

        //HTTP 응답 코드 수신 
        int responseCode = conn.getResponseCode();
       if(responseCode == 400) {
            System.out.println("400 : 명령을 실행 오류");
       } else if (responseCode == 500) {
            System.out.println("500 : 서버 에러.");
        } else { //정상 . 200 응답코드 . 기타 응답코드 
            System.out.println(responseCode + " : 응답코드임");
        }

    }catch(IOException ie) {
        System.out.println("IOException " + ie.getCause());
        ie.printStackTrace();
    }catch(Exception ee) {
        System.out.println("Exception " + ee.getCause());
        ee.printStackTrace();
    }

    }
}