
package com.example.sports.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

/**
 * Data model for Sport
 */
data class Sport(
    val id: Int,
    @StringRes val titleResourceId: Int,
    @StringRes val subtitleResourceId: Int,
    @DrawableRes val imageResourceId: Int,
    @DrawableRes val sportsImageBanner: Int,
    @StringRes val newsDetails: Int
)
