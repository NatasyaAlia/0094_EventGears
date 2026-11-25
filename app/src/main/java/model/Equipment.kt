package com.example.eventgears.model

data class Equipment(
    val id: Long = 0L,
    val ownerId: String,
    val name: String,
    val category: String,
    val stockAvailable: Int,
    val conditionStatus: String,
    val description: String? = null,
    val createdAt: String? = null
)