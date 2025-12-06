// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.enterprise.health

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Chemistry: ImageVector
  get() {
    val current = _chemistry
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Chemistry",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M27.23 23.62 20 13.67 V4 h2 V2 H10 v2 h2 v9.67 l-7.23 9.95 A4.02 4.02 0 0 0 8.02 30 h15.96 a4.02 4.02 0 0 0 3.25 -6.38 M14 14.32 V4 h4 v10.33 L20.67 18 h-9.34Z M23.98 28 H8.02 a2.02 2.02 0 0 1 -1.63 -3.2 L9.87 20 h12.26 l3.48 4.8 a2.02 2.02 0 0 1 -1.63 3.2
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 27.23 23.62
          moveTo(x = 27.23f, y = 23.62f)
          // L 20 13.67
          lineTo(x = 20.0f, y = 13.67f)
          // V 4
          verticalLineTo(y = 4.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // V 2
          verticalLineTo(y = 2.0f)
          // H 10
          horizontalLineTo(x = 10.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 9.67
          verticalLineToRelative(dy = 9.67f)
          // l -7.23 9.95
          lineToRelative(dx = -7.23f, dy = 9.95f)
          // A 4.02 4.02 0 0 0 8.02 30
          arcTo(
            horizontalEllipseRadius = 4.02f,
            verticalEllipseRadius = 4.02f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 8.02f,
            y1 = 30.0f,
          )
          // h 15.96
          horizontalLineToRelative(dx = 15.96f)
          // a 4.02 4.02 0 0 0 3.25 -6.38
          arcToRelative(
            a = 4.02f,
            b = 4.02f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 3.25f,
            dy1 = -6.38f,
          )
          // M 14 14.32
          moveTo(x = 14.0f, y = 14.32f)
          // V 4
          verticalLineTo(y = 4.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v 10.33
          verticalLineToRelative(dy = 10.33f)
          // L 20.67 18
          lineTo(x = 20.67f, y = 18.0f)
          // h -9.34z
          horizontalLineToRelative(dx = -9.34f)
          close()
          // M 23.98 28
          moveTo(x = 23.98f, y = 28.0f)
          // H 8.02
          horizontalLineTo(x = 8.02f)
          // a 2.02 2.02 0 0 1 -1.63 -3.2
          arcToRelative(
            a = 2.02f,
            b = 2.02f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -1.63f,
            dy1 = -3.2f,
          )
          // L 9.87 20
          lineTo(x = 9.87f, y = 20.0f)
          // h 12.26
          horizontalLineToRelative(dx = 12.26f)
          // l 3.48 4.8
          lineToRelative(dx = 3.48f, dy = 4.8f)
          // a 2.02 2.02 0 0 1 -1.63 3.2
          arcToRelative(
            a = 2.02f,
            b = 2.02f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -1.63f,
            dy1 = 3.2f,
          )
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
      .also { _chemistry = it }
  }

@Suppress("ObjectPropertyName")
private var _chemistry: ImageVector? = null
