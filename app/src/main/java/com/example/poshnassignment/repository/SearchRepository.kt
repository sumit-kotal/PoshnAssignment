package com.example.poshnassignment.repository

import android.app.Application
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import javax.inject.Inject
import kotlin.coroutines.CoroutineContext

class SearchRepository @Inject constructor(
    application: Application
) : CoroutineScope {

    override val coroutineContext: CoroutineContext
        get() = Dispatchers.Main
}