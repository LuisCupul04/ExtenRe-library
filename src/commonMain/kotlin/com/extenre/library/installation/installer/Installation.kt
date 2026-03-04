/*
 * Copyright (C) 2022 ReVanced LLC
 * Copyright (C) 2022 inotia00
 * Copyright (C) 2026 LuisCupul04
 *
 * SPDX-License-Identifier: GPL-3.0-only
 */

package com.extenre.library.installation.installer

/**
 * [Installation] of an apk file.
 *
 * @param apkFilePath The apk file path.
 */
@Suppress("MemberVisibilityCanBePrivate")
open class Installation internal constructor(
    val apkFilePath: String,
)
