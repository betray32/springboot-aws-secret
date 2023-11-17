package spring.moflete.aws.secret.integration;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import software.amazon.awssdk.core.exception.SdkClientException;
import software.amazon.awssdk.services.secretsmanager.SecretsManagerClient;
import software.amazon.awssdk.services.secretsmanager.model.GetSecretValueRequest;
import software.amazon.awssdk.services.secretsmanager.model.GetSecretValueResponse;
import software.amazon.awssdk.services.secretsmanager.model.SecretsManagerException;

import java.util.Optional;

@Service
@Slf4j
public class GetSecretValue {
    public static final String RETRIEVED_OK = "Retrieved [OK]";
    public static final String CLIENT_NULL_VALUE = "Error retrieving key from Store, Detail > ";

    private String errorMsg;

    public Optional<String> getValue(String secretName) {
        try (SecretsManagerClient secretsManagerClient = SecretsManagerClient.create()) {
            GetSecretValueRequest valueRequest = GetSecretValueRequest.builder()
                    .secretId(secretName)
                    .build();

            GetSecretValueResponse valueResponse = secretsManagerClient.getSecretValue(valueRequest);
            String secret = valueResponse.secretString();

            return Optional.of(secret);

        } catch (SecretsManagerException e) {
            errorMsg = "SecretsManagerException - " + CLIENT_NULL_VALUE + e.awsErrorDetails().errorMessage();
            log.error(errorMsg);
        } catch (SdkClientException e) {
            errorMsg = "SdkClientException - " + CLIENT_NULL_VALUE + e.getMessage();
            log.error(errorMsg);
        } catch (Exception e) {
            errorMsg = "Exception - " + CLIENT_NULL_VALUE + e.getMessage();
            log.error(errorMsg);
        }

        return Optional.empty();
    }

    public String getErrorMsg() {
        return errorMsg;
    }
}