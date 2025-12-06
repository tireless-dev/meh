// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.organization.systems

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Redefinition: ImageVector
  get() {
    val current = _redefinition
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Redefinition",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M13 28 v-4 h7 v-2 h-7 v-4 h7 a1 1 0 0 0 .87 -1.5 l-8 -14 c-.36 -.62 -1.38 -.62 -1.74 0 l-8 14 A1 1 0 0 0 4 18 h7 v4 H4 v2 h7 v4 a2 2 0 0 0 2 2 h15 v-2z M5.72 16 12 5.02 18.28 16z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 13 28
          moveTo(x = 13.0f, y = 28.0f)
          // v -4
          verticalLineToRelative(dy = -4.0f)
          // h 7
          horizontalLineToRelative(dx = 7.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h -7
          horizontalLineToRelative(dx = -7.0f)
          // v -4
          verticalLineToRelative(dy = -4.0f)
          // h 7
          horizontalLineToRelative(dx = 7.0f)
          // a 1 1 0 0 0 0.87 -1.5
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.87f,
            dy1 = -1.5f,
          )
          // l -8 -14
          lineToRelative(dx = -8.0f, dy = -14.0f)
          // c -0.36 -0.62 -1.38 -0.62 -1.74 0
          curveToRelative(
            dx1 = -0.36f,
            dy1 = -0.62f,
            dx2 = -1.38f,
            dy2 = -0.62f,
            dx3 = -1.74f,
            dy3 = 0.0f,
          )
          // l -8 14
          lineToRelative(dx = -8.0f, dy = 14.0f)
          // A 1 1 0 0 0 4 18
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 4.0f,
            y1 = 18.0f,
          )
          // h 7
          horizontalLineToRelative(dx = 7.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // H 4
          horizontalLineTo(x = 4.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 7
          horizontalLineToRelative(dx = 7.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
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
          // h 15
          horizontalLineToRelative(dx = 15.0f)
          // v -2z
          verticalLineToRelative(dy = -2.0f)
          close()
          // M 5.72 16
          moveTo(x = 5.72f, y = 16.0f)
          // L 12 5.02
          lineTo(x = 12.0f, y = 5.02f)
          // L 18.28 16z
          lineTo(x = 18.28f, y = 16.0f)
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
      .also { _redefinition = it }
  }

@Suppress("ObjectPropertyName")
private var _redefinition: ImageVector? = null
