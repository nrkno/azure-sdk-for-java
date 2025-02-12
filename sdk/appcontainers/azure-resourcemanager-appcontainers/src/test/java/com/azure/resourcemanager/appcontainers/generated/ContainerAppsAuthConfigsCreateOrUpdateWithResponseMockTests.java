// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.appcontainers.ContainerAppsApiManager;
import com.azure.resourcemanager.appcontainers.models.AuthConfig;
import com.azure.resourcemanager.appcontainers.models.AuthPlatform;
import com.azure.resourcemanager.appcontainers.models.GlobalValidation;
import com.azure.resourcemanager.appcontainers.models.HttpSettings;
import com.azure.resourcemanager.appcontainers.models.IdentityProviders;
import com.azure.resourcemanager.appcontainers.models.Login;
import com.azure.resourcemanager.appcontainers.models.UnauthenticatedClientActionV2;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class ContainerAppsAuthConfigsCreateOrUpdateWithResponseMockTests {
    @Test
    public void testCreateOrUpdateWithResponse() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"properties\":{\"platform\":{\"enabled\":false,\"runtimeVersion\":\"rrqwexjk\"},\"globalValidation\":{\"unauthenticatedClientAction\":\"Return403\",\"redirectToProvider\":\"jwogqqnobpudc\",\"excludedPaths\":[]},\"identityProviders\":{\"customOpenIdConnectProviders\":{}},\"login\":{\"preserveUrlFragmentsForLogins\":false,\"allowedExternalRedirectUrls\":[]},\"httpSettings\":{\"requireHttps\":false}},\"id\":\"exaoguya\",\"name\":\"p\",\"type\":\"dsdaultxijjumf\"}";

        Mockito.when(httpResponse.getStatusCode()).thenReturn(200);
        Mockito.when(httpResponse.getHeaders()).thenReturn(new HttpHeaders());
        Mockito
            .when(httpResponse.getBody())
            .thenReturn(Flux.just(ByteBuffer.wrap(responseStr.getBytes(StandardCharsets.UTF_8))));
        Mockito
            .when(httpResponse.getBodyAsByteArray())
            .thenReturn(Mono.just(responseStr.getBytes(StandardCharsets.UTF_8)));
        Mockito
            .when(httpClient.send(httpRequest.capture(), Mockito.any()))
            .thenReturn(
                Mono
                    .defer(
                        () -> {
                            Mockito.when(httpResponse.getRequest()).thenReturn(httpRequest.getValue());
                            return Mono.just(httpResponse);
                        }));

        ContainerAppsApiManager manager =
            ContainerAppsApiManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        AuthConfig response =
            manager
                .containerAppsAuthConfigs()
                .define("tmzlbiojlv")
                .withExistingContainerApp("sbostzel", "dlat")
                .withPlatform(new AuthPlatform().withEnabled(true).withRuntimeVersion("neqvcwwyyurmo"))
                .withGlobalValidation(
                    new GlobalValidation()
                        .withUnauthenticatedClientAction(UnauthenticatedClientActionV2.RETURN401)
                        .withRedirectToProvider("prsnmokayzejn")
                        .withExcludedPaths(Arrays.asList()))
                .withIdentityProviders(new IdentityProviders().withCustomOpenIdConnectProviders(mapOf()))
                .withLogin(
                    new Login()
                        .withPreserveUrlFragmentsForLogins(false)
                        .withAllowedExternalRedirectUrls(Arrays.asList()))
                .withHttpSettings(new HttpSettings().withRequireHttps(false))
                .create();

        Assertions.assertEquals(false, response.platform().enabled());
        Assertions.assertEquals("rrqwexjk", response.platform().runtimeVersion());
        Assertions
            .assertEquals(
                UnauthenticatedClientActionV2.RETURN403, response.globalValidation().unauthenticatedClientAction());
        Assertions.assertEquals("jwogqqnobpudc", response.globalValidation().redirectToProvider());
        Assertions.assertEquals(false, response.login().preserveUrlFragmentsForLogins());
        Assertions.assertEquals(false, response.httpSettings().requireHttps());
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
