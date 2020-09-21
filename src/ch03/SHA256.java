package ch03;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.security.MessageDigest;

public class SHA256 {

    public static void main(String[] args) throws Exception {

        // 입력갑는값이 크거나 많을때는 Scanner 대신 BufferReader를 사용한다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String base = br.readLine();

        // 암호화
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        byte[] hash = md.digest(base.getBytes("UTF-8"));

        // String 을 byte단위로 계속해서 이어붙일때는 StringBuffer사용
        StringBuffer result = new StringBuffer();

        // byte단위를 String으로 연결
        for (int i=0; i<hash.length; i++){
            String hex = Integer.toHexString(0xff & hash[i]);
            if (hex.length() == 1) result.append('0');
            result.append(hex);
        }

        System.out.println(result.toString());

    }
}
