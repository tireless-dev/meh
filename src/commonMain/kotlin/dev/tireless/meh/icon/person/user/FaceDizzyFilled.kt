// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.person.user

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FaceDizzyFilled: ImageVector
  get() {
    val current = _faceDizzyFilled
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.FaceDizzyFilled",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M16 2 a14 14 0 1 0 14 14 A14 14 0 0 0 16 2 M9 16.41 7.59 15 l2 -2 -2 -2 L9 9.59 l2 2 2 -2 L14.41 11 l-2 2 2 2 L13 16.41 l-2 -2Z M16 25 a3 3 0 1 1 3 -3 3 3 0 0 1 -3 3 m8.41 -10 L23 16.41 l-2 -2 -2 2 L17.59 15 l2 -2 -2 -2 L19 9.59 l2 2 2 -2 L24.41 11 l-2 2Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 16 2
          moveTo(x = 16.0f, y = 2.0f)
          // a 14 14 0 1 0 14 14
          arcToRelative(
            a = 14.0f,
            b = 14.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = 14.0f,
            dy1 = 14.0f,
          )
          // A 14 14 0 0 0 16 2
          arcTo(
            horizontalEllipseRadius = 14.0f,
            verticalEllipseRadius = 14.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 16.0f,
            y1 = 2.0f,
          )
          // M 9 16.41
          moveTo(x = 9.0f, y = 16.41f)
          // L 7.59 15
          lineTo(x = 7.59f, y = 15.0f)
          // l 2 -2
          lineToRelative(dx = 2.0f, dy = -2.0f)
          // l -2 -2
          lineToRelative(dx = -2.0f, dy = -2.0f)
          // L 9 9.59
          lineTo(x = 9.0f, y = 9.59f)
          // l 2 2
          lineToRelative(dx = 2.0f, dy = 2.0f)
          // l 2 -2
          lineToRelative(dx = 2.0f, dy = -2.0f)
          // L 14.41 11
          lineTo(x = 14.41f, y = 11.0f)
          // l -2 2
          lineToRelative(dx = -2.0f, dy = 2.0f)
          // l 2 2
          lineToRelative(dx = 2.0f, dy = 2.0f)
          // L 13 16.41
          lineTo(x = 13.0f, y = 16.41f)
          // l -2 -2z
          lineToRelative(dx = -2.0f, dy = -2.0f)
          close()
          // M 16 25
          moveTo(x = 16.0f, y = 25.0f)
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
          // m 8.41 -10
          moveToRelative(dx = 8.41f, dy = -10.0f)
          // L 23 16.41
          lineTo(x = 23.0f, y = 16.41f)
          // l -2 -2
          lineToRelative(dx = -2.0f, dy = -2.0f)
          // l -2 2
          lineToRelative(dx = -2.0f, dy = 2.0f)
          // L 17.59 15
          lineTo(x = 17.59f, y = 15.0f)
          // l 2 -2
          lineToRelative(dx = 2.0f, dy = -2.0f)
          // l -2 -2
          lineToRelative(dx = -2.0f, dy = -2.0f)
          // L 19 9.59
          lineTo(x = 19.0f, y = 9.59f)
          // l 2 2
          lineToRelative(dx = 2.0f, dy = 2.0f)
          // l 2 -2
          lineToRelative(dx = 2.0f, dy = -2.0f)
          // L 24.41 11
          lineTo(x = 24.41f, y = 11.0f)
          // l -2 2z
          lineToRelative(dx = -2.0f, dy = 2.0f)
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
      .also { _faceDizzyFilled = it }
  }

@Suppress("ObjectPropertyName")
private var _faceDizzyFilled: ImageVector? = null
