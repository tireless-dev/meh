// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.person.user

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val UserSpeaker: ImageVector
  get() {
    val current = _userSpeaker
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.UserSpeaker",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // m29.41 19 -1.71 -1.71 A3 3 0 0 0 28 16 a3 3 0 1 0 -3 3 3 3 0 0 0 1.29 -.3 L28 20.41 V28 h-6 v-3 a7 7 0 0 0 -7 -7 H9 a7 7 0 0 0 -7 7 v5 h28 v-9.59 A2 2 0 0 0 29.41 19 M4 25 a5 5 0 0 1 5 -5 h6 a5 5 0 0 1 5 5 v3 H4Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 29.41 19
          moveTo(x = 29.41f, y = 19.0f)
          // l -1.71 -1.71
          lineToRelative(dx = -1.71f, dy = -1.71f)
          // A 3 3 0 0 0 28 16
          arcTo(
            horizontalEllipseRadius = 3.0f,
            verticalEllipseRadius = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 28.0f,
            y1 = 16.0f,
          )
          // a 3 3 0 1 0 -3 3
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = -3.0f,
            dy1 = 3.0f,
          )
          // a 3 3 0 0 0 1.29 -0.3
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 1.29f,
            dy1 = -0.3f,
          )
          // L 28 20.41
          lineTo(x = 28.0f, y = 20.41f)
          // V 28
          verticalLineTo(y = 28.0f)
          // h -6
          horizontalLineToRelative(dx = -6.0f)
          // v -3
          verticalLineToRelative(dy = -3.0f)
          // a 7 7 0 0 0 -7 -7
          arcToRelative(
            a = 7.0f,
            b = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -7.0f,
            dy1 = -7.0f,
          )
          // H 9
          horizontalLineTo(x = 9.0f)
          // a 7 7 0 0 0 -7 7
          arcToRelative(
            a = 7.0f,
            b = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -7.0f,
            dy1 = 7.0f,
          )
          // v 5
          verticalLineToRelative(dy = 5.0f)
          // h 28
          horizontalLineToRelative(dx = 28.0f)
          // v -9.59
          verticalLineToRelative(dy = -9.59f)
          // A 2 2 0 0 0 29.41 19
          arcTo(
            horizontalEllipseRadius = 2.0f,
            verticalEllipseRadius = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 29.41f,
            y1 = 19.0f,
          )
          // M 4 25
          moveTo(x = 4.0f, y = 25.0f)
          // a 5 5 0 0 1 5 -5
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 5.0f,
            dy1 = -5.0f,
          )
          // h 6
          horizontalLineToRelative(dx = 6.0f)
          // a 5 5 0 0 1 5 5
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 5.0f,
            dy1 = 5.0f,
          )
          // v 3
          verticalLineToRelative(dy = 3.0f)
          // H 4z
          horizontalLineTo(x = 4.0f)
          close()
        }
        // M12 4 a5 5 0 1 1 -5 5 5 5 0 0 1 5 -5 m0 -2 a7 7 0 1 0 7 7 7 7 0 0 0 -7 -7
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 12 4
          moveTo(x = 12.0f, y = 4.0f)
          // a 5 5 0 1 1 -5 5
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = -5.0f,
            dy1 = 5.0f,
          )
          // a 5 5 0 0 1 5 -5
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 5.0f,
            dy1 = -5.0f,
          )
          // m 0 -2
          moveToRelative(dx = 0.0f, dy = -2.0f)
          // a 7 7 0 1 0 7 7
          arcToRelative(
            a = 7.0f,
            b = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = 7.0f,
            dy1 = 7.0f,
          )
          // a 7 7 0 0 0 -7 -7
          arcToRelative(
            a = 7.0f,
            b = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -7.0f,
            dy1 = -7.0f,
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
      .also { _userSpeaker = it }
  }

@Suppress("ObjectPropertyName")
private var _userSpeaker: ImageVector? = null
