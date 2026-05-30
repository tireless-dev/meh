// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.organization.systems

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Succession: ImageVector
  get() {
    val current = _succession
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Succession",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <rect width="2" height="4" x="19.0" y="27.0" fill="#000" stroke-width="0" />
        path(
          fill = SolidColor(Color(0xFF000000)),
          strokeLineWidth = 0.0f,
        ) {
          // M 22 27.999998
          moveTo(x = 22.0f, y = 27.999998f)
          // l -8.742278E-8 2
          lineToRelative(dx = -8.742278E-8f, dy = 2.0f)
          // l -4 -1.7484555E-7
          lineToRelative(dx = -4.0f, dy = -1.7484555E-7f)
          // l 8.742278E-8 -2z
          lineToRelative(dx = 8.742278E-8f, dy = -2.0f)
          close()
        }
        // <rect width="2" height="4" x="25.0" y="27.0" fill="#000" stroke-width="0" />
        path(
          fill = SolidColor(Color(0xFF000000)),
          strokeLineWidth = 0.0f,
        ) {
          // M 27.999998 27.999998
          moveTo(x = 27.999998f, y = 27.999998f)
          // l -8.742278E-8 2
          lineToRelative(dx = -8.742278E-8f, dy = 2.0f)
          // l -4 -1.7484555E-7
          lineToRelative(dx = -4.0f, dy = -1.7484555E-7f)
          // l 8.742278E-8 -2z
          lineToRelative(dx = 8.742278E-8f, dy = -2.0f)
          close()
        }
        // M13 28 v-3 h-2 v3 a2 2 0 0 0 2 2 h3 v-2z
        path(
          strokeLineWidth = 0.0f,
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 13 28
          moveTo(x = 13.0f, y = 28.0f)
          // v -3
          verticalLineToRelative(dy = -3.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v 3
          verticalLineToRelative(dy = 3.0f)
          // a 2 2 0 0 0 2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 2.0f,
            dy1 = 2.0f,
          )
          // h 3
          horizontalLineToRelative(dx = 3.0f)
          // v -2z
          verticalLineToRelative(dy = -2.0f)
          close()
        }
        // <rect width="2" height="4" x="11.0" y="19.0" fill="#000" stroke-width="0" />
        path(
          fill = SolidColor(Color(0xFF000000)),
          strokeLineWidth = 0.0f,
        ) {
          // M 11 19
          moveTo(x = 11.0f, y = 19.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // h -2z
          horizontalLineToRelative(dx = -2.0f)
          close()
        }
        // <rect width="2" height="4" x="11.0" y="13.0" fill="#000" stroke-width="0" />
        path(
          fill = SolidColor(Color(0xFF000000)),
          strokeLineWidth = 0.0f,
        ) {
          // M 11 13
          moveTo(x = 11.0f, y = 13.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // h -2z
          horizontalLineToRelative(dx = -2.0f)
          close()
        }
        // <polygon points="22.0 12.0 12.0 2.0 2.0 12.0 3.4141 13.4141 11.0 5.8281 11.0 11.0 13.0 11.0 13.0 5.8281 20.5859 13.4141 22.0 12.0" fill="#000" stroke-width="0" />
        path(
          fill = SolidColor(Color(0xFF000000)),
          strokeLineWidth = 0.0f,
        ) {
          // M 22 12
          moveTo(x = 22.0f, y = 12.0f)
          // L 12 2
          lineTo(x = 12.0f, y = 2.0f)
          // L 2 12
          lineTo(x = 2.0f, y = 12.0f)
          // L 3.4141 13.4141
          lineTo(x = 3.4141f, y = 13.4141f)
          // L 11 5.8281
          lineTo(x = 11.0f, y = 5.8281f)
          // L 11 11
          lineTo(x = 11.0f, y = 11.0f)
          // L 13 11
          lineTo(x = 13.0f, y = 11.0f)
          // L 13 5.8281
          lineTo(x = 13.0f, y = 5.8281f)
          // L 20.5859 13.4141
          lineTo(x = 20.5859f, y = 13.4141f)
          // L 22 12z
          lineTo(x = 22.0f, y = 12.0f)
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
      .also { _succession = it }
  }

@Suppress("ObjectPropertyName")
private var _succession: ImageVector? = null
