package DefShrimp;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

public class BaiduAI implements CanDriverScan{

    @Override
    public String driverBehavior() {
        String url = "https://aip.baidubce.com/rest/2.0/image-classify/v1/driver_behavior";
        try {

            String imgPath = "D:/important/IdeaProjects/GraduateDrivingProject/src/main/java/DefShrimp/test.png";
            byte[] imgData = FileUtil.readFileByBytes(imgPath);
            String imgString = Base64Util.encode(imgData);
            String imgParam = URLEncoder.encode(imgString, StandardCharsets.UTF_8);
            String param = "image=" + imgParam;

            String result = HttpUtil.post(url, AccessToken.accessToken, param);
            System.out.println(result);
            return result;
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
