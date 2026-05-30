// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.actions.operations

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ConnectRecursive: ImageVector
  get() {
    val current = _connectRecursive
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.ConnectRecursive",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M28 7 H13.83 l3.58 -3.59 L16 2 l-6 6 6 6 1.41 -1.41 L13.83 9 H28 v11 H11.9 A5 5 0 0 0 8 16.1 V2 H6 v14.1 a5 5 0 0 0 0 9.8 V30 h2 v-4.1 a5 5 0 0 0 3.9 -3.9 H28 a2 2 0 0 0 2 -2 V9 a2 2 0 0 0 -2 -2 M7 24 a3 3 0 1 1 3 -3 3 3 0 0 1 -3 3
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 28 7
          moveTo(x = 28.0f, y = 7.0f)
          // H 13.83
          horizontalLineTo(x = 13.83f)
          // l 3.58 -3.59
          lineToRelative(dx = 3.58f, dy = -3.59f)
          // L 16 2
          lineTo(x = 16.0f, y = 2.0f)
          // l -6 6
          lineToRelative(dx = -6.0f, dy = 6.0f)
          // l 6 6
          lineToRelative(dx = 6.0f, dy = 6.0f)
          // l 1.41 -1.41
          lineToRelative(dx = 1.41f, dy = -1.41f)
          // L 13.83 9
          lineTo(x = 13.83f, y = 9.0f)
          // H 28
          horizontalLineTo(x = 28.0f)
          // v 11
          verticalLineToRelative(dy = 11.0f)
          // H 11.9
          horizontalLineTo(x = 11.9f)
          // A 5 5 0 0 0 8 16.1
          arcTo(
            horizontalEllipseRadius = 5.0f,
            verticalEllipseRadius = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 8.0f,
            y1 = 16.1f,
          )
          // V 2
          verticalLineTo(y = 2.0f)
          // H 6
          horizontalLineTo(x = 6.0f)
          // v 14.1
          verticalLineToRelative(dy = 14.1f)
          // a 5 5 0 0 0 0 9.8
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = 9.8f,
          )
          // V 30
          verticalLineTo(y = 30.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v -4.1
          verticalLineToRelative(dy = -4.1f)
          // a 5 5 0 0 0 3.9 -3.9
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 3.9f,
            dy1 = -3.9f,
          )
          // H 28
          horizontalLineTo(x = 28.0f)
          // a 2 2 0 0 0 2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 2.0f,
            dy1 = -2.0f,
          )
          // V 9
          verticalLineTo(y = 9.0f)
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
          // M 7 24
          moveTo(x = 7.0f, y = 24.0f)
          // a 3 3 0 1 1 3 -3
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 3.0f,
            dy1 = -3.0f,
          )
          // a 3 3 0 0 1 -3 3
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -3.0f,
            dy1 = 3.0f,
          )
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
      .also { _connectRecursive = it }
  }

@Suppress("ObjectPropertyName")
private var _connectRecursive: ImageVector? = null
