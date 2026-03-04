/*
 * Copyright (C) 2022 ReVanced LLC
 * Copyright (C) 2022 inotia00
 * Copyright (C) 2026 LuisCupul04
 *
 * SPDX-License-Identifier: GPL-3.0-only
 */

package com.extenre.library.installation.installer

import com.extenre.library.installation.command.AdbShellCommandRunner
import com.extenre.library.installation.installer.Installer.Apk
import com.extenre.library.installation.installer.RootInstaller.NoRootPermissionException

/**
 * [AdbRootInstaller] for installing and uninstalling [Apk] files with using ADB root permissions by mounting.
 *
 * @param deviceSerial The device serial. If null, the first connected device will be used.
 *
 * @throws NoRootPermissionException If the device does not have root permission.
 *
 * @see RootInstaller
 * @see AdbShellCommandRunner
 */
class AdbRootInstaller(
    deviceSerial: String? = null,
) : RootInstaller({ AdbShellCommandRunner(deviceSerial) }) {
    init {
        logger.fine("Connected to $deviceSerial")
    }
}
