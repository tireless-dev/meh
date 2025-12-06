// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.actions.toggle

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val NotificationFilled: ImageVector
  get() {
    val current = _notificationFilled
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.NotificationFilled",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M28.7 19.3 26 16.58 V13 a10 10 0 0 0 -9 -9.95 V1 h-2 v2.05 A10 10 0 0 0 6 13 v3.59 l-2.7 2.7 A1 1 0 0 0 3 20 v3 a1 1 0 0 0 1 1 h7 v1 a5 5 0 0 0 10 0 v-1 h7 a1 1 0 0 0 1 -1 v-3 a1 1 0 0 0 -.3 -.7 M19 25 a3 3 0 0 1 -6 0 v-1 h6Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 28.7 19.3
          moveTo(x = 28.7f, y = 19.3f)
          // L 26 16.58
          lineTo(x = 26.0f, y = 16.58f)
          // V 13
          verticalLineTo(y = 13.0f)
          // a 10 10 0 0 0 -9 -9.95
          arcToRelative(
            a = 10.0f,
            b = 10.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -9.0f,
            dy1 = -9.95f,
          )
          // V 1
          verticalLineTo(y = 1.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v 2.05
          verticalLineToRelative(dy = 2.05f)
          // A 10 10 0 0 0 6 13
          arcTo(
            horizontalEllipseRadius = 10.0f,
            verticalEllipseRadius = 10.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 6.0f,
            y1 = 13.0f,
          )
          // v 3.59
          verticalLineToRelative(dy = 3.59f)
          // l -2.7 2.7
          lineToRelative(dx = -2.7f, dy = 2.7f)
          // A 1 1 0 0 0 3 20
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 3.0f,
            y1 = 20.0f,
          )
          // v 3
          verticalLineToRelative(dy = 3.0f)
          // a 1 1 0 0 0 1 1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 1.0f,
            dy1 = 1.0f,
          )
          // h 7
          horizontalLineToRelative(dx = 7.0f)
          // v 1
          verticalLineToRelative(dy = 1.0f)
          // a 5 5 0 0 0 10 0
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 10.0f,
            dy1 = 0.0f,
          )
          // v -1
          verticalLineToRelative(dy = -1.0f)
          // h 7
          horizontalLineToRelative(dx = 7.0f)
          // a 1 1 0 0 0 1 -1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 1.0f,
            dy1 = -1.0f,
          )
          // v -3
          verticalLineToRelative(dy = -3.0f)
          // a 1 1 0 0 0 -0.3 -0.7
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.3f,
            dy1 = -0.7f,
          )
          // M 19 25
          moveTo(x = 19.0f, y = 25.0f)
          // a 3 3 0 0 1 -6 0
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -6.0f,
            dy1 = 0.0f,
          )
          // v -1
          verticalLineToRelative(dy = -1.0f)
          // h 6z
          horizontalLineToRelative(dx = 6.0f)
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
      .also { _notificationFilled = it }
  }

@Suppress("ObjectPropertyName")
private var _notificationFilled: ImageVector? = null
