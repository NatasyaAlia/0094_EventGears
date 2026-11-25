package com.example.eventgears.model

enum class UserRole(val value: String) {
    ADMIN("ADMIN"),
    USER("USER");

    companion object {
        fun fromString(role: String?): UserRole =
            entries.find { it.value.equals(role, ignoreCase = true) } ?: USER
    }
}

data class User(
    val id: String,
    val name: String,
    val email: String,
    val organizationName: String? = null,
    val role: String = UserRole.USER.value,
    val createdAt: String? = null
)