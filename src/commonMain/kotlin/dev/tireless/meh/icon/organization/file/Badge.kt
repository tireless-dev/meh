// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.organization.file

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Badge: ImageVector
  get() {
    val current = _badge
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Badge",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <polygon points="23.0 2.0 24.593 5.0 28.0 5.414 25.5 7.667 26.0 11.0 23.0 9.125 20.0 11.0 20.5 7.667 18.0 5.414 21.5 5.0 23.0 2.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 23 2
          moveTo(x = 23.0f, y = 2.0f)
          // L 24.593 5
          lineTo(x = 24.593f, y = 5.0f)
          // L 28 5.414
          lineTo(x = 28.0f, y = 5.414f)
          // L 25.5 7.667
          lineTo(x = 25.5f, y = 7.667f)
          // L 26 11
          lineTo(x = 26.0f, y = 11.0f)
          // L 23 9.125
          lineTo(x = 23.0f, y = 9.125f)
          // L 20 11
          lineTo(x = 20.0f, y = 11.0f)
          // L 20.5 7.667
          lineTo(x = 20.5f, y = 7.667f)
          // L 18 5.414
          lineTo(x = 18.0f, y = 5.414f)
          // L 21.5 5
          lineTo(x = 21.5f, y = 5.0f)
          // L 23 2z
          lineTo(x = 23.0f, y = 2.0f)
          close()
        }
        // m22.72 13.25 -1.94 -.5 a7 7 0 1 1 -5.03 -8.53 l.5 -1.94 A8.99 8.99 0 0 0 8 17.68 V30 l6 -4 6 4 V17.7 a9 9 0 0 0 2.72 -4.45 M18 26.26 l-4 -2.66 -4 2.66 v-7.21 a9 9 0 0 0 8 0Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 22.72 13.25
          moveTo(x = 22.72f, y = 13.25f)
          // l -1.94 -0.5
          lineToRelative(dx = -1.94f, dy = -0.5f)
          // a 7 7 0 1 1 -5.03 -8.53
          arcToRelative(
            a = 7.0f,
            b = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = -5.03f,
            dy1 = -8.53f,
          )
          // l 0.5 -1.94
          lineToRelative(dx = 0.5f, dy = -1.94f)
          // A 8.99 8.99 0 0 0 8 17.68
          arcTo(
            horizontalEllipseRadius = 8.99f,
            verticalEllipseRadius = 8.99f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 8.0f,
            y1 = 17.68f,
          )
          // V 30
          verticalLineTo(y = 30.0f)
          // l 6 -4
          lineToRelative(dx = 6.0f, dy = -4.0f)
          // l 6 4
          lineToRelative(dx = 6.0f, dy = 4.0f)
          // V 17.7
          verticalLineTo(y = 17.7f)
          // a 9 9 0 0 0 2.72 -4.45
          arcToRelative(
            a = 9.0f,
            b = 9.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 2.72f,
            dy1 = -4.45f,
          )
          // M 18 26.26
          moveTo(x = 18.0f, y = 26.26f)
          // l -4 -2.66
          lineToRelative(dx = -4.0f, dy = -2.66f)
          // l -4 2.66
          lineToRelative(dx = -4.0f, dy = 2.66f)
          // v -7.21
          verticalLineToRelative(dy = -7.21f)
          // a 9 9 0 0 0 8 0z
          arcToRelative(
            a = 9.0f,
            b = 9.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 8.0f,
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
      .also { _badge = it }
  }

@Suppress("ObjectPropertyName")
private var _badge: ImageVector? = null
