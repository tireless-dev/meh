// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.person.user

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val UserXRay: ImageVector
  get() {
    val current = _userXRay
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.UserXRay",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <polygon points="28.0 9.0 28.0 7.0 25.0 7.0 25.0 5.0 23.0 5.0 23.0 7.0 20.0 7.0 20.0 9.0 23.0 9.0 23.0 12.0 20.0 12.0 20.0 14.0 23.0 14.0 23.0 16.0 25.0 16.0 25.0 14.0 28.0 14.0 28.0 12.0 25.0 12.0 25.0 9.0 28.0 9.0" fill="#000" />
        path(
          fill = SolidColor(Color.Transparent),
        ) {
          // M 28 9
          moveTo(x = 28.0f, y = 9.0f)
          // L 28 7
          lineTo(x = 28.0f, y = 7.0f)
          // L 25 7
          lineTo(x = 25.0f, y = 7.0f)
          // L 25 5
          lineTo(x = 25.0f, y = 5.0f)
          // L 23 5
          lineTo(x = 23.0f, y = 5.0f)
          // L 23 7
          lineTo(x = 23.0f, y = 7.0f)
          // L 20 7
          lineTo(x = 20.0f, y = 7.0f)
          // L 20 9
          lineTo(x = 20.0f, y = 9.0f)
          // L 23 9
          lineTo(x = 23.0f, y = 9.0f)
          // L 23 12
          lineTo(x = 23.0f, y = 12.0f)
          // L 20 12
          lineTo(x = 20.0f, y = 12.0f)
          // L 20 14
          lineTo(x = 20.0f, y = 14.0f)
          // L 23 14
          lineTo(x = 23.0f, y = 14.0f)
          // L 23 16
          lineTo(x = 23.0f, y = 16.0f)
          // L 25 16
          lineTo(x = 25.0f, y = 16.0f)
          // L 25 14
          lineTo(x = 25.0f, y = 14.0f)
          // L 28 14
          lineTo(x = 28.0f, y = 14.0f)
          // L 28 12
          lineTo(x = 28.0f, y = 12.0f)
          // L 25 12
          lineTo(x = 25.0f, y = 12.0f)
          // L 25 9
          lineTo(x = 25.0f, y = 9.0f)
          // L 28 9z
          lineTo(x = 28.0f, y = 9.0f)
          close()
        }
        // M31 3 H17 a1 1 0 0 0 -1 1 v13 a1 1 0 0 0 1 1 h14 a1 1 0 0 0 1 -1 V4 a1 1 0 0 0 -1 -1 m-3 6 h-3 v3 h3 v2 h-3 v2 h-2 v-2 h-3 v-2 h3 V9 h-3 V7 h3 V5 h2 v2 h3Z M15 30 h-2 v-4 a2.95 2.95 0 0 0 -3 -3 H6 a2.95 2.95 0 0 0 -3 3 v4 H1 v-4 a4.95 4.95 0 0 1 5 -5 h4 a4.95 4.95 0 0 1 5 5Z M8 11 a3 3 0 0 1 0 6 3 3 0 0 1 0 -6 m0 -2 a5 5 0 0 0 0 10 A5 5 0 0 0 8 9
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 31 3
          moveTo(x = 31.0f, y = 3.0f)
          // H 17
          horizontalLineTo(x = 17.0f)
          // a 1 1 0 0 0 -1 1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.0f,
            dy1 = 1.0f,
          )
          // v 13
          verticalLineToRelative(dy = 13.0f)
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
          // h 14
          horizontalLineToRelative(dx = 14.0f)
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
          // V 4
          verticalLineTo(y = 4.0f)
          // a 1 1 0 0 0 -1 -1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.0f,
            dy1 = -1.0f,
          )
          // m -3 6
          moveToRelative(dx = -3.0f, dy = 6.0f)
          // h -3
          horizontalLineToRelative(dx = -3.0f)
          // v 3
          verticalLineToRelative(dy = 3.0f)
          // h 3
          horizontalLineToRelative(dx = 3.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -3
          horizontalLineToRelative(dx = -3.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h -3
          horizontalLineToRelative(dx = -3.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h 3
          horizontalLineToRelative(dx = 3.0f)
          // V 9
          verticalLineTo(y = 9.0f)
          // h -3
          horizontalLineToRelative(dx = -3.0f)
          // V 7
          verticalLineTo(y = 7.0f)
          // h 3
          horizontalLineToRelative(dx = 3.0f)
          // V 5
          verticalLineTo(y = 5.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 3z
          horizontalLineToRelative(dx = 3.0f)
          close()
          // M 15 30
          moveTo(x = 15.0f, y = 30.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v -4
          verticalLineToRelative(dy = -4.0f)
          // a 2.95 2.95 0 0 0 -3 -3
          arcToRelative(
            a = 2.95f,
            b = 2.95f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -3.0f,
            dy1 = -3.0f,
          )
          // H 6
          horizontalLineTo(x = 6.0f)
          // a 2.95 2.95 0 0 0 -3 3
          arcToRelative(
            a = 2.95f,
            b = 2.95f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -3.0f,
            dy1 = 3.0f,
          )
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // H 1
          horizontalLineTo(x = 1.0f)
          // v -4
          verticalLineToRelative(dy = -4.0f)
          // a 4.95 4.95 0 0 1 5 -5
          arcToRelative(
            a = 4.95f,
            b = 4.95f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 5.0f,
            dy1 = -5.0f,
          )
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // a 4.95 4.95 0 0 1 5 5z
          arcToRelative(
            a = 4.95f,
            b = 4.95f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 5.0f,
            dy1 = 5.0f,
          )
          close()
          // M 8 11
          moveTo(x = 8.0f, y = 11.0f)
          // a 3 3 0 0 1 0 6
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = 6.0f,
          )
          // a 3 3 0 0 1 0 -6
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = -6.0f,
          )
          // m 0 -2
          moveToRelative(dx = 0.0f, dy = -2.0f)
          // a 5 5 0 0 0 0 10
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = 10.0f,
          )
          // A 5 5 0 0 0 8 9
          arcTo(
            horizontalEllipseRadius = 5.0f,
            verticalEllipseRadius = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 8.0f,
            y1 = 9.0f,
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
      .also { _userXRay = it }
  }

@Suppress("ObjectPropertyName")
private var _userXRay: ImageVector? = null
