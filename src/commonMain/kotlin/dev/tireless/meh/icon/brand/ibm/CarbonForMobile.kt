// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.brand.ibm

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val CarbonForMobile: ImageVector
  get() {
    val current = _carbonForMobile
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.CarbonForMobile",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M32 14 h-2 V8.07 l-5.5 -3.2 1 -1.73 6 3.5 A1 1 0 0 1 32 7.5z m-12 8 a1 1 0 0 1 -.5 -.14 l-6 -3.5 A1 1 0 0 1 13 17.5 v-7 a1 1 0 0 1 .5 -.86 l6 -3.5 a1 1 0 0 1 1 0 l6 3.5 A1 1 0 0 1 27 10.5 v7 a1 1 0 0 1 -.5 .86 l-6 3.5 A1 1 0 0 1 20 22 m-5 -5.07 5 2.91 5 -2.91 v-5.86 l-5 -2.91 -5 2.91z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 32 14
          moveTo(x = 32.0f, y = 14.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // V 8.07
          verticalLineTo(y = 8.07f)
          // l -5.5 -3.2
          lineToRelative(dx = -5.5f, dy = -3.2f)
          // l 1 -1.73
          lineToRelative(dx = 1.0f, dy = -1.73f)
          // l 6 3.5
          lineToRelative(dx = 6.0f, dy = 3.5f)
          // A 1 1 0 0 1 32 7.5z
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 32.0f,
            y1 = 7.5f,
          )
          close()
          // m -12 8
          moveToRelative(dx = -12.0f, dy = 8.0f)
          // a 1 1 0 0 1 -0.5 -0.14
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.5f,
            dy1 = -0.14f,
          )
          // l -6 -3.5
          lineToRelative(dx = -6.0f, dy = -3.5f)
          // A 1 1 0 0 1 13 17.5
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 13.0f,
            y1 = 17.5f,
          )
          // v -7
          verticalLineToRelative(dy = -7.0f)
          // a 1 1 0 0 1 0.5 -0.86
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.5f,
            dy1 = -0.86f,
          )
          // l 6 -3.5
          lineToRelative(dx = 6.0f, dy = -3.5f)
          // a 1 1 0 0 1 1 0
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 1.0f,
            dy1 = 0.0f,
          )
          // l 6 3.5
          lineToRelative(dx = 6.0f, dy = 3.5f)
          // A 1 1 0 0 1 27 10.5
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 27.0f,
            y1 = 10.5f,
          )
          // v 7
          verticalLineToRelative(dy = 7.0f)
          // a 1 1 0 0 1 -0.5 0.86
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.5f,
            dy1 = 0.86f,
          )
          // l -6 3.5
          lineToRelative(dx = -6.0f, dy = 3.5f)
          // A 1 1 0 0 1 20 22
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 20.0f,
            y1 = 22.0f,
          )
          // m -5 -5.07
          moveToRelative(dx = -5.0f, dy = -5.07f)
          // l 5 2.91
          lineToRelative(dx = 5.0f, dy = 2.91f)
          // l 5 -2.91
          lineToRelative(dx = 5.0f, dy = -2.91f)
          // v -5.86
          verticalLineToRelative(dy = -5.86f)
          // l -5 -2.91
          lineToRelative(dx = -5.0f, dy = -2.91f)
          // l -5 2.91z
          lineToRelative(dx = -5.0f, dy = 2.91f)
          close()
        }
        // <circle cx="12.5" cy="24.5" radius="1.5" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 12.5 24.5
          moveTo(x = 12.5f, y = 24.5f)
          // m -1.5 0
          moveToRelative(dx = -1.5f, dy = 0.0f)
          // a 1.5 1.5 0 1 1 3 0
          arcToRelative(
            a = 1.5f,
            b = 1.5f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 3.0f,
            dy1 = 0.0f,
          )
          // a 1.5 1.5 0 1 1 -3 0z
          arcToRelative(
            a = 1.5f,
            b = 1.5f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = -3.0f,
            dy1 = 0.0f,
          )
          close()
        }
        // M19 30 H6 a2 2 0 0 1 -2 -2 V4 a2 2 0 0 1 2 -2 h13 v2 H6 v24 h13 v-4 h2 v4 a2 2 0 0 1 -2 2
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 19 30
          moveTo(x = 19.0f, y = 30.0f)
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
          // V 4
          verticalLineTo(y = 4.0f)
          // a 2 2 0 0 1 2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 2.0f,
            dy1 = -2.0f,
          )
          // h 13
          horizontalLineToRelative(dx = 13.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // H 6
          horizontalLineTo(x = 6.0f)
          // v 24
          verticalLineToRelative(dy = 24.0f)
          // h 13
          horizontalLineToRelative(dx = 13.0f)
          // v -4
          verticalLineToRelative(dy = -4.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
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
      .also { _carbonForMobile = it }
  }

@Suppress("ObjectPropertyName")
private var _carbonForMobile: ImageVector? = null
