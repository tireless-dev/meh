// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.organization.systems

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val BoxMedium: ImageVector
  get() {
    val current = _boxMedium
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.BoxMedium",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M26 28 H6 a2 2 0 0 1 -2 -2 V9 h2 v17 h20 V9 h2 v17 a2 2 0 0 1 -2 2
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 26 28
          moveTo(x = 26.0f, y = 28.0f)
          // H 6
          horizontalLineTo(x = 6.0f)
          // a 2 2 0 0 1 -2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -2.0f,
            dy1 = -2.0f,
          )
          // V 9
          verticalLineTo(y = 9.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 17
          verticalLineToRelative(dy = 17.0f)
          // h 20
          horizontalLineToRelative(dx = 20.0f)
          // V 9
          verticalLineTo(y = 9.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 17
          verticalLineToRelative(dy = 17.0f)
          // a 2 2 0 0 1 -2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -2.0f,
            dy1 = 2.0f,
          )
        }
        // <polygon points="18.0 9.0 16.485 14.0 16.0 15.977 15.535 14.0 14.0 9.0 12.0 9.0 12.0 23.0 14.0 23.0 14.0 15.0 13.842 13.004 14.421 15.0 16.0 19.626 17.579 15.0 18.159 13.0 18.0 15.0 18.0 23.0 20.0 23.0 20.0 9.0 18.0 9.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 18 9
          moveTo(x = 18.0f, y = 9.0f)
          // L 16.485 14
          lineTo(x = 16.485f, y = 14.0f)
          // L 16 15.977
          lineTo(x = 16.0f, y = 15.977f)
          // L 15.535 14
          lineTo(x = 15.535f, y = 14.0f)
          // L 14 9
          lineTo(x = 14.0f, y = 9.0f)
          // L 12 9
          lineTo(x = 12.0f, y = 9.0f)
          // L 12 23
          lineTo(x = 12.0f, y = 23.0f)
          // L 14 23
          lineTo(x = 14.0f, y = 23.0f)
          // L 14 15
          lineTo(x = 14.0f, y = 15.0f)
          // L 13.842 13.004
          lineTo(x = 13.842f, y = 13.004f)
          // L 14.421 15
          lineTo(x = 14.421f, y = 15.0f)
          // L 16 19.626
          lineTo(x = 16.0f, y = 19.626f)
          // L 17.579 15
          lineTo(x = 17.579f, y = 15.0f)
          // L 18.159 13
          lineTo(x = 18.159f, y = 13.0f)
          // L 18 15
          lineTo(x = 18.0f, y = 15.0f)
          // L 18 23
          lineTo(x = 18.0f, y = 23.0f)
          // L 20 23
          lineTo(x = 20.0f, y = 23.0f)
          // L 20 9
          lineTo(x = 20.0f, y = 9.0f)
          // L 18 9z
          lineTo(x = 18.0f, y = 9.0f)
          close()
        }
        // <rect width="24" height="2" x="4.0" y="4.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 4 4
          moveTo(x = 4.0f, y = 4.0f)
          // h 24
          horizontalLineToRelative(dx = 24.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -24z
          horizontalLineToRelative(dx = -24.0f)
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
      .also { _boxMedium = it }
  }

@Suppress("ObjectPropertyName")
private var _boxMedium: ImageVector? = null
