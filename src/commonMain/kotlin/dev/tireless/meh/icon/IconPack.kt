// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon

import androidx.compose.ui.graphics.vector.ImageVector
import dev.tireless.meh.icon.RadioButton as RadioButtonVector
import dev.tireless.meh.icon.RadioButtonChecked as RadioButtonCheckedVector

@Suppress("ktlint:standard:property-naming")
interface IconPack {
  val RadioButton: ImageVector
  val RadioButtonChecked: ImageVector
}

internal object DefaultIconPack : IconPack {
  override val RadioButton: ImageVector
    get() = RadioButtonVector

  override val RadioButtonChecked: ImageVector
    get() = RadioButtonCheckedVector
}
