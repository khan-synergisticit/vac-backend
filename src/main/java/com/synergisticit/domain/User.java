package com.synergisticit.domain;


//import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
//import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
//import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
//@ToString
//@DynamoDBTable(tableName = "users")
@Document( "user")
public class User {
    @Id
    private String userID;

    private String userName;

    private String role;

//    @DynamoDBHashKey(attributeName = "userID")
//    public String getUserID() {
//        return userID;
//    }
//
//    public void setUserID(String userID) {
//        this.userID = userID;
//    }
//
//    //@DynamoDBAttribute(attributeName = "userName")
//    public String getUserName() {
//        return userName;
//    }
//
//    public void setUserName(String userName) {
//        this.userName = userName;
//    }
//    //@DynamoDBAttribute(attributeName = "role")
//    public String getRole() {
//        return role;
//    }
//
//    public void setRole(String role) {
//        this.role = role;
//    }
}


