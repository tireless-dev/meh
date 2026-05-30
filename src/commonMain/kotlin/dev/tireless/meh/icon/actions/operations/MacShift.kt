// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.actions.operations

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MacShift: ImageVector
  get() {
    val current = _macShift
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.MacShift",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M21 28 H11 a2 2 0 0 1 -2 -2 V16 H4 a1 1 0 0 1 -.7 -1.7 l12 -12 a1 1 0 0 1 1.4 0 l12 12 A1 1 0 0 1 28 16 h-5 v10 a2 2 0 0 1 -2 2 M6.41 14 H11 v12 h10 V14 h4.59 L16 4.41Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 21 28
          moveTo(x = 21.0f, y = 28.0f)
          // H 11
          horizontalLineTo(x = 11.0f)
          // a 2 2 0 0 1 -2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -2.0f,
            dy1 = -2.0f,
          )
          // V 16
          verticalLineTo(y = 16.0f)
          // H 4
          horizontalLineTo(x = 4.0f)
          // a 1 1 0 0 1 -0.7 -1.7
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.7f,
            dy1 = -1.7f,
          )
          // l 12 -12
          lineToRelative(dx = 12.0f, dy = -12.0f)
          // a 1 1 0 0 1 1.4 0
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 1.4f,
            dy1 = 0.0f,
          )
          // l 12 12
          lineToRelative(dx = 12.0f, dy = 12.0f)
          // A 1 1 0 0 1 28 16
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 28.0f,
            y1 = 16.0f,
          )
          // h -5
          horizontalLineToRelative(dx = -5.0f)
          // v 10
          verticalLineToRelative(dy = 10.0f)
          // a 2 2 0 0 1 -2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -2.0f,
            dy1 = 2.0f,
          )
          // M 6.41 14
          moveTo(x = 6.41f, y = 14.0f)
          // H 11
          horizontalLineTo(x = 11.0f)
          // v 12
          verticalLineToRelative(dy = 12.0f)
          // h 10
          horizontalLineToRelative(dx = 10.0f)
          // V 14
          verticalLineTo(y = 14.0f)
          // h 4.59
          horizontalLineToRelative(dx = 4.59f)
          // L 16 4.41z
          lineTo(x = 16.0f, y = 4.41f)
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
      .also { _macShift = it }
  }

@Suppress("ObjectPropertyName")
private var _macShift: ImageVector? = null
