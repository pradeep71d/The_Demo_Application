package com.pradeep.demoapp.media_details.presentation.details

import com.pradeep.demoapp.main.domain.models.Genre

sealed class MediaDetailsScreenEvents {

    data class SetDataAndLoad(
        val moviesGenresList: List<Genre>,
        val tvGenresList: List<Genre>,
        val id: Int,
        val type: String,
        val category: String
    ) : MediaDetailsScreenEvents()

    object Refresh : MediaDetailsScreenEvents()

    object NavigateToWatchVideo : MediaDetailsScreenEvents()
}