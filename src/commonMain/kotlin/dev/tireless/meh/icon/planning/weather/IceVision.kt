// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.planning.weather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val IceVision: ImageVector
  get() {
    val current = _iceVision
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.IceVision",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <polygon points="19.0 14.0 19.0 21.0 20.0 23.0 21.0 21.0 21.0 14.0 19.0 14.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 19 14
          moveTo(x = 19.0f, y = 14.0f)
          // L 19 21
          lineTo(x = 19.0f, y = 21.0f)
          // L 20 23
          lineTo(x = 20.0f, y = 23.0f)
          // L 21 21
          lineTo(x = 21.0f, y = 21.0f)
          // L 21 14
          lineTo(x = 21.0f, y = 14.0f)
          // L 19 14z
          lineTo(x = 19.0f, y = 14.0f)
          close()
        }
        // M17 14 h-4 a2 2 0 0 0 -2 2 v4 l1 2 1 -2 v-4 h2 v7 l1 2 1 -2Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 17 14
          moveTo(x = 17.0f, y = 14.0f)
          // h -4
          horizontalLineToRelative(dx = -4.0f)
          // a 2 2 0 0 0 -2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.0f,
            dy1 = 2.0f,
          )
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // l 1 2
          lineToRelative(dx = 1.0f, dy = 2.0f)
          // l 1 -2
          lineToRelative(dx = 1.0f, dy = -2.0f)
          // v -4
          verticalLineToRelative(dy = -4.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 7
          verticalLineToRelative(dy = 7.0f)
          // l 1 2
          lineToRelative(dx = 1.0f, dy = 2.0f)
          // l 1 -2z
          lineToRelative(dx = 1.0f, dy = -2.0f)
          close()
        }
        // M4 18 A12 12 0 1 0 16 6 h-4 V1 L6 7 l6 6 V8 h4 A10 10 0 1 1 6 18Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 4 18
          moveTo(x = 4.0f, y = 18.0f)
          // A 12 12 0 1 0 16 6
          arcTo(
            horizontalEllipseRadius = 12.0f,
            verticalEllipseRadius = 12.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            x1 = 16.0f,
            y1 = 6.0f,
          )
          // h -4
          horizontalLineToRelative(dx = -4.0f)
          // V 1
          verticalLineTo(y = 1.0f)
          // L 6 7
          lineTo(x = 6.0f, y = 7.0f)
          // l 6 6
          lineToRelative(dx = 6.0f, dy = 6.0f)
          // V 8
          verticalLineTo(y = 8.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // A 10 10 0 1 1 6 18z
          arcTo(
            horizontalEllipseRadius = 10.0f,
            verticalEllipseRadius = 10.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            x1 = 6.0f,
            y1 = 18.0f,
          )
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
      .also { _iceVision = it }
  }

@Suppress("ObjectPropertyName")
private var _iceVision: ImageVector? = null
