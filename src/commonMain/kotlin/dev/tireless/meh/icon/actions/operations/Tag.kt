// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.actions.operations

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tag: ImageVector
  get() {
    val current = _tag
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Tag",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M10 14 a4 4 0 1 1 4 -4 4 4 0 0 1 -4 4 m0 -6 a2 2 0 1 0 2 2 2 2 0 0 0 -2 -2
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 10 14
          moveTo(x = 10.0f, y = 14.0f)
          // a 4 4 0 1 1 4 -4
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 4.0f,
            dy1 = -4.0f,
          )
          // a 4 4 0 0 1 -4 4
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -4.0f,
            dy1 = 4.0f,
          )
          // m 0 -6
          moveToRelative(dx = 0.0f, dy = -6.0f)
          // a 2 2 0 1 0 2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = 2.0f,
            dy1 = 2.0f,
          )
          // a 2 2 0 0 0 -2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.0f,
            dy1 = -2.0f,
          )
        }
        // M16.64 29.41 2.6 15.36 A2 2 0 0 1 2 13.94 V4 a2 2 0 0 1 2 -2 h9.94 a2 2 0 0 1 1.42 .59 L29.4 16.64 a2 2 0 0 1 0 2.83 l-9.94 9.94 a2 2 0 0 1 -2.83 0 M4 4 v9.94 L18.06 28 28 18.06 13.94 4Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 16.64 29.41
          moveTo(x = 16.64f, y = 29.41f)
          // L 2.6 15.36
          lineTo(x = 2.6f, y = 15.36f)
          // A 2 2 0 0 1 2 13.94
          arcTo(
            horizontalEllipseRadius = 2.0f,
            verticalEllipseRadius = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 2.0f,
            y1 = 13.94f,
          )
          // V 4
          verticalLineTo(y = 4.0f)
          // a 2 2 0 0 1 2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 2.0f,
            dy1 = -2.0f,
          )
          // h 9.94
          horizontalLineToRelative(dx = 9.94f)
          // a 2 2 0 0 1 1.42 0.59
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 1.42f,
            dy1 = 0.59f,
          )
          // L 29.4 16.64
          lineTo(x = 29.4f, y = 16.64f)
          // a 2 2 0 0 1 0 2.83
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = 2.83f,
          )
          // l -9.94 9.94
          lineToRelative(dx = -9.94f, dy = 9.94f)
          // a 2 2 0 0 1 -2.83 0
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -2.83f,
            dy1 = 0.0f,
          )
          // M 4 4
          moveTo(x = 4.0f, y = 4.0f)
          // v 9.94
          verticalLineToRelative(dy = 9.94f)
          // L 18.06 28
          lineTo(x = 18.06f, y = 28.0f)
          // L 28 18.06
          lineTo(x = 28.0f, y = 18.06f)
          // L 13.94 4z
          lineTo(x = 13.94f, y = 4.0f)
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
      .also { _tag = it }
  }

@Suppress("ObjectPropertyName")
private var _tag: ImageVector? = null
