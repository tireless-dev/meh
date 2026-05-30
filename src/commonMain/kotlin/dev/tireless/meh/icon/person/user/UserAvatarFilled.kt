// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.person.user

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val UserAvatarFilled: ImageVector
  get() {
    val current = _userAvatarFilled
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.UserAvatarFilled",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M8 24.93 A5 5 0 0 1 13 20 h6 a5 5 0 0 1 5 4.93 11.94 11.94 0 0 1 -16 0 M20.5 12.5 A4.5 4.5 0 1 1 16 8 a4.5 4.5 0 0 1 4.5 4.5
        path {
          // M 8 24.93
          moveTo(x = 8.0f, y = 24.93f)
          // A 5 5 0 0 1 13 20
          arcTo(
            horizontalEllipseRadius = 5.0f,
            verticalEllipseRadius = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 13.0f,
            y1 = 20.0f,
          )
          // h 6
          horizontalLineToRelative(dx = 6.0f)
          // a 5 5 0 0 1 5 4.93
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 5.0f,
            dy1 = 4.93f,
          )
          // a 11.94 11.94 0 0 1 -16 0
          arcToRelative(
            a = 11.94f,
            b = 11.94f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -16.0f,
            dy1 = 0.0f,
          )
          // M 20.5 12.5
          moveTo(x = 20.5f, y = 12.5f)
          // A 4.5 4.5 0 1 1 16 8
          arcTo(
            horizontalEllipseRadius = 4.5f,
            verticalEllipseRadius = 4.5f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            x1 = 16.0f,
            y1 = 8.0f,
          )
          // a 4.5 4.5 0 0 1 4.5 4.5
          arcToRelative(
            a = 4.5f,
            b = 4.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 4.5f,
            dy1 = 4.5f,
          )
        }
        // M26.75 24.93 A13.99 13.99 0 1 0 2 16 a14 14 0 0 0 3.25 8.93 l-.02 .02 .22 .24 .28 .3 q.42 .46 .87 .87 l.28 .24 a14 14 0 0 0 1 .78 L8 27.48 v-.01 a13.9 13.9 0 0 0 16 0 v.01 l.13 -.1 a14 14 0 0 0 .99 -.78 l.28 -.24 a14 14 0 0 0 .87 -.87 l.28 -.3 .22 -.24Z M16 8 a4.5 4.5 0 1 1 -4.5 4.5 A4.5 4.5 0 0 1 16 8 M8 24.93 A5 5 0 0 1 13 20 h6 a5 5 0 0 1 5 4.93 11.94 11.94 0 0 1 -16 0
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 26.75 24.93
          moveTo(x = 26.75f, y = 24.93f)
          // A 13.99 13.99 0 1 0 2 16
          arcTo(
            horizontalEllipseRadius = 13.99f,
            verticalEllipseRadius = 13.99f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            x1 = 2.0f,
            y1 = 16.0f,
          )
          // a 14 14 0 0 0 3.25 8.93
          arcToRelative(
            a = 14.0f,
            b = 14.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 3.25f,
            dy1 = 8.93f,
          )
          // l -0.02 0.02
          lineToRelative(dx = -0.02f, dy = 0.02f)
          // l 0.22 0.24
          lineToRelative(dx = 0.22f, dy = 0.24f)
          // l 0.28 0.3
          lineToRelative(dx = 0.28f, dy = 0.3f)
          // q 0.42 0.46 0.87 0.87
          quadToRelative(
            dx1 = 0.42f,
            dy1 = 0.46f,
            dx2 = 0.87f,
            dy2 = 0.87f,
          )
          // l 0.28 0.24
          lineToRelative(dx = 0.28f, dy = 0.24f)
          // a 14 14 0 0 0 1 0.78
          arcToRelative(
            a = 14.0f,
            b = 14.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 1.0f,
            dy1 = 0.78f,
          )
          // L 8 27.48
          lineTo(x = 8.0f, y = 27.48f)
          // v -0.01
          verticalLineToRelative(dy = -0.01f)
          // a 13.9 13.9 0 0 0 16 0
          arcToRelative(
            a = 13.9f,
            b = 13.9f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 16.0f,
            dy1 = 0.0f,
          )
          // v 0.01
          verticalLineToRelative(dy = 0.01f)
          // l 0.13 -0.1
          lineToRelative(dx = 0.13f, dy = -0.1f)
          // a 14 14 0 0 0 0.99 -0.78
          arcToRelative(
            a = 14.0f,
            b = 14.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.99f,
            dy1 = -0.78f,
          )
          // l 0.28 -0.24
          lineToRelative(dx = 0.28f, dy = -0.24f)
          // a 14 14 0 0 0 0.87 -0.87
          arcToRelative(
            a = 14.0f,
            b = 14.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.87f,
            dy1 = -0.87f,
          )
          // l 0.28 -0.3
          lineToRelative(dx = 0.28f, dy = -0.3f)
          // l 0.22 -0.24z
          lineToRelative(dx = 0.22f, dy = -0.24f)
          close()
          // M 16 8
          moveTo(x = 16.0f, y = 8.0f)
          // a 4.5 4.5 0 1 1 -4.5 4.5
          arcToRelative(
            a = 4.5f,
            b = 4.5f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = -4.5f,
            dy1 = 4.5f,
          )
          // A 4.5 4.5 0 0 1 16 8
          arcTo(
            horizontalEllipseRadius = 4.5f,
            verticalEllipseRadius = 4.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 16.0f,
            y1 = 8.0f,
          )
          // M 8 24.93
          moveTo(x = 8.0f, y = 24.93f)
          // A 5 5 0 0 1 13 20
          arcTo(
            horizontalEllipseRadius = 5.0f,
            verticalEllipseRadius = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 13.0f,
            y1 = 20.0f,
          )
          // h 6
          horizontalLineToRelative(dx = 6.0f)
          // a 5 5 0 0 1 5 4.93
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 5.0f,
            dy1 = 4.93f,
          )
          // a 11.94 11.94 0 0 1 -16 0
          arcToRelative(
            a = 11.94f,
            b = 11.94f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -16.0f,
            dy1 = 0.0f,
          )
        }
        // <rect width="32" height="32" fill="#000" />
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
      .also { _userAvatarFilled = it }
  }

@Suppress("ObjectPropertyName")
private var _userAvatarFilled: ImageVector? = null
