// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.actions.operations

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Launch: ImageVector
  get() {
    val current = _launch
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Launch",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M26 28 H6 a2 2 0 0 1 -2 -2 V6 a2 2 0 0 1 2 -2 h10 v2 H6 v20 h20 V16 h2 v10 a2 2 0 0 1 -2 2
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 26 28
          moveTo(x = 26.0f, y = 28.0f)
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
          // V 6
          verticalLineTo(y = 6.0f)
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
          // h 10
          horizontalLineToRelative(dx = 10.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // H 6
          horizontalLineTo(x = 6.0f)
          // v 20
          verticalLineToRelative(dy = 20.0f)
          // h 20
          horizontalLineToRelative(dx = 20.0f)
          // V 16
          verticalLineTo(y = 16.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
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
        }
        // <polygon points="20.0 2.0 20.0 4.0 26.586 4.0 18.0 12.586 19.414 14.0 28.0 5.414 28.0 12.0 30.0 12.0 30.0 2.0 20.0 2.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 20 2
          moveTo(x = 20.0f, y = 2.0f)
          // L 20 4
          lineTo(x = 20.0f, y = 4.0f)
          // L 26.586 4
          lineTo(x = 26.586f, y = 4.0f)
          // L 18 12.586
          lineTo(x = 18.0f, y = 12.586f)
          // L 19.414 14
          lineTo(x = 19.414f, y = 14.0f)
          // L 28 5.414
          lineTo(x = 28.0f, y = 5.414f)
          // L 28 12
          lineTo(x = 28.0f, y = 12.0f)
          // L 30 12
          lineTo(x = 30.0f, y = 12.0f)
          // L 30 2
          lineTo(x = 30.0f, y = 2.0f)
          // L 20 2z
          lineTo(x = 20.0f, y = 2.0f)
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
      .also { _launch = it }
  }

@Suppress("ObjectPropertyName")
private var _launch: ImageVector? = null
