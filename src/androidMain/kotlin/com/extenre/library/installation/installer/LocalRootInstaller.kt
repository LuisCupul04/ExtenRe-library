/*
 * Copyright (C) 2022 ReVanced LLC
 * Copyright (C) 2022 inotia00
 * Copyright (C) 2026 LuisCupul04
 *
 * SPDX-License-Identifier: GPL-3.0-only
 */

package com.extenre.library.installation.installer

import android.content.Context
import com.extenre.library.installation.command.LocalShellCommandRunner
import com.extenre.library.installation.installer.Installer.Apk
import com.extenre.library.installation.installer.RootInstaller.NoRootPermissionException
import com.topjohnwu.superuser.ipc.RootService
import java.io.Closeable

/**
 * [LocalRootInstaller] for installing and uninstalling [Apk] files locally with using root permissions by mounting.
 *
 * @param context The [Context] to use for binding to the [RootService].
 * @param onReady A callback to be invoked when [LocalRootInstaller] is ready to be used.
 *
 * @throws NoRootPermissionException If the device does not have root permission.
 *
 * @see Installer
 * @see LocalShellCommandRunner
 */
@Suppress("unused")
class LocalRootInstaller(
    context: Context,
    onReady: LocalRootInstaller.() -> Unit = {},
) : RootInstaller(
    { installer ->
        LocalShellCommandRunner(context) {
            (installer as LocalRootInstaller).onReady()
        }
    },
),
    Closeable {
    override fun close() = (shellCommandRunner as LocalShellCommandRunner).close()
}
