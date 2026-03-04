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
 * The result of installing or uninstalling an [Apk] with root permissions using [RootInstaller].
 *
 * @see RootInstaller
 */
enum class RootInstallerResult {
    /**
     * The result of installing an [Apk] successfully.
     */
    SUCCESS,

    /**
     * The result of installing an [Apk] unsuccessfully.
     */
    FAILURE,
}
