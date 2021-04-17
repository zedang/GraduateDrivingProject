package DefShrimp;

import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class AccessToken {
    public static JSONObject jsonObject;
    public static String accessToken;

    public static String getAuth(){
        String clientID = "a5S1hWlSmCmGNhGFp6panOG5";
        String clientSecret = "ICqKhq5TT0ocAcj5qFQ6bLk2QP8pCrp1";
        return getAuth(clientID,clientSecret);
    }
    public static String getAuth(String ak, String sk){

        String authHost = "https://aip.baidubce.com/oauth/2.0/token?";
        String getAccessTokenUrl = authHost
                + "grant_type=client_credentials"
                + "&client_id=" + ak
                + "&client_secret=" + sk;
        try {
            var realUrl = new URL(getAccessTokenUrl);
            System.out.println(getAccessTokenUrl);
            HttpURLConnection connection = (HttpURLConnection) realUrl.openConnection();
            connection.setRequestMethod("GET");
            connection.connect();

            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String result = "";
            String line;
            while ((line = in.readLine()) != null) {
                result += line;
            }
            System.err.println("result:" + result);
            jsonObject = new JSONObject(result);
            accessToken = jsonObject.getString("access_token");
            return accessToken;
        }catch (Exception e){
            System.err.println("cannot get token");
            e.printStackTrace(System.err);
        }
        return null;
    }

}
