# kubernetesAPIPrac, Note
-

Setting apiclientURL
-
     /**
     * Set base path
     *
     * @param basePath Base path of the URL (e.g https://localhost
     * @return An instance of OkHttpClient
     */
    public ApiClient setBasePath(String basePath) {
        this.basePath = basePath;
        return this;
    }


BearerToken
-
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        // Configure API key authorization: BearerToken
        ApiKeyAuth BearerToken = (ApiKeyAuth)defaultClient.getAuthentication("BearerToken");
        BearerToken.setApiKey("YOUR API KEY");

        BatchV1Api apiInstance = new BatchV1Api();
        
BearerToken
https://kubernetes.io/docs/admin/authentication/#putting-a-bearer-token-in-a-request


Intro to the Jackson ObjectMapper
-
http://www.baeldung.com/jackson-object-mapper-tutorial
https://www.lesstif.com/pages/viewpage.action?pageId=24445183

