// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.actions.controls

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SkipBackOutline: ImageVector
  get() {
    val current = _skipBackOutline
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.SkipBackOutline",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M23 22 a1 1 0 0 1 -.49 -.13 l-9 -5 a1 1 0 0 1 0 -1.74 l9 -5 A1 1 0 0 1 24 11 v10 a1 1 0 0 1 -1 1 m-6.94 -6 L22 19.3 v-6.6Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 23 22
          moveTo(x = 23.0f, y = 22.0f)
          // a 1 1 0 0 1 -0.49 -0.13
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.49f,
            dy1 = -0.13f,
          )
          // l -9 -5
          lineToRelative(dx = -9.0f, dy = -5.0f)
          // a 1 1 0 0 1 0 -1.74
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = -1.74f,
          )
          // l 9 -5
          lineToRelative(dx = 9.0f, dy = -5.0f)
          // A 1 1 0 0 1 24 11
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 24.0f,
            y1 = 11.0f,
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
          // m -6.94 -6
          moveToRelative(dx = -6.94f, dy = -6.0f)
          // L 22 19.3
          lineTo(x = 22.0f, y = 19.3f)
          // v -6.6z
          verticalLineToRelative(dy = -6.6f)
          close()
        }
        // <rect width="2" height="12" x="9.0" y="10.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 11 22
          moveTo(x = 11.0f, y = 22.0f)
          // l -2 0
          lineToRelative(dx = -2.0f, dy = 0.0f)
          // l 0 -12
          lineToRelative(dx = 0.0f, dy = -12.0f)
          // l 2 -0z
          lineToRelative(dx = 2.0f, dy = -0.0f)
          close()
        }
        // M16 30 a14 14 0 1 1 14 -14 14 14 0 0 1 -14 14 m0 -26 a12 12 0 1 0 12 12 A12 12 0 0 0 16 4
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 16 30
          moveTo(x = 16.0f, y = 30.0f)
          // a 14 14 0 1 1 14 -14
          arcToRelative(
            a = 14.0f,
            b = 14.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 14.0f,
            dy1 = -14.0f,
          )
          // a 14 14 0 0 1 -14 14
          arcToRelative(
            a = 14.0f,
            b = 14.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -14.0f,
            dy1 = 14.0f,
          )
          // m 0 -26
          moveToRelative(dx = 0.0f, dy = -26.0f)
          // a 12 12 0 1 0 12 12
          arcToRelative(
            a = 12.0f,
            b = 12.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = 12.0f,
            dy1 = 12.0f,
          )
          // A 12 12 0 0 0 16 4
          arcTo(
            horizontalEllipseRadius = 12.0f,
            verticalEllipseRadius = 12.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 16.0f,
            y1 = 4.0f,
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
      .also { _skipBackOutline = it }
  }

@Suppress("ObjectPropertyName")
private var _skipBackOutline: ImageVector? = null
