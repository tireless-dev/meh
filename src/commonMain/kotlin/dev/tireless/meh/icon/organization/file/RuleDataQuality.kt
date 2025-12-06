// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.organization.file

import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp

val RuleDataQuality: ImageVector
  get() {
    val current = _ruleDataQuality
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.RuleDataQuality",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
      }.build()
      .also { _ruleDataQuality = it }
  }

@Suppress("ObjectPropertyName")
private var _ruleDataQuality: ImageVector? = null
