package com.example.models

import java.sql.ResultSet

class Employee {

    val id: Int
    val name: String
    val age: Int
    val role: String
    val img_url: String?
    //var passphrase: String

    constructor(resultSet: ResultSet) {
        id = resultSet.getInt(1)
        name = resultSet.getString(2)
        //passphrase = resultSet.getString(3)
        age = resultSet.getInt(4)
        role = resultSet.getString(5)
        img_url = resultSet.getString(6)
    }
}
