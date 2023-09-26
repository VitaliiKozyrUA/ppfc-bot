/*
 * Copyright (c) 2023. Vitalii Kozyr
 */

package com.ppfcbot.common.api.models.auth

import kotlinx.serialization.Serializable

@Serializable
data class AuthNewPasswordRequiredChallengeRequest(
    val username: String,
    val password: String,
    val session: String
)
