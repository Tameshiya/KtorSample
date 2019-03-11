package com.example.models

import java.sql.Date
import java.sql.ResultSet

class News {

    private val id: Int
    private val title: String
    private val date: Date
    private val authorId: Int
    private val shortText: String
    private val fullText: String

    constructor(resultSet: ResultSet) {
        this.id = resultSet.getInt(1)
        this.title = resultSet.getString(2)
        this.date = resultSet.getDate(3)
        this.authorId = resultSet.getInt(4)
        this.shortText = resultSet.getString(5)
        this.fullText = resultSet.getString(6)
    }

}
