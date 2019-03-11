package com.example.models

import java.sql.ResultSet

class Order(resultSet: ResultSet) {

    val id: Int = resultSet.getInt(1)
    val customerName: String = resultSet.getString(2)
    val customerEmail: String = resultSet.getString(3)
    val customerPhone: String = resultSet.getString(4)
    val message: String? = resultSet.getString(5) ?: ""

}
