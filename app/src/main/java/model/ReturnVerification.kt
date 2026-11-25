package com.example.eventgears.model

data class ReturnVerification(
    val id: Long = 0L,
    val rentalRequestId: Long,
    val verifiedBy: String,
    val actualReturnDate: String,
    val itemConditionAfter: String,
    val notes: String? = null,
    val proofFilePath: String? = null,
    val createdAt: String? = null
)