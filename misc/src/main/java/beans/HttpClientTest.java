package beans;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import sun.net.www.http.HttpClient;

import java.io.IOException;

/**
 * Created by yangtao.lyt on 2015/5/8.
 *
 * 用于测试httpclient
 *
 */
public class HttpClientTest {

    public static void main(String[] args) {

        CloseableHttpClient httpClient = HttpClients.createDefault();

        HttpGet httpGet = new HttpGet("http://www.baidu.com");

        try {
            HttpResponse httpResponse = httpClient.execute(httpGet);

            System.out.println(httpResponse.getStatusLine());

            if(httpResponse.getEntity() != null){
                System.out.println(EntityUtils.toString(httpResponse.getEntity()));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
