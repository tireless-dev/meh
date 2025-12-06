// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.actions.operations

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ConnectReference: ImageVector
  get() {
    val current = _connectReference
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.ConnectReference",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <polygon points="4.0 20.0 4.0 22.0 8.586 22.0 2.0 28.586 3.414 30.0 10.0 23.414 10.0 28.0 12.0 28.0 12.0 20.0 4.0 20.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 4 20
          moveTo(x = 4.0f, y = 20.0f)
          // L 4 22
          lineTo(x = 4.0f, y = 22.0f)
          // L 8.586 22
          lineTo(x = 8.586f, y = 22.0f)
          // L 2 28.586
          lineTo(x = 2.0f, y = 28.586f)
          // L 3.414 30
          lineTo(x = 3.414f, y = 30.0f)
          // L 10 23.414
          lineTo(x = 10.0f, y = 23.414f)
          // L 10 28
          lineTo(x = 10.0f, y = 28.0f)
          // L 12 28
          lineTo(x = 12.0f, y = 28.0f)
          // L 12 20
          lineTo(x = 12.0f, y = 20.0f)
          // L 4 20z
          lineTo(x = 4.0f, y = 20.0f)
          close()
        }
        // M23 16 a7 7 0 0 0 -4.18 1.4 l-4.22 -4.23 A7 7 0 1 0 9 16 a7 7 0 0 0 4.19 -1.41 l4.21 4.22 A6.99 6.99 0 0 0 23 30 a7 7 0 0 0 0 -14 M4 9 a5 5 0 1 1 10.01 .01 A5 5 0 0 1 4 9
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 23 16
          moveTo(x = 23.0f, y = 16.0f)
          // a 7 7 0 0 0 -4.18 1.4
          arcToRelative(
            a = 7.0f,
            b = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -4.18f,
            dy1 = 1.4f,
          )
          // l -4.22 -4.23
          lineToRelative(dx = -4.22f, dy = -4.23f)
          // A 7 7 0 1 0 9 16
          arcTo(
            horizontalEllipseRadius = 7.0f,
            verticalEllipseRadius = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            x1 = 9.0f,
            y1 = 16.0f,
          )
          // a 7 7 0 0 0 4.19 -1.41
          arcToRelative(
            a = 7.0f,
            b = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 4.19f,
            dy1 = -1.41f,
          )
          // l 4.21 4.22
          lineToRelative(dx = 4.21f, dy = 4.22f)
          // A 6.99 6.99 0 0 0 23 30
          arcTo(
            horizontalEllipseRadius = 6.99f,
            verticalEllipseRadius = 6.99f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 23.0f,
            y1 = 30.0f,
          )
          // a 7 7 0 0 0 0 -14
          arcToRelative(
            a = 7.0f,
            b = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = -14.0f,
          )
          // M 4 9
          moveTo(x = 4.0f, y = 9.0f)
          // a 5 5 0 1 1 10.01 0.01
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 10.01f,
            dy1 = 0.01f,
          )
          // A 5 5 0 0 1 4 9
          arcTo(
            horizontalEllipseRadius = 5.0f,
            verticalEllipseRadius = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 4.0f,
            y1 = 9.0f,
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
      .also { _connectReference = it }
  }

@Suppress("ObjectPropertyName")
private var _connectReference: ImageVector? = null
