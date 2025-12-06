// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.actions.operations

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val NewTab: ImageVector
  get() {
    val current = _newTab
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.NewTab",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M26 26 H6 V6 h10 V4 H6 a2 2 0 0 0 -2 2 v20 a2 2 0 0 0 2 2 h20 a2 2 0 0 0 2 -2 V16 h-2Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 26 26
          moveTo(x = 26.0f, y = 26.0f)
          // H 6
          horizontalLineTo(x = 6.0f)
          // V 6
          verticalLineTo(y = 6.0f)
          // h 10
          horizontalLineToRelative(dx = 10.0f)
          // V 4
          verticalLineTo(y = 4.0f)
          // H 6
          horizontalLineTo(x = 6.0f)
          // a 2 2 0 0 0 -2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.0f,
            dy1 = 2.0f,
          )
          // v 20
          verticalLineToRelative(dy = 20.0f)
          // a 2 2 0 0 0 2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 2.0f,
            dy1 = 2.0f,
          )
          // h 20
          horizontalLineToRelative(dx = 20.0f)
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
          // V 16
          verticalLineTo(y = 16.0f)
          // h -2z
          horizontalLineToRelative(dx = -2.0f)
          close()
        }
        // M26 26 H6 V6 h10 V4 H6 a2 2 0 0 0 -2 2 v20 a2 2 0 0 0 2 2 h20 a2 2 0 0 0 2 -2 V16 h-2Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 26 26
          moveTo(x = 26.0f, y = 26.0f)
          // H 6
          horizontalLineTo(x = 6.0f)
          // V 6
          verticalLineTo(y = 6.0f)
          // h 10
          horizontalLineToRelative(dx = 10.0f)
          // V 4
          verticalLineTo(y = 4.0f)
          // H 6
          horizontalLineTo(x = 6.0f)
          // a 2 2 0 0 0 -2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.0f,
            dy1 = 2.0f,
          )
          // v 20
          verticalLineToRelative(dy = 20.0f)
          // a 2 2 0 0 0 2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 2.0f,
            dy1 = 2.0f,
          )
          // h 20
          horizontalLineToRelative(dx = 20.0f)
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
          // V 16
          verticalLineTo(y = 16.0f)
          // h -2z
          horizontalLineToRelative(dx = -2.0f)
          close()
        }
        // <polygon points="26.0 6.0 26.0 2.0 24.0 2.0 24.0 6.0 20.0 6.0 20.0 8.0 24.0 8.0 24.0 12.0 26.0 12.0 26.0 8.0 30.0 8.0 30.0 6.0 26.0 6.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 26 6
          moveTo(x = 26.0f, y = 6.0f)
          // L 26 2
          lineTo(x = 26.0f, y = 2.0f)
          // L 24 2
          lineTo(x = 24.0f, y = 2.0f)
          // L 24 6
          lineTo(x = 24.0f, y = 6.0f)
          // L 20 6
          lineTo(x = 20.0f, y = 6.0f)
          // L 20 8
          lineTo(x = 20.0f, y = 8.0f)
          // L 24 8
          lineTo(x = 24.0f, y = 8.0f)
          // L 24 12
          lineTo(x = 24.0f, y = 12.0f)
          // L 26 12
          lineTo(x = 26.0f, y = 12.0f)
          // L 26 8
          lineTo(x = 26.0f, y = 8.0f)
          // L 30 8
          lineTo(x = 30.0f, y = 8.0f)
          // L 30 6
          lineTo(x = 30.0f, y = 6.0f)
          // L 26 6z
          lineTo(x = 26.0f, y = 6.0f)
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
      .also { _newTab = it }
  }

@Suppress("ObjectPropertyName")
private var _newTab: ImageVector? = null
