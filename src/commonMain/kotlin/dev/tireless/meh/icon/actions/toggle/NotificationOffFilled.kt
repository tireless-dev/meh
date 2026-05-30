// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.actions.toggle

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val NotificationOffFilled: ImageVector
  get() {
    val current = _notificationOffFilled
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.NotificationOffFilled",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M26 16.59 V13 a10 10 0 0 0 -1.09 -4.5 L30 3.41 28.59 2 2 28.59 3.41 30 l6 -6 H11 v1 a5 5 0 0 0 10 0 v-1 h7 a1 1 0 0 0 1 -1 v-3 a1 1 0 0 0 -.3 -.7Z M19 25 a3 3 0 0 1 -6 0 v-1 h6Z m2.61 -20.26 A10 10 0 0 0 17 3.05 V1 h-2 v2.05 A10 10 0 0 0 6 13 v3.59 l-2.7 2.7 A1 1 0 0 0 3 20 v3 a1 1 0 0 0 .06 .29Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 26 16.59
          moveTo(x = 26.0f, y = 16.59f)
          // V 13
          verticalLineTo(y = 13.0f)
          // a 10 10 0 0 0 -1.09 -4.5
          arcToRelative(
            a = 10.0f,
            b = 10.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.09f,
            dy1 = -4.5f,
          )
          // L 30 3.41
          lineTo(x = 30.0f, y = 3.41f)
          // L 28.59 2
          lineTo(x = 28.59f, y = 2.0f)
          // L 2 28.59
          lineTo(x = 2.0f, y = 28.59f)
          // L 3.41 30
          lineTo(x = 3.41f, y = 30.0f)
          // l 6 -6
          lineToRelative(dx = 6.0f, dy = -6.0f)
          // H 11
          horizontalLineTo(x = 11.0f)
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
          // a 1 1 0 0 0 -0.3 -0.7z
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.3f,
            dy1 = -0.7f,
          )
          close()
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
          // m 2.61 -20.26
          moveToRelative(dx = 2.61f, dy = -20.26f)
          // A 10 10 0 0 0 17 3.05
          arcTo(
            horizontalEllipseRadius = 10.0f,
            verticalEllipseRadius = 10.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 17.0f,
            y1 = 3.05f,
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
          // a 1 1 0 0 0 0.06 0.29z
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.06f,
            dy1 = 0.29f,
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
      .also { _notificationOffFilled = it }
  }

@Suppress("ObjectPropertyName")
private var _notificationOffFilled: ImageVector? = null
