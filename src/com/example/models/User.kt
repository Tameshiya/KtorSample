package com.example.models

import java.sql.ResultSet

class User {

    private val id: Int
    private val name: String
    private val age: Int
    private val gender: String
    private val description: String?

    constructor(resultSet: ResultSet) {
        this.id = resultSet.getInt(1)
        this.name = resultSet.getString(2)
        this.age = resultSet.getInt(3)
        this.gender = resultSet.getString(4)
        this.description = resultSet.getString(5)
    }
}
