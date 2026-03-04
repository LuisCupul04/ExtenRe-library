/*
 * Copyright (C) 2022 ReVanced LLC
 * Copyright (C) 2022 inotia00
 * Copyright (C) 2026 LuisCupul04
 *
 * SPDX-License-Identifier: GPL-3.0-only
 */

package com.extenre.library

/**
 * Utils for the library.
 */
@Suppress("unused")
object Utils {
    /**
     * True if the environment is Android.
     */
    val isAndroidEnvironment =
        try {
            Class.forName("android.app.Application")
            true
        } catch (e: ClassNotFoundException) {
            false
        }
}
