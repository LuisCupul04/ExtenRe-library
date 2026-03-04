/*
 * Copyright (C) 2022 ReVanced LLC
 * Copyright (C) 2022 inotia00
 * Copyright (C) 2026 LuisCupul04
 *
 * SPDX-License-Identifier: GPL-3.0-only
 */

package com.extenre.library.installation.installer

import com.extenre.library.installation.installer.Installer.Apk

/**
 * The result of installing or uninstalling an [Apk] via ADB using [AdbInstaller].
 *
 * @see AdbInstaller
 */
@Suppress("MemberVisibilityCanBePrivate")
interface AdbInstallerResult {
    /**
     * The result of installing an [Apk] successfully.
     */
    object Success : AdbInstallerResult

    /**
     * The result of installing an [Apk] unsuccessfully.
     *
     * @param exception The exception that caused the installation to fail.
     */
    class Failure internal constructor(val exception: Exception) : AdbInstallerResult
}
