// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.tools.technology

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val At: ImageVector
  get() {
    val current = _at
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.At",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M16 3 A12.9 12.9 0 0 0 3 16 v1 a13 13 0 0 0 13 13 h7 v-2 h-7 A11 11 0 0 1 5 17 v-1 A10.94 10.94 0 0 1 16 5 a10.64 10.64 0 0 1 11 11 c0 3.59 -1.4 5 -3.66 5 -1.58 0 -2.34 -1.29 -2.34 -3 v-8 h-2 v1.94 A3.8 3.8 0 0 0 15.5 10 a5.5 5.5 0 0 0 -5.5 5.44 v2.12 A5.5 5.5 0 0 0 15.5 23 a4.3 4.3 0 0 0 4 -2.46 A4.4 4.4 0 0 0 23.41 23 c3.07 0 5.59 -2 5.59 -7 A12.7 12.7 0 0 0 16 3 m3 14.56 a3.5 3.5 0 0 1 -7 0 v-2.12 a3.5 3.5 0 0 1 7 0Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 16 3
          moveTo(x = 16.0f, y = 3.0f)
          // A 12.9 12.9 0 0 0 3 16
          arcTo(
            horizontalEllipseRadius = 12.9f,
            verticalEllipseRadius = 12.9f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 3.0f,
            y1 = 16.0f,
          )
          // v 1
          verticalLineToRelative(dy = 1.0f)
          // a 13 13 0 0 0 13 13
          arcToRelative(
            a = 13.0f,
            b = 13.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 13.0f,
            dy1 = 13.0f,
          )
          // h 7
          horizontalLineToRelative(dx = 7.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h -7
          horizontalLineToRelative(dx = -7.0f)
          // A 11 11 0 0 1 5 17
          arcTo(
            horizontalEllipseRadius = 11.0f,
            verticalEllipseRadius = 11.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 5.0f,
            y1 = 17.0f,
          )
          // v -1
          verticalLineToRelative(dy = -1.0f)
          // A 10.94 10.94 0 0 1 16 5
          arcTo(
            horizontalEllipseRadius = 10.94f,
            verticalEllipseRadius = 10.94f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 16.0f,
            y1 = 5.0f,
          )
          // a 10.64 10.64 0 0 1 11 11
          arcToRelative(
            a = 10.64f,
            b = 10.64f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 11.0f,
            dy1 = 11.0f,
          )
          // c 0 3.59 -1.4 5 -3.66 5
          curveToRelative(
            dx1 = 0.0f,
            dy1 = 3.59f,
            dx2 = -1.4f,
            dy2 = 5.0f,
            dx3 = -3.66f,
            dy3 = 5.0f,
          )
          // c -1.58 0 -2.34 -1.29 -2.34 -3
          curveToRelative(
            dx1 = -1.58f,
            dy1 = 0.0f,
            dx2 = -2.34f,
            dy2 = -1.29f,
            dx3 = -2.34f,
            dy3 = -3.0f,
          )
          // v -8
          verticalLineToRelative(dy = -8.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v 1.94
          verticalLineToRelative(dy = 1.94f)
          // A 3.8 3.8 0 0 0 15.5 10
          arcTo(
            horizontalEllipseRadius = 3.8f,
            verticalEllipseRadius = 3.8f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 15.5f,
            y1 = 10.0f,
          )
          // a 5.5 5.5 0 0 0 -5.5 5.44
          arcToRelative(
            a = 5.5f,
            b = 5.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -5.5f,
            dy1 = 5.44f,
          )
          // v 2.12
          verticalLineToRelative(dy = 2.12f)
          // A 5.5 5.5 0 0 0 15.5 23
          arcTo(
            horizontalEllipseRadius = 5.5f,
            verticalEllipseRadius = 5.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 15.5f,
            y1 = 23.0f,
          )
          // a 4.3 4.3 0 0 0 4 -2.46
          arcToRelative(
            a = 4.3f,
            b = 4.3f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 4.0f,
            dy1 = -2.46f,
          )
          // A 4.4 4.4 0 0 0 23.41 23
          arcTo(
            horizontalEllipseRadius = 4.4f,
            verticalEllipseRadius = 4.4f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 23.41f,
            y1 = 23.0f,
          )
          // c 3.07 0 5.59 -2 5.59 -7
          curveToRelative(
            dx1 = 3.07f,
            dy1 = 0.0f,
            dx2 = 5.59f,
            dy2 = -2.0f,
            dx3 = 5.59f,
            dy3 = -7.0f,
          )
          // A 12.7 12.7 0 0 0 16 3
          arcTo(
            horizontalEllipseRadius = 12.7f,
            verticalEllipseRadius = 12.7f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 16.0f,
            y1 = 3.0f,
          )
          // m 3 14.56
          moveToRelative(dx = 3.0f, dy = 14.56f)
          // a 3.5 3.5 0 0 1 -7 0
          arcToRelative(
            a = 3.5f,
            b = 3.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -7.0f,
            dy1 = 0.0f,
          )
          // v -2.12
          verticalLineToRelative(dy = -2.12f)
          // a 3.5 3.5 0 0 1 7 0z
          arcToRelative(
            a = 3.5f,
            b = 3.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 7.0f,
            dy1 = 0.0f,
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
      .also { _at = it }
  }

@Suppress("ObjectPropertyName")
private var _at: ImageVector? = null
