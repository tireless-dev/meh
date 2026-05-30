// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.organization.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SkillLevelAdvanced: ImageVector
  get() {
    val current = _skillLevelAdvanced
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.SkillLevelAdvanced",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M30 30 h-8 V4 h8Z m-10 0 h-8 V12 h8Z m-10 0 H2 V18 h8Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 30 30
          moveTo(x = 30.0f, y = 30.0f)
          // h -8
          horizontalLineToRelative(dx = -8.0f)
          // V 4
          verticalLineTo(y = 4.0f)
          // h 8z
          horizontalLineToRelative(dx = 8.0f)
          close()
          // m -10 0
          moveToRelative(dx = -10.0f, dy = 0.0f)
          // h -8
          horizontalLineToRelative(dx = -8.0f)
          // V 12
          verticalLineTo(y = 12.0f)
          // h 8z
          horizontalLineToRelative(dx = 8.0f)
          close()
          // m -10 0
          moveToRelative(dx = -10.0f, dy = 0.0f)
          // H 2
          horizontalLineTo(x = 2.0f)
          // V 18
          verticalLineTo(y = 18.0f)
          // h 8z
          horizontalLineToRelative(dx = 8.0f)
          close()
        }
        // <rect width="32" height="32" fill="#000" style="fill:none" />
        path(
          fill = SolidColor(Color.Transparent),
        ) {
          // M 0 0
          moveTo(x = 0.0f, y = 0.0f)
          // h 32
          horizontalLineToRelative(dx = 32.0f)
          // v 32
          verticalLineToRelative(dy = 32.0f)
          // h -32z
          horizontalLineToRelative(dx = -32.0f)
          close()
        }
      }.build()
      .also { _skillLevelAdvanced = it }
  }

@Suppress("ObjectPropertyName")
private var _skillLevelAdvanced: ImageVector? = null
