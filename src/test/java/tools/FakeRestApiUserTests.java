package tools;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.*;
import okhttp3.internal.tls.OkHostnameVerifier;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;
import tools.dto.User;
import tools.dto.Users;

import java.io.IOException;

import static com.sun.management.HotSpotDiagnosticMXBean.ThreadDumpFormat.JSON;

public class FakeRestApiUserTests {
    final String apiUrl = "https://fakerestapi.azurewebsites.net/api/v1";
    OkHttpClient client = new OkHttpClient.Builder().build();

    @Test
    public void getUsers() {
        final String endpointName = "/users";
        String url = apiUrl + endpointName;
        var mapper = new ObjectMapper();
        mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);

        Request request = new Request.Builder()
                .url(url)
                .method("GET", null)
                .header("accept", "text/plain; v=1.0")
                .build();
        try (Response response = client.newCall(request).execute()) {
            int code = response.code();
            Assert.assertEquals(code, 200, "Should be 200, but got " + code);
            var users = mapper.readValue(response.body().string(), Users[].class);
            Assert.assertEquals(users[4].getId(), 5, "Should be 5, but got" + users[4].getId());
            Assert.assertEquals(users[4].getPassword(), "Password5", "Should be Password5, but got" + users[4].getPassword());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void getUser() {
        final String endpointName = "/users";
        final String userId = "/5";
        String url = apiUrl + endpointName + userId;
        var mapper = new ObjectMapper();
        mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);

        Request request = new Request.Builder()
                .url(url)
                .header("accept", "*/*")
                .build();
        try (Response response = client.newCall(request).execute()) {
            int code = response.code();
            Assert.assertEquals(code, 200, "Should be 200, but got " + code);
            var user = mapper.readValue(response.body().string(), User.class);
            Assert.assertEquals(user.getId(), 5, "Should be 5, but got" + user.getId());
            Assert.assertEquals(user.getUserName(), "User 5");
            Assert.assertEquals(user.getPassword(), "Password5", "Should be Password5, but got" + user.getPassword());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void deleteUser() {
        final String endpointName = "/users/5";
        String url = apiUrl + endpointName;
        var mapper = new ObjectMapper();
        mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);

        Request request = new Request.Builder()
                .url(url)
                .method("DELETE", RequestBody.create("", MediaType.get("application/json")))
                .header("accept", "text/plain; v=1.0")
                .build();
        try (Response response = client.newCall(request).execute()) {
            int code = response.code();
            Assert.assertEquals(code, 200, "Should be 200, but got " + code);
        } catch (IOException e) {
            throw new RuntimeException(e);

        }
    }
}