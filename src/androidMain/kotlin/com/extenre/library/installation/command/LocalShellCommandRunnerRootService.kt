/*
 * Copyright (C) 2022 ReVanced LLC
 * Copyright (C) 2022 inotia00
 * Copyright (C) 2026 LuisCupul04
 *
 * SPDX-License-Identifier: GPL-3.0-only
 */

package com.extenre.library.installation.command

import android.content.Intent
import com.topjohnwu.superuser.ipc.RootService
import com.topjohnwu.superuser.nio.FileSystemManager

/**
 * The [RootService] for the [LocalShellCommandRunner].
 */
internal class LocalShellCommandRunnerRootService : RootService() {
    override fun onBind(intent: Intent) = object : ILocalShellCommandRunnerRootService.Stub() {
        override fun getFileSystemService() =
            FileSystemManager.getService()
    }
}
