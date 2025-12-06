// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.organization.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val VirtualMachine: ImageVector
  get() {
    val current = _virtualMachine
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.VirtualMachine",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M20 13 h-8 a2 2 0 0 0 -2 2 v13 a2 2 0 0 0 2 2 h8 a2 2 0 0 0 2 -2 V15 a2 2 0 0 0 -2 -2 m0 2 v3 h-8 v-3Z m0 5 v3 h-8 v-3Z m-8 8 v-3 h8 v3Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 20 13
          moveTo(x = 20.0f, y = 13.0f)
          // h -8
          horizontalLineToRelative(dx = -8.0f)
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
          // v 13
          verticalLineToRelative(dy = 13.0f)
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
          // V 15
          verticalLineTo(y = 15.0f)
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
          // m 0 2
          moveToRelative(dx = 0.0f, dy = 2.0f)
          // v 3
          verticalLineToRelative(dy = 3.0f)
          // h -8
          horizontalLineToRelative(dx = -8.0f)
          // v -3z
          verticalLineToRelative(dy = -3.0f)
          close()
          // m 0 5
          moveToRelative(dx = 0.0f, dy = 5.0f)
          // v 3
          verticalLineToRelative(dy = 3.0f)
          // h -8
          horizontalLineToRelative(dx = -8.0f)
          // v -3z
          verticalLineToRelative(dy = -3.0f)
          close()
          // m -8 8
          moveToRelative(dx = -8.0f, dy = 8.0f)
          // v -3
          verticalLineToRelative(dy = -3.0f)
          // h 8
          horizontalLineToRelative(dx = 8.0f)
          // v 3z
          verticalLineToRelative(dy = 3.0f)
          close()
        }
        // M25.91 10.13 a.1 .1 0 0 1 -.1 -.1 10 10 0 0 0 -7.92 -7.85 10 10 0 0 0 -11.7 7.85 .1 .1 0 0 1 -.1 .1 A7.5 7.5 0 0 0 7.49 25 H8 v-2 H7.5 a5.5 5.5 0 0 1 -5.44 -6.3 5.7 5.7 0 0 1 4.71 -4.66 l1.02 -.18 a.1 .1 0 0 0 .1 -.1 l.18 -.94 a8.3 8.3 0 0 1 6.85 -6.75 8 8 0 0 1 2.85 .13 8.2 8.2 0 0 1 6.14 6.54 l.2 1.01 a.1 .1 0 0 0 .1 .1 l1.06 .2 a5.8 5.8 0 0 1 3.1 1.54 A5.5 5.5 0 0 1 24.51 23 H24 v2 h.5 a7.5 7.5 0 0 0 1.41 -14.87
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 25.91 10.13
          moveTo(x = 25.91f, y = 10.13f)
          // a 0.1 0.1 0 0 1 -0.1 -0.1
          arcToRelative(
            a = 0.1f,
            b = 0.1f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.1f,
            dy1 = -0.1f,
          )
          // a 10 10 0 0 0 -7.92 -7.85
          arcToRelative(
            a = 10.0f,
            b = 10.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -7.92f,
            dy1 = -7.85f,
          )
          // a 10 10 0 0 0 -11.7 7.85
          arcToRelative(
            a = 10.0f,
            b = 10.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -11.7f,
            dy1 = 7.85f,
          )
          // a 0.1 0.1 0 0 1 -0.1 0.1
          arcToRelative(
            a = 0.1f,
            b = 0.1f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.1f,
            dy1 = 0.1f,
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
          // a 5.5 5.5 0 0 1 -5.44 -6.3
          arcToRelative(
            a = 5.5f,
            b = 5.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -5.44f,
            dy1 = -6.3f,
          )
          // a 5.7 5.7 0 0 1 4.71 -4.66
          arcToRelative(
            a = 5.7f,
            b = 5.7f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 4.71f,
            dy1 = -4.66f,
          )
          // l 1.02 -0.18
          lineToRelative(dx = 1.02f, dy = -0.18f)
          // a 0.1 0.1 0 0 0 0.1 -0.1
          arcToRelative(
            a = 0.1f,
            b = 0.1f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.1f,
            dy1 = -0.1f,
          )
          // l 0.18 -0.94
          lineToRelative(dx = 0.18f, dy = -0.94f)
          // a 8.3 8.3 0 0 1 6.85 -6.75
          arcToRelative(
            a = 8.3f,
            b = 8.3f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 6.85f,
            dy1 = -6.75f,
          )
          // a 8 8 0 0 1 2.85 0.13
          arcToRelative(
            a = 8.0f,
            b = 8.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 2.85f,
            dy1 = 0.13f,
          )
          // a 8.2 8.2 0 0 1 6.14 6.54
          arcToRelative(
            a = 8.2f,
            b = 8.2f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 6.14f,
            dy1 = 6.54f,
          )
          // l 0.2 1.01
          lineToRelative(dx = 0.2f, dy = 1.01f)
          // a 0.1 0.1 0 0 0 0.1 0.1
          arcToRelative(
            a = 0.1f,
            b = 0.1f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.1f,
            dy1 = 0.1f,
          )
          // l 1.06 0.2
          lineToRelative(dx = 1.06f, dy = 0.2f)
          // a 5.8 5.8 0 0 1 3.1 1.54
          arcToRelative(
            a = 5.8f,
            b = 5.8f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 3.1f,
            dy1 = 1.54f,
          )
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
          // a 7.5 7.5 0 0 0 1.41 -14.87
          arcToRelative(
            a = 7.5f,
            b = 7.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
          dx1 = 1.41f,
          dy1 = -14.87f,
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
      .also { _virtualMachine = it }
  }

@Suppress("ObjectPropertyName")
private var _virtualMachine: ImageVector? = null
