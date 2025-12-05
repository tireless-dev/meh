// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon

import androidx.compose.ui.graphics.vector.ImageVector
import dev.tireless.meh.icon.Home as HomeVector
import dev.tireless.meh.icon.RadioButton as RadioButtonVector
import dev.tireless.meh.icon.RadioButtonChecked as RadioButtonCheckedVector
import dev.tireless.meh.icon.Task as TaskVector
import dev.tireless.meh.icon.UserSettings as UserSettingsVector

@Suppress("ktlint:standard:property-naming")
interface IconPack {
  val Home: ImageVector
  val RadioButton: ImageVector
  val RadioButtonChecked: ImageVector
  val Task: ImageVector
  val UserSettings: ImageVector
}

internal object DefaultIconPack : IconPack {
  override val Home: ImageVector
    get() = HomeVector

  override val RadioButton: ImageVector
    get() = RadioButtonVector

  override val RadioButtonChecked: ImageVector
    get() = RadioButtonCheckedVector

  override val Task: ImageVector
    get() = TaskVector

  override val UserSettings: ImageVector
    get() = UserSettingsVector
}
