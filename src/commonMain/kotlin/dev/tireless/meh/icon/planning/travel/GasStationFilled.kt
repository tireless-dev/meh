// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.planning.travel

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val GasStationFilled: ImageVector
  get() {
    val current = _gasStationFilled
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.GasStationFilled",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <rect width="7" height="2" x="8.0" y="10.0" fill="#000" />
        path(
          fill = SolidColor(Color.Transparent),
        ) {
          // M 8 10
          moveTo(x = 8.0f, y = 10.0f)
          // h 7
          horizontalLineToRelative(dx = 7.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -7z
          horizontalLineToRelative(dx = -7.0f)
          close()
        }
        // m28.41 8 -5 -5 L22 4.41 l3 3 V12 a2 2 0 0 0 2 2 v10.5 a1.5 1.5 0 0 1 -3 0 V16 a1 1 0 0 0 -1 -1 h-4 V5 a1 1 0 0 0 -1 -1 H5 a1 1 0 0 0 -1 1 v21 H2 v2 h19 v-2 h-2 v-9 h3 v7.4 a3.56 3.56 0 0 0 2.77 3.52 A3.5 3.5 0 0 0 29 24.5 V9.41 A2 2 0 0 0 28.41 8 M15 12 H8 v-2 h7Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 28.41 8
          moveTo(x = 28.41f, y = 8.0f)
          // l -5 -5
          lineToRelative(dx = -5.0f, dy = -5.0f)
          // L 22 4.41
          lineTo(x = 22.0f, y = 4.41f)
          // l 3 3
          lineToRelative(dx = 3.0f, dy = 3.0f)
          // V 12
          verticalLineTo(y = 12.0f)
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
          // v 10.5
          verticalLineToRelative(dy = 10.5f)
          // a 1.5 1.5 0 0 1 -3 0
          arcToRelative(
            a = 1.5f,
            b = 1.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -3.0f,
            dy1 = 0.0f,
          )
          // V 16
          verticalLineTo(y = 16.0f)
          // a 1 1 0 0 0 -1 -1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.0f,
            dy1 = -1.0f,
          )
          // h -4
          horizontalLineToRelative(dx = -4.0f)
          // V 5
          verticalLineTo(y = 5.0f)
          // a 1 1 0 0 0 -1 -1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.0f,
            dy1 = -1.0f,
          )
          // H 5
          horizontalLineTo(x = 5.0f)
          // a 1 1 0 0 0 -1 1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.0f,
            dy1 = 1.0f,
          )
          // v 21
          verticalLineToRelative(dy = 21.0f)
          // H 2
          horizontalLineTo(x = 2.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 19
          horizontalLineToRelative(dx = 19.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v -9
          verticalLineToRelative(dy = -9.0f)
          // h 3
          horizontalLineToRelative(dx = 3.0f)
          // v 7.4
          verticalLineToRelative(dy = 7.4f)
          // a 3.56 3.56 0 0 0 2.77 3.52
          arcToRelative(
            a = 3.56f,
            b = 3.56f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 2.77f,
            dy1 = 3.52f,
          )
          // A 3.5 3.5 0 0 0 29 24.5
          arcTo(
            horizontalEllipseRadius = 3.5f,
            verticalEllipseRadius = 3.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 29.0f,
            y1 = 24.5f,
          )
          // V 9.41
          verticalLineTo(y = 9.41f)
          // A 2 2 0 0 0 28.41 8
          arcTo(
            horizontalEllipseRadius = 2.0f,
            verticalEllipseRadius = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 28.41f,
            y1 = 8.0f,
          )
          // M 15 12
          moveTo(x = 15.0f, y = 12.0f)
          // H 8
          horizontalLineTo(x = 8.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h 7z
          horizontalLineToRelative(dx = 7.0f)
          close()
        }
        // <rect width="32" height="32" fill="#000" />
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
      .also { _gasStationFilled = it }
  }

@Suppress("ObjectPropertyName")
private var _gasStationFilled: ImageVector? = null
