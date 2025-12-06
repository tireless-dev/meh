// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.organization.systems

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val CloudServices: ImageVector
  get() {
    val current = _cloudServices
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.CloudServices",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M25.82 10.12 a10 10 0 0 0 -19.64 0 A7.5 7.5 0 0 0 7.5 25 H8 v-2 H7.5 a5.5 5.5 0 0 1 -.38 -10.98 l.84 -.06 .09 -.83 a8 8 0 0 1 15.9 0 l.1 .83 .83 .06 A5.5 5.5 0 0 1 24.5 23 H24 v2 h.5 a7.5 7.5 0 0 0 1.32 -14.88
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 25.82 10.12
          moveTo(x = 25.82f, y = 10.12f)
          // a 10 10 0 0 0 -19.64 0
          arcToRelative(
            a = 10.0f,
            b = 10.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -19.64f,
            dy1 = 0.0f,
          )
          // A 7.5 7.5 0 0 0 7.5 25
          arcTo(
            horizontalEllipseRadius = 7.5f,
            verticalEllipseRadius = 7.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 7.5f,
            y1 = 25.0f,
          )
          // H 8
          horizontalLineTo(x = 8.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // H 7.5
          horizontalLineTo(x = 7.5f)
          // a 5.5 5.5 0 0 1 -0.38 -10.98
          arcToRelative(
            a = 5.5f,
            b = 5.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.38f,
            dy1 = -10.98f,
          )
          // l 0.84 -0.06
          lineToRelative(dx = 0.84f, dy = -0.06f)
          // l 0.09 -0.83
          lineToRelative(dx = 0.09f, dy = -0.83f)
          // a 8 8 0 0 1 15.9 0
          arcToRelative(
            a = 8.0f,
            b = 8.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 15.9f,
            dy1 = 0.0f,
          )
          // l 0.1 0.83
          lineToRelative(dx = 0.1f, dy = 0.83f)
          // l 0.83 0.06
          lineToRelative(dx = 0.83f, dy = 0.06f)
          // A 5.5 5.5 0 0 1 24.5 23
          arcTo(
            horizontalEllipseRadius = 5.5f,
            verticalEllipseRadius = 5.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 24.5f,
            y1 = 23.0f,
          )
          // H 24
          horizontalLineTo(x = 24.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 0.5
          horizontalLineToRelative(dx = 0.5f)
          // a 7.5 7.5 0 0 0 1.32 -14.88
          arcToRelative(
            a = 7.5f,
            b = 7.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 1.32f,
            dy1 = -14.88f,
          )
        }
        // M23 22 v-2 h-2.1 a5 5 0 0 0 -.73 -1.75 l1.49 -1.5 -1.42 -1.4 -1.49 1.48 A5 5 0 0 0 17 16.1 V14 h-2 v2.1 a5 5 0 0 0 -1.75 .73 l-1.5 -1.49 -1.4 1.42 1.48 1.49 A5 5 0 0 0 11.1 20 H9 v2 h2.1 a5 5 0 0 0 .73 1.75 l-1.49 1.5 1.42 1.4 1.49 -1.48 A5 5 0 0 0 15 25.9 V28 h2 v-2.1 a5 5 0 0 0 1.75 -.73 l1.5 1.49 1.4 -1.42 -1.48 -1.49 A5 5 0 0 0 20.9 22Z m-7 2 a3 3 0 1 1 3 -3 3 3 0 0 1 -3 3
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 23 22
          moveTo(x = 23.0f, y = 22.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h -2.1
          horizontalLineToRelative(dx = -2.1f)
          // a 5 5 0 0 0 -0.73 -1.75
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.73f,
            dy1 = -1.75f,
          )
          // l 1.49 -1.5
          lineToRelative(dx = 1.49f, dy = -1.5f)
          // l -1.42 -1.4
          lineToRelative(dx = -1.42f, dy = -1.4f)
          // l -1.49 1.48
          lineToRelative(dx = -1.49f, dy = 1.48f)
          // A 5 5 0 0 0 17 16.1
          arcTo(
            horizontalEllipseRadius = 5.0f,
            verticalEllipseRadius = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 17.0f,
            y1 = 16.1f,
          )
          // V 14
          verticalLineTo(y = 14.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v 2.1
          verticalLineToRelative(dy = 2.1f)
          // a 5 5 0 0 0 -1.75 0.73
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.75f,
            dy1 = 0.73f,
          )
          // l -1.5 -1.49
          lineToRelative(dx = -1.5f, dy = -1.49f)
          // l -1.4 1.42
          lineToRelative(dx = -1.4f, dy = 1.42f)
          // l 1.48 1.49
          lineToRelative(dx = 1.48f, dy = 1.49f)
          // A 5 5 0 0 0 11.1 20
          arcTo(
            horizontalEllipseRadius = 5.0f,
            verticalEllipseRadius = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 11.1f,
            y1 = 20.0f,
          )
          // H 9
          horizontalLineTo(x = 9.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 2.1
          horizontalLineToRelative(dx = 2.1f)
          // a 5 5 0 0 0 0.73 1.75
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.73f,
            dy1 = 1.75f,
          )
          // l -1.49 1.5
          lineToRelative(dx = -1.49f, dy = 1.5f)
          // l 1.42 1.4
          lineToRelative(dx = 1.42f, dy = 1.4f)
          // l 1.49 -1.48
          lineToRelative(dx = 1.49f, dy = -1.48f)
          // A 5 5 0 0 0 15 25.9
          arcTo(
            horizontalEllipseRadius = 5.0f,
            verticalEllipseRadius = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 15.0f,
            y1 = 25.9f,
          )
          // V 28
          verticalLineTo(y = 28.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v -2.1
          verticalLineToRelative(dy = -2.1f)
          // a 5 5 0 0 0 1.75 -0.73
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 1.75f,
            dy1 = -0.73f,
          )
          // l 1.5 1.49
          lineToRelative(dx = 1.5f, dy = 1.49f)
          // l 1.4 -1.42
          lineToRelative(dx = 1.4f, dy = -1.42f)
          // l -1.48 -1.49
          lineToRelative(dx = -1.48f, dy = -1.49f)
          // A 5 5 0 0 0 20.9 22z
          arcTo(
            horizontalEllipseRadius = 5.0f,
            verticalEllipseRadius = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 20.9f,
            y1 = 22.0f,
          )
          close()
          // m -7 2
          moveToRelative(dx = -7.0f, dy = 2.0f)
          // a 3 3 0 1 1 3 -3
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 3.0f,
            dy1 = -3.0f,
          )
          // a 3 3 0 0 1 -3 3
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -3.0f,
          dy1 = 3.0f,
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
      .also { _cloudServices = it }
  }

@Suppress("ObjectPropertyName")
private var _cloudServices: ImageVector? = null
