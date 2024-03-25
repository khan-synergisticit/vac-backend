//package com.synergisticit.config;
//
//import com.amazonaws.auth.*;
//import com.amazonaws.regions.Regions;
//import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
//import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClient;
//import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
//import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapperConfig;
//import com.amazonaws.services.dynamodbv2.document.DynamoDB;
////import org.socialsignin.spring.data.dynamodb.repository.config.EnableDynamoDBRepositories;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import org.springframework.context.annotation.Primary;
//import org.springframework.context.annotation.PropertySource;
//import org.springframework.util.StringUtils;
//
//
//@Configuration
////@EnableDynamoDBRepositories(basePackages = "com.synergisticit.dao")
////@PropertySource(value = "classpath:application.properties")
//public class AppConfig {
//    @Value("${amazon.dynamodb.endpoint}")
//    private String amazonDynamoDBEndpoint;
//
//    @Value("${amazon.aws.accesskey}")
//    private String amazonAWSAccessKey;
//
//    @Value("${amazon.aws.secretkey}")
//    private String amazonAWSSecretKey;
//
//
//    @Bean
//    public AmazonDynamoDB amazonDynamoDB() {
////        AmazonDynamoDB amazonDynamoDB
////                = new AmazonDynamoDBClient(amazonAWSCredentials());
//        AmazonDynamoDB amazonDynamoDB = AmazonDynamoDBClientBuilder.standard().withRegion(Regions.AP_SOUTHEAST_2).withCredentials(new AWSStaticCredentialsProvider(amazonAWSCredentials())).build();
//
////        return  dynamoDB;
////        if (!StringUtils.isEmpty(amazonDynamoDBEndpoint)) {
////            amazonDynamoDB.setEndpoint(amazonDynamoDBEndpoint);
////        }
//
//        return amazonDynamoDB;
//    }
//    @Bean
//    public AWSCredentialsProvider awsCredentialsProvider(){
//        return new AWSCredentialsProvider() {
//            @Override
//            public AWSCredentials getCredentials() {
//                return new BasicAWSCredentials(
//                        amazonAWSAccessKey, amazonAWSSecretKey);
//            }
//
//            @Override
//            public void refresh() {
//
//            }
//        };
//    }
//    @Bean
//    public AWSCredentials amazonAWSCredentials() {
//        return new BasicAWSCredentials(
//                amazonAWSAccessKey, amazonAWSSecretKey);
//    }
//
//    @Primary
//    @Bean
//    public DynamoDBMapperConfig dynamoDBMapperConfig() {
//
//        return DynamoDBMapperConfig.builder()
//                .withSaveBehavior(DynamoDBMapperConfig.SaveBehavior.UPDATE)
//                .withConsistentReads(DynamoDBMapperConfig.ConsistentReads.EVENTUAL)
//                .withTableNameOverride(null)
//                .withPaginationLoadingStrategy(DynamoDBMapperConfig.PaginationLoadingStrategy.LAZY_LOADING)
//                .build();
//    }
//
//}
