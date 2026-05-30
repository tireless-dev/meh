// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.organization.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DataCategorical: ImageVector
  get() {
    val current = _dataCategorical
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.DataCategorical",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M29 30 H19 a1 1 0 0 1 -1 -1 V19 a1 1 0 0 1 1 -1 h10 a1 1 0 0 1 1 1 v10 a1 1 0 0 1 -1 1 m-9 -2 h8 v-8 h-8z M8 30 a6.01 6.01 0 1 1 6 -6 6 6 0 0 1 -6 6 m0 -10 a4 4 0 1 0 0 8 4 4 0 0 0 0 -8 m14 -6 H10 a1 1 0 0 1 -.86 -1.51 l6 -10 C15.34 2.15 15.67 2 16 2 s.66 .16 .86 .48 l6 10 A1 1 0 0 1 22 14 m-10.23 -2 h8.46 L16 4.94z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 29 30
          moveTo(x = 29.0f, y = 30.0f)
          // H 19
          horizontalLineTo(x = 19.0f)
          // a 1 1 0 0 1 -1 -1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -1.0f,
            dy1 = -1.0f,
          )
          // V 19
          verticalLineTo(y = 19.0f)
          // a 1 1 0 0 1 1 -1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 1.0f,
            dy1 = -1.0f,
          )
          // h 10
          horizontalLineToRelative(dx = 10.0f)
          // a 1 1 0 0 1 1 1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 1.0f,
            dy1 = 1.0f,
          )
          // v 10
          verticalLineToRelative(dy = 10.0f)
          // a 1 1 0 0 1 -1 1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -1.0f,
            dy1 = 1.0f,
          )
          // m -9 -2
          moveToRelative(dx = -9.0f, dy = -2.0f)
          // h 8
          horizontalLineToRelative(dx = 8.0f)
          // v -8
          verticalLineToRelative(dy = -8.0f)
          // h -8z
          horizontalLineToRelative(dx = -8.0f)
          close()
          // M 8 30
          moveTo(x = 8.0f, y = 30.0f)
          // a 6.01 6.01 0 1 1 6 -6
          arcToRelative(
            a = 6.01f,
            b = 6.01f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 6.0f,
            dy1 = -6.0f,
          )
          // a 6 6 0 0 1 -6 6
          arcToRelative(
            a = 6.0f,
            b = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -6.0f,
            dy1 = 6.0f,
          )
          // m 0 -10
          moveToRelative(dx = 0.0f, dy = -10.0f)
          // a 4 4 0 1 0 0 8
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = 8.0f,
          )
          // a 4 4 0 0 0 0 -8
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = -8.0f,
          )
          // m 14 -6
          moveToRelative(dx = 14.0f, dy = -6.0f)
          // H 10
          horizontalLineTo(x = 10.0f)
          // a 1 1 0 0 1 -0.86 -1.51
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.86f,
            dy1 = -1.51f,
          )
          // l 6 -10
          lineToRelative(dx = 6.0f, dy = -10.0f)
          // C 15.34 2.15 15.67 2 16 2
          curveTo(
            x1 = 15.34f,
            y1 = 2.15f,
            x2 = 15.67f,
            y2 = 2.0f,
            x3 = 16.0f,
            y3 = 2.0f,
          )
          // s 0.66 0.16 0.86 0.48
          reflectiveCurveToRelative(
            dx1 = 0.66f,
            dy1 = 0.16f,
            dx2 = 0.86f,
            dy2 = 0.48f,
          )
          // l 6 10
          lineToRelative(dx = 6.0f, dy = 10.0f)
          // A 1 1 0 0 1 22 14
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 22.0f,
            y1 = 14.0f,
          )
          // m -10.23 -2
          moveToRelative(dx = -10.23f, dy = -2.0f)
          // h 8.46
          horizontalLineToRelative(dx = 8.46f)
          // L 16 4.94z
          lineTo(x = 16.0f, y = 4.94f)
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
      .also { _dataCategorical = it }
  }

@Suppress("ObjectPropertyName")
private var _dataCategorical: ImageVector? = null
