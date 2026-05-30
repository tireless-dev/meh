// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.organization.status

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val LowSeverity: ImageVector
  get() {
    val current = _lowSeverity
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.LowSeverity",
        defaultWidth = 16.0.dp,
        defaultHeight = 16.0.dp,
        viewportWidth = 16.0f,
        viewportHeight = 16.0f,
      ).apply {
        // <rect width="8" height="8" x="4.0" y="4.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 4 4
          moveTo(x = 4.0f, y = 4.0f)
          // h 8
          horizontalLineToRelative(dx = 8.0f)
          // v 8
          verticalLineToRelative(dy = 8.0f)
          // h -8z
          horizontalLineToRelative(dx = -8.0f)
          close()
        }
        // M12 4 v8 H4 V4z m1 -1 H3 v10 h10z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 12 4
          moveTo(x = 12.0f, y = 4.0f)
          // v 8
          verticalLineToRelative(dy = 8.0f)
          // H 4
          horizontalLineTo(x = 4.0f)
          // V 4z
          verticalLineTo(y = 4.0f)
          close()
          // m 1 -1
          moveToRelative(dx = 1.0f, dy = -1.0f)
          // H 3
          horizontalLineTo(x = 3.0f)
          // v 10
          verticalLineToRelative(dy = 10.0f)
          // h 10z
          horizontalLineToRelative(dx = 10.0f)
          close()
        }
        // <rect width="16" height="16" fill="#000" style="fill:none" />
        path(
          fill = SolidColor(Color.Transparent),
        ) {
          // M 0 0
          moveTo(x = 0.0f, y = 0.0f)
          // h 16
          horizontalLineToRelative(dx = 16.0f)
          // v 16
          verticalLineToRelative(dy = 16.0f)
          // h -16z
          horizontalLineToRelative(dx = -16.0f)
          close()
        }
      }.build()
      .also { _lowSeverity = it }
  }

@Suppress("ObjectPropertyName")
private var _lowSeverity: ImageVector? = null
