package com.example.models

import java.sql.ResultSet

class Price(resultSet: ResultSet) {

    val service: String = resultSet.getString(2)
    val price: Int = resultSet.getInt(3)

}
