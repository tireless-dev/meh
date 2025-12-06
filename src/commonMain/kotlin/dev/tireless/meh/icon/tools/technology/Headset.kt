// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.tools.technology

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Headset: ImageVector
  get() {
    val current = _headset
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Headset",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M25 10 h-.06 a9 9 0 0 0 -17.88 0 H7 a5 5 0 0 0 0 10 h2 v-9 a7 7 0 0 1 14 0 v10 a4 4 0 0 1 -3.17 3.91 4 4 0 1 0 .05 2 A6 6 0 0 0 25 21 v-1 a5 5 0 0 0 0 -10 M4 15 a3 3 0 0 1 3 -3 v6 a3 3 0 0 1 -3 -3 m12 13 a2 2 0 1 1 2 -2 2 2 0 0 1 -2 2 m9 -10 v-6 a3 3 0 0 1 0 6
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 25 10
          moveTo(x = 25.0f, y = 10.0f)
          // h -0.06
          horizontalLineToRelative(dx = -0.06f)
          // a 9 9 0 0 0 -17.88 0
          arcToRelative(
            a = 9.0f,
            b = 9.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -17.88f,
            dy1 = 0.0f,
          )
          // H 7
          horizontalLineTo(x = 7.0f)
          // a 5 5 0 0 0 0 10
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = 10.0f,
          )
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v -9
          verticalLineToRelative(dy = -9.0f)
          // a 7 7 0 0 1 14 0
          arcToRelative(
            a = 7.0f,
            b = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 14.0f,
            dy1 = 0.0f,
          )
          // v 10
          verticalLineToRelative(dy = 10.0f)
          // a 4 4 0 0 1 -3.17 3.91
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -3.17f,
            dy1 = 3.91f,
          )
          // a 4 4 0 1 0 0.05 2
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = 0.05f,
            dy1 = 2.0f,
          )
          // A 6 6 0 0 0 25 21
          arcTo(
            horizontalEllipseRadius = 6.0f,
            verticalEllipseRadius = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 25.0f,
            y1 = 21.0f,
          )
          // v -1
          verticalLineToRelative(dy = -1.0f)
          // a 5 5 0 0 0 0 -10
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = -10.0f,
          )
          // M 4 15
          moveTo(x = 4.0f, y = 15.0f)
          // a 3 3 0 0 1 3 -3
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 3.0f,
            dy1 = -3.0f,
          )
          // v 6
          verticalLineToRelative(dy = 6.0f)
          // a 3 3 0 0 1 -3 -3
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -3.0f,
            dy1 = -3.0f,
          )
          // m 12 13
          moveToRelative(dx = 12.0f, dy = 13.0f)
          // a 2 2 0 1 1 2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 2.0f,
            dy1 = -2.0f,
          )
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
          // m 9 -10
          moveToRelative(dx = 9.0f, dy = -10.0f)
          // v -6
          verticalLineToRelative(dy = -6.0f)
          // a 3 3 0 0 1 0 6
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = 6.0f,
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
      .also { _headset = it }
  }

@Suppress("ObjectPropertyName")
private var _headset: ImageVector? = null
