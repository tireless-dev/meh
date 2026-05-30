// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.person.user

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val UserAvatar: ImageVector
  get() {
    val current = _userAvatar
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.UserAvatar",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M16 8 a5 5 0 1 0 5 5 5 5 0 0 0 -5 -5 m0 8 a3 3 0 1 1 3 -3 3 3 0 0 1 -3 3
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 16 8
          moveTo(x = 16.0f, y = 8.0f)
          // a 5 5 0 1 0 5 5
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = 5.0f,
            dy1 = 5.0f,
          )
          // a 5 5 0 0 0 -5 -5
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -5.0f,
            dy1 = -5.0f,
          )
          // m 0 8
          moveToRelative(dx = 0.0f, dy = 8.0f)
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
        // M16 2 a14 14 0 1 0 14 14 A14 14 0 0 0 16 2 m-6 24.38 V25 a3 3 0 0 1 3 -3 h6 a3 3 0 0 1 3 3 v1.38 a11.9 11.9 0 0 1 -12 0 m14 -1.45 A5 5 0 0 0 19 20 h-6 a5 5 0 0 0 -5 4.93 12 12 0 1 1 16 0
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
          // m -6 24.38
          moveToRelative(dx = -6.0f, dy = 24.38f)
          // V 25
          verticalLineTo(y = 25.0f)
          // a 3 3 0 0 1 3 -3
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 3.0f,
            dy1 = -3.0f,
          )
          // h 6
          horizontalLineToRelative(dx = 6.0f)
          // a 3 3 0 0 1 3 3
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 3.0f,
            dy1 = 3.0f,
          )
          // v 1.38
          verticalLineToRelative(dy = 1.38f)
          // a 11.9 11.9 0 0 1 -12 0
          arcToRelative(
            a = 11.9f,
            b = 11.9f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -12.0f,
            dy1 = 0.0f,
          )
          // m 14 -1.45
          moveToRelative(dx = 14.0f, dy = -1.45f)
          // A 5 5 0 0 0 19 20
          arcTo(
            horizontalEllipseRadius = 5.0f,
            verticalEllipseRadius = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 19.0f,
            y1 = 20.0f,
          )
          // h -6
          horizontalLineToRelative(dx = -6.0f)
          // a 5 5 0 0 0 -5 4.93
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -5.0f,
            dy1 = 4.93f,
          )
          // a 12 12 0 1 1 16 0
          arcToRelative(
            a = 12.0f,
            b = 12.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 16.0f,
            dy1 = 0.0f,
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
      .also { _userAvatar = it }
  }

@Suppress("ObjectPropertyName")
private var _userAvatar: ImageVector? = null
