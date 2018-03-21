import com.fasterxml.jackson.databind.ObjectMapper;
import com.oracle.jrockit.jfr.InvalidValueException;
import io.kubernetes.client.ApiClient;
import io.kubernetes.client.ApiException;
import io.kubernetes.client.Configuration;
import io.kubernetes.client.apis.BatchV1Api;
import io.kubernetes.client.apis.BatchV1beta1Api;

import java.io.IOException;

public class KubernetesWrapperSample {

    String jobDef = "JobYamlorJson";
    String cronJobDef = "CronJobYamlorJson";

    public void kubernetesPrac() throws ApiException {

        ApiClient defaultClient = Configuration.getDefaultApiClient();
        // Configure API key authorization: BearerToken
        //ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
        //BearerToken.setApiKey("YOUR API KEY");
        String namespace ="default";

    }



    public <R> R convertJobDefinition(String jobDefinitionStr) throws IOException, InvalidValueException {
        R result = null;
        ObjectMapper objectMapper = new ObjectMapper();
        V1Job jobObject = new V1Job();
//        V1Job jobObject = objectMapper.readValue(jobDefinitionStr, V1Job.class);
//
//        if(jobObject != null){
//            result = (R) jobObject;
//
//        }else if (jobObject == null){
//            V1beta1CronJob cronJobObject = objectMapper.readValue(jobDefinitionStr, V1beta1CronJob.class);
//            if (cronJobObject != null){
//                result = (R) cronJobObject;
//            }
//        }else {
//            throw new InvalidValueException();
//        }
        return (R) jobObject;
    }

    public <T, R> R runJob(T t){
        R result = null;
    //    batchV1beta1Api.createNamespacedCronJob(namespace, cronJobObject,"pretty");
    //    batchV1Api.createNamespacedJob(namespace,jobObject,"pretty");
        if(t instanceof V1Job){

        }
        return result;
    }

    public static void main(String args[]){
        KubernetesWrapperSample testclass = new KubernetesWrapperSample();
        V1Job jobObject = new V1Job();
        V1beta1CronJob cronJobObject = new V1beta1CronJob();

        try {
            Object result = testclass.convertJobDefinition("");
            System.out.println(result.toString());
            System.out.println(result.getClass());
            if(result instanceof V1Job){
                System.out.println("typecheck OK");
            }

        } catch (IOException e) {
            e.printStackTrace();
        } catch (InvalidValueException e) {
            e.printStackTrace();
        }

        BatchV1Api batchV1Api = new BatchV1Api();
        BatchV1beta1Api batchV1beta1Api = new BatchV1beta1Api();

//        public <R> R convertJobDefinition(String jobDefinitionStr) throws IOException, InvalidValueException {
  }
}
