// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.tools.technology

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Wifi: ImageVector
  get() {
    val current = _wifi
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Wifi",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <circle cx="16.0" cy="25.0" radius="2.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 16 25
          moveTo(x = 16.0f, y = 25.0f)
          // m -2 0
          moveToRelative(dx = -2.0f, dy = 0.0f)
          // a 2 2 0 1 1 4 0
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 4.0f,
            dy1 = 0.0f,
          )
          // a 2 2 0 1 1 -4 0z
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = -4.0f,
            dy1 = 0.0f,
          )
          close()
        }
        // m10.47 19.23 1.41 1.42 a5.97 5.97 0 0 1 8.23 -.01 l1.41 -1.42 a7.96 7.96 0 0 0 -11.05 .01
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 10.47 19.23
          moveTo(x = 10.47f, y = 19.23f)
          // l 1.41 1.42
          lineToRelative(dx = 1.41f, dy = 1.42f)
          // a 5.97 5.97 0 0 1 8.23 -0.01
          arcToRelative(
            a = 5.97f,
            b = 5.97f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 8.23f,
            dy1 = -0.01f,
          )
          // l 1.41 -1.42
          lineToRelative(dx = 1.41f, dy = -1.42f)
          // a 7.96 7.96 0 0 0 -11.05 0.01
          arcToRelative(
            a = 7.96f,
            b = 7.96f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -11.05f,
            dy1 = 0.01f,
          )
        }
        // m6.23 15 1.41 1.4 a11.96 11.96 0 0 1 16.7 0 l1.42 -1.42 A13.95 13.95 0 0 0 6.23 15
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 6.23 15
          moveTo(x = 6.23f, y = 15.0f)
          // l 1.41 1.4
          lineToRelative(dx = 1.41f, dy = 1.4f)
          // a 11.96 11.96 0 0 1 16.7 0
          arcToRelative(
            a = 11.96f,
            b = 11.96f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 16.7f,
            dy1 = 0.0f,
          )
          // l 1.42 -1.42
          lineToRelative(dx = 1.42f, dy = -1.42f)
          // A 13.95 13.95 0 0 0 6.23 15
          arcTo(
            horizontalEllipseRadius = 13.95f,
            verticalEllipseRadius = 13.95f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 6.23f,
            y1 = 15.0f,
          )
        }
        // M30 10.74 a19.94 19.94 0 0 0 -28 0 v.02 l1.4 1.4 a17.93 17.93 0 0 1 25.19 0z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 30 10.74
          moveTo(x = 30.0f, y = 10.74f)
          // a 19.94 19.94 0 0 0 -28 0
          arcToRelative(
            a = 19.94f,
            b = 19.94f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -28.0f,
            dy1 = 0.0f,
          )
          // v 0.02
          verticalLineToRelative(dy = 0.02f)
          // l 1.4 1.4
          lineToRelative(dx = 1.4f, dy = 1.4f)
          // a 17.93 17.93 0 0 1 25.19 0z
          arcToRelative(
            a = 17.93f,
            b = 17.93f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 25.19f,
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
      .also { _wifi = it }
  }

@Suppress("ObjectPropertyName")
private var _wifi: ImageVector? = null
