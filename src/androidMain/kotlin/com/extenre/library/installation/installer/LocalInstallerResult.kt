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
 * The result of installing or uninstalling an [Apk] locally using [LocalInstaller].
 *
 * @param pmStatus The status code returned by the package manager.
 * @param extra The extra information returned by the package manager.
 * @param packageName The package name of the installed app.
 *
 * @see LocalInstaller
 */
@Suppress("MemberVisibilityCanBePrivate")
class LocalInstallerResult internal constructor(val pmStatus: Int, val extra: String, val packageName: String)
