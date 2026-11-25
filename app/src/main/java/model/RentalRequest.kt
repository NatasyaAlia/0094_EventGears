package com.example.eventgears.model

enum class RentalStatus(val value: String) {
    PENDING("PENDING"),
    APPROVED("APPROVED"),
    REJECTED("REJECTED"),
    RETURNED("RETURNED");

    companion object {
        fun fromString(status: String?): RentalStatus =
            entries.find { it.value.equals(status, ignoreCase = true) } ?: PENDING
    }
}

data class RentalRequest(
    val id: Long = 0L,
    val equipmentId: Long,
    val borrowerId: String,
    val eventName: String,
    val quantity: Int,
    val borrowDate: String,
    val returnDate: String,
    val permitFilePath: String? = null,
    val status: String = RentalStatus.PENDING.value,
    val createdAt: String? = null
)