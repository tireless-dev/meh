// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.actions.operations

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Rotate: ImageVector
  get() {
    val current = _rotate
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Rotate",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // m17.91 26.82 .35 2 a13 13 0 0 0 4.24 -1.54 l-1 -1.73 a11 11 0 0 1 -3.59 1.27 m6.51 -3.75 L26 24.35 a13 13 0 0 0 2.24 -3.91 l-1.87 -.68 a11 11 0 0 1 -1.95 3.31 M9.5 27.25 a13 13 0 0 0 4.24 1.54 l.35 -2 a11 11 0 0 1 -3.59 -1.3Z m-3.83 -7.49 L3.8 20.44 A13 13 0 0 0 6 24.35 l.32 -.26 1.22 -1 a11 11 0 0 1 -1.91 -3.31Z M29 16 a13 13 0 0 0 -.8 -4.44 l-1.87 .68 A11 11 0 0 1 27 16Z m-3 -8.35 a13 13 0 0 0 -20 0 V4 H4 v8 h8 v-2 H6.81 a11 11 0 0 1 17.61 -1.07Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 17.91 26.82
          moveTo(x = 17.91f, y = 26.82f)
          // l 0.35 2
          lineToRelative(dx = 0.35f, dy = 2.0f)
          // a 13 13 0 0 0 4.24 -1.54
          arcToRelative(
            a = 13.0f,
            b = 13.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 4.24f,
            dy1 = -1.54f,
          )
          // l -1 -1.73
          lineToRelative(dx = -1.0f, dy = -1.73f)
          // a 11 11 0 0 1 -3.59 1.27
          arcToRelative(
            a = 11.0f,
            b = 11.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -3.59f,
            dy1 = 1.27f,
          )
          // m 6.51 -3.75
          moveToRelative(dx = 6.51f, dy = -3.75f)
          // L 26 24.35
          lineTo(x = 26.0f, y = 24.35f)
          // a 13 13 0 0 0 2.24 -3.91
          arcToRelative(
            a = 13.0f,
            b = 13.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 2.24f,
            dy1 = -3.91f,
          )
          // l -1.87 -0.68
          lineToRelative(dx = -1.87f, dy = -0.68f)
          // a 11 11 0 0 1 -1.95 3.31
          arcToRelative(
            a = 11.0f,
            b = 11.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -1.95f,
            dy1 = 3.31f,
          )
          // M 9.5 27.25
          moveTo(x = 9.5f, y = 27.25f)
          // a 13 13 0 0 0 4.24 1.54
          arcToRelative(
            a = 13.0f,
            b = 13.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 4.24f,
            dy1 = 1.54f,
          )
          // l 0.35 -2
          lineToRelative(dx = 0.35f, dy = -2.0f)
          // a 11 11 0 0 1 -3.59 -1.3z
          arcToRelative(
            a = 11.0f,
            b = 11.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -3.59f,
            dy1 = -1.3f,
          )
          close()
          // m -3.83 -7.49
          moveToRelative(dx = -3.83f, dy = -7.49f)
          // L 3.8 20.44
          lineTo(x = 3.8f, y = 20.44f)
          // A 13 13 0 0 0 6 24.35
          arcTo(
            horizontalEllipseRadius = 13.0f,
            verticalEllipseRadius = 13.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 6.0f,
            y1 = 24.35f,
          )
          // l 0.32 -0.26
          lineToRelative(dx = 0.32f, dy = -0.26f)
          // l 1.22 -1
          lineToRelative(dx = 1.22f, dy = -1.0f)
          // a 11 11 0 0 1 -1.91 -3.31z
          arcToRelative(
            a = 11.0f,
            b = 11.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -1.91f,
            dy1 = -3.31f,
          )
          close()
          // M 29 16
          moveTo(x = 29.0f, y = 16.0f)
          // a 13 13 0 0 0 -0.8 -4.44
          arcToRelative(
            a = 13.0f,
            b = 13.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.8f,
            dy1 = -4.44f,
          )
          // l -1.87 0.68
          lineToRelative(dx = -1.87f, dy = 0.68f)
          // A 11 11 0 0 1 27 16z
          arcTo(
            horizontalEllipseRadius = 11.0f,
            verticalEllipseRadius = 11.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 27.0f,
            y1 = 16.0f,
          )
          close()
          // m -3 -8.35
          moveToRelative(dx = -3.0f, dy = -8.35f)
          // a 13 13 0 0 0 -20 0
          arcToRelative(
            a = 13.0f,
            b = 13.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -20.0f,
            dy1 = 0.0f,
          )
          // V 4
          verticalLineTo(y = 4.0f)
          // H 4
          horizontalLineTo(x = 4.0f)
          // v 8
          verticalLineToRelative(dy = 8.0f)
          // h 8
          horizontalLineToRelative(dx = 8.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // H 6.81
          horizontalLineTo(x = 6.81f)
          // a 11 11 0 0 1 17.61 -1.07z
          arcToRelative(
            a = 11.0f,
            b = 11.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 17.61f,
            dy1 = -1.07f,
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
      .also { _rotate = it }
  }

@Suppress("ObjectPropertyName")
private var _rotate: ImageVector? = null
