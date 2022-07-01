package com.pm.mongo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User {

  private int userdId;
  private String firstName;
  private String lastName;
  private List<Address> addressList;
}
