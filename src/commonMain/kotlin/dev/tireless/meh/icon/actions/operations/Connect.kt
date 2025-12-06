// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.actions.operations

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Connect: ImageVector
  get() {
    val current = _connect
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Connect",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M23 16.01 a7 7 0 0 0 -4.18 1.39 l-4.22 -4.22 A7 7 0 0 0 16 9.01 a7 7 0 1 0 -2.81 5.59 l4.21 4.22 a7 7 0 1 0 5.6 -2.81 m-19 -7 a5 5 0 1 1 5 5 5 5 0 0 1 -5 -5
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 23 16.01
          moveTo(x = 23.0f, y = 16.01f)
          // a 7 7 0 0 0 -4.18 1.39
          arcToRelative(
            a = 7.0f,
            b = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -4.18f,
            dy1 = 1.39f,
          )
          // l -4.22 -4.22
          lineToRelative(dx = -4.22f, dy = -4.22f)
          // A 7 7 0 0 0 16 9.01
          arcTo(
            horizontalEllipseRadius = 7.0f,
            verticalEllipseRadius = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 16.0f,
            y1 = 9.01f,
          )
          // a 7 7 0 1 0 -2.81 5.59
          arcToRelative(
            a = 7.0f,
            b = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = -2.81f,
            dy1 = 5.59f,
          )
          // l 4.21 4.22
          lineToRelative(dx = 4.21f, dy = 4.22f)
          // a 7 7 0 1 0 5.6 -2.81
          arcToRelative(
            a = 7.0f,
            b = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = 5.6f,
            dy1 = -2.81f,
          )
          // m -19 -7
          moveToRelative(dx = -19.0f, dy = -7.0f)
          // a 5 5 0 1 1 5 5
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 5.0f,
            dy1 = 5.0f,
          )
          // a 5 5 0 0 1 -5 -5
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -5.0f,
            dy1 = -5.0f,
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
      .also { _connect = it }
  }

@Suppress("ObjectPropertyName")
private var _connect: ImageVector? = null
