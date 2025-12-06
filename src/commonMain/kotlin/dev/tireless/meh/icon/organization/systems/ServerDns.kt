// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.organization.systems

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ServerDns: ImageVector
  get() {
    val current = _serverDns
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.ServerDns",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M16 2 a8 8 0 1 0 8 8 8 8 0 0 0 -8 -8 m5.91 7 h-2.44 a15 15 0 0 0 -.79 -4.36 A6 6 0 0 1 21.91 9 m-5.89 7 c-.39 -.12 -1.31 -1.82 -1.48 -5 h2.92 c-.16 3.18 -1.09 4.88 -1.44 5 m-1.48 -7 c.16 -3.18 1.09 -4.88 1.44 -5 .39 .12 1.31 1.82 1.48 5Z m-1.22 -4.36 A15 15 0 0 0 12.52 9 H10.1 a6 6 0 0 1 3.23 -4.36 M10.09 11 h2.44 a15 15 0 0 0 .79 4.36 A6 6 0 0 1 10.09 11 m8.59 4.36 a15 15 0 0 0 .8 -4.36 h2.43 a6 6 0 0 1 -3.23 4.36 M28 30 H4 a2 2 0 0 1 -2 -2 v-6 a2 2 0 0 1 2 -2 h24 a2 2 0 0 1 2 2 v6 a2 2 0 0 1 -2 2 M4 22 v6 h24 v-6Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 16 2
          moveTo(x = 16.0f, y = 2.0f)
          // a 8 8 0 1 0 8 8
          arcToRelative(
            a = 8.0f,
            b = 8.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = 8.0f,
            dy1 = 8.0f,
          )
          // a 8 8 0 0 0 -8 -8
          arcToRelative(
            a = 8.0f,
            b = 8.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -8.0f,
            dy1 = -8.0f,
          )
          // m 5.91 7
          moveToRelative(dx = 5.91f, dy = 7.0f)
          // h -2.44
          horizontalLineToRelative(dx = -2.44f)
          // a 15 15 0 0 0 -0.79 -4.36
          arcToRelative(
            a = 15.0f,
            b = 15.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.79f,
            dy1 = -4.36f,
          )
          // A 6 6 0 0 1 21.91 9
          arcTo(
            horizontalEllipseRadius = 6.0f,
            verticalEllipseRadius = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 21.91f,
            y1 = 9.0f,
          )
          // m -5.89 7
          moveToRelative(dx = -5.89f, dy = 7.0f)
          // c -0.39 -0.12 -1.31 -1.82 -1.48 -5
          curveToRelative(
            dx1 = -0.39f,
            dy1 = -0.12f,
            dx2 = -1.31f,
            dy2 = -1.82f,
            dx3 = -1.48f,
            dy3 = -5.0f,
          )
          // h 2.92
          horizontalLineToRelative(dx = 2.92f)
          // c -0.16 3.18 -1.09 4.88 -1.44 5
          curveToRelative(
            dx1 = -0.16f,
            dy1 = 3.18f,
            dx2 = -1.09f,
            dy2 = 4.88f,
            dx3 = -1.44f,
            dy3 = 5.0f,
          )
          // m -1.48 -7
          moveToRelative(dx = -1.48f, dy = -7.0f)
          // c 0.16 -3.18 1.09 -4.88 1.44 -5
          curveToRelative(
            dx1 = 0.16f,
            dy1 = -3.18f,
            dx2 = 1.09f,
            dy2 = -4.88f,
            dx3 = 1.44f,
            dy3 = -5.0f,
          )
          // c 0.39 0.12 1.31 1.82 1.48 5z
          curveToRelative(
            dx1 = 0.39f,
            dy1 = 0.12f,
            dx2 = 1.31f,
            dy2 = 1.82f,
            dx3 = 1.48f,
            dy3 = 5.0f,
          )
          close()
          // m -1.22 -4.36
          moveToRelative(dx = -1.22f, dy = -4.36f)
          // A 15 15 0 0 0 12.52 9
          arcTo(
            horizontalEllipseRadius = 15.0f,
            verticalEllipseRadius = 15.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 12.52f,
            y1 = 9.0f,
          )
          // H 10.1
          horizontalLineTo(x = 10.1f)
          // a 6 6 0 0 1 3.23 -4.36
          arcToRelative(
            a = 6.0f,
            b = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 3.23f,
            dy1 = -4.36f,
          )
          // M 10.09 11
          moveTo(x = 10.09f, y = 11.0f)
          // h 2.44
          horizontalLineToRelative(dx = 2.44f)
          // a 15 15 0 0 0 0.79 4.36
          arcToRelative(
            a = 15.0f,
            b = 15.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.79f,
            dy1 = 4.36f,
          )
          // A 6 6 0 0 1 10.09 11
          arcTo(
            horizontalEllipseRadius = 6.0f,
            verticalEllipseRadius = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 10.09f,
            y1 = 11.0f,
          )
          // m 8.59 4.36
          moveToRelative(dx = 8.59f, dy = 4.36f)
          // a 15 15 0 0 0 0.8 -4.36
          arcToRelative(
            a = 15.0f,
            b = 15.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.8f,
            dy1 = -4.36f,
          )
          // h 2.43
          horizontalLineToRelative(dx = 2.43f)
          // a 6 6 0 0 1 -3.23 4.36
          arcToRelative(
            a = 6.0f,
            b = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -3.23f,
            dy1 = 4.36f,
          )
          // M 28 30
          moveTo(x = 28.0f, y = 30.0f)
          // H 4
          horizontalLineTo(x = 4.0f)
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
          // v -6
          verticalLineToRelative(dy = -6.0f)
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
          // h 24
          horizontalLineToRelative(dx = 24.0f)
          // a 2 2 0 0 1 2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 2.0f,
            dy1 = 2.0f,
          )
          // v 6
          verticalLineToRelative(dy = 6.0f)
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
          // M 4 22
          moveTo(x = 4.0f, y = 22.0f)
          // v 6
          verticalLineToRelative(dy = 6.0f)
          // h 24
          horizontalLineToRelative(dx = 24.0f)
          // v -6z
          verticalLineToRelative(dy = -6.0f)
          close()
        }
        // <circle cx="7.0" cy="25.0" radius="1.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 7 25
          moveTo(x = 7.0f, y = 25.0f)
          // m -1 0
          moveToRelative(dx = -1.0f, dy = 0.0f)
          // a 1 1 0 1 1 2 0
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 2.0f,
            dy1 = 0.0f,
          )
          // a 1 1 0 1 1 -2 0z
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = -2.0f,
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
      .also { _serverDns = it }
  }

@Suppress("ObjectPropertyName")
private var _serverDns: ImageVector? = null
