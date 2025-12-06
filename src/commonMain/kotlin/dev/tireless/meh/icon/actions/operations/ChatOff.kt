// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.actions.operations

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ChatOff: ImageVector
  get() {
    val current = _chatOff
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.ChatOff",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M28 8 v13 h2 V8 a4 4 0 0 0 -4 -4 H8.24 l2 2 H26 a2 2 0 0 1 2 2 m2 20.59 L3.41 2 2 3.41 l1.5 1.5 A4 4 0 0 0 2 8 v12 a4 4 0 0 0 4 4 h6 v-2 H6 a2 2 0 0 1 -2 -2 V8 a2 2 0 0 1 .92 -1.67 L20.59 22 H17 l-4 7 1.74 1 3.42 -6 h4.43 l6 6Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 28 8
          moveTo(x = 28.0f, y = 8.0f)
          // v 13
          verticalLineToRelative(dy = 13.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // V 8
          verticalLineTo(y = 8.0f)
          // a 4 4 0 0 0 -4 -4
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -4.0f,
            dy1 = -4.0f,
          )
          // H 8.24
          horizontalLineTo(x = 8.24f)
          // l 2 2
          lineToRelative(dx = 2.0f, dy = 2.0f)
          // H 26
          horizontalLineTo(x = 26.0f)
          // a 2 2 0 0 1 2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 2.0f,
            dy1 = 2.0f,
          )
          // m 2 20.59
          moveToRelative(dx = 2.0f, dy = 20.59f)
          // L 3.41 2
          lineTo(x = 3.41f, y = 2.0f)
          // L 2 3.41
          lineTo(x = 2.0f, y = 3.41f)
          // l 1.5 1.5
          lineToRelative(dx = 1.5f, dy = 1.5f)
          // A 4 4 0 0 0 2 8
          arcTo(
            horizontalEllipseRadius = 4.0f,
            verticalEllipseRadius = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 2.0f,
            y1 = 8.0f,
          )
          // v 12
          verticalLineToRelative(dy = 12.0f)
          // a 4 4 0 0 0 4 4
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 4.0f,
            dy1 = 4.0f,
          )
          // h 6
          horizontalLineToRelative(dx = 6.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // H 6
          horizontalLineTo(x = 6.0f)
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
          // V 8
          verticalLineTo(y = 8.0f)
          // a 2 2 0 0 1 0.92 -1.67
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.92f,
            dy1 = -1.67f,
          )
          // L 20.59 22
          lineTo(x = 20.59f, y = 22.0f)
          // H 17
          horizontalLineTo(x = 17.0f)
          // l -4 7
          lineToRelative(dx = -4.0f, dy = 7.0f)
          // l 1.74 1
          lineToRelative(dx = 1.74f, dy = 1.0f)
          // l 3.42 -6
          lineToRelative(dx = 3.42f, dy = -6.0f)
          // h 4.43
          horizontalLineToRelative(dx = 4.43f)
          // l 6 6z
          lineToRelative(dx = 6.0f, dy = 6.0f)
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
      .also { _chatOff = it }
  }

@Suppress("ObjectPropertyName")
private var _chatOff: ImageVector? = null
