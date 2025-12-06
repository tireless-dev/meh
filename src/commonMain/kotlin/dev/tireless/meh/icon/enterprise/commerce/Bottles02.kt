// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.enterprise.commerce

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bottles02: ImageVector
  get() {
    val current = _bottles02
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Bottles02",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M24 9.05 V6 a1 1 0 0 0 -1 -1 h-3 v2 h2 v3.02 s2 1.12 2 3.48 V25 h-4 v2 h5 a1 1 0 0 0 1 -1 V13.5 c0 -1.71 -.72 -3.3 -2 -4.45 m-8 0 V6 a1 1 0 0 0 -1 -1 H9 a1 1 0 0 0 -1 1 v3.05 a6 6 0 0 0 -2 4.45 V26 a1 1 0 0 0 1 1 h10 a1 1 0 0 0 1 -1 V13.5 c0 -1.71 -.72 -3.3 -2 -4.45 M16 25 H8 V13.5 c0 -2.36 2 -3.48 2 -3.48 V7 h4 v3.02 s2 1.12 2 3.48z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 24 9.05
          moveTo(x = 24.0f, y = 9.05f)
          // V 6
          verticalLineTo(y = 6.0f)
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
          // h -3
          horizontalLineToRelative(dx = -3.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 3.02
          verticalLineToRelative(dy = 3.02f)
          // s 2 1.12 2 3.48
          reflectiveCurveToRelative(
            dx1 = 2.0f,
            dy1 = 1.12f,
            dx2 = 2.0f,
            dy2 = 3.48f,
          )
          // V 25
          verticalLineTo(y = 25.0f)
          // h -4
          horizontalLineToRelative(dx = -4.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 5
          horizontalLineToRelative(dx = 5.0f)
          // a 1 1 0 0 0 1 -1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 1.0f,
            dy1 = -1.0f,
          )
          // V 13.5
          verticalLineTo(y = 13.5f)
          // c 0 -1.71 -0.72 -3.3 -2 -4.45
          curveToRelative(
            dx1 = 0.0f,
            dy1 = -1.71f,
            dx2 = -0.72f,
            dy2 = -3.3f,
            dx3 = -2.0f,
            dy3 = -4.45f,
          )
          // m -8 0
          moveToRelative(dx = -8.0f, dy = 0.0f)
          // V 6
          verticalLineTo(y = 6.0f)
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
          // H 9
          horizontalLineTo(x = 9.0f)
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
          // v 3.05
          verticalLineToRelative(dy = 3.05f)
          // a 6 6 0 0 0 -2 4.45
          arcToRelative(
            a = 6.0f,
            b = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.0f,
            dy1 = 4.45f,
          )
          // V 26
          verticalLineTo(y = 26.0f)
          // a 1 1 0 0 0 1 1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 1.0f,
            dy1 = 1.0f,
          )
          // h 10
          horizontalLineToRelative(dx = 10.0f)
          // a 1 1 0 0 0 1 -1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 1.0f,
            dy1 = -1.0f,
          )
          // V 13.5
          verticalLineTo(y = 13.5f)
          // c 0 -1.71 -0.72 -3.3 -2 -4.45
          curveToRelative(
            dx1 = 0.0f,
            dy1 = -1.71f,
            dx2 = -0.72f,
            dy2 = -3.3f,
            dx3 = -2.0f,
            dy3 = -4.45f,
          )
          // M 16 25
          moveTo(x = 16.0f, y = 25.0f)
          // H 8
          horizontalLineTo(x = 8.0f)
          // V 13.5
          verticalLineTo(y = 13.5f)
          // c 0 -2.36 2 -3.48 2 -3.48
          curveToRelative(
            dx1 = 0.0f,
            dy1 = -2.36f,
            dx2 = 2.0f,
            dy2 = -3.48f,
            dx3 = 2.0f,
            dy3 = -3.48f,
          )
          // V 7
          verticalLineTo(y = 7.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v 3.02
          verticalLineToRelative(dy = 3.02f)
          // s 2 1.12 2 3.48z
          reflectiveCurveToRelative(
            dx1 = 2.0f,
            dy1 = 1.12f,
            dx2 = 2.0f,
            dy2 = 3.48f,
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
      .also { _bottles02 = it }
  }

@Suppress("ObjectPropertyName")
private var _bottles02: ImageVector? = null
