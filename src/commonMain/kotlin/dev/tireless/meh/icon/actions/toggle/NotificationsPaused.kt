// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.actions.toggle

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val NotificationsPaused: ImageVector
  get() {
    val current = _notificationsPaused
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.NotificationsPaused",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // m29 5 -3.62 4 H29 v2 h-6 V9 l3.75 -4 H23 V3 h6z m-.3 14.3 A1 1 0 0 1 29 20 v3 a1 1 0 0 1 -1 1 h-7 v1 a5 5 0 0 1 -10 0 v-1 H4 a1 1 0 0 1 -1 -1 v-3 a1 1 0 0 1 .3 -.7 L6 16.58 V13 c0 -5.18 3.95 -9.45 9 -9.95 V1 h2 v2.05 a10 10 0 0 1 3 .8 V6 a8 8 0 0 0 -4 -1 8 8 0 0 0 -8 8 v4 a1 1 0 0 1 -.3 .7 L5 20.42 V22 h22 v-1.59 l-2.7 -2.7 A1 1 0 0 1 24 17 v-3 h2 v2.59z M19 24 h-6 v1 a3 3 0 0 0 6 0z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 29 5
          moveTo(x = 29.0f, y = 5.0f)
          // l -3.62 4
          lineToRelative(dx = -3.62f, dy = 4.0f)
          // H 29
          horizontalLineTo(x = 29.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -6
          horizontalLineToRelative(dx = -6.0f)
          // V 9
          verticalLineTo(y = 9.0f)
          // l 3.75 -4
          lineToRelative(dx = 3.75f, dy = -4.0f)
          // H 23
          horizontalLineTo(x = 23.0f)
          // V 3
          verticalLineTo(y = 3.0f)
          // h 6z
          horizontalLineToRelative(dx = 6.0f)
          close()
          // m -0.3 14.3
          moveToRelative(dx = -0.3f, dy = 14.3f)
          // A 1 1 0 0 1 29 20
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 29.0f,
            y1 = 20.0f,
          )
          // v 3
          verticalLineToRelative(dy = 3.0f)
          // a 1 1 0 0 1 -1 1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -1.0f,
            dy1 = 1.0f,
          )
          // h -7
          horizontalLineToRelative(dx = -7.0f)
          // v 1
          verticalLineToRelative(dy = 1.0f)
          // a 5 5 0 0 1 -10 0
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -10.0f,
            dy1 = 0.0f,
          )
          // v -1
          verticalLineToRelative(dy = -1.0f)
          // H 4
          horizontalLineTo(x = 4.0f)
          // a 1 1 0 0 1 -1 -1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -1.0f,
            dy1 = -1.0f,
          )
          // v -3
          verticalLineToRelative(dy = -3.0f)
          // a 1 1 0 0 1 0.3 -0.7
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.3f,
            dy1 = -0.7f,
          )
          // L 6 16.58
          lineTo(x = 6.0f, y = 16.58f)
          // V 13
          verticalLineTo(y = 13.0f)
          // c 0 -5.18 3.95 -9.45 9 -9.95
          curveToRelative(
            dx1 = 0.0f,
            dy1 = -5.18f,
            dx2 = 3.95f,
            dy2 = -9.45f,
            dx3 = 9.0f,
            dy3 = -9.95f,
          )
          // V 1
          verticalLineTo(y = 1.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 2.05
          verticalLineToRelative(dy = 2.05f)
          // a 10 10 0 0 1 3 0.8
          arcToRelative(
            a = 10.0f,
            b = 10.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 3.0f,
            dy1 = 0.8f,
          )
          // V 6
          verticalLineTo(y = 6.0f)
          // a 8 8 0 0 0 -4 -1
          arcToRelative(
            a = 8.0f,
            b = 8.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -4.0f,
            dy1 = -1.0f,
          )
          // a 8 8 0 0 0 -8 8
          arcToRelative(
            a = 8.0f,
            b = 8.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -8.0f,
            dy1 = 8.0f,
          )
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // a 1 1 0 0 1 -0.3 0.7
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.3f,
            dy1 = 0.7f,
          )
          // L 5 20.42
          lineTo(x = 5.0f, y = 20.42f)
          // V 22
          verticalLineTo(y = 22.0f)
          // h 22
          horizontalLineToRelative(dx = 22.0f)
          // v -1.59
          verticalLineToRelative(dy = -1.59f)
          // l -2.7 -2.7
          lineToRelative(dx = -2.7f, dy = -2.7f)
          // A 1 1 0 0 1 24 17
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 24.0f,
            y1 = 17.0f,
          )
          // v -3
          verticalLineToRelative(dy = -3.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 2.59z
          verticalLineToRelative(dy = 2.59f)
          close()
          // M 19 24
          moveTo(x = 19.0f, y = 24.0f)
          // h -6
          horizontalLineToRelative(dx = -6.0f)
          // v 1
          verticalLineToRelative(dy = 1.0f)
          // a 3 3 0 0 0 6 0z
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 6.0f,
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
      .also { _notificationsPaused = it }
  }

@Suppress("ObjectPropertyName")
private var _notificationsPaused: ImageVector? = null
