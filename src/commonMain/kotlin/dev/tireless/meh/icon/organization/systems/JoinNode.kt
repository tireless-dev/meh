// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.organization.systems

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val JoinNode: ImageVector
  get() {
    val current = _joinNode
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.JoinNode",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <rect width="4" height="2" x="2.0" y="9.0" fill="#000" stroke-width="0" />
        path(
          fill = SolidColor(Color(0xFF000000)),
          strokeLineWidth = 0.0f,
        ) {
          // M 2 9
          moveTo(x = 2.0f, y = 9.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -4z
          horizontalLineToRelative(dx = -4.0f)
          close()
        }
        // <rect width="4" height="2" x="2.0" y="21.0" fill="#000" stroke-width="0" />
        path(
          fill = SolidColor(Color(0xFF000000)),
          strokeLineWidth = 0.0f,
        ) {
          // M 2 21
          moveTo(x = 2.0f, y = 21.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -4z
          horizontalLineToRelative(dx = -4.0f)
          close()
        }
        // <polygon points="25.0 11.0 23.5859 12.4141 26.1719 15.0 18.0 15.0 18.0 4.0 12.0 4.0 12.0 9.0 8.0 9.0 8.0 11.0 12.0 11.0 12.0 21.0 8.0 21.0 8.0 23.0 12.0 23.0 12.0 28.0 18.0 28.0 18.0 17.0 26.1719 17.0 23.5859 19.5859 25.0 21.0 30.0 16.0 25.0 11.0" fill="#000" stroke-width="0" />
        path(
          fill = SolidColor(Color(0xFF000000)),
          strokeLineWidth = 0.0f,
        ) {
          // M 25 11
          moveTo(x = 25.0f, y = 11.0f)
          // L 23.5859 12.4141
          lineTo(x = 23.5859f, y = 12.4141f)
          // L 26.1719 15
          lineTo(x = 26.1719f, y = 15.0f)
          // L 18 15
          lineTo(x = 18.0f, y = 15.0f)
          // L 18 4
          lineTo(x = 18.0f, y = 4.0f)
          // L 12 4
          lineTo(x = 12.0f, y = 4.0f)
          // L 12 9
          lineTo(x = 12.0f, y = 9.0f)
          // L 8 9
          lineTo(x = 8.0f, y = 9.0f)
          // L 8 11
          lineTo(x = 8.0f, y = 11.0f)
          // L 12 11
          lineTo(x = 12.0f, y = 11.0f)
          // L 12 21
          lineTo(x = 12.0f, y = 21.0f)
          // L 8 21
          lineTo(x = 8.0f, y = 21.0f)
          // L 8 23
          lineTo(x = 8.0f, y = 23.0f)
          // L 12 23
          lineTo(x = 12.0f, y = 23.0f)
          // L 12 28
          lineTo(x = 12.0f, y = 28.0f)
          // L 18 28
          lineTo(x = 18.0f, y = 28.0f)
          // L 18 17
          lineTo(x = 18.0f, y = 17.0f)
          // L 26.1719 17
          lineTo(x = 26.1719f, y = 17.0f)
          // L 23.5859 19.5859
          lineTo(x = 23.5859f, y = 19.5859f)
          // L 25 21
          lineTo(x = 25.0f, y = 21.0f)
          // L 30 16
          lineTo(x = 30.0f, y = 16.0f)
          // L 25 11z
          lineTo(x = 25.0f, y = 11.0f)
          close()
        }
        // <rect width="32" height="32" fill="#000" style="fill:none;stroke-width:0" stroke-width="0" />
        path(
          fill = SolidColor(Color.Transparent),
          strokeLineWidth = 0.0f,
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
      .also { _joinNode = it }
  }

@Suppress("ObjectPropertyName")
private var _joinNode: ImageVector? = null
