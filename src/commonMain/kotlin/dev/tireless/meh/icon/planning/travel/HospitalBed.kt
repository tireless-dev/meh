// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.planning.travel

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val HospitalBed: ImageVector
  get() {
    val current = _hospitalBed
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.HospitalBed",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M25 16 h-8 a2 2 0 0 0 -2 2 v6 H4 V14 H2 v16 h2 v-4 h24 v4 h2 v-9 a5 5 0 0 0 -5 -5 m3 8 H17 v-6 h8 a3 3 0 0 1 3 3Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 25 16
          moveTo(x = 25.0f, y = 16.0f)
          // h -8
          horizontalLineToRelative(dx = -8.0f)
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
          // v 6
          verticalLineToRelative(dy = 6.0f)
          // H 4
          horizontalLineTo(x = 4.0f)
          // V 14
          verticalLineTo(y = 14.0f)
          // H 2
          horizontalLineTo(x = 2.0f)
          // v 16
          verticalLineToRelative(dy = 16.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v -4
          verticalLineToRelative(dy = -4.0f)
          // h 24
          horizontalLineToRelative(dx = 24.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v -9
          verticalLineToRelative(dy = -9.0f)
          // a 5 5 0 0 0 -5 -5
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -5.0f,
            dy1 = -5.0f,
          )
          // m 3 8
          moveToRelative(dx = 3.0f, dy = 8.0f)
          // H 17
          horizontalLineTo(x = 17.0f)
          // v -6
          verticalLineToRelative(dy = -6.0f)
          // h 8
          horizontalLineToRelative(dx = 8.0f)
          // a 3 3 0 0 1 3 3z
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 3.0f,
            dy1 = 3.0f,
          )
          close()
        }
        // M9.5 17 A1.5 1.5 0 1 1 8 18.5 1.5 1.5 0 0 1 9.5 17 m0 -2 a3.5 3.5 0 1 0 3.5 3.5 A3.5 3.5 0 0 0 9.5 15
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 9.5 17
          moveTo(x = 9.5f, y = 17.0f)
          // A 1.5 1.5 0 1 1 8 18.5
          arcTo(
            horizontalEllipseRadius = 1.5f,
            verticalEllipseRadius = 1.5f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            x1 = 8.0f,
            y1 = 18.5f,
          )
          // A 1.5 1.5 0 0 1 9.5 17
          arcTo(
            horizontalEllipseRadius = 1.5f,
            verticalEllipseRadius = 1.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 9.5f,
            y1 = 17.0f,
          )
          // m 0 -2
          moveToRelative(dx = 0.0f, dy = -2.0f)
          // a 3.5 3.5 0 1 0 3.5 3.5
          arcToRelative(
            a = 3.5f,
            b = 3.5f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = 3.5f,
            dy1 = 3.5f,
          )
          // A 3.5 3.5 0 0 0 9.5 15
          arcTo(
            horizontalEllipseRadius = 3.5f,
            verticalEllipseRadius = 3.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 9.5f,
            y1 = 15.0f,
          )
        }
        // <polygon points="21.0 6.0 17.0 6.0 17.0 2.0 15.0 2.0 15.0 6.0 11.0 6.0 11.0 8.0 15.0 8.0 15.0 12.0 17.0 12.0 17.0 8.0 21.0 8.0 21.0 6.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 21 6
          moveTo(x = 21.0f, y = 6.0f)
          // L 17 6
          lineTo(x = 17.0f, y = 6.0f)
          // L 17 2
          lineTo(x = 17.0f, y = 2.0f)
          // L 15 2
          lineTo(x = 15.0f, y = 2.0f)
          // L 15 6
          lineTo(x = 15.0f, y = 6.0f)
          // L 11 6
          lineTo(x = 11.0f, y = 6.0f)
          // L 11 8
          lineTo(x = 11.0f, y = 8.0f)
          // L 15 8
          lineTo(x = 15.0f, y = 8.0f)
          // L 15 12
          lineTo(x = 15.0f, y = 12.0f)
          // L 17 12
          lineTo(x = 17.0f, y = 12.0f)
          // L 17 8
          lineTo(x = 17.0f, y = 8.0f)
          // L 21 8
          lineTo(x = 21.0f, y = 8.0f)
          // L 21 6z
          lineTo(x = 21.0f, y = 6.0f)
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
      .also { _hospitalBed = it }
  }

@Suppress("ObjectPropertyName")
private var _hospitalBed: ImageVector? = null
