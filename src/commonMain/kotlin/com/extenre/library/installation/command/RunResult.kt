/*
 * Copyright (C) 2022 ReVanced LLC
 * Copyright (C) 2022 inotia00
 * Copyright (C) 2026 LuisCupul04
 *
 * SPDX-License-Identifier: GPL-3.0-only
 */

package com.extenre.library.installation.command

/**
 * The result of a command execution.
 */
interface RunResult {
    /**
     * The exit code of the command.
     */
    val exitCode: Int

    /**
     * The output of the command.
     */
    val output: String

    /**
     * The error of the command.
     */
    val error: String

    /**
     * Waits for the command to finish.
     */
    fun waitFor() {}
}
