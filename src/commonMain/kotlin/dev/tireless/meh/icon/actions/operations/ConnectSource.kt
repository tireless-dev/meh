// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.actions.operations

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ConnectSource: ImageVector
  get() {
    val current = _connectSource
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.ConnectSource",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // m24 10 -1.41 1.41 L26.17 15 H11.9 A5 5 0 0 0 8 11.1 V2 H6 v9.1 a5 5 0 0 0 0 9.8 V30 h2 v-9.1 a5 5 0 0 0 3.9 -3.9 h14.27 l-3.58 3.59 L24 22 l6 -6Z M7 19 a3 3 0 1 1 3 -3 3 3 0 0 1 -3 3
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 24 10
          moveTo(x = 24.0f, y = 10.0f)
          // l -1.41 1.41
          lineToRelative(dx = -1.41f, dy = 1.41f)
          // L 26.17 15
          lineTo(x = 26.17f, y = 15.0f)
          // H 11.9
          horizontalLineTo(x = 11.9f)
          // A 5 5 0 0 0 8 11.1
          arcTo(
            horizontalEllipseRadius = 5.0f,
            verticalEllipseRadius = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 8.0f,
            y1 = 11.1f,
          )
          // V 2
          verticalLineTo(y = 2.0f)
          // H 6
          horizontalLineTo(x = 6.0f)
          // v 9.1
          verticalLineToRelative(dy = 9.1f)
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
          // v -9.1
          verticalLineToRelative(dy = -9.1f)
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
          // h 14.27
          horizontalLineToRelative(dx = 14.27f)
          // l -3.58 3.59
          lineToRelative(dx = -3.58f, dy = 3.59f)
          // L 24 22
          lineTo(x = 24.0f, y = 22.0f)
          // l 6 -6z
          lineToRelative(dx = 6.0f, dy = -6.0f)
          close()
          // M 7 19
          moveTo(x = 7.0f, y = 19.0f)
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
      .also { _connectSource = it }
  }

@Suppress("ObjectPropertyName")
private var _connectSource: ImageVector? = null
