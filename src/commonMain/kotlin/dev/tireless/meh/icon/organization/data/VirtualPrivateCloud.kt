// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.organization.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val VirtualPrivateCloud: ImageVector
  get() {
    val current = _virtualPrivateCloud
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.VirtualPrivateCloud",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M20 20 v-3 a4 4 0 0 0 -8 0 v3 a2 2 0 0 0 -2 2 v6 a2 2 0 0 0 2 2 h8 a2 2 0 0 0 2 -2 v-6 a2 2 0 0 0 -2 -2 m-6 -3 a2 2 0 0 1 4 0 v3 h-4Z m-2 11 v-6 h8 v6Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 20 20
          moveTo(x = 20.0f, y = 20.0f)
          // v -3
          verticalLineToRelative(dy = -3.0f)
          // a 4 4 0 0 0 -8 0
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -8.0f,
            dy1 = 0.0f,
          )
          // v 3
          verticalLineToRelative(dy = 3.0f)
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
          // h 8
          horizontalLineToRelative(dx = 8.0f)
          // a 2 2 0 0 0 2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 2.0f,
            dy1 = -2.0f,
          )
          // v -6
          verticalLineToRelative(dy = -6.0f)
          // a 2 2 0 0 0 -2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.0f,
            dy1 = -2.0f,
          )
          // m -6 -3
          moveToRelative(dx = -6.0f, dy = -3.0f)
          // a 2 2 0 0 1 4 0
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 4.0f,
            dy1 = 0.0f,
          )
          // v 3
          verticalLineToRelative(dy = 3.0f)
          // h -4z
          horizontalLineToRelative(dx = -4.0f)
          close()
          // m -2 11
          moveToRelative(dx = -2.0f, dy = 11.0f)
          // v -6
          verticalLineToRelative(dy = -6.0f)
          // h 8
          horizontalLineToRelative(dx = 8.0f)
          // v 6z
          verticalLineToRelative(dy = 6.0f)
          close()
        }
        // M25.83 10.12 a10 10 0 0 0 -7.94 -7.94 10 10 0 0 0 -11.72 7.94 A7.5 7.5 0 0 0 7.49 25 H8 v-2 H7.5 a5.5 5.5 0 0 1 -.97 -10.92 l1.34 -.24 .26 -1.35 a8.01 8.01 0 0 1 15.73 0 l.26 1.35 1.35 .24 A5.5 5.5 0 0 1 24.51 23 H24 v2 h.5 a7.5 7.5 0 0 0 1.33 -14.88
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 25.83 10.12
          moveTo(x = 25.83f, y = 10.12f)
          // a 10 10 0 0 0 -7.94 -7.94
          arcToRelative(
            a = 10.0f,
            b = 10.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -7.94f,
            dy1 = -7.94f,
          )
          // a 10 10 0 0 0 -11.72 7.94
          arcToRelative(
            a = 10.0f,
            b = 10.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -11.72f,
            dy1 = 7.94f,
          )
          // A 7.5 7.5 0 0 0 7.49 25
          arcTo(
            horizontalEllipseRadius = 7.5f,
            verticalEllipseRadius = 7.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 7.49f,
            y1 = 25.0f,
          )
          // H 8
          horizontalLineTo(x = 8.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // H 7.5
          horizontalLineTo(x = 7.5f)
          // a 5.5 5.5 0 0 1 -0.97 -10.92
          arcToRelative(
            a = 5.5f,
            b = 5.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.97f,
            dy1 = -10.92f,
          )
          // l 1.34 -0.24
          lineToRelative(dx = 1.34f, dy = -0.24f)
          // l 0.26 -1.35
          lineToRelative(dx = 0.26f, dy = -1.35f)
          // a 8.01 8.01 0 0 1 15.73 0
          arcToRelative(
            a = 8.01f,
            b = 8.01f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 15.73f,
            dy1 = 0.0f,
          )
          // l 0.26 1.35
          lineToRelative(dx = 0.26f, dy = 1.35f)
          // l 1.35 0.24
          lineToRelative(dx = 1.35f, dy = 0.24f)
          // A 5.5 5.5 0 0 1 24.51 23
          arcTo(
            horizontalEllipseRadius = 5.5f,
            verticalEllipseRadius = 5.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 24.51f,
            y1 = 23.0f,
          )
          // H 24
          horizontalLineTo(x = 24.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 0.5
          horizontalLineToRelative(dx = 0.5f)
          // a 7.5 7.5 0 0 0 1.33 -14.88
          arcToRelative(
            a = 7.5f,
            b = 7.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 1.33f,
            dy1 = -14.88f,
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
      .also { _virtualPrivateCloud = it }
  }

@Suppress("ObjectPropertyName")
private var _virtualPrivateCloud: ImageVector? = null
