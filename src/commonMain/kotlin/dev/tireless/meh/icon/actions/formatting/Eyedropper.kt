// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.actions.formatting

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Eyedropper: ImageVector
  get() {
    val current = _eyedropper
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Eyedropper",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <rect width="3" height="3" x="2.0" y="27.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 2 27
          moveTo(x = 2.0f, y = 27.0f)
          // h 3
          horizontalLineToRelative(dx = 3.0f)
          // v 3
          verticalLineToRelative(dy = 3.0f)
          // h -3z
          horizontalLineToRelative(dx = -3.0f)
          close()
        }
        // m29.71 7.29 -5 -5 a1 1 0 0 0 -1.41 0 L20 5.59 l-1.29 -1.3 -1.42 1.42 L18.59 7 8.29 17.29 A1 1 0 0 0 8 18 v1.59 l-2.71 2.7 a1 1 0 0 0 0 1.41 l3 3 a1 1 0 0 0 1.41 0 l2.71 -2.7 H14 a1 1 0 0 0 .71 -.29 L25 13.41 l1.29 1.3 1.42 -1.42 -1.3 -1.29 3.3 -3.29 a1 1 0 0 0 0 -1.41Z M13.59 22 h-2 L9 24.59 7.41 23 10 20.41 v-2 l10 -10 L23.59 12Z M25 10.59 21.41 7 24 4.41 27.59 8Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 29.71 7.29
          moveTo(x = 29.71f, y = 7.29f)
          // l -5 -5
          lineToRelative(dx = -5.0f, dy = -5.0f)
          // a 1 1 0 0 0 -1.41 0
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.41f,
            dy1 = 0.0f,
          )
          // L 20 5.59
          lineTo(x = 20.0f, y = 5.59f)
          // l -1.29 -1.3
          lineToRelative(dx = -1.29f, dy = -1.3f)
          // l -1.42 1.42
          lineToRelative(dx = -1.42f, dy = 1.42f)
          // L 18.59 7
          lineTo(x = 18.59f, y = 7.0f)
          // L 8.29 17.29
          lineTo(x = 8.29f, y = 17.29f)
          // A 1 1 0 0 0 8 18
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 8.0f,
            y1 = 18.0f,
          )
          // v 1.59
          verticalLineToRelative(dy = 1.59f)
          // l -2.71 2.7
          lineToRelative(dx = -2.71f, dy = 2.7f)
          // a 1 1 0 0 0 0 1.41
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = 1.41f,
          )
          // l 3 3
          lineToRelative(dx = 3.0f, dy = 3.0f)
          // a 1 1 0 0 0 1.41 0
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 1.41f,
            dy1 = 0.0f,
          )
          // l 2.71 -2.7
          lineToRelative(dx = 2.71f, dy = -2.7f)
          // H 14
          horizontalLineTo(x = 14.0f)
          // a 1 1 0 0 0 0.71 -0.29
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.71f,
            dy1 = -0.29f,
          )
          // L 25 13.41
          lineTo(x = 25.0f, y = 13.41f)
          // l 1.29 1.3
          lineToRelative(dx = 1.29f, dy = 1.3f)
          // l 1.42 -1.42
          lineToRelative(dx = 1.42f, dy = -1.42f)
          // l -1.3 -1.29
          lineToRelative(dx = -1.3f, dy = -1.29f)
          // l 3.3 -3.29
          lineToRelative(dx = 3.3f, dy = -3.29f)
          // a 1 1 0 0 0 0 -1.41z
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = -1.41f,
          )
          close()
          // M 13.59 22
          moveTo(x = 13.59f, y = 22.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // L 9 24.59
          lineTo(x = 9.0f, y = 24.59f)
          // L 7.41 23
          lineTo(x = 7.41f, y = 23.0f)
          // L 10 20.41
          lineTo(x = 10.0f, y = 20.41f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // l 10 -10
          lineToRelative(dx = 10.0f, dy = -10.0f)
          // L 23.59 12z
          lineTo(x = 23.59f, y = 12.0f)
          close()
          // M 25 10.59
          moveTo(x = 25.0f, y = 10.59f)
          // L 21.41 7
          lineTo(x = 21.41f, y = 7.0f)
          // L 24 4.41
          lineTo(x = 24.0f, y = 4.41f)
          // L 27.59 8z
          lineTo(x = 27.59f, y = 8.0f)
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
      .also { _eyedropper = it }
  }

@Suppress("ObjectPropertyName")
private var _eyedropper: ImageVector? = null
